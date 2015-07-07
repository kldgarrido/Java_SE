package cert.diskacces.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class Main04FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		String path1 = "data.txt";
		String path2 = "data2.txt";
		
		long time = Calendar.getInstance().getTimeInMillis();
		
		FileWriter fileWriter1 = new FileWriter(path1); // append false for default.
		fileWriter1.close();
		fileWriter1 = new FileWriter(path1, false); // append false
		fileWriter1.write("save me "+time+"\n");
		fileWriter1.close();
		
		File file = new File(path2);
		FileWriter fileWriter2 = new FileWriter(file, true); // append true -> persist original content of the file.
		fileWriter2.write("Change World"+time+"\n");
		fileWriter2.close();
	}

}
