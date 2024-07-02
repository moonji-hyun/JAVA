package ch09.interfaceExam.extended;

public class BirdExam {
	public static void main(String[] args) {
		// 다중 상속 인터페이스 테스트
		
		Flamingos flamingos = new Flamingos();
		flamingos.eat();
		flamingos.flying();
		flamingos.sound();
		
		System.out.println("--------------------");
		System.out.println("자동타입변환");
		Fly fly = flamingos; // 업캐스팅
		fly.flying();
		fly.land();
		fly.takeOff();
	//	fly.eat(); 부모가 다름
		
		Animal animal = flamingos;
		animal.eat();
		animal.breathe();
		animal.dispose();
	//	animal.land(); 부모가 다름
		
		
		
		
	}
}
