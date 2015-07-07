package cert.clasesgenerales_09.collections;

import java.util.ArrayList;
import java.util.Hashtable;

public class MainClass03Generic {
	
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("uno");
		l.add("dos");
		l.add("tres");
		
		Hashtable<Integer,String> hs = new Hashtable<Integer, String>();
		hs.put(10, l.get(0));
		hs.put(12, l.get(1));
		hs.put(13, l.get(2));
		
		MyWrapper<String> w = new MyWrapper<String>();
		w.setData("Mi cadena");
		String s = w.getData();
		System.out.println(s);
	}

}
