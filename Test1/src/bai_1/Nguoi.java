package bai_1;

import java.util.Scanner;

public class Nguoi {
 private String name;
 private String gender;
 private String birthDay;
 private String address;
public Nguoi () {}
public Nguoi(String name, String gender, String birthDay, String address) {
	
	this.name = name;
	this.gender = gender;
	this.birthDay = birthDay;
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBirthDay() {
	return birthDay;
}
public void setBirthDay(String birthDay) {
	this.birthDay = birthDay;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 public void input () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ten");
	name = sc.nextLine();
	System.out.println("Nhap gioi tinh");
	gender = sc.nextLine();
	System.out.println("Nhap ngay sinh");
      birthDay = sc.nextLine();
      System.out.println("Nhap dia chi");
      address = sc.nextLine();
}
public void outPut() {
	System.out.println("Ho ten" +name);
	System.out.println("Gioi tinh" +gender);
	System.out.println("Ngay sinh" +birthDay);
	System.out.println(" Dia chi" +address);
	
}

 
}
