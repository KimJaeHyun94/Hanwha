package com.example.url.utils;

import org.springframework.stereotype.Component;

import java.net.URL;
import java.net.URLConnection;

@Component
public class UrlCheck {
    public boolean valid(String url) {
        try {
            URL connectionUrl = new URL(url);
            URLConnection conn = connectionUrl.openConnection();
            conn.connect();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}