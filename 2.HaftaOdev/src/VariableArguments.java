
public class VariableArguments {

	public static void main(String[] args) {
		topla(12,2,3,23,23,43,1);
	}
	
	public static int topla(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		System.out.println(toplam);
		return toplam;
	}

}
