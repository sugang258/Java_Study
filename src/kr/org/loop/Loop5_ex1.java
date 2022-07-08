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
		int check = 0;
		boolean c = true;
		boolean login = true;
		int gold = 1000;
		while(c) {
			System.out.println("로그인 시도 하시겠습니까? (1 : 예, 2 :아니요)");
			check = sc.nextInt();
			
			if(check == 1) {
				System.out.println("Id를 입력하세요");
				Id = sc.nextInt();
				
				System.out.println("비밀번호를 입력하세요");
				Pw = sc.nextInt();
				
				if(Id == yId && Pw == yPw) {
					System.out.println("로그인 되었습니다");
					break;
				}else {
					System.out.println("정보가 맞지 않습니다.");
				}
				
			}else {
				System.out.println("로그인 종료");
				login = false;
				break;
			}
			
			System.out.println();
			
		}//while 종료
		
		/*
		 * 로그인을 안했으면 프로그램이 종료
		 * 로그인에 성공했으면 게임시작
		 * RPG
		 * 시작레벨은 1
		 * 만렙 15
		 * gold : 1000gold
		 * 모든 몬스터의 경험치는 동일
		 * 레벨 1 -> 2 : 3마리 
		 * 레벨 2 -> 3 : 6마리
		 * 레벨 3 -> 4 : 9마리
		 * 레벨 4 -> 5 : 12마리
		 * ...
		 * 레벨 14 -> 15 : 42마리
		 * 
		 * 5렙 달성시 축하금으로 1000gold 지급
		 * 10렙 달설 시 축하금으로 2000gold 지급
		 * 15렙 달성 시 축하금으로 3000gold 지급
		 */
		
		while(login) {
			for(int i = 1 ; i <15; i++) {
				
				for (int b = 1 ; b <= i*3 ; b++) {
	
					System.out.print(" 사냥 " + "경험치 " + b);
				}
				System.out.println(" 레벨 업!!! 현재 레벨 : " + (i+1));
			
				/*
				if(i == ) {
					System.out.println("레벨업 보상 " + i * 200 +" gold 지급" );
					gold =gold + i * 200;
					System.out.println("현재 보유 gold : " + gold + "gold" );
				
				}
				*/
		}
			break;
		
		}
		

	}

}
