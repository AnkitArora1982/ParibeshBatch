package com.core.intern.services;

import java.util.List;

import com.core.intern.domain.Hotel;

public interface HotelService {

	public List<Hotel> searchHotel(String searchString);
	
}
