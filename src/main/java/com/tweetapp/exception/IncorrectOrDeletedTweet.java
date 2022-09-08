package com.tweetapp.exception;

public class IncorrectOrDeletedTweet extends Exception{

    /**
     * IncorrectOrDeletedTweet Exception
     */
    private static final long serialVersionUID = 1L;

    public IncorrectOrDeletedTweet(String msg) {

        super(msg);
    }
}
