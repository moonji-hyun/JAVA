package ch07.mbcCar;

import ch07.hankook.SnowTire;  // SnowTire는 한국타이어에 하나뿐이라서 import가 가능
import ch07.hyundai.Engine;
import ch07.kumho.EcoTire;
import ch07.nexen.*;  // * : nexen에서 만든 클래스는 모두 가져올 수 있음. 

//import ch07.hankook.Tire;
//import ch07.kumho.Tire;       Tire가 중복돼서 사용 불가.

public class Car {
	// 필드
	//Tire hTire = new Tire();  // 한국타이어 패키지에서 가져옴. import ch07.hankook.Tire; 사용이 편함.
	ch07.hankook.Tire hTire = new ch07.hankook.Tire();
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); // 금호타이어 패키지에서 가져옴. 요즘 트렌드, 보기 편함.
	SnowTire Stire = new SnowTire();
	EcoTire eTire = new EcoTire();
	
	BigWidthTire bTire = new BigWidthTire();
	SportTire spTire = new SportTire();
	
	Engine hEngine = new Engine();
	
	
	// 생성자
	
	
	// 메서드
	
	
}
