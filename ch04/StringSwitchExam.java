package ch04;

import java.util.Scanner;

public class StringSwitchExam {

	public static void main(String[] args) {
		// String 타입도 switch문으로 활용할 수 있다.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("본인의 직급을 엽력해주세요. : ");
		String position = input.next();
		
		switch(position) {
		case "부장":
			System.out.println(position + " 성과급은 1000만원");
			break;
			
		case "과장":
			System.out.println(position + " 성과급은 1500만원");
			break;
			
		case "대리":
			System.out.println(position + " 성과급은 2000만원");
			break;	
			
		default :
			System.out.println("성과급 없음.");
			break;
			
		} // switch 종료

	} // main 종료

} // class 종료
