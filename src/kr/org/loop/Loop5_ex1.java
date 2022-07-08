package kr.org.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yId = 1234;
		int yPw = 5678;
		
		//로그인이 성공할 때 까지
		int Id,Pw = 0;
		while(true) {
			System.out.println("Id를 입력하세요");
			Id = sc.nextInt();
			
			System.out.println("비밀번호를 입력하세요");
			Pw = sc.nextInt();
			
			if(Id == yId && Pw == yPw) {
				System.out.println("로그인 되었습니다");
				break;
			}
			System.out.println("정보가 맞지 않습니다.");
			System.out.println();
			

		}
		
		

	}

}
