package com.gang.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월급을 입력
		//1. 정규직 2. 계약직
		//정규직 - 국민연금 1% , 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		double s = 0l;
		int a = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요");
		s = sc.nextInt();
		System.out.println("정규직이면 1, 계약직이면 2를 입력하세요");
		a = sc.nextInt();
		
		if(a == 1) {
			s = s - (s*0.01 + s*0.014 + s*0.005 + s*0.007 );
		}else {
			s = s - (s*0.033);
		}
		
		System.out.println("월급은 " + s + "원 입니다.");
	}

}
