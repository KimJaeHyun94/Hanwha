package com.example.url.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.url.model.Address;

@Mapper
public interface AddressDAO {
	Address getUrls();
    Integer getUrlIdByLongUrl(String longurl);
    Integer insertLongUrl(String longurl);
    String getLongUrlById(int id);
    int deleteURL(String longurl);
    List<Address> selectAllUrl();
}
