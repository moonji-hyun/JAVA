package ch08.extended.vehicle;

public class Bus extends Vehicle{

	// 필드
	String type;
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}  //탈것의 자식 객체
	
	public void busCard() {
		System.out.println("승차권으로 판단합니다.");
	}
	

}
