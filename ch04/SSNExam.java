package ch04;

import java.util.Scanner;

public class SSNExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력 받아 남, 여 파악용
		
		/*
		  Scanner input = new Scanner(System.in);		  
		  
		  System.out.print("주민번호 7번째 숫자 입력 : "); 
		  int ssn = input.nextInt();
		  
		  if(ssn % 2 == 1 && ssn<9) { 
		  	System.out.println("성별 : 남"); 
		  }else if (ssn%2==0 && ssn<9){
		    System.out.println("성별 : 여"); 
		  }else {
		    System.out.println("입력 오류-1~8의 숫자를 입력하세요.");
		  }
		 */
		
		System.out.println("주민등록번호 13자리를 입력하세요(-생략)");
		Scanner input = new Scanner(System.in);
		
		String ssn = input.next();
		
		char ssn2 = ssn.charAt(6); //성별 확인 추출 // 6은 7번째 숫자를 의미.
		int num = Character.getNumericValue(ssn2);
		
		if(num%2==0) {
			System.out.println("여자");
		}else if(num%2==1) {
			System.out.println("남자");
		}else {
			System.out.println("다시 작성해주세요.");
		}// 성별 구분 if문 종료
		
		int year = Integer.parseInt(ssn.substring(0,2)); //태어난 년도 추출
		
		if(num==1 || num==2 || num==5 || num==6) {
			System.out.println("나이는 " + (2024-(1900+year))+ "입니다");
		}else if(num==3 || num==4 || num==7 || num==8) {
			System.out.println("나이는 " + (2024-(2000+year))+ "입니다");
		}else {
			System.out.println("다시 작성해주세요.");
		}
		
		
		int month = Integer.parseInt(ssn.substring(2,4)); //태어난 월 추출
		
		if(month<=0 || month>=13) {
			System.out.println("다시 작성해주세요.");
		}else if(month>=3 && month<=5) {
			System.out.println("봄에 태어났습니다.");
		}else if(month>=6 && month<=8) {
			System.out.println("여름에 태어났습니다");
		}else if(month>=9 && month<=1) {
			System.out.println("가을에 태어났습니다");
		}else {
			System.out.println("겨울에 태어났습니다.");
		}		
		

	}

}
