package com.tweetapp.model;


import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerated;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor

//@Document(collection="users")
@DynamoDBDocument
@DynamoDBTable(tableName = "User")

public class User {
	//@Id
	//private ObjectId id;
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	private String id;
	
	
	//@Indexed
	@NotNull
	@DynamoDBAttribute
	private String username;
	
	@NotNull
	@DynamoDBAttribute
	private String password;
	//@Indexed
	@NotNull
	@DynamoDBAttribute
	private String email;
	@NotNull
	@DynamoDBAttribute
	private String firstName;
	@NotNull
	@DynamoDBAttribute
	private String lastName;
	@NotNull
	@DynamoDBAttribute
	private String contactNumber;
	
	
}
