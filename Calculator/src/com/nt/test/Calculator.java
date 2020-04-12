package com.nt.test;

import com.nt.beans.Mathematics;

public class Calculator {
 public static void main(String[] args) {
	Mathematics m=new Mathematics();
	System.out.println("Addition: "+m.sum(20,30));
	System.out.println("Substraction: "+m.sub(34, 22));
	System.out.println("Multiplication Result is: "+m.mul(24, 21));
 }
}
