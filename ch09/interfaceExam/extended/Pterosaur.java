package ch09.interfaceExam.extended;

public class Pterosaur implements Bird{// 익룡 //service

	
	
	@Override
	public void land() {
		System.out.println("익룡이 착륙합니다.");
		
	}

	@Override
	public void flying() {
		System.out.println("익룡이 납니다.");
		
	}

	@Override
	public void takeOff() {
		System.out.println("익룡이 이륙합니다.");
		
	}

	@Override
	public void eat() {
		System.out.println("익룡이 먹다.");
		
	}

	@Override
	public void breathe() {
		System.out.println("익룡이 숨을 쉽니다.");
		
	}

	@Override
	public void dispose() {
		System.out.println("익룡이 배출합니다.");
		
	}

	@Override
	public void sound() {
		System.out.println("익룡이 소리를 냅니다.");
		
	} 

}
