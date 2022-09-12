package com.tweetapp.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.tweetapp.model.Tweet;
import com.tweetapp.model.User;
@EnableScan

public interface TweetRepository extends CrudRepository<Tweet, String> {
	List<Tweet> findAll();
	
	List<Tweet> findByUser(User user);
	
	List<Tweet> findTweetByUser_Username(String username);
	
	
	

}
