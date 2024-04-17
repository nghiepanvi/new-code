package bai_3;

import java.util.Scanner;

public class Computer extends Machine {
	private String speed;
	int ram;
	int hardDriver;

	public Computer() {
	}

	public Computer(String speed, int ram, int hardDriver) {
		this.speed = speed;
		this.ram = ram;
		this.hardDriver = hardDriver;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHardDriver() {
		return hardDriver;
	}

	public void setHardDriver(int hardDriver) {
		this.hardDriver = hardDriver;
	}

	public void inPut() {
		super.inPut();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap toc do may tinh Ghz: ");
		speed = sc.nextLine();
		System.out.println("Nhap dung luong ram Gb: ");
		ram = sc.nextInt();
		System.out.println("Nhap dung luong Hdd Gb: ");
		hardDriver = sc.nextInt();

	}

	public void outPut() {
		super.outPut();
		System.out.println("Toc do may tinh: " + speed + " Ghz");
		System.out.println("Dung luong ram: " + ram + " Gb");
		System.out.println("Dung luong o cung:" + hardDriver + " Gb");
	}

	public void printIBM() {
		outPut();
	}

	public void printUpPrice(Computer C) {
		System.out.print(super.getProducer() + "  |  " + super.getBrand() + " | " + super.getPrice());
	}

	public void printRemoveIntel(Computer computer[]) {
		int n = computer.length -1;
		Computer newComputer[] = new Computer[n];
		int index = 0;
		for (int i = 0; i < computer.length; i++) {
			if (computer[i].getProducer().equals("Intel")) {
				index = i;
			}

		}
		for (int i = 0, j = 0; i < computer.length; i++) {
			if (i != index) {
				newComputer[j++] = computer[i];
			}
		}
	   for (int i = 0; i < newComputer.length; i++) {
		        newComputer[i].outPut();
		 }

	}
}
