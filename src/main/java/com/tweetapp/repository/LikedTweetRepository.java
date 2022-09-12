package com.tweetapp.repository;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.tweetapp.model.TweetLiked;
@EnableScan
public interface LikedTweetRepository extends CrudRepository<TweetLiked, String>{

	Optional<TweetLiked>findByIdAndUserName(String id, String userName);
}
