package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, Vector, linkedlist 3가지를 주로 사용한다.
		// list 컬렉션은 배열 대신 활용도가 높다.(길이가 자유롭다.)
		// list<String> 는 강한 타입체크로 String만 들어감.
		// List<String> list = new ArrayList<STring>(); -> 10개가 기본값.

		List<String> listS = new ArrayList<String>(); // 다형성
	//	List<String> listS = new Vector<String>();
	//	List<String> listS = new LinkedList<String>();

		listS.add("Java"); // 0번 인덱스
		listS.add("Oracle"); // 1번 인덱스, 데이터베이스
		listS.add("JDBC"); // java + db 연동
		listS.add("HTML, CSS, JS"); // 프론트
		listS.add("jsp"); // java + db + front
		listS.add("tomcat"); // 서버 프로그램(servlet)
		listS.add("리눅스"); // 배포 서버
		listS.add(5, "servlet");
		listS.add("AWS"); // 가상 배포서버

		int size = listS.size();
		System.out.println("총 객체수 : " + size);
		System.out.println("*******************");

		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("2번째 인덱스 값 : " + skill);

		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		
		//for문
		System.out.println("*******for문 전체 출력*****");
		for (int i = 0; i < listS.size(); i++) {
			System.out.println(i + "번째 값 : " + listS.get(i));
		}
				
		
		// 향상 for문
		System.out.println("*** for each 전체 출력(index 사용 안함) ***");
		for (String str : listS) {
			System.out.println(str);  // 배열에 있는 순서대로 인쇄
		}
		
		

	}

}
