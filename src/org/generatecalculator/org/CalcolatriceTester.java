package org.generatecalculator.org;

import java.util.Scanner;

public class CalcolatriceTester {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dimmi il primo numero?");
		float num1 = sc.nextInt();
		System.out.print("Dimmi il secondo numero?");
		float num2 = sc.nextInt();
		Calcolatrice c = new Calcolatrice(num1,num2);
		c.add(num1, num2);
		System.out.print("la somma dei due numeri scelti è :" + c.add(num1, num2));
		System.out.println("\n--------------");
		
		c.substract(num1, num2);
		System.out.print("la sottrazione dei due numeri scelti è :" + c.substract(num1, num2));
		System.out.println("\n--------------");
		

		c.multiply(num1, num2);
		System.out.print("la moltiplicazione dei due numeri scelti è :" + c.multiply(num1, num2));
		System.out.println("\n--------------");

		c.divide(num1, num2);
		System.out.print("la divisione dei due numeri scelti è :" + c.divide(num1, num2));
		System.out.println("\n--------------");
		
		
		

}
}
