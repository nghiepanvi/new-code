package bai_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong thi sinh: ");
		int n = scanner.nextInt();
		ThiSinh a[] = new ThiSinh [n];
		System.out.println("Nhap thong tin thi sinh");
		for (int i = 0; i < n; i++) {
			a[i] = new ThiSinh();
			System.out.println("Thi sinh: " + (i+1));
			a[i].input();
		}
	    System.out.println("Hien thi thong tin thi sinh");
		for (int i = 0; i < n; i++) {
			a[i].outPut();
		}
		
		System.out.println("Nhap diem chuan");
		int diemchuan = scanner.nextInt();
	    System.out.println("Danh sach thi sinh du diem do: ");
	    for (int i = 0; i < n; i++) {
			if(a[i].diemChuan(diemchuan))
				System.out.println("Tên thi sinh do: "+ a[i].getName());
		}
	}

}
