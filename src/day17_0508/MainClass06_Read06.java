package day17_0508;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainClass06_Read06 implements CommonPath{
	public static void main(String[] args) throws Exception {
		
//		File path = new File("E:/오전취업반_응용소프트웨어_kim/5월/05_java_test/test.txt");
//		String path = CommonPath.PATH;
		FileInputStream fis = new FileInputStream(PATH);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		ObjectInputStream ois = new ObjectInputStream(dis);
		
		TestClass06 t = (TestClass06) ois.readObject();
		System.out.println("이름 : "+t.getName()+"\n나이 : "+t.getAge());
		
		ois.close();
		dis.close();
		bis.close();
		fis.close();
	}
}
