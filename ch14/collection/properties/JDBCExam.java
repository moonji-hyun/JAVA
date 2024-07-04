package ch14.collection.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {

	public static void main(String[] args) throws Exception {
		// properties는 텍스트 문서를 java 코드의 k, v 형태로 불러 온다.
		
		Properties properties = new Properties(); // 빈 객체 생성
		String path = JDBCExam.class.getResource("jdbc.properties").getPath();
		// 파일의 위치 정보를 path 변수에 넣음
		System.out.println(path);
		System.out.println("================");
		
		path = URLDecoder.decode(path,"utf-8");
		// 한국어가 있을 수 있으니 utf-8 처리
		
		properties.load(new FileReader(path));
		// properties로 불러 옴.
		
		String driver = properties.getProperty("driver");
		System.out.println("오바클 드라이버 : " + driver);
		String url = properties.getProperty("url");
		System.out.println("url : " + url);

	}

}
