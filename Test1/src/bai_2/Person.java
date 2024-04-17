package bai_2;

import java.util.Scanner;

public class Person {
	private String name;
	private String gioiTinh;
	private String ngaySinh;
	private String queQuan;
	private String diaChi;

	public Person() {
	}

	public Person(String name, String gioiTinh, String ngaySinh, String queQuan, String diaChi) {
	
		this.name = name;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
		this.diaChi = diaChi;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiachi(String diaChi) {
		this.diaChi = diaChi;
	}

	void input () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten: ");
		name = scanner.nextLine();
		System.out.println("gioi tinh: ");
		gioiTinh = scanner.nextLine();
		System.out.println("ngay sinh: ");
		ngaySinh = scanner.nextLine();
		System.out.println("que quan: ");
		queQuan = scanner.nextLine();	
		System.out.println("dia chi: ");
		diaChi = scanner.nextLine();
	}
	void outPut() {
		System.out.println("Ho ten: "+ name);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Ngay sinh: " +ngaySinh);
		System.out.println("Que quan: " + queQuan);
		System.out.println("Dia chi: " + diaChi);
	}
}
