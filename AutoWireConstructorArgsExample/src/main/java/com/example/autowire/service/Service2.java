package com.example.autowire.service;

public class Service2 {

	private String object1;
	private String object2;

	public Service2(String object1, String object2) {
		super();
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public String toString() {
		return "Service2 [object1=" + object1 + ", object2=" + object2 + "]";
	}

}