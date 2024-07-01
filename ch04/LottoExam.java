package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		Scanner input = new Scanner(System.in);
		System.out.println("1~45번까지 번호중 6개를 입력해주세요.");
			
		int myNum1 = input.nextInt();
	//	System.out.println("첫 번재 번호" + myNum1);		
		int myNum2 = input.nextInt();
	//	System.out.println("두 번재 번호" + myNum2);		
		int myNum3 = input.nextInt();
	//	System.out.println("세 번재 번호" + myNum3);		
		int myNum4 = input.nextInt();
	//	System.out.println("네 번재 번호" + myNum4);		
		int myNum5 = input.nextInt();
	//	System.out.println("다섯 번재 번호" + myNum5);		
		int myNum6 = input.nextInt();
	//	System.out.println("여섯 번재 번호" + myNum6);
		
		System.out.println("내가 선택한 번호. \n" +myNum1+" "+myNum2+" "+myNum3+" "+myNum4+" "+myNum5+" "+myNum6 );
		
		int num1 = (int)(Math.random()*45)+1 ;
		int num2 = (int)(Math.random()*45)+1 ;
		int num3 = (int)(Math.random()*45)+1 ;
		int num4 = (int)(Math.random()*45)+1 ;
		int num5 = (int)(Math.random()*45)+1 ;
		int num6 = (int)(Math.random()*45)+1 ;
		
		System.out.println("=========================");
		System.out.println("이번주 로또 당첨 번호입니다. \n" +num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		System.out.println("=========================");
	
		
		int x = 0;
		if(myNum1==num1 || myNum1==num2 || myNum1==num3 || myNum1==num4 || myNum1==num5 || myNum1==num6) {
			++x;
		}
		if(myNum2==num1 || myNum2==num2 || myNum2==num3 || myNum2==num4 || myNum2==num5 || myNum2==num6) {
			++x;
		}
		if(myNum3==num1 || myNum3==num2 || myNum3==num3 || myNum3==num4 || myNum3==num5 || myNum3==num6) {
			++x;
		}
		if(myNum4==num1 || myNum4==num2 || myNum4==num3 || myNum4==num4 || myNum4==num5 || myNum4==num6) {
			++x;
		}
		if(myNum5==num1 || myNum5==num2 || myNum5==num3 || myNum5==num4 || myNum5==num5 || myNum5==num6) {
			++x;
		}
		if(myNum6==num1 || myNum6==num2 || myNum6==num3 || myNum6==num4 || myNum6==num5 || myNum6==num6) {
			++x;
		}
		
				
		if(x==0) {
			System.out.println("맞는 번호가 하나도 없습니다.");
		}else if(x==1) {
			System.out.println("번호가 1개 맞았습니다.");
		}else if(x==2) {
			System.out.println("번호가 2개 맞았습니다.");
		}else if(x==3) {
			System.out.println("번호가 3개 맞았습니다.");
		}else if(x==4) {
			System.out.println("축하합니다. 번호가 4개 맞았습니다.");
		}else if(x==5) {
			System.out.println("축하합니다.번호가 5개 맞았습니다.");
		}else if(x==6) {
			System.out.println("번호가 6개 맞았습니다.");
			System.out.println("축하합니다. 아무도 모르게 농협으로 가세요.");
		}else {
			System.out.println("시스템에 오류가 있습니다.");
		}
	//배열을 적용하지 않아서 중복되는 숫자가 발생할 수 있다.

	}

}
