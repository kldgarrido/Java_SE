package cert.diskacces.file;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main07DataOutputStream {

	public static void main(String[] args) throws IOException {
		String path1 = "data4.txt";
		File file = new File(path1);
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		dataOutputStream.writeBoolean(true);
		dataOutputStream.flush();
		dataOutputStream.close();
	}
	
}
