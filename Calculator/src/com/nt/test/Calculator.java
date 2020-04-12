package com.nt.test;

import com.nt.beans.Mathematics;

public class Calculator {
 public static void main(String[] args) {
	Mathematics m=new Mathematics();
	System.out.println("The addition Result is: "+m.sum(20,30));
	System.out.println("The substraction Result is: "+m.sub(34, 22));
 }
}
