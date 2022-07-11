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
			System.out.println((i+1) + "번째 이름은");
		names[i] = sc.next();
		}
		
		for(int i=0; i < names.length; i++) {
			System.out.println((i+1) + "번째 이름은 " + names[i]);
		}
		
		//각 학생의 이름별로 국어 점수 입력 후 출력
		int kor [] = new int[names.length];
		for(int i=0; i < names.length; i++) {
			System.out.println(names[i] + "학생의 국어 점수 입력");
			kor[i] = sc.nextInt();
			
		}
		for(int i =0; i < names.length; i++) {
			System.out.println(names[i] + "학생의 국어 점수 : " + kor[i]);
		}
		
		//국어 총점을 계산하고 출력
		int total_kor =0;
		for(int i =0; i< names.length;i++) {
		total_kor = total_kor + kor[i];
		}
		System.out.println("국어 총점 : " + total_kor); 

	}

}
