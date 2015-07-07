package cert.diskacces.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main06FileOutputStream {
	
	public static void main(String[] args) throws IOException {
		String path1 = "data3.txt";
		File file = new File(path1);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(3);
		fileOutputStream.flush();
		fileOutputStream.close();
	}

}
