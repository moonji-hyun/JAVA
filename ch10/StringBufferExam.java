package ch10;

public class StringBufferExam {

	public static void main(String[] args) { // 구형
		// String 으로 만든 문자열은 객체로 추가나 변경이 불가능하고 새로운 객체를 또 만듬.
		// StringBuffer는 문자열을 수정과 변경을 할 수 있다.		
		// StringBuilder는 싱글 스레드 환경에서 StringBuffer보다 더 빠른 성능을 가짐.
		// StringBuilder는 StringBuffer와 다르게 멀티 스레드(thread) 환경에서 안정적이지 않음!
		
		StringBuffer stringBuffer = new StringBuffer(); 		// 16개 문자열 배열
		StringBuffer stringBuffer1 = new StringBuffer("Hello "); //6개 문자열 배열
		StringBuffer stringBuffer2 = new StringBuffer("Hello ");
		StringBuffer stringBuffer3 = new StringBuffer(50); 		// 50개 문자열 배열
		
		stringBuffer1.append("Programming"); //HELLO Programming
		System.out.println(stringBuffer1);
		
		stringBuffer1.insert(6, "Java ");	// 인덱스 번호 6번에 삽입.
		System.out.println(stringBuffer1);
		
		stringBuffer1.replace(1, 4, "Good");	// 인덱스 1번부터 4번 전까지를 Good으로 변경
		System.out.println(stringBuffer1);
		
		stringBuffer1.delete(1, 5);	//1부터 5전까지 삭제
		System.out.println(stringBuffer1);
		
		stringBuffer1.reverse();
		System.out.println(stringBuffer1);
		
		System.out.println(stringBuffer1.equals(stringBuffer2));  // equals 재정의 안됨
		
	}

	@Override  // stringBuffer의 equals()를 사용하기 위한 재정의.
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
