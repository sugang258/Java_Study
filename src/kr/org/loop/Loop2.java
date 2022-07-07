package kr.org.loop;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0; i<10; i++) {
			if(i%2 != 0) {
				System.out.println(i);
				continue;
			}
			System.out.println(i);
		}
		
		for(int i =0; i<10;i++) {
			System.out.println(i);
			break;
		}

	}

}
