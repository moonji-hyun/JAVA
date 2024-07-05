package ch15.functional;

public class MyFunctionExam {

	public static void main(String[] args) {
		// 원래는 인터페이스를 사용하기 위해서 구현 클래스가 있어야 한다.
		// 근데 익명의 구현 객체를 이용하기도 한다.
		
		MyFunction myFunction ;  // 인터페이스를 변수에 타입으로 설정.
		
		myFunction = (x, y) -> {
			int result = x * y;	// 실행문1
			//System.out.println(result);		// 실행문2
			return result;
		}; 	// 익명의 구현 객체 ->  동작에 실행코드를 주입.
		int result = myFunction.method(10, 20); // 실행문이 2개인 메서드 실행
		System.out.println(result);
		System.out.println("------------------------");
		System.out.println(myFunction.method(10, 20));
		
		
//		  System.out.println("--------------------"); myFunction = () -> {
//		  System.out.println("method call2"); // 실행문1 
//		  };
//		  myFunction.method();
		 
		
		System.out.println("--------------------");
		
		myFunction = (x, y) ->  x * y; 
		//myFunction.method(20, 30); // 실행문 1개로 압축시 { } 생략가능 
		System.out.println(myFunction.method(20, 30));
		
		System.out.println("--------------------");
		myFunction = (x, y) -> sum(x, y);
		System.out.println(myFunction.method(20, 30));
		
		
		
	} 	// main() end of

	public static int sum(int x, int y) {
		return (x + y);
	}
	
	
}
