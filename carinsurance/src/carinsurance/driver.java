package carinsurance;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		System.out.println("Araç tipinizi giriniz:");
		System.out.println("car, truck, bus, motor");
		Scanner k=new Scanner(System.in);
		String tip=k.nextLine();
		int premium=0;
		switch(tip) {
		case"car":
			premium =200;
			break;
		case"truck":
		premium=300;
		break;
		case"bus":
		
		premium=400;
		break;
		case"motor":
		System.out.println("Motor tipinizi giriniz:");
		System.out.println("1(low power) = <=100cc, 2(medium power) 100-150, 3(high power) 150+");
		String motortip=k.nextLine();
		int motorint = Integer.parseInt(motortip);
		switch(motorint) {
		case 1:
			premium = 300;
			break;
		case 2:
			premium = 400;
			break;
		case 3:
			premium = 500;
			break;
			default:
				System.out.println("Bilinmeyen motor tipi");
}
		break;
		default:
			System.out.println("Bilinmeyen araç tipi");
			

		}
		System.out.println("Premium is $"+premium);
		k.close();
	}
}


