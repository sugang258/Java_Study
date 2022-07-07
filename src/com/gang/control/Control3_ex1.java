package com.gang.control;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터, 국어, 영어, 수학 점수 차례로 입력
		// 총점과 평균을 계산
		// 90점 이상이면 a
		// 80점 이상이면 b
		// 70점 이상이면 c
		// 60점 이상이면 d
		// 나머지 f
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
		
		if(average >= 90) {
			System.out.println("A");
		}else if(average >= 80) {
			System.out.println("B");
		}else if(average >= 70 ) {
			System.out.println("C");
		}else if(average >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
