package org.generatecalculator.org;

public class Calcolatrice {
	private float num1;
	private float num2;
	
	public Calcolatrice(float num1,float num2) {
		setNum1(num1);
		setNum2(num2);
	}
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public float add(float num1,float num2) {
		float numAdd = 0;
		return numAdd = num1 + num2;
	}
	public float substract(float num1,float num2) {
		float numSubstract = 0;
		if(num1 >= num2) {
			return numSubstract = num1 - num2;
		}
		else numSubstract = num2 - num1;
		return numSubstract;
	}
	public float multiply(float num1,float num2) {
		float numMultiply = 0;
		if(num1 > 0) {
			return numMultiply = num1 * num2;
		}
	
		return numMultiply;
	}
	public float divide(float num1,float num2) {
		float numDivide = 0;
		if(num1 > 0) {
			return numDivide = num1 / num2;
		}
	
		return numDivide;
	}
	
}
