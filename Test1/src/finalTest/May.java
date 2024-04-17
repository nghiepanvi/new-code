package finalTest;

import java.util.Scanner;

public class May {
private String tenNSX;
private String diaChi;
private String nhanHieu;
private int giaThanh;
public May () {
	
}

public May(String tenNSX, String diaChi, String nhanHieu, int giaThanh) {
	this.tenNSX = tenNSX;
	this.diaChi = diaChi;
	this.nhanHieu = nhanHieu;
	this.giaThanh = giaThanh;
}

 void inPut () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap ten nsx: ");
	tenNSX = sc.nextLine();
	System.out.println("Nhap dia chi");
	diaChi = sc.nextLine();
	System.out.println("nhan hieu");
      nhanHieu = sc.nextLine();
      System.out.println("Nhap gia thanh");
      giaThanh = sc.nextInt();
}
 void outPut() {
	System.out.println("Ten nsx: " + tenNSX);
	System.out.println("diaChi: " + diaChi);
	System.out.println("nhan hieu: " + nhanHieu);
	System.out.println("Gia thanh: " + giaThanh);
	
}

public String getTenNSX() {
	return tenNSX;
}

public void setTenNSX(String tenNSX) {
	this.tenNSX = tenNSX;
}

public String getDiaChi() {
	return diaChi;
}

public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}

public String getNhanHieu() {
	return nhanHieu;
}

public void setNhanHieu(String nhanHieu) {
	this.nhanHieu = nhanHieu;
}

public int getGiaThanh() {
	return giaThanh;
}

public void setGiaThanh(int giaThanh) {
	this.giaThanh = giaThanh;
}

}
