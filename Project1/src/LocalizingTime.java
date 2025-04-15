import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizingTime {

	public static void main(String[] args) {
		
		/*DateFormat df=DateFormat.getTimeInstance(DateFormat.FULL,new Locale("au","US"));
		String d1=df.format(new Date());
		System.out.println(d1);*/
		
		/*DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("de","DE"));
		String d1=df.format(new Date());
		System.out.println(d1);*/
		
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
		String formatted=nft.format(10000);
		System.out.println(formatted);

	}

}
