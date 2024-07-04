package ch12.beepTest;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	// 소리가 나는 스레드
	
	// 추상메서드
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		Toolkit toolkit = Toolkit.getDefaultToolkit();  // 객체화
		for(int i=0; i<10; i++) {
			toolkit.beep();   // 사운드로 경고음이 출력됨.
			
			try {
				Thread.sleep(1000);
			} catch (/* Interrupted */Exception e) {
				e.printStackTrace();
			}  // 1초 동안 대기 상태
		} // 소리나는 for end of
	}

	
}
