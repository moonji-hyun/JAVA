package ch12.beepTest;

import java.awt.Toolkit;

public class BeepExam {

	public static void main(String[] args) {
		// 소리와 자막이 동시에 나오고 싶은 프로그램 (단일 스레드) 
		
		Runnable beepTask = new BeepTask();
		// 스레드 run 용 객체 생성
		
		Thread th1 = new Thread(beepTask);
		// run 메서드가 들어있는 객체를 스레드에 밀어넣음.
		
		th1.start(); // 스레드 시작
		
		for(int i =0; i<10; i++) {
			
			System.out.println("띠디딩~~~!");
			try {
				Thread.sleep(1000);
			} catch (/* Interrupted */Exception e) {
				e.printStackTrace();
			}  // 1초 동안 대기 상태
		} // 자막 for end of

	}

}
