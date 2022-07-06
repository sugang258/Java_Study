package com.gang.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Scanner sc= new Scanner(System.in);
		char result = ' ';
		
		System.out.println("1-5사이의 숫자 입력");
		int num = sc.nextInt();
		
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		//num : 1 ch:a 출력 b
		//num : 2 ch:a 출력 c
		//num : 1 ch:z 출력 a
		//num : 2 ch:z 출력 b
		
		if(num<= 5 && num >=1) {
				result = (char) (ch + num);
		}if ((int)result > 123) {
			result = (char) (result - 26);
		}
		else {
			System.out.println("1-5사이의 숫자를 입력해주세요");
		}
	
		System.out.println(result);
		
		
		
	}

}
