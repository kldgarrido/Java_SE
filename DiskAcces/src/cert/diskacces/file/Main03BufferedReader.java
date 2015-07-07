package cert.diskacces.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main03BufferedReader {

	public static void main(String[] args) throws IOException {
		File f = new File("data2.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bufferedReader = new BufferedReader(fr);
		String str = "";
		while( (str=bufferedReader.readLine()) != null){
			System.out.println(str);
		}
		bufferedReader.close();
		fr.close();
	}

}
