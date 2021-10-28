package com.example.url.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url.dao.AddressDAO;
import com.example.url.model.Address;
import com.example.url.utils.Base62Util;
import com.example.url.utils.UrlCheck;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDAO addressDao;

	@Autowired
    private UrlCheck typeCheck;

    @Autowired
    private Base62Util base62Util;
    
	@Override
	public Address getUrls() {
		return addressDao.getUrls();
	}

	@Override
	public String generateShortUrl(String longurl) {
		if(!typeCheck.valid(longurl)){
            throw new IllegalArgumentException("잘못된 URL 타입입니다.");
        }

        longurl = longurl.replace("https://","").replace("http://","");
        Integer id = addressDao.getUrlIdByLongUrl(longurl);
        String shorturl;
        if(id == null) {
            id = addressDao.insertLongUrl(longurl);
        }
        shorturl = base62Util.encoding(id);

        return "http://shorten/"+shorturl;
	}

	@Override
	public String getLongUrlByShortUrl(String shorturl) {
		int id = base62Util.decoding(shorturl);
        String longurl = addressDao.getLongUrlById(id);

        return longurl;
	}

	@Override
	public int deleteURL(String longurl) {
		return addressDao.deleteURL(longurl);
	}

	@Override
	public List<Address> selectAllUrl() {
		return addressDao.selectAllUrl();
	};
	
}
