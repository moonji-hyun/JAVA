package ch06.circle;

public class Circle2Exam {

	public static void main(String[] args) {
		// 생성자 오버로딩으로 구현
		Circle circle = new Circle(30);// public Circle(int radius) 사용
		circle.name = "김기원";

		// 동작
		double result = circle.getArea(); // 메서드 호출(동작->리턴)
		

		// 출력
		System.out.println("원의 넓이 : " + circle.radius);
		System.out.println("작성자 : " + circle.name);
		System.out.println("동작 결과 : " + result);

	}

}
