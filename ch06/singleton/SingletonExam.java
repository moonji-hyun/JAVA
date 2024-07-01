package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤을 사용해보자.

		// Singleton 생성자가 private이라서 불가능
		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();

		Singleton obj3 = Singleton.getInstance(); // 싱글톤 객체연결
		Singleton obj4 = Singleton.getInstance(); // 싱글톤 객체연결

		if (obj3 == obj4) {
			System.out.println("같은 싱글톤 객체 입니다.");
		} else {
			System.out.println("다른 싱글톤 객체 입니다.");
		}

	}

}
