package ch12.threadname;

public class ThreadB extends Thread {

	// 생성자 ( 클래스 이름과 동일, 리턴값 없음)
	public ThreadB() {
		setName("스레드B");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
