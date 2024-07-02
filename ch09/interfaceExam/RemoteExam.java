package ch09.interfaceExam;

import java.util.Scanner;

public class RemoteExam {

	public static void main(String[] args) {
		// 인터페이스를 사용한 구현클래스를 이용해본다.

		/*
		 * Television tv = new Television(); tv.turnOn(); tv.turnOff();
		 */

		RemoteControl.changeBattery();
		System.out.println("리모컨 인터페이스를 사용합니다.");
		Scanner scanner = new Scanner(System.in);
		RemoteControl rc = null; // 인터페이스를 변수에 연결
		
		boolean condition = true;
		while (condition) {
			// 다형성
			
			System.out.println("--------------------------------------");
			System.out.println("1. tv | 2. audio | 3. 스마트TV | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print(">>>");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				rc = new Television(); // RemoteControl rc = new Television();
				  rc.turnOn(); 
				  rc.setMute(true); // 음소거 on
				  rc.setMute(false); // 음소거 off
				  rc.turnOff();
				break;
			case 2:
				rc = new Audio(); // RemoteControl rc = new Audio();
				  rc.turnOn(); 
				  rc.turnOff();
				break;
			case 3:
				rc = new SmartTelevision(); // RemoteControl rc = new SmartTelevision();
				rc.turnOn();
				// 스마트티비 타입 생성 b/c 인터페이스가 다름.
				Searchable se = new SmartTelevision();  // 2번째 인터페이스 연동
				System.out.println("인터넷 검색을 시작합니다.");
				System.out.print(">>>");
				String sc = scanner.next();
				se.search(sc);
				rc.turnOff();
				break;
			case 4:
				condition = false;
				break;
			default:
				System.out.println("1~3 값만 넣어주세요.");
			} // switch end of
			
		} // while end of

	}

}
