package com.example.form;

public class UserForm {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getIntAge() {
		return Integer.parseInt(age);
	}

	private String name;
	private String age;
	private String comment;
}
