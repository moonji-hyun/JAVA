package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHashSet, TreeSet등이 있다. 
		// Set은 중복 되지 않는 인덱스가 없는 객체를 담아 놓은 구슬 주머니 임.
		
		Set<String> setHashSet = new HashSet<String>();
	//	Set<String> linkedHashSet = new LinkedHashSet<String>();
	//	Set<String> treeSet = new TreeSet<String>();
		
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC");
		
		int size = setHashSet.size();  // 객체수를 반환
		System.out.println("set 객체 수 : " + size);
		int i = 0 ;
		System.out.println("-----인텍스가 없어서 for문으로 전체 출력 안됨------");
		Iterator<String> iterator = setHashSet.iterator();  	// 반복자 타입에 set 타입 연결
		while(iterator.hasNext()) { // hasNext() : 다음 객체가 있으면 true 없으면 false
			String element = iterator.next(); // next() : 가져온 값.  울 element에 넣음.
			
			System.out.println(++i + "객체 : " + element);
		}
		
		setHashSet.remove("CSS");
		
		System.out.println("----인덱스가 없어서 for each문으로 출력해보자.----");
		for(String entity : setHashSet) {
			System.out.println(++i +"객체 : " + entity );
		}
		
		
		
	}
}
