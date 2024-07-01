package ch04;

import java.util.Scanner;

public class CarRun2Exam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		int Id = 1234;
		int speed = 0;
		final int MAXSPEED = 300;
		final int MINSPEED = 0;
		int su = 0;
		int sd = 0;
		int co = 2;

		System.out.println("M6가 입고 되었습니다.");
		System.out.println("시동을 켜기전 본인 인증을 시작합니다.");
		System.out.print("id를 입력하세요. : ");
		int id = input.nextInt();
		if (Id == id) {
			System.out.println("\n인증 성공! 시동을 켭니다.\n 안전운전 하세요.");
			System.out.println("현재 속도 : " + speed + "km/h");
			System.out.println("주행중 속도 증감을 설정해 주세요.");
			System.out.println("한 번에 가속 시킬 속도 설정 : ");
			int su1 = input.nextInt();
			su = su1;
			System.out.println("한 번에 감속 시킬 속도 설정 : ");
			int sd1 = input.nextInt();
			sd = sd1;
			System.out.println("가속 :" + su + "/ 감속 : " + sd + "로 설정됐습니다.");
		} else {
			run = false;
			System.out.println("인증 실패! 경찰 부르기전에 사라져라.");
		} // if문 종료

		while (run) {
			System.out.println("\n===================");
			System.out.println("0. 시동 종료"); // 종료 성공.
			System.out.println("1. 엑셀"); // maxspeed 설정 완
			System.out.println("2. 브레이크");// minspeed 설정 완
			System.out.println("3. 멀티미디어");//속도증감변경, 크루즈,블루투스,네비 설정, 차량정보 
			System.out.println("4. 주유하기"); // 주유 속도 완
			System.out.println("===================");

			System.out.print("0~4 숫자입력 : ");
			int select = input.nextInt();
			switch (select) {
			case 0:
				System.out.println("시동을 종료합니다.");
				run = false; // switch 종료
				System.out.println("안전운전한 당신, 칭찬합니다.");
				break;
			case 1:
				System.out.println("가속을 진행합니다.");
				speed += su;
				if (speed >= MAXSPEED) {
					speed = MAXSPEED;
				}
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
			case 2:
				System.out.println("감속을 진행합니다.");
				speed -= sd;
				if (speed <= MINSPEED) {
					speed = MINSPEED;
				}
				System.out.println("현재 속도 : " + speed + "km/h");
				break;
			case 3:
				System.out.println("멀티미디어를 실행합니다.");
				boolean run2 = true;
				while (run2) {
					System.out.println("------------------");
					System.out.println("1 : 속도증감 변경.");
					System.out.println("2 : 크루즈 기능.");
					System.out.println("3 : 블루투스 연결.");
					System.out.println("4 : 네비게이션.");
					System.out.println("5 : 차량정보.");
					System.out.println("1~5 숫자입력 : ");
					System.out.println("------------------");
					int select2 = input.nextInt();
					switch (select2) {
					case 1:
						System.out.println("한 번에 가속 시킬 속도 설정 : ");
						int su2 = input.nextInt();
						su = su2;
						System.out.println("한 번에 감속 시킬 속도 설정 : ");
						int sd2 = input.nextInt();
						sd = sd2;
						System.out.println("가속 :" + su + "/ 감속 : " + sd + "로 변경됐습니다.");
						run2 = false;
						break;
					case 2:
						System.out.println("크루즈 기능을 실행하시겠습니까?\n On:1/ Off:2");
						int co2 = input.nextInt();
						if (co == co2) {
							System.out.println("크루즈 기능이 종료 됩니다.");
						} else {
							System.out.println("크루즈 기능이 실행 됩니다.");
							System.out.println("현재 속도 : " + speed + "km/h");
						} // if문 종료
						run2 = false;
						break;
					case 3:
						System.out.println("블루투스에 연결하시겠습니까?\n연결:1/ 취소:2");
						int bt = input.nextInt();
						if (bt == 1) {
							System.out.println("기존 기기에 연결하시겠습니까? : 1 ");
							System.out.println("세로운 기기에 연결하시겠습니까? : 2 ");
							int bt2 = input.nextInt();
							if (bt2 == 1) {
								System.out.println("연결 되었습니다");
							} else {
								System.out.println("새기기를 연결해주세요.");
							}
						} else {
							System.out.println("블루투스 연결이 취소됐습니다.");
						} // if문 종료
						run2 = false;
						break;
					case 4:
						System.out.println("목적지를 설정해주세요.");
						run2 = false;
						break;
					case 5:
						System.out.println("1. 차종 : BMW F06 M6 그란 쿠페(4도어)");
						System.out.println("2. 밸브 : V8 \n3. 배기량 : 4395cc");
						System.out.println("4. 출력 : 560마력\n5. 변속기 : 7단 M-DCT ");
						System.out.println("6. 출고일 : 2024.06.12");
						run2 = false;
						break;
					}// switch문 종료

				}
				break;
			case 4:
				if (speed == 0) {
					System.out.println("주유를 진행합니다.");
				} else {
					speed = 0;
					System.out.println("시동을 끄고 주유하세요.");
					System.out.println("현재 속도 : " + speed + "km/h");
				}
				break;
			default:
				System.out.println("번호를 확인하세요.");
				break;
			}// switch문 종료

		} // while문 종료

	}// main 종료

} // class 종료
