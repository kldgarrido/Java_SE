package cert.clasesgenerales_08.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("J2[SEM]E");
		Matcher matcher = p.matcher("J2SE");
		System.out.println(matcher.matches());


		// Alternative character. [SEM] indicate the valors in a unique position.
		p = Pattern.compile("N[YD]K");
		matcher = p.matcher("NYK");
		System.out.println(matcher.matches());

		p = Pattern.compile("N[^YD]K"); // ^Y: not character y
		matcher = p.matcher("NYK");
		System.out.println(matcher.matches());

		p = Pattern.compile("A[0-9]"); // [0-9] character: 0 through 9.
		matcher = p.matcher("A2");
		System.out.println(matcher.matches());

		p = Pattern.compile("[a-dA-D]"); // Character: (a thorugh d) or (A thorugh D)
		matcher = p.matcher("c");
		System.out.println(matcher.matches());
		matcher = p.matcher("B");
		System.out.println(matcher.matches());
		matcher = p.matcher("E");
		System.out.println(matcher.matches());
		matcher = p.matcher("f");
		System.out.println(matcher.matches());


		// Special Character.

		// [.] All character
		p = Pattern.compile("A\\.C");
		matcher = p.matcher("A?C");
		System.out.println(". "+matcher.matches());
		matcher = p.matcher("A2C");
		System.out.println(matcher.matches());

		// [.]  Character: 0 thorugh 9
		p = Pattern.compile("A\\dC");
		matcher = p.matcher("A2C");
		System.out.println(matcher.matches());
		matcher = p.matcher("A9C");
		System.out.println(matcher.matches());

		// [\s]  white space
		p = Pattern.compile("A\\sC");
		matcher = p.matcher("A C");
		System.out.println(matcher.matches());
		matcher = p.matcher("A9C");
		System.out.println(matcher.matches());

		// [.]  Character: numeric o letter
		p = Pattern.compile("A\\wC");
		matcher = p.matcher("ABC");
		System.out.println(matcher.matches());
		matcher = p.matcher("A9C");
		System.out.println(matcher.matches());

		// Quantifiers.
		p = Pattern.compile("(JAVA)+"); // One or plus.
		matcher = p.matcher("JAVAJAVA");
		System.out.println(matcher.matches());
		
		p = Pattern.compile("(JAVA)?"); // One
		matcher = p.matcher("JAVA");
		System.out.println(matcher.matches());
		
		p = Pattern.compile("(JAVA)*"); // many
		matcher = p.matcher("JAVAJAVAJAVA");
		System.out.println(matcher.matches());
		
		p = Pattern.compile("(JAVA)*"); // many
		matcher = p.matcher("JAVA_JAVA_JAVA");
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
		String strPattern = "www\\.\\w*\\.es";
		Pattern pattern = Pattern.compile(strPattern);
		String urls = "www.yahoo.es wwww.google.es";
		Matcher matcher2 = pattern.matcher(urls);
		while(matcher2.find()){
			System.out.println(matcher2.group());
		}
		
		String strPattern2 = "\\w+\\.?\\w+@\\w+\\.\\w+";
		Pattern pattern2 = Pattern.compile(strPattern2);
		String emails = "bruce.wayne@gmail.com batman@yahoo.com";
		Matcher matcher3 = pattern2.matcher(emails);
		while(matcher3.find()){
			System.out.println(matcher3.group());
		}
		
		
	}

}
