package com.core.intern.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.intern.domain.Hotel;
import com.core.intern.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public List<Hotel> searchHotel(String searchString) {
		searchString = "%"+searchString+"%";
		return hotelRepository.findByHotelNameLikeOrAddressLikeOrCityLikeOrStateLike(searchString,searchString,searchString,searchString);
	}

}
