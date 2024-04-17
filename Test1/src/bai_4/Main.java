package bai_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		Sinhvien sv[] = new Sinhvien[n];
		System.out.println("Nhap thong tin nhan vien: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhan vien thu: " + (i + 1));
			sv[i] = new Sinhvien();
			sv[i].input();
		}
		System.out.println("---------------------------------- ");
		System.out.println("Xuat thong tin nhan vien");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhan vien thu: " + (i + 1));
			sv[i].outPut();
		}
		System.out.println("---------------------------------- ");

		
		// sap xep giam dan
		System.out.println("Danh sach diem tb giam dan");
		float sort[] = new float[n];
		// tạo mảng mới sortSalary. Lấy lượng từ nv gán vào mảng mới
		for (int k = 0; k < n; k++) {
			sort[k] = sv[k].getDiemTB();

		}
		// sap xếp mảng
		for (int i = 0; i < sort.length; i++) {
			for (int j = 0; j < sort.length -1; j++) {
				if(sort[j] < sort[j+1]) {
					float temp = sort[j];
					sort[j] = sort[j +1];
					sort[j+1] = temp;
					
				}
			}
		}
		// in mảng
		System.out.println("In ds giảm dan diem tb");
		for (int k = 0; k < n; k++) {
			if (sv[k].getDiemTB() == sort[k]) {
				sv[k].print();
			}
		}
		
				System.out.println("-------------------------");
				System.out.println("In ds sinh viên điểm tb > 7.0");
				for (int k = 0; k < n; k++) {
					if (sv[k].getDiemTB() > 7.0) {
						sv[k].print();
					}
				}
	}
}
