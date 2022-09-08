package com.tweetapp.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.tweetapp.model.TweetLiked;

public interface LikedTweetRepository extends MongoRepository<TweetLiked, String>{

	Optional<TweetLiked>findByIdAndUserName(String id, String userName);
}
