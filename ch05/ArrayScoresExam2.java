package ch05;

import java.util.Scanner;

public class ArrayScoresExam2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		int count =0;
		
		while(run) {
			System.out.println("1. 학생수를 입력하세요.");
			System.out.println("2. 점수를 입력하세요.");
			System.out.println("3. 수정할 번호를 입력하세요.");//수정할 점수 연결
			System.out.println("4. 입력한 점수 확인.");
			System.out.println("5. 총점을 계산합니다.");
			System.out.println("6. 평균을 계산합니다.");
			System.out.print(">>>");
			int select = input.nextInt();
			
			
			switch(select) {
			case 1:
				System.out.print(">>>> ");
				 count=input.nextInt();
				System.out.println("학생은 총 " + count + "명입니다.");
				System.out.println();
				
				break;
			case 2:				
				int[] scores = new int[count]; //키보드로 입력받은 값을 토대로 배열 길이 생성
				System.out.println("배열의 길이 : " + scores.length);
				for(int i = 0 ; i < scores.length ; i++ ) { //scores.length(배열길이)
					System.out.println( (i + 1) + "번째 학생의 점수를 입력하세요");
					scores[i] = input.nextInt();		
				}
				break;
			case 3:
			
				break;
			case 4:
				
				break;	
			case 5:
				
				break;
			case 6:
				
				break;
			default :
				System.out.println("잘못된 번호입니다. 확인하고 다시 눌러주세요");
				break;
			
			} // switch 종료
			
			
		} //while문 종료
		
		
	} // main()메서드 종료
	
	
	
	
	
	

} // class 종료
