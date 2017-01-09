import java.text.Collator;
import java.util.Locale;

public class Foreignlanguage {
	public static void main(String [] args){
		Locale locale = new Locale("es", "ES");
		Collator collator = Collator.getInstance(locale);
		
		int result = collator.compare("ah", "ah");
		System.out.println(result);
	}
}
