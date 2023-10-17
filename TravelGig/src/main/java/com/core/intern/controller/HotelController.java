package com.core.intern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.core.intern.domain.Hotel;
import com.core.intern.services.HotelServiceImpl;

@RestController
public class HotelController {
	
	@Autowired
	HotelServiceImpl hotelServiceImpl;
	
	@RequestMapping(value = "/searchHotel/{searchString}",method = RequestMethod.GET)
	public List<Hotel> searchHotel(@PathVariable String searchString){
		//first commit by ankit...
		//third commit by ankit using sts...
		return hotelServiceImpl.searchHotel(searchString);
	}
	
}
