package ch06.calender;

import java.util.Calendar;

import javax.management.monitor.Monitor;

public class WeekExam {

	public static void main(String[] args) {
		// Calendar 객체를 이용해서 날짜를 처리함.

		Calendar cal = Calendar.getInstance();
		// getIstance()는 내장된 객체를 가져옴 (new 사용 안함)

		int year = cal.get(Calendar.YEAR); // 내장함수는 ctrl 누르고 클릭하면 내장된 설명이 나온다.
		// get() 메서드는 객체의 값을 가져오는 동작.
		// Calendar.YEAR 매개값으로 년도를 신청함.
		System.out.println("현재 년도 : " + year);
		int month = cal.get(Calendar.MONTH) + 1;
		// Calendar.MONTH는 0부터 시작하기 때문에 +1 필수!!
		//Java 버젼이 업데이트 되면서 바뀔 수 있기때문에 출력해보고 수정.
		System.out.println("현재 월 : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//Calendar.DAY_OF_MONTH 월에 해당하는 일
		System.out.println("현재 일 : " + day);
		
		Week today = null; 
		int week = cal.get(Calendar.DAY_OF_WEEK);//타입이 int라서 요일이 숫자로 나옴
		// Calendar.DAY_OF_WEEK 는 요일이 숫자로 나옴 
		// 일요일:1, 월요일은:2, 화요일:3,.....토요일:7
		switch(week) { // 요일 숫자로 받은 값을 변환
		case 1:			
			today  = Week.SUNDAY ; //일요일
			break;
		case 2:			
			today  = Week.MONDAY ; // 월요일
			break;
		case 3:			
			today  = Week.TUESDAY ; // 화요일
			break;
		case 4:			
			today  = Week.WEDNESDAY ; // 수요일
			break;
		case 5:			
			today  = Week.THURSDAY ; // 목요일
			break;
		case 6:			
			today  = Week.FRIDAY ; // 금요일
			break;
		case 7:			
			today  = Week.SATURDAY ; // 토요일
			break;	
		default:
			System.out.println("버그 생성 : 작성자에게 문의하세요.");
		}
	//	System.out.println("현재 요일 : " + week);
		System.out.println("현재 요일 : " + today);
		
		
		int hour = cal.get(Calendar.HOUR);
		System.out.println("현재 시간 : " + hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 분 : " + minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 초 : " + second);
		
		

	}

}
