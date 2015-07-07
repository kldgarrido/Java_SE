package cert.diskacces.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import cert.diskacces.file.bean.Person;

public class Main09ObjectOutputStream {

	public static void main(String[] args) throws IOException {
		String path1 = "data5.txt";
		File file = new File(path1);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		Person person = new Person("Batman", 36);
		objectOutputStream.writeObject(person);
		objectOutputStream.flush();
		objectOutputStream.close();
	}
	
	}
