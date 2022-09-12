package com.tweetapp.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.tweetapp.model.Tweet;
import com.tweetapp.model.User;
@EnableScan
public interface UserRepository extends CrudRepository<User, String> {
	List<User> findAll();
	List<User> findByUsernameContaining(String username);
	User findByUsername(String username);
	

}
