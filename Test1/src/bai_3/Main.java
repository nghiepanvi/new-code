package bai_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("so luong san pham can nhap la: ");
         int m = sc.nextInt();
         Computer [] computer = new Computer[m];
         for (int i = 0; i < computer.length; i++) {
			computer[i] = new Computer();
			  System.out.println("san pham: " + (i+1));
			computer[i].inPut();
		}
         System.out.println("----------------------------------------");
         
         System.out.println("Xuat thong tin san pham đã nhập");
         for (int j = 0; j < computer.length; j++) {
        	 System.out.println("san pham: " + (j+1));
        	 computer[j].outPut();
 			
 		}
         System.out.println("----------------------------------------");
         System.out.println("Sản phẩm của hãng IBM");
         for (int j = 0; j < computer.length; j++) {
        	 if(computer[j].getProducer().equalsIgnoreCase("IBM")) {
        		 computer[j].printIBM();
        	 }
 		}
         System.out.println("----------------------------------------");
  // săp xếp mảng theo thứ tự giá tăng dần
         System.out.println("Danh sach san pham gia tang dan");
        float sortPrice [] = new float[m];
         for (int k = 0; k < m; k++) {
        sortPrice[k] = computer[k].getPrice();
			
		}
         Arrays.sort(sortPrice);
         
         for (int i = 0; i < sortPrice.length; i++) {
        	 for (int j = 0; j < sortPrice.length; j++) {
				if(computer[j].getPrice() == sortPrice[i]) {
					System.out.println(computer[j].getProducer()+ " | "+ computer[j].getBrand()+ "  |  "
							+ sortPrice[i]);
				}
			}
        	
		}
         System.out.println("----------------------------------------");
// xóa sản phẩm hãng intel
           Computer com = new Computer();
          
           System.out.println(" Danh sach mang sau khi xoa sản phẩm của hang Intel");
           com.printRemoveIntel(computer);
		}
	}	
               
                 

