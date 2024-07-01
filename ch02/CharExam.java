package ch02;

public class CharExam {

	public static void main(String[] args) {
		// 유니코드는 0~65535 숫자에 글자테이블을 매핑하여 문자를 출력해준다.
		//char는 2byte처리가 되며 작은 따옴표로 처리 해야 한다.
		
		char c1 = 75 ;
		char c2 = 105 ;
		char c3 = 109 ;
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);
		
		char ch1 = 77 ;
		char ch2 = 79 ;
		char ch3 = 111 ;
		char ch4 = 110 ;
		
		System.out.print("My familyname is " + ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		System.out.println(ch4);

	}

}
