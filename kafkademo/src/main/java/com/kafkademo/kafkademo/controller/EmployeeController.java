package com.kafkademo.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafkademo.kafkademo.kafka.Producer;



@RestController
@RequestMapping("/kafka")
public class EmployeeController {

	private final Producer producer;
	@Autowired
	public EmployeeController(Producer producer) {
	this.producer = producer;
	}
	
	  @PostMapping(value = "/publish")
	    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
	    this.producer.sendMessage(message);
	    }
}
