package com.tweetapp.service;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	Logger logger = LoggerFactory.getLogger(EmailSenderService.class);
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String toEmail,String body,String subject)
	{  logger.info("email service.....");
		
			SimpleMailMessage msg=new SimpleMailMessage();
			msg.setFrom("tweetapp9@gmail.com");
			msg.setTo(toEmail);
			msg.setText(body);
			msg.setSubject(subject);
			mailSender.send(msg);
			logger.info("mail sent.....");
		
	}
	public String genrateOtp() {
		String otp= UUID.randomUUID().toString().substring(0, 8);
		logger.info(otp+"  sent....");
		return otp;
	}
}
