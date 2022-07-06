package com.gang.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터, 국어, 영어, 수학 점수 차례로 입력
		// 총점과 평균을 계산
		// 평균이 90점 이상이면 우등상 수상 출력
		// 모든 학생들은 졸업 출력
		
		// 2) 90점 이상이면 a
	      // 80점 이상이면 b
	      // 70점 이상이면 c
	      // 70점 이상이면 d
	      // 나머지 f
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		int average = total / 3;
		
		System.out.println("총 합계는 " + total + " 점 입니다.");
		System.out.println("평균은 " + average + " 점 입니다.");

		if(average >= 90) {
			System.out.println("우등상입니다.");
			System.out.println("A학점");
		}else if(average >= 80) {
			System.out.println("B학점");
		}else if(average >= 70) {
			System.out.println("C학점");
		}else if (average >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
			System.out.println("졸업이다");
	}
	

}
