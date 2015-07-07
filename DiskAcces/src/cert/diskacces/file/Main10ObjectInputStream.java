package cert.diskacces.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import cert.diskacces.file.bean.Person;

public class Main10ObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path1 = "data5.txt";
		File file = new File(path1);
		FileInputStream fileInputStream = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person = (Person) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(person);
		
	}
}
