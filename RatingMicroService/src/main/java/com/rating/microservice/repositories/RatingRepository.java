package com.rating.microservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rating.microservice.models.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{
	

}
