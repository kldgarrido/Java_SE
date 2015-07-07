package cert.diskacces.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main05PrintWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("data.txt",true);
		PrintWriter out = new PrintWriter(fileWriter);
		
		String[] numb3rs = {"one","two","tree"};
		
		for(String numb3r: numb3rs){
			out.println(numb3r);
		}
		out.flush(); // flush is complete in to file
		out.close();
		fileWriter.close();
		
	}
	
}
