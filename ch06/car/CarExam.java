package ch06.car;

public class CarExam {

	public static void main(String[] args) {
		// 객체를 호출하는 메인 메서드
		Car myCar = new Car();
		Car yourCar = new Car("페라리", "458이탈리아", "노랑색", 350, 10, false);
		
		System.out.println("myCar : " + myCar);
		System.out.println("yourCar : " + yourCar);
		//myCar : ch06.car.Car@75a1cd57
		//yourCar : ch06.car.Car@61064425   주소값
		
		System.out.println("myCar : " + myCar.toString());
		System.out.println("yourCar : " + yourCar.toString());
		//toString을 붙여도 똑같이 주소가 뜨지만 클래스Car에 @Override toString 생성하면 결과값이 보인다.

	}

}
