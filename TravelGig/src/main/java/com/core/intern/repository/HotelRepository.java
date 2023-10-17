package com.core.intern.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.core.intern.domain.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer>{
	public List<Hotel> findByHotelNameLikeOrAddressLikeOrCityLikeOrStateLike(String hotelName,String address,String city,String state);
}
