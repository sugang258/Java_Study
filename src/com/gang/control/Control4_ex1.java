package com.gang.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math, total, average;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		math = sc.nextInt();
		
		total = kor + eng + math;
		average = total / 3;
		
		switch (average/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
			
			default:
				System.out.println("F");
		}

	}

}
