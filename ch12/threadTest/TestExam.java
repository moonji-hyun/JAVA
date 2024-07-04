package ch12.threadTest;

public class TestExam {

	public static void main(String[] args) {
		// main 스레드
		// 타입   변수      객체
		Runnable tk = new Tesk(); // 다형성
		// Runnable타입의 tk변수를 Tesk()객체를 연결
		// 순서1) 스레드에서 실행할 코드를 객체로 받음.
		
		Thread th = new Thread(tk);
		// 스레드 타입에 th 변수에 스레드 객체를 tk를 활용하여 생성(스레드가 새로 만들어짐)
		// 순서2) 스레드가 새로 만들어짐.
		
		th.start();	// 스레드 시작
		// 순서3) 만든 스레드를 시작.
		
		System.out.println("--------익명의 구현체----------");
		Thread anonymousTH = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명의 구현체로 스레드 생성 됨.");
				
			}
		});
		anonymousTH.start();
		
		
		
		
	}

}
