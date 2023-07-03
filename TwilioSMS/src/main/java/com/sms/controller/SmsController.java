package com.sms.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
public class SmsController {
	

	
@GetMapping("/sendSms")
public ResponseEntity<String> sendSms(){
		
		
		Twilio.init("ACf1bcfa6e9b65e2fbc870ed9300d6c4cf","55670371503b5acaf92b47bd8f8554da");
	
		Message.creator(new PhoneNumber("+917018446755"),
                new PhoneNumber("5173008814"), "HI I am Pardeep Nishad 📞").create();
		
		return new ResponseEntity<String>("Message send successfully ",HttpStatus.OK);
 
	}

}
