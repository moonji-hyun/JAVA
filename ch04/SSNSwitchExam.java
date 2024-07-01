package ch04;

import java.util.Scanner;

public class SSNSwitchExam {

	public static void main(String[] args) {
		// if문과 비교해보기
		System.out.println("본인의 주민번호를 13자리를 입력하시오.(-포함)");
		Scanner input = new Scanner(System.in);
		String ssn = input.next();
		char gender = ssn.charAt(7); // 8번째 글자를 추출, 7번째 글자는 '-'
		//System.out.println(gender);
		
		switch(gender) {
		case '1': case '3': case '5': case '7':
			System.out.println("당신은 남자 입니다.");
			break;
		
		case '2': case '4': case '6': case '8':
			System.out.println("당신은 여자 입니다.");
			break;	
		
		default:
			System.out.println("당신은 외계인입니다.!!!");
			System.out.println("당신의 별로 돌아가세요!!");
			break;
		}
		

	}

}
