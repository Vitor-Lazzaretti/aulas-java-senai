import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Att_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Date data =  new Date();
		Locale local = new Locale("pt","BR");
		DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy HH:mm:ss",local);
		System.out.println(formato.format(data));
		
		sc.close();
	}

}
