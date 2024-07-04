package ch12.shareThread;

public class Calculator {
	// 공유 계산기
	
	private int memory;

	
	public int getMemory() { // 값 출력용
		return memory;
	}

	public synchronized void setMemory(int memory) {	// 값 입력용 // synchronize 동사 동시에 발생하다[움직이다], 동시에 발생하게[움직이게] 하다
		// synchronized -> 임계영역 설정으로 누가 쓰고 있으면 대기!!!
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초 딜레이
		} catch (InterruptedException e) {
			System.out.println("2초간 딜레이 중 예외 발생.");
		//	e.printStackTrace();
		} //try end of
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		// 2초 뒤에 메모리 필드값 출력
	}
	
}
