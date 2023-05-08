package day17_0508;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass03 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오전취업반_응용소프트웨어_kim/5월/05_java_test/test.txt");
		FileInputStream fis = new FileInputStream(path);
		while(true) {
			int ch =  fis.read();
			if(ch == -1) {//없을경우 EOF
				System.out.println("ch : "+ch);
				break;
			}
			System.out.println((char)ch);
		}
	}
}
