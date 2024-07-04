package ch12.shareThread;

public class CalcExam {

	public static void main(String[] args) {
		// 만든 스레드를 동작시킴
		
		Calculator calculator = new Calculator();  // Calculator 객체 생성
		
		User1 user1 = new User1();					//User1 객체 생성
		user1.setCalculator(calculator);
		user1.start(); // 스레드 시작
		
	//	Calculator calculator2 = new Calculator();  // Calculator 객체 생성  // 
		
		User2 user2 = new User2();					//User2 객체 생성
		user2.setCalculator(calculator); // 객체가 공유됨
		user2.start();

	}

}
