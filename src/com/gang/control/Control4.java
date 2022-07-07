package com.gang.control;

public class Control4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int select = 1;
		switch (select * 2 + 1 -3) {
		case 1: System.out.println("1일때 진행");
		break;
		case 2 : System.out.println("2일때 진행");
		break;
		
		default:
			System.out.println("그 외 나머지 진행");
		
		}
	}

}
