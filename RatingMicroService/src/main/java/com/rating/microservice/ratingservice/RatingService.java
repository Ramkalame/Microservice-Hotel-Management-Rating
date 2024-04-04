package com.rating.microservice.ratingservice;

import java.util.List;

import com.rating.microservice.models.Rating;

public interface RatingService {
	
	public Rating createRating(Rating rating);
	
	public Rating getRating(String ratingId);
	
	public List<Rating> getRatingByUserId(String userId);
	
	public List<Rating> getRatingByHotelId(String hotelId);

}
