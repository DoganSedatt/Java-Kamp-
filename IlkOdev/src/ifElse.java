
public class ifElse {

	public static void main(String[] args) {
		int sayi=7;
		int rakam=7;
		if(rakam>sayi) {
			System.out.println(rakam+" rakamı "+ sayi+ " sayısından büyüktür");
		}
		else if(sayi>rakam) {
			System.out.println(sayi+" sayısı "+ rakam+ " rakamından büyüktür");
		}
		else {
			System.out.println(sayi+" sayısı ve "+ rakam+ " rakamı eşittir");
		}
	}

}
