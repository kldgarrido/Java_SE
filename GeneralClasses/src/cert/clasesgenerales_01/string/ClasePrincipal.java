/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cert.clasesgenerales_01.string;

/**
 *
 * @author kaled
 */
public class ClasePrincipal {
    
    public static void main(String[] args){
        String s = new String("Texto prueba");
        s = "Texto prueba";
        s.length();
        s.equals("Texto prueba");
        s.equalsIgnoreCase("Texto PRUEBA");
        s.charAt(0);
        
        String s2 = s.substring(0, 5);
        System.out.println(s2.equals("Texto"));
        
        System.out.println(s.indexOf("prueba"));
        
        String s3 = "alcala";
        System.out.println(s3.replace('a', '0'));
        
        String s4 = String.valueOf(true);
        System.out.println(s4);
        
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
       
        String s5 = "a,b,c,d,e";
        for(String a: s5.split(",")){
            System.out.println(a);
        }
        
    }
            
}
