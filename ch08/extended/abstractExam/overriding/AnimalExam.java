package ch08.extended.abstractExam.overriding;

public class AnimalExam {

	public static void main(String[] args) {
		// 추상 메서드 활용
		
		//Animal animal = new Animal();  추상 클래스라서 사용 안됨
		
		Dog dog =  new Dog();
		dog.kind = "포유류";
		dog.breathe();
		dog.sound();
		System.out.println("kind : " + dog.kind);		
		System.out.println("---dog 자식 객체(구현 클래스)---");
		
		Cat cat = new Cat();
		cat.kind = "포유류";
		cat.breathe();
		cat.sound();
		System.out.println("kind : " + cat.kind);
		System.out.println("---cat 자식 객체(구현 클래스)---");
		System.out.println();
		
		System.out.println("변수의 자동타입 변환 테스트");
		Animal animal = null;   // 타입은 있는데 객체가 없음.  
		animal = new Dog(); // 자동 타입 변환
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println();
		// 객체의 다형성
		
		// 매개변수의 다형성 실행
		System.out.println("--매개변수의 다형성 실행--");
		animalSound(new Dog());
		animalSound(new Cat());
		
	} // main() end of
	
	//메서드의 매개변수의 다형성
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
