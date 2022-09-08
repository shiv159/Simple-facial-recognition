package com.tweetapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.model.Tweet;
import com.tweetapp.model.User;

public interface TweetRepository extends MongoRepository<Tweet, String> {
	
	List<Tweet> findByUser(User user);
	
	List<Tweet> findTweetByUserUsername(String username);
	
	

}
