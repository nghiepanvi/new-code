package bai_4;

import java.util.Scanner;

public class Sinhvien extends Nguoi {
	String maSV;
	int diemTB;
	
	public Sinhvien() {
	}

	public Sinhvien(String maSV, int diemTB) {
		super();
		this.maSV = maSV;
		this.diemTB = diemTB;
	}




	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public int getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(int diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap maSV");
		maSV = sc.nextLine();
		System.out.println(" nhap diem TB");
		diemTB = sc.nextInt();
	}
		
	@Override
	public void outPut() {
		super.outPut();
		System.out.println("ma Sinh vien: " + maSV);
		System.out.println("Diem TB: " + diemTB);
		
	}

	public void print () {
		outPut();
	}
}
