import java.util.Iterator;
import java.util.Scanner;

public class forDöngüsü {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayısal değer gir");
		int sayi=scan.nextInt();
		System.out.println("Girilen değer:"+ sayi);
		System.out.println("Sıfır sayıma katılsın mı? = Y/N");
		char c=scan.next().charAt(0);
		System.out.println("Verilen cevap="+c);
		
		switch (c) {
		case 'Y':{
			for (int i = 0; i <=sayi; i++) {
				System.out.println("- " +i);
			}
			break;
			}
		
		case 'N':{
			for (int i = 1; i <=sayi; i++) {
				System.out.println("- " +i);	
			}
			break;
			}
		
		default:
			{
				System.out.println("Tanımsız değer girildi");
			}
		
		}
		
			
		
		
		
	}

}
