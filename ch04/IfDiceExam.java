package ch04;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문을 활용하여 주사위 값을 추출 해본다.
		// Math.random() 메서드는 컴퓨터 시간의 초를 활용하여 난수를 발생 시킴
		
		int num = (int)(Math.random() * 6) +1;  //1~6사이 값이 랜덤으로 추출됨.
				
		System.out.println("주사위 값 : " + num);
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else if(num==6) {
			System.out.println("6번이 나왔습니다.");
		}else {
			System.out.println("프로그램 오류로 점검이 필요합니다.");
		}

	}

}
