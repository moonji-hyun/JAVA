package ch06.Board;

import java.util.Scanner;

public class BoardExam {
	public static Scanner input = new Scanner(System.in);
	public static Member[] members = new Member[100];
	public static Board[] boards = new Board[1000];

	public static void main(String[] args) {
		// 게시판을 구현 해보자.
		// 객체는 2개 (Member, Board)
		// 회원제용 게시판 구현 용

		System.out.println("=====회원제 게시판=====");
		boolean run = true;
		while (run) {
			System.out.println("1. 회원관리 | 2. 게시판 | 3. 종료");
			System.out.println(">>>");
			int select = input.nextInt();
			switch (select) {
			case 1:
				System.out.println("회원관리 클래스로 진입합니다.");
				Member member = new Member(); // 빈 객체 생성
				member.menu(input, members); 
				
				break;
			case 2:
				System.out.println("게시판관리 클래스로 진입합니다.");

				break;
			case 3:
				System.out.println("종료 합니다.");
				run = false;
				break;
			default:
				System.out.println("1~3값만 입력하세요.");
			} // switch end of

		} // while end of

	} // main() method end of

} // class end of
