package ch07.exam1.package1;

public class A{

	// 접근 제한자를 생략하면 default 처리 됨.
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	
		public A(boolean b) {
			// public 공용 -> 어디서나 사용 가능	
		}
		A(int b){ // default 접근 제한.
			
		}
		private A (String s) { 
			// private 개인적인 자신 클래스 안에서만 허용
			
		}
	
	// 메서드
}
