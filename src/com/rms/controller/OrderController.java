package com.rms.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rms.model.Confirmation;
import com.rms.model.Order;

@Controller
public class OrderController {

	@MessageMapping("/order")
	@SendTo("/topic/showConfirm")
	public Confirmation acceptOrder(Order order) throws InterruptedException {
		Thread.sleep(3000); // simulated delay
		return new Confirmation(order);
	}

	@RequestMapping("/start")
	public String start() {
		return "starting...";
	}
}
