package ch12.threadname;

public class ThreadA extends Thread {

	// 생성자 ( 클래스 이름과 동일, 리턴값 없음)
	public ThreadA() {
		setName("스레드A");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
