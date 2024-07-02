package ch09.interfaceExam.extended;

public class Flamingos implements Bird{// 홍학 //service

	
	
	@Override
	public void land() {
		System.out.println("홍학이 착륙합니다.");
		
	}

	@Override
	public void flying() {
		System.out.println("홍학이 납니다.");
		
	}

	@Override
	public void takeOff() {
		System.out.println("홍학이 이륙합니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("홍학이 먹다.");
		
	}

	@Override
	public void breathe() {
		System.out.println("홍학이 숨을 쉽니다.");
		
	}

	@Override
	public void dispose() {
		System.out.println("홍학이 배출합니다.");
		
	}

	@Override
	public void sound() {
		System.out.println("홍학이 소리를 냅니다.");
		
	} 

}
