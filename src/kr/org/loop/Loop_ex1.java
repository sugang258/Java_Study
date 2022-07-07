package kr.org.loop;

import java.util.Scanner;

public class Loop_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0-9 출력하는 반복문
		//단, 출력은 짝수만 출력
		for(int i=0;i<10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		//0-9 출력하는 반복문
		//단, if문을 사용하지 않고 출력
		for(int i=0;i<10;i+=2) {
			System.out.println(i);
		}
		
		//멍멍 출력
		//출력하는 횟수를 입력받아서 그 횟수만큼 출력
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		a=sc.nextInt();
		
		for(int i=0; i<a; i++) {
			System.out.println("멍멍");
		}

	}

}
