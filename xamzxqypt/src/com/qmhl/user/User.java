package com.qmhl.user;

public class User {
	
	 private int id;
	 
	 
	 private String userName;
	 
	 
	 private int age;
	 
	 
	 private String address;
	 

	 private String tel;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", age=" + age + ", address=" + address + ", tel=" + tel
				+ "]";
	}

}
