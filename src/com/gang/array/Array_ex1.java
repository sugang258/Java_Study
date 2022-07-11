package com.gang.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 인원수를 입력받아서
		//인원 수 만큼 이름을 입력받아서
		//이름들을 출력
		int a = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수를 입력하세요");
		a = sc.nextInt();
		String names [] = new String[a];
		
		for(int i =0; i<names.length;i++) {
			System.out.println(i + "번째 이름은");
		names[i] = sc.next();
		}
		
		for(int i=0; i < names.length; i++) {
			System.out.println(i + "번째 이름은 " + names[i]);
		}
	}

}
