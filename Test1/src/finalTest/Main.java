package finalTest;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("so may in can nhap");
		int n = scanner.nextInt();
		MayIn m[] = new MayIn[n];
		System.out.println("nhap thong tin may in");
		for (int i = 0; i < m.length; i++) {
			System.out.println("may in thu: " + (i + 1));
			m[i] = new MayIn();
			m[i].inPut();
		}
		System.out.println("Xuat thong tin may in");
		for (int i = 0; i < m.length; i++) {
			System.out.println("may in: " + (i + 1));
			m[i].outPut();;
		}
		System.out.println("---------------------------");
// sắp xếp máy in theo thứ tự giá giảm dần
		int newMayIn[] = new int[n];
		// lay gia thanh luu vào mang
		for (int i = 0; i < n; i++) {
			newMayIn[i] = m[i].getGiaThanh();
		}
		// sap xep mang giảm dan
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				if (newMayIn[j] < newMayIn[j + 1]) {
					int temp = newMayIn[j];
					newMayIn[j] = newMayIn[j + 1];
					newMayIn[j + 1] = temp;
				}
			}
		}
		// in mảng dã sắp xêp
		System.out.println("In danh sachs mays in gia giam dan:");
		for (int i = 0; i < n; i++) {
			if (m[i].getGiaThanh() == newMayIn[i]) {
				System.out.print(i+1+ ". ");
				m[i].display();;
			}
		}
// in danh sách máy in giá thấp nhất
		 int min = m[0].getGiaThanh();
		 for (int j = 0; j < n; j++) {
				if(m[j].getGiaThanh() < min) {
					min = m[j].getGiaThanh();
				}
			}
		 System.out.println("In danh sach mays in gia thap nhat:");
		 // in may in gia re nhat
		 for (int k = 0; k < m.length; k++) {
			if(m[k].getGiaThanh()== min) {
				m[k].display();
			}
		}
	}

}
