package ch08.extended.tire;

public class KumhoTire extends Tire{
	// 필드
	
	//생성자
	public KumhoTire(int maxRotation, String lcation) {
		super(maxRotation, lcation);
		
	}

	//메서드
	public boolean roll() { //달리면서 마일리지 소모
		accRotation += 8;
		if(accRotation < maxRotation) { // 타이어 소모 측정
			System.out.println(location + " 위치에 타이어 수명 : " + (maxRotation-accRotation) + "마일리지");
			return true;			
		}else {
			System.out.println("***경고***");
			System.out.println(location+"위치에 타이어위치에 펑크 되었습니다");
			return false;
		}
	}
	
}
