package com.freestack.helloworld.apis;

public class User {
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;

	public User(String firstName, String lastName, String gender, String birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", gender='").append(gender).append('\'');
		sb.append(", birthDate='").append(birthDate).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
