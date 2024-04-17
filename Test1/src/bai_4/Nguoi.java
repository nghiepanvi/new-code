package bai_4;

import java.util.Scanner;

public class Nguoi {
 private String name;
 private String gender;
 private String birthDay;

public Nguoi () {}
public Nguoi(String name, String gender, String birthDay) {
	
	this.name = name;
	this.gender = gender;
	this.birthDay = birthDay;

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

 public void input () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập tên");
	name = sc.nextLine();
	System.out.println("Nhập giới tính");
	gender = sc.nextLine();
	System.out.println("Nhập ngày sinh");
      birthDay = sc.nextLine();
     
}
public void outPut() {
	System.out.println("Ho ten: " +name);
	System.out.println("Gioi tinh: " +gender);
	System.out.println("Ngay sinh: " +birthDay);

}

 
}
