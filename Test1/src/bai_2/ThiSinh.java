package bai_2;

import java.util.Scanner;


public class ThiSinh extends Person {
	private String SBD;
	private int dToan;
	private int dLy;
	private int dHoa;
	 public ThiSinh () {
		 
	 }
	 

	public ThiSinh(String sBD, int dToan, int dLy, int dHoa) {
		super();
		SBD = sBD;
		this.dToan = dToan;
		this.dLy = dLy;
		this.dHoa = dHoa;
	}


	@Override
	void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so bao danh");
		SBD = scanner.nextLine();
		System.out.println("Nhap diem toan");
		dToan = scanner.nextInt();
		System.out.println("Nhap diem ly");
		dLy = scanner.nextInt();
		System.out.println("Nhap diem hoa");
		dHoa = scanner.nextInt();
	}

	void outPut() {
		super.outPut();
		System.out.println("So bao danh: " + SBD);
		System.out.println("Diem toan: " + dToan);
		System.out.println("Diem ly: " + dLy);
		System.out.println("diem hoa: " + dHoa);
	}

public boolean	diemChuan(int diemchuan) {
		ThiSinh ts = new ThiSinh();
           boolean pass = false;
		float dTB = (dToan + dLy + dHoa) / 3;
		if (dTB >= diemchuan) {
			pass = true;
		}
        return pass;
	}

}
