package ch08.extended.abstractExam;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) { // 구현 클래스(추상메서드를 상속 받음)		
		super(owner); // 부모에서 만든 생성자 호출해서 사용
		// 추상메서드에서 만든 생성자를 강제로 주입 받음.
	}

	// 메서드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
