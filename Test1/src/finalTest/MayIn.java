package finalTest;

import java.util.Scanner;

public class MayIn extends May {
          private String tocDo;
          private String phanGiai ;
 public MayIn () {
	 
 }
public MayIn(String tocDo, String phanGiai) {
	super();
	this.tocDo = tocDo;
	this.phanGiai = phanGiai;
}

     public String getTocDo() {
	return tocDo;
}
public void setTocDo(String tocDo) {
	this.tocDo = tocDo;
}
public String getPhanGiai() {
	return phanGiai;
}
public void setPhanGiai(String phanGiai) {
	this.phanGiai = phanGiai;
}
	@Override
 public void inPut () {
	 super.inPut();
	
		Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap toc do in: " );
		tocDo = sc.nextLine();
		 System.out.println("Nhap do phan giai: " );
			phanGiai = sc.nextLine();
	 
 }
     @Override
 public void outPut () {
	 super.outPut();
	 System.out.println("Toc do in: " + tocDo );
	 System.out.println("Toc do phan giai: " + phanGiai );
 }
     void display () {
    	 System.out.println(super.getTenNSX() + "   |   "+ super.getNhanHieu()+"   |   "+super.getGiaThanh() );
    	
     }
}
