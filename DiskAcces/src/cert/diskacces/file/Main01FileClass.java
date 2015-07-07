package cert.diskacces.file;

import java.io.File;
import java.io.IOException;

public class Main01FileClass {

	public static void main(String[] args) {

		// Create new file.
		File f = new File("data.txt");
		try {
			boolean b = f.createNewFile();
			System.out.println(b);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create new folder.
		File f2 = new File("myfolder");
		boolean b2 = f2.mkdir();
		System.out.println(b2);

		// Example
		File folder = new File("data");
		folder.mkdir();
		File f4 = new File(folder, "data.txt");
		boolean b3 = false;
		try {
			b3 = f4.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(b3);


		// Is read a file
		File f5 = new File("data.txt");
		if(f5.canRead()){
			System.out.println("The file is read");
		}
		else{
			System.out.println("The file not is read");
		}

		// Is write a file
		File f6 = new File("data.txt");
		if(f6.canWrite()){
			System.out.println("The file is write");
		}
		else{
			System.out.println("The file not is write");
		}

		// Exist the file
		File f7 = new File("data.txt");
		if(f7.exists()){
			System.out.println("The file exist");
		}
		else{
			System.out.println("The file not exist");
		}

		// the file references is a file
		File f9 = new File("data.txt");
		if(f9.isFile()){
			System.out.println("Is file");
		}
		else{
			System.out.println("not is file");
		}

		// the file references is a Directory
		File f10 = new File("data");
		if(f10.isDirectory()){
			System.out.println("Is Directory");
		}
		else{
			System.out.println("not is Directory");
		}

		// the file name
		File f11 = new File("data.txt");
		String name = f10.getName();
		System.out.println(name);
		
		// the file path
		File f12 = new File("data.txt");
		String name2 = f10.getAbsolutePath();
		System.out.println(name2);
		
		// Rename File
		File f13 = new File("data.txt");
		File f14 = new File("data2.txt");
		boolean b5 = f13.renameTo(f14);
		System.out.println("The file is rename: "+b5);
		
		// Rename Directory
		File f15 = new File("data");
		File f16 = new File("data2");
		boolean b6 = f15.renameTo(f16);
		System.out.println("The Directory is rename: "+b6);
		
		// Delete File
		File f17 = new File("data2.txt");
		boolean b7 = f13.delete();
		System.out.println("The file is delete: "+b5);
		
		// Delete Directory
		File f18 = new File("data2");
		boolean b8 = f18.delete();
		System.out.println("The Directory is delete: "+b8);
		// The directory is not empty.
		File f19 = new File("data2/data.txt");
		f19.delete();
		f18 = new File("data2"); // is empty
		b8 = f18.delete();
		System.out.println("The Directory is delete: "+b8);
	}

}
