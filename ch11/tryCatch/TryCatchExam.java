package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchExam {

	public static void main(String[] args) {
		// 예외처리문의 기본은 Try - Catch - Finally
		// Try -> 예외발생가능 코드
		// Catch -> 예외처리 코드
		// Finally -> 항상실행되는 코드
		// 예외처리는 대부분 이클립스가 빨간 밑줄로 알려주지만
		// 실행 후 발생하는 런타임 예외는 경험으로 처리를 해야 한다.
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class clazz = Class.forName(scanner.next());
			//예외가 발생할 수 있는 확율이 있는 코드
			System.out.println("클래스가 존재합니다.");
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();  // 예외 로그 출력
		} finally {
			System.out.println("프로그램이 종료 됩니다.");
		}

	}

}
