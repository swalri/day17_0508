package day17_0508;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) throws Exception {
		File path = new File("E:/오전취업반_응용소프트웨어_kim/5월/05_java_test/test.txt");
		
		
		FileOutputStream fos  = new FileOutputStream(path);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		System.out.println("출력내용");
		String n = new Scanner(System.in).next();
		dos.writeUTF(n);
		dos.close();
		bos.close();
		fos.close();
		
		
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		String s = dis.readUTF();
		System.out.println("가져온 내용 : "+s);
		dis.close();
		bis.close();
		fis.close();
		
		
		
		
		
	}
}
