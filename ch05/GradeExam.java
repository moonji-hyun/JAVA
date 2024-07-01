package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용
		Scanner mainSC = new Scanner(System.in); // 다른 메서드에서 사용안됨.

		System.out.println("초기작업 : 학생수를 입력하세요.");
		int count = mainSC.nextInt(); // 학생수 등록완료
		String[] name = new String[count];
		byte[] engScores = new byte[count];
		byte[] korScores = new byte[count];
		int[] totalScores = new int[count];
		double[] avgScores = new double[count];
		boolean run = true;

		while (run) {
			System.out.println("=====MBC 교육센터 성적 관리 프로그램=====");
			System.out.println("1. 학생관리 | 2. 성적관리 | 3. 통계 | 4. 종료");
			System.out.println("=================================");
			System.out.print(">>>");
			int select = mainSC.nextInt(); // 1~4까지 정수 입력 후에 분기

			switch (select) {
			case 1:
				System.out.println("학생관리 메서드로 진입합니다.");
				student(name);
				break;
			case 2:
				System.out.println("성적관리 메서드로 진입합니다.");
				scores(engScores, korScores);
				break;
			case 3:
				System.out.println("통계관리 메서드로 진입합니다.");
				System.out.println("1. 합계 |2. 평균");
				int ch3 = mainSC.nextInt();
				switch(ch3) {
				case 1:
					totalScores(totalScores, engScores, korScores);
					break;
				case 2:
					avgScores(totalScores, avgScores);
					break;
				} // 통계 switch end
				
				break;
			case 4:
				System.out.println("종료 합니다.");
				run = false;
				break;

			} // 주메뉴 switch문 종료
		} // main while 종료
	} // main() 종료

	private static void avgScores(int[] totalScores,double[] avgScores) {
		// 평균
		
		for(int i = 0; i < totalScores.length; i++) {
			avgScores[i] = totalScores[i] / 2;
			System.out.println("평균 성적 : " + avgScores[i]);
		}
		
	}// avgScores() end


	private static void totalScores(int[] totalScores, byte[] engScores, byte[] korScores) {
		//합계
		
		for(int i = 0; i < totalScores.length; i++) {
			totalScores[i] = engScores[i] + korScores[i];
			System.out.println("총점 : " + totalScores[i]);
		} // end of for
		
	} // totalScore() end


	private static void scores(byte[] engScores, byte[] korScores) {
		// 점수관리용 crud
		Scanner scoresSC = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("=======성적관리메뉴=======");
			System.out.println("1. 점수등록 | 2. 점수보기  |3. 수정 | 4. 삭제 |5. 뒤로");
			System.out.println("======================");
			System.out.println(">>>");
			byte select = scoresSC.nextByte();

			switch (select) {
			case 1:
				System.out.println("======================");
				System.out.println("1. 영어 | 2. 국어");
				System.out.println("======================");
				byte ch1 = scoresSC.nextByte();
				switch (ch1) {
				case 1:
					System.out.println("======================");
					System.out.println("영어 점수 입력");
					System.out.println("======================");
					for (byte i = 0; i < engScores.length; i++) {
						System.out.println((i + 1) + "번 학생의 영어 점수를 입력하세요");
						engScores[i] = scoresSC.nextByte();
					} // case 1 for문 종료
					break;
				case 2:
					System.out.println("======================");
					System.out.println("국어 점수 입력");
					System.out.println("======================");
					for (byte i = 0; i < korScores.length; i++) {
						System.out.println((i + 1) + "번 학생의 국어 점수를 입력하세요");
						korScores[i] = scoresSC.nextByte();
					} // case 2 for문 종료
					break;
				default:
					System.out.println("입력값 오류 : 1~2번 만 입력하세요");
					break;
				} // 점수등록 switch 종료
				break;

			case 2:
				System.out.println("======================");
				System.out.println("학생 성적 확인");
				System.out.println("1. 영어성적 |2. 국어성적 |3. 영어 최고/최적 점수 |4. 국어 최고/최적 점수 ");
				System.out.println("======================");
				byte ch2 = scoresSC.nextByte();

				switch (ch2) {
				case 1:
					for (byte i = 0; i < engScores.length; i++) {
						System.out.println((i + 1) + "번 학생의 영어점수 : " + engScores[i]);
					} // 성적확인 for 종료
					break;
				case 2:
					for (byte i = 0; i < korScores.length; i++) {
						System.out.println((i + 1) + "번 학생의 국어점수 : " + korScores[i]);
					} // 성적확인 for 종료
					break;
				case 3:
					System.out.println();
					byte max = engScores[0]; // 영어점수 최대값 구하는 변수에 0번 인덱스 값을 삽입
					byte min = engScores[0]; // 영어점수 최소값 구하는 변수에 0번 인덱스 값을 삽입

					for (byte i = 1; i < engScores.length; i++) {
						if (engScores[i] > max) {
							max = engScores[i];
						} else if (engScores[i] < min) {
							min = engScores[i];
						}
					} // end of for
					System.out.println("영어 최고 점수 : " + max);
					System.out.println("영어 최저 점수 : " + min);
					break;
				case 4:
					System.out.println();
					byte max1 = korScores[0]; // 국어점수 최대값 구하는 변수에 0번 인덱스 값을 삽입
					byte min1 = korScores[0]; // 국어점수 최소값 구하는 변수에 0번 인덱스 값을 삽입

					for (byte i = 1; i < korScores.length; i++) {
						if (korScores[i] > max1) {
							max1 = korScores[i];
						} else if (korScores[i] < min1) {
							min = korScores[i];
						}
					} // end of for
					System.out.println("국어 최고 점수 : " + max1);
					System.out.println("국어 최저 점수 : " + min1);
					break;
				default:
					System.out.println("입력값 오류 : 1~4번 만 입력하세요");
					break;
				} // case2 switch 종료
				break;
			case 3: // 수정
				System.out.println("======================");
				System.out.println("학생 성적 수정");
				System.out.println("1. 영어성적수정 |2. 국어성적수정 |3. 확인 ");
				System.out.println("======================");
				byte ch3 = scoresSC.nextByte();

				switch (ch3) {
				case 1:
					System.out.println("수정할 학생 번호를 입력하세요 : ");
					byte engScore = scoresSC.nextByte();
					System.out.println("수정할 영어점수를 입력하세요 : ");
					byte engMOD = scoresSC.nextByte();
					engScores[engScore - 1] = engMOD;
					System.out.println("수정완료");
					break;
				case 2:
					System.out.println("수정할 학생 번호를 입력하세요 : ");
					byte korScore = scoresSC.nextByte();
					System.out.println("수정할 국어점수를 입력하세요 : ");
					byte korMOD = scoresSC.nextByte();
					korScores[korScore - 1] = korMOD;
					System.out.println("수정완료");
					break;
				case 3:
					System.out.println("수정된 성적 확인!");
					for (int i = 0; i < engScores.length; i++) {
						System.out.println("영어성적");
						System.out.println((i + 1) + "번 : " + engScores[i]);
					}
					for (int i = 0; i < korScores.length; i++) {
						System.out.println("국어성적");
						System.out.println((i + 1) + "번 : " + korScores[i]);
					}
					break;
				} // case 3 switch end
				break;
			case 4: // 삭제
				System.out.println("삭제할 학생 번호를 입력하세요 :");
				byte deletEngNum = scoresSC.nextByte();
				engScores[deletEngNum - 1] = 0; // 주소삭제->객체삭제
				break;
			case 5:
				run = false;
				break;

			} // switch 종료

		} // while 종료

	} // scores() 종료

	private static String[] student(String[] name) {
		// 학생관리용 crud
		Scanner studentSC = new Scanner(System.in);
		boolean run = true; // while 반복문 용

		while (run) {
			System.out.println("=======학생관리메뉴=======");
			System.out.println("1. 등록 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 뒤로");
			System.out.println("======================");
			System.out.print(">>>");
			int select = studentSC.nextInt();

			switch (select) {
			case 1:
				System.out.println("학생 등록을 시작합니다.");
				System.out.println("총 학생수는 : " + name.length);
				for (int i = 0; i < name.length; i++) { // 학생이름 반복문
					System.out.println((i + 1) + "번 학생 이름을 등록하세요");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열i에 넣음
				}
				System.out.println("학생 등록 완료");
				break;
			case 2:
				System.out.println("학생 리스트 출력!");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번 : " + name[i]);
				}
				break;
			case 3:
				System.out.println("학생 이름 수정");
				System.out.println("수정할 학생 번호를 입력하세요 : ");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요 : ");
				String nameMOD = studentSC.next();
				name[nameNum - 1] = nameMOD;
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요 :");
				int deletNum = studentSC.nextInt();
				name[deletNum - 1] = null; // 주소삭제->객체삭제
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("입력값 오류 : 1~5번 만 입력하세요");
				break;
			} // switch문 종료

		} // while문 종료
		return name;
	} // student() 종료

} // class 종료
