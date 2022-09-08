package com.tweetapp.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection="users")
public class User {
	@Id
	private ObjectId id;
	
	@Indexed
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	@Indexed
	@NotNull
	private String email;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String contactNumber;
	
	
}
