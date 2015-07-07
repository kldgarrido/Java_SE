package cert.clasesgenerales_09.collections;

import java.util.ArrayList;

public class MainClass01ArrayList {
	
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		
		v.add("hola");
		v.add(new Integer(5));
		v.add(6);
		
		System.out.println(v.get(1));
		v.add(1, 1);
		System.out.println(v.get(1));
		
		String s = (String) v.get(0);
		System.out.println(s);
		
		System.out.println(v.get(1));
		v.remove(1);
		System.out.println(v.get(1));
		
		int i = v.indexOf("hola");
		System.out.println(i);
		
		System.out.println(v.size());
		v.clear();
		System.out.println(v.size());
		
		int[] n = {1,2,3,4};
		for(i=0; i< n.length;i++){
			v.add(n[i]);
		}
	}

}
