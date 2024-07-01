package ch08.extended.vehicle;

public class Taxi extends Vehicle{

	// 필드
	String model; // 카카오택시, T택시, 수원택시
	
	
	// aptjem
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}  //탈것의 자식 객체
	
	public void meter() {
		System.out.println("요금을 측정합니다.");
	}
	

}
