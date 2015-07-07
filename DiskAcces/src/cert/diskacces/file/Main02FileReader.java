package cert.diskacces.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main02FileReader {

	public static void main(String[] args) throws IOException {
		File f = new File("data2.txt");
		FileReader fr = new FileReader(f);
		
		Integer c;
		while( (c =fr.read())!=null ){
			System.out.printf("%c",c);
		}
		
		fr.close();
	}

}
