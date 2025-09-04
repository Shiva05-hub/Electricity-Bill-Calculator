package ControlFlowexamples;
import java.util.Scanner;

public class ElectricityBills {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your electricity uage in kwh");
	
	int kwh = sc.nextInt();
	
	if(kwh<=100) {
		System.out.println(kwh*3 +" rupes is your electricity bill");
	}
	else if(kwh>=101&&kwh<=200) {
		System.out.println(kwh*5 +" rupes is your electricity bill ");
		
	}
	else if(kwh>=201&&kwh<=300) {
		System.out.println(kwh*7 +" rupes is your electricity bill");
		
	}
	else {
		System.out.println(kwh*10 +" rupes is your electricity bill");
	}
	
}
}
