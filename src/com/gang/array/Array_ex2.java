package com.gang.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Random random = new Random();
		//random.nextInt(30); //0 ~ 29
		//몬스터 생성
		String [] monsterNames = {"고블린", "오크" ,"트롤", "골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//캐릭터 이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		
		//파이어볼
		int magicPower = 6;
		
		//몬스터 파티 생성
		//몬스터 수 입력(1-4)
		
		//입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
		int a = 0;
		System.out.println("몬스터 수를 입력하세요(1-4사이)");
		a = sc.nextInt();
		String [] monsterPartyNames = new String[a];
		int [] monsterPartyHps = new int [a];
		
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i] = monsterNames[index];
			monsterPartyHps[i] = monsterHps[index]; 
			System.out.println(monsterPartyNames[i] + "의 Hp는 : " + monsterPartyHps[i] );
		
			
		}
		System.out.println("===============================");
		
		//1. 사냥 2. 도망
		//0-6 미만의 랜덤한 데미지로 몬스터를 공격
		int choice = 0;
		boolean check = true;
		
		while (check) {
			int death = 0;

			System.out.println("1. 사냥");
			System.out.println("2. 도망");
			choice = sc.nextInt();
			
			if(choice == 1) {
			
		for(int i=0;i<monsterPartyNames.length;i++) {
			
		
			int attack = random.nextInt(magicPower);
			monsterPartyHps[i] =  monsterPartyHps[i] - attack;
			System.out.println("파이어볼 스킬 사용 " + attack);
			System.out.println(monsterPartyNames[i] + "의 Hp는 : " + monsterPartyHps[i]);
			if(monsterPartyHps[i] <= 0) {
				death = death + 1;
				System.out.println("몬스터 사냥 완료! " + death);
			}

			}
		}else {
			System.out.println("도망가자");
			//check != check;
			break;
	}
		}
}
	}
	

