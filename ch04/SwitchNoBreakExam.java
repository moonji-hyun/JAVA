package ch04;

public class SwitchNoBreakExam {

	public static void main(String[] args) {
		// switch문은 의도에 따라서 break를 생략할 수 있다.
		// 시간에 따라서 스케쥴 제공 프로그램 제작
		
		int time = (int)(Math.random()*10) +8 ; // 8시부터 17시
		System.out.println("현재 시간 : " + time + "시");
		
		switch(time) {
		case 9 :
			System.out.println("1교시 출석을 부르고 어제 배운 내용을 복습 합니다.");
		
		case 10 :
			System.out.println("2교시 다음 내용을 교사와 함께 실습을 진행 합니다.");
		
		case 11 :
			System.out.println("3교시 다음 내용을 교사와 함께 실습을 진행 합니다.");
		
		case 12 :
			System.out.println("4교시 응용 실습을 진행 합니다.");
		
		case 13 :
			System.out.println("점심 식사를 하고 옵니다.");
		
		case 14 :
			System.out.println("5교시 오후 수업을 시작합니다.");	
		
		case 15 :
			System.out.println("6교시 오후 수업을 시작합니다.");	
		
		case 16 :
			System.out.println("7교시 오후 응용 실습을 진행 합니다.");	
			
		case 17 :
			System.out.println("8교시 실습한 내용을 github에 백업합니다.");	
			break;
			
		default :
			System.out.println((time) + "시 현재 일과시간이 아닙니다. 휴식하세요.");
		
			
		
		}// switch문 종료
		

	} // main() 종료

} // class종료
