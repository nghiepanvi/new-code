package bai_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Nhap so giang vien");
		 int n = scanner.nextInt();
		 GiangVien a [] = new GiangVien [n];
		 for (int i = 0; i < a.length; i++) {
		       System.out.println("Giang vien thu: " + (i+1));
			a[i] = new GiangVien();
			a[i].input();
		}
		 System.out.println("Xuat danh sach giang vien");
		for (int i = 0; i < a.length; i++) {
				a[i].outPut();  
			}
		 System.out.println("Bang luong");
			for (int i = 0; i < a.length; i++) {
				System.out.println("Ho ten: " + a[i].getName());
					 System.out.format("Luong: %10.1f \n", a[i].tinh_luong());
				}
	}

}
