package com.rms.model;

public class Confirmation {
	private String confirmation;
	private Order order;

	public Confirmation(Order order) {
		this.order = order;
	}

	public String getConfirmation() {
		this.confirmation = order.getFoodName() + " was processing";
		return confirmation;
	}
}
