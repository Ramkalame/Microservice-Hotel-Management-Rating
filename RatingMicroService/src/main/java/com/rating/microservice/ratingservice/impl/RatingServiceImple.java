package com.rating.microservice.ratingservice.impl;

import java.util.List;

import com.rating.microservice.exceptions.EmptyDataException;
import com.rating.microservice.exceptions.RatingNotFoundException;
import com.rating.microservice.models.Rating;
import com.rating.microservice.ratingservice.RatingService;
import com.rating.microservice.repositories.RatingRepository;

public class RatingServiceImple implements RatingService{
	
	private RatingRepository ratingRepo;

	@Override
	public Rating createRating(Rating rating) {
		if(rating.getUserId().isEmpty()) {
			throw new EmptyDataException("607", "usre id is not present in the  data");
		}
		
		if(rating.getHotelId().isEmpty()) {
			throw new EmptyDataException("608", "hotel id is not present in the  data");
		}
		
		Rating newRating = new Rating();
		newRating.setFeedback(rating.getFeedback());
		newRating.setHotelId(rating.getHotelId());
		newRating.setUserId(rating.getUserId());
		newRating.setRating(rating.getRating());
		return newRating;
	}

	@Override
	public Rating getRating(String ratingId) {
		ratingRepo.findById(ratingId).orElseThrow(()-> new RatingNotFoundException("609", "rating not found with this is id: "+ratingId));
		return null;
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

}
