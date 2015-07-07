package cert.clasesgenerales_09.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class MainClass02Hashtables {
	
	public static void main(String[] args) {
		
		Hashtable hs = new Hashtable();
		
		hs.put("a21", "pepito");
		System.out.println(hs.get("a21"));
		
		hs.put("a21", "Luis");
		System.out.println(hs.get("a21"));
		
		System.out.println(hs.containsKey("a21"));
		
		System.out.println(hs.size());
		hs.remove("h21");
		System.out.println(hs.size());
		
		hs.put("a21", "pepito");
		hs.put("a22", "Luis");
		Enumeration e = hs.keys();
		
		while(e.hasMoreElements()){
			Object obj = e.nextElement();
			System.out.println(obj+ " "+hs.get(obj));
		}
		
	}

}
