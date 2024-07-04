package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		// StringBuilder는 신형문자열 처리 방법으로 객체의 문자열을 수정, 추가 할 수 있다.
		// 동기화되지 않는다는 점(비동기화)을 제외하고는 StringBuffer 클래스와 메서드가 같다.
		// 동기화 :  여러 객체가 변수를 같이 쓰는 개념.
		// 구현에서 빠르기 때문에 우선적으로 활용한다.
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드(thread) 환경에서 안정적이지 않음!

		StringBuilder stringBuilder = new StringBuilder(); 		// 16개 문자열 배열
		StringBuilder stringBuilder1 = new StringBuilder("Hello "); //6개 문자열 배열
		StringBuilder stringBuilder2 = new StringBuilder("Hello ");
		StringBuilder stringBuilder3 = new StringBuilder(50); 		// 50개 문자열 배열
		
		stringBuilder1.append("Programming"); //HELLO Programming
		System.out.println(stringBuilder1);
		
		stringBuilder1.insert(6, "Java ");	// 인덱스 번호 6번에 삽입.
		System.out.println(stringBuilder1);
		
		stringBuilder1.replace(1, 4, "Good");	// 인덱스 1번부터 4번 전까지를 Good으로 변경
		System.out.println(stringBuilder1);
		
		stringBuilder1.delete(1, 5);	//1부터 5전까지 삭제
		System.out.println(stringBuilder1);
		
		stringBuilder1.reverse();
		System.out.println(stringBuilder1);
		
		System.out.println(stringBuilder1.equals(stringBuilder2));  // equals 재정의 안됨
	}

}
