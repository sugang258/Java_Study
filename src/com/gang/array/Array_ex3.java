package com.gang.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학교 성적프로그램
	      //1. 학생 정보 입력
	      //   -학생 수를 입력
	      //   -이름, 번호, 국어, 영어, 수학 입력 후 계산 총점, 평균
	      //2. 학생 정보 조회
	      //   -모든 학생의 이름, 번호, 총점, 평균 출력
	      //3. 학생 정보 검색
	      //   -검색할 학생의 번호를 입력
	      //   -입력한 번호와 일치하는 학생의 모든 정보 출력
	      //   -일치하는 번호가 없으면 없는 학생이다 출력
	      //4. 학생 정보 삭제
	      //   -삭제할 학생의 번호를 입력
	      //   -입력한 번호와 일치하는 학생의 정보 삭제 (배열을 한칸 삭제)
	      //   -일치하는 번호가 없으면 없는 학생이다 출력
	      //5. 학생 정보 추가
		  //   -이름, 번호, 국어, 영어 수학 입력 후 계산 총점, 평균 추가
	      //6. 프로그램 종료
		
		  int num = 0;
	      boolean check = true;
	      
	      String [] student_name = new String[10];
	      int [] student_num = new int [10];
	      int [] student_kor = new int[10];
	      int [] student_eng = new int [10];
	      int [] student_math = new int [10];
	      int [] student_total = new int [10];
	      double [] student_avg = new double [10];
	      
	      Scanner sc = new Scanner(System.in);
	      
	      while(check) {
	         System.out.println("1.학생정보입력 2.학생정보조회 3.학생정보검색 4.학생정보삭제 5.학생정보추가 6.프로그램 종료");
	         num = sc.nextInt();
	         
	         System.out.println(num + "을 선택하셨습니다.");
	         if(num == 1) {
	        	 System.out.println("학생 수를 입력하세요");
	        	 int student = sc.nextInt();
	        	 
	        	 student_name = new String[student];
	        	 student_num = new int[student];
	        	 student_kor = new int[student];
	   	      	 student_eng = new int[student];
	   	      	 student_math = new int [student];
	   	         student_total = new int [student];
	   	      	 student_avg = new double[student];
	   	      	 
	   	      	 for(int i = 0; i < student; i++) {
	   	      		 System.out.println("학생의 이름을 입력해주세요");
	   	      		 student_name[i] = sc.next();
	   	      		 System.out.println("학생의 번호를 입력해주세요");
	   	      		 student_num[i] = sc.nextInt();
	   	      		 System.out.println("학생의 국어 점수를 입력해주세요");
	   	      		 student_kor[i] = sc.nextInt();
	   	      		 System.out.println("학생의 영어 점수를 입력해주세요");
	   	      		 student_eng[i] = sc.nextInt();
	   	      		 System.out.println("학생의 수학 점수를 입력해주세요");
	   	      		 student_math[i] = sc.nextInt();
	   	      		 student_total[i] = student_kor[i] + student_eng[i] + student_math[i];
	   	      		 student_avg[i] = student_total[i] / 3;
	   	      	 }
	        	 
	         }else if (num == 2) {
	        	 String[] student_name1 = student_name;
	        	 int [] student_num1 = student_num;
	        	 int [] student_total1 = student_total;
	        	 double [] student_avg1 = student_avg;
	        	 
	        	 for(int i=0;i<student_name1.length;i++) {
	        		 System.out.println(student_name1[i] + " " + student_num1[i] + " " + student_total1[i] + " " + student_avg1[i]);
	        	 }
	        	 
	            
	         }else if (num == 3) {
	        	 
	        	 String[] student_name1 = student_name;
	        	 int [] student_num1 = student_num;
	        	 int [] student_total1 = student_total;
	        	 double [] student_avg1 = student_avg;
	        	 
	        	 System.out.println("검색할 학생의 번호를 입력하세요");
	        	 int s_num = sc.nextInt();
	        	 boolean check1 = false;
	        	 while(!check1) {
	        	for(int i=0; i<student_name1.length;i++) {
	        		if(s_num == student_num1[i]) {
	        			System.out.println(student_name1[i] + " " +student_num1[i] +" " + student_total1[i] + " " + student_avg1[i]);
	        			break;
		        	 }
        			//check1 = true;
		        	 }
	        	check1 =true;
	        	System.out.println("일치하는 학생이 없습니다.");
	        	}
	        
	         }else if (num == 4) {
	        	 String[] student_name1 = null;
	        	 int [] student_num1 = null;
	        	 int [] student_total1 = null;
	        	 double [] student_avg1 = null;
	        	 
	        	 System.out.println("삭제할 학생의 번호를 입력하세요");
	        	 int s_num = sc.nextInt();
	        	 boolean check1 = false;
	        	 
	        	 while(!check1) {
	       
	        	 for(int i=0; i<student_name1.length;i++) {
	        		 if(s_num == student_num1[i]) {
	        			
	        			 String[] student_name2 = new String [student_name1.length-1];
	        			 int [] student_num2 = new int[student_num1.length-1];
	        			 int [] student_total2 = new int[student_total1.length-1];
	        			 int [] student_avg2 = new int[student_avg1.length-1];
	        			
	        			 break; 
	        		 }
	        		 }
    			 check1 = true;
        		 System.out.println("일치하는 학생이 없습니다.");

	        	 }
	        	
	            
	         }else if (num == 5) {
	            
	         }else {
	        	 System.out.println("프로그램 종료");
	            break;
	         }
	      }
	   

	}
}
