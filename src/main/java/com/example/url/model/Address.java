package com.example.url.model;


public class Address {
	
	private int id;
    private String longurl;
    
    public Address() {
    	super();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLongurl() {
		return longurl;
	}

	public void setLongurl(String longurl) {
		this.longurl = longurl;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", longurl=" + longurl + "]";
	}
	
    
    
}
