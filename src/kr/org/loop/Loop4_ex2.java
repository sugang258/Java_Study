package kr.org.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FPS
		//총알 : 
		//탄창 1개에 총알 30발 , 3개
		
		//1. 단발(탕 x 30) 2. 점사(탕탕탕 x 10)
		
		int a = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i <3; i++) {
		
		System.out.println("1, 2 중 하나를 입력하세요(1. 단발 2. 점사)");
		a = sc.nextInt();
		
		if(a == 1) {
			for(int b = 1 ; b <= 30; b++) {
				System.out.println("탄창 : " + i + " 총알 : " + b + " 탕!♥ ");
			}
		}else if(a==2) {
			for(int b = 1 ; b <= 10 ; b++) {
				System.out.println("탄창 : " + i + " 총알 : " + b + " 탕!♥ 팅 탕!♥ ");
			}
		}else {
			System.out.println("입력이 잘못되었습니다.");
			i--;
		}
		System.out.println();
		}
	}

}
