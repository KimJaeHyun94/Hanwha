package com.example.url.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.url.model.Address;
import com.example.url.model.User;
import com.example.url.service.AddressService;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/address")
public class AddressController {
	
	 	@Autowired
	    private AddressService addressService;
	 	
	 	@GetMapping("/")
	 	public ResponseEntity<List<Address>> allAddress(){
	 		return new ResponseEntity<List<Address>>(addressService.selectAllUrl(), HttpStatus.OK);
	 	}

	    @PostMapping("/")
	    public ResponseEntity<String> Shortening(@RequestParam String longurl){
	        String shorturl = addressService.generateShortUrl(longurl);
	        return new ResponseEntity<String>(shorturl, HttpStatus.OK);
	    }

	    @GetMapping("/getlong")
	    public ResponseEntity<String> redirect(@RequestParam String shorturl){
	        String url= addressService.getLongUrlByShortUrl(shorturl.replace("http://shorten/",""));
	        String longurl = "https://"+url;
	        if(url == null){
	        	return new ResponseEntity<String>("등록되지 않음...", HttpStatus.OK);
	        }
	        return new ResponseEntity<String>(longurl, HttpStatus.OK);
	    }
	    
	    @DeleteMapping("/")
	    public ResponseEntity<String> delete(@RequestParam String longurl){
	    	 String url = longurl.replace("https://","");
	    	 int check = addressService.deleteURL(url);
	    	 if(check==0) {
	    		 return new ResponseEntity<String>("저장안된 URL임...", HttpStatus.OK);
	    	 }else
	    		 return new ResponseEntity<String>("OK", HttpStatus.OK);
	    }
}
