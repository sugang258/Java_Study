package kr.org.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//분과 초 입력받음
		//ex) 1, 15
		int min, sec;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분을 입력하세요");
		min = sc.nextInt();
		
		System.out.println("초를 입력하세요");
		sec = sc.nextInt();
		
		for(int m=1;m<60;m++) {
			for(int s=0;s<60;s++) {
				System.out.println(m +"분 :" + s +"초");
				if(m==min && s ==sec) {
					break;
				
		}
				
		}
			if(m == min) break;
	}
}
}

