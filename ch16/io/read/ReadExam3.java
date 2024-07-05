package ch16.io.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExam3 {

	public static void main(String[] args) throws Exception {
		// 파일에서 글자를 추출하는 용도로 활용 가능
		InputStream inputStream = new FileInputStream("c:\\temp\\text.txt"); // 폴더나 파일명의 대소문자는 중요하지 않음.
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = inputStream.read(readBytes, 2, 3); // read(읽어올배열, 시작 인덱스, 개수)
		for(int i =0; i<readBytes.length; i++) {
			System.out.println((char)readBytes[i]);
		}
		inputStream.close();

	}

}
