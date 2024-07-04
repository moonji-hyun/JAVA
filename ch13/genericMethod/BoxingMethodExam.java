package ch13.genericMethod;

public class BoxingMethodExam {

	public static void main(String[] args) {
		// 제네릭 메서드를 사용하여 강한 타입체크
		
		Box<Integer> boxI = Util./* <Integer> */boxing(1000);
		int intValue = boxI.get();
		System.out.println(intValue);
		
		Box<String> boxS = Util.<String>boxing("송이");
		String strValue = boxS.get();
		System.out.println(strValue);

	}

}
