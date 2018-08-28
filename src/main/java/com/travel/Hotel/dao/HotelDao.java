package com.travel.Hotel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.travel.Hotel.entity.Hotel;

public class HotelDao {

	
	@PersistenceContext
	private EntityManager em;
	
	public Hotel findByCity(String city) {
		return em.find(Hotel.class, city);
	}
	
	public List<Hotel> findByAll() {
		return em.createQuery("FROM HOTEL", Hotel.class).getResultList();
	}
	
}
