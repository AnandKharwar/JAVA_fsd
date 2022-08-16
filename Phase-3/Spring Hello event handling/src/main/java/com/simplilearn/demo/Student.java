package com.simplilearn.demo;

public class Student {
	
	private String name;
	private int id;
	private Marks marks;
	
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}