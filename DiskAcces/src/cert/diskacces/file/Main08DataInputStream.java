package cert.diskacces.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main08DataInputStream {
	
	public static void main(String[] args) throws IOException {
		String path1 = "data3.txt";
		File file = new File(path1);
		FileInputStream fileInputStream = new FileInputStream(file);
		int b = fileInputStream.read();
		System.out.println(b);
	}
	
}
