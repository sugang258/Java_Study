package com.gang.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String num1 = "홀수";
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		if (num%2 == 0) {
			num1 = "짝수";
		}
		System.out.println(num1);

	}

}
