package ch08.extended.calculator;

public class Computer extends Calculator {

	@Override // 재정의 하겠다!
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 재정의 결과");
		return Math.PI * r * r;
	} // 자식 클래스 (최신형 컴퓨터)

}
