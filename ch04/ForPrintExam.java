package ch04;

public class ForPrintExam {

	public static void main(String[] args) {
		// for문은 횟수가 정해진 반복문이다.
		// for(초기값; 조건식; 증감식){ 실행문1; 실행문2;....}실행블럭
		
		for(int i=1;   // 초기값
				i<=10; // 조건식
				i++    // 증감식
			) {
			//실행문
			System.out.println("1~10까지 출력 : " + i);
			
		}// for문 종료
		
		System.out.println("====================");
		
		for(int j=0; j<=10; j+=2 ) {
			System.out.println("1~10까지 짝수 출력 : " + j);
		}// for문 종료
		
		System.out.println("====================");
		
		for(int k=1; k<=10; k+=2 ) {
			System.out.println("1~10까지 홀수 출력 : " + k);
		}// for문 종료
		
		System.out.println("====================");
		
		int sum = 0;// 총합의 누적 계산용
		for(int i=1; i<=100; i++) {
			sum = sum + i ; //sum+=i 와 동일
		}
			System.out.println("1~100까지의 합 출력 : " + sum);
			
		System.out.println("====================");
			
			
		for(int m=0, n=100; m<=10 && n>=90 ; m++, n--) {
			System.out.println("m값의 증가 : " + m + " // n값의 감소 : " + n);
		}// for문 종료
						
	}
		
	
}
