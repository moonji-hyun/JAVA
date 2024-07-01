package ch08.extended.car;

public class SportCar extends Car{ // 자식
	
	@Override  // 재정의용인지 검토
	public void speedUp() {
		speed += 5;		
	} 
	
//	@Override
//	public void stop() {
//		
//	} 상속 재정의 안됨.
	
	public void stop1() {
		
	} // 새로운 메서드
	
}
