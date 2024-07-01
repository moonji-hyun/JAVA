package ch08.extended.abstractExam;

public class PhoneExam {

	public static void main(String[] args) {
		
		// Phone phone = new Phone("김기원");
		// Phone 클래스에 abstract가 되어 있어 객체로 사용할 수 없다.
		// 사용하려면 구현 클래스(주원이만든) 상속받아 활용해야 한다. (강제)
		

	SmartPhone smartPhone = new SmartPhone("김기원");
	smartPhone.turnOn();						// 부모
	System.out.println(smartPhone.owner);		// 부모생성
	smartPhone.internetSearch();				// 자식
	smartPhone.turnOff();						// 부모	
	}

}
