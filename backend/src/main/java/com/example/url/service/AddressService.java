package com.example.url.service;

import java.util.List;
import java.util.Map;

import com.example.url.model.Address;

public interface AddressService {
	 Address getUrls();
	 String generateShortUrl(String longurl);
	 String getLongUrlByShortUrl(String shorturl);
	 List<Address> selectAllUrl();
	 int deleteURL(String longurl);
}
