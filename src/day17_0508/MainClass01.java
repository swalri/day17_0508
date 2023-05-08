package day17_0508;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass01 {
	public static void main(String[] args) throws FileNotFoundException {
		String s = "E:\\오전취업반_응용소프트웨어_kim\\5월\\05_java_test\\test.txt";//절대경로
		File path = new File("E:\\오전취업반_응용소프트웨어_kim\\5월\\05_java_test\\");//파일기능
//		path.mkdir();//디렉토리 생성
		path.delete();///파일 삭제
//		FileOutputStream fos = new FileOutputStream(path);//파일생성
		
		
		
		
		
	}
}
