package bai_1;
import java.util.Scanner;

public class GiangVien extends Nguoi {
private String lop_day ;
private double salaryOneHour;
public GiangVien () {}

public GiangVien(String lop_day, double salaryOneHour, int timeTeachMonth) {
	super();
	this.lop_day = lop_day;
	this.salaryOneHour = salaryOneHour;
	this.timeTeachMonth = timeTeachMonth;
}
private int timeTeachMonth;


@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap lop");
		lop_day = scanner.nextLine();
		System.out.println("nhap luong / gio day");
		salaryOneHour = scanner.nextDouble();
		System.out.println("nhap so gio day / thang");
		timeTeachMonth = scanner.nextInt();
		
		
	}
@Override
	public void outPut() {

		super.outPut();
		System.out.println(lop_day);
		System.out.println(salaryOneHour);
		System.out.println(timeTeachMonth);
		
	}
public double  tinh_luong() {
	double tongLuong = 0;
	if(lop_day.equalsIgnoreCase("sang") || lop_day.equalsIgnoreCase("chieu")) {return timeTeachMonth *salaryOneHour;}
	else if(lop_day.equals("toi")) { return timeTeachMonth * salaryOneHour + 200000;}
	return tongLuong;
}

	}
	
	

