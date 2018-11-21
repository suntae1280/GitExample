package Homework;

public class Student {

	private String name;
	private String address;
	private int phone_num;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
	
	public void printInfo() {
		System.out.println("학생 이름 : " + this.name);
		System.out.println("학생 주소 : " + this.address);
		System.out.println("학생 번호: " + this.phone_num);
		
	}

}
