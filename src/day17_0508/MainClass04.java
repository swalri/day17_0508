package day17_0508;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MainClass04 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("E:/오전취업반_응용소프트웨어_kim/5월/05_java_test/test.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		for(char i = 'A';i<='D';i++) {
//			Thread.sleep(2000);
//			fos.write(i);
			bos.write(i);
		}
		
		bos.flush();
		bos.write("안녕하세요".getBytes());
		
		bos.close();//종료
		fos.close();//종료
		
		
		
		
		
		
		
		
		
	}
}
