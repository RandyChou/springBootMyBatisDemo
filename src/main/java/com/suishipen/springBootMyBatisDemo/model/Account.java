package com.suishipen.springBootMyBatisDemo.model;

public class Account {
	private String id;
	private double amount;
	private User user;
	
	public Account() {}
	
	public Account(double amount, User user) {
		this.amount = amount;
		this.user = user;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
