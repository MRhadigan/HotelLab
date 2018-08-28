package com.travel.Hotel.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table
public class Hotel {

	@Column
	private int hotel_id;
	private String hotel_name;
	private String city;
	private double price_per_night;
	
	public Hotel() {
		
	}
	
	public Hotel(int hotel_id, String hotel_name, String city, double price_per_night) {
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.city = city;
		this.price_per_night = price_per_night;
	}
	
	public Hotel(int hotel_id, String hotel_name) {
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPrice_per_night() {
		return price_per_night;
	}

	public void setPrice_per_night(double price_per_night) {
		this.price_per_night = price_per_night;
	}

	@Override
	public String toString() {
		return "hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", city=" + city + ", price_per_night="
				+ price_per_night;
	}
	
	
}
