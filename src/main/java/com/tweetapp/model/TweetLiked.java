package com.tweetapp.model;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
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
@AllArgsConstructor
@NoArgsConstructor
//@Document(collection = "liked-tweets")
@DynamoDBDocument
@DynamoDBTable(tableName = "TweetLiked")
public class TweetLiked {
	
	//@Id
	@DynamoDBHashKey
	private String id;
	@DynamoDBAttribute
	private String userName;

}
