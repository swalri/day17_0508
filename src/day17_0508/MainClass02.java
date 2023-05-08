package day17_0508;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass02 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오전취업반_응용소프트웨어_kim/5월/05_java_test/test.txt");
		FileOutputStream fos = new FileOutputStream(path, true);//글입력,글추가
		
		fos.write(65);
		fos.write('B');
		fos.write('\n');
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);//글읽기
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
		
	}
}
