package ch08.lineage.service;

import java.util.Scanner;

import ch08.lineage.DTO.Account;

public class LoginService {
	// 로그인에 관한 부메뉴 용
						//      메뉴를 호출했을때 받을 것들
	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) { 
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 회원수정 | 4. 빠져나가기");
		System.out.print(">>>");
		int select = scanner.nextInt();
		switch(select) {
		case 1: 
			System.out.println("로그인을 시작합니다.");
			System.out.print("id : ");
			String id = scanner.next();
			System.out.print("pw : ");
			String pw = scanner.next();
			Account account = new Account(); // 입력받은 id, pw를 넣을 객체 생성
			account.setId(id);
			account.setPw(pw); // 새로만든 account 객체에 id, pw 삽입
			
			//배열에 있는 값과 비교
			for(int i =0 ; i<accounts.length; i++) {
				if(accounts[i] != null ) { // 빈객체 비교
					if(accounts[i].getId().equals(account.getId())) { 
						System.out.println("해당하는 id가 있습니다");
						if(accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인 성공");
							break;
						}else {
							System.out.println("해당하는 pw가 없습니다.");
						} // switch-for-if-if-if end of
					}else {
						System.out.println("해당하는 id가 없습니다.");
					} // switch-for-if-if end of					
					
				}else{
					System.out.println("해당하는 정보(객체)가 없습니다.");
					break;
				}// switch-for-if end of
			} // switch-for end of
			break;
		
		} // switch end of		
		return loginAccount;
	} // menu() end of
}
