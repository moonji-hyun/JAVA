package ch06.car;

public class Car {
	//자동차 객체용 클래스
	
	// 필드 (멤버 변수)
		// 고유데이터
		String Company; // 제조회사
		String model; 	// 모델명
		String color;   // 자동차 생삭
		int maxSpeed;   // 최고 속도
		int minSpeed;   // 최저 속도
		// 상태
		int speed; 		// 현재 속도
		int rpm;  		// 현재 엔진 회전수
		boolean start;     // 시동 유무
			
		// 부품 ( Body body중 Body위에 마우스 올리면 클래스 생성뜸)
		Body body;
		Engine engine;
		Tire tire;
		
		
		
	
	
	//생성자 (new)- 시작할때 값을 먼저 받음.
	// source -> generate constructor using field로 자동 생성
		public Car() {
			
		} // 기본 생성자 <- 사용자지정 생성자가 있어서 자동생성 안됨.
		public Car(String company, String model, String color, int maxSpeed, int minSpeed, boolean start) {
			super(); // 상속에 관련된 메서드
			Company = company;
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			this.minSpeed = minSpeed;
			this.start = start;
		}
		
		
		@Override //재정의 코드(객체를 문자열로 출력)
		public String toString() {
			return "Car [Company=" + Company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
					+ ", minSpeed=" + minSpeed + ", speed=" + speed + ", rpm=" + rpm + ", start=" + start + "]";
		}
		
	
	//메서드 (동작)
	//source -> generate toString  //테스트용 코드
		
	
}
