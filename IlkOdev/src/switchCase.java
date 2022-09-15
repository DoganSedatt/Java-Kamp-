
public class switchCase {

	public static void main(String[] args) {
		char not='F';
		switch (not) {
		case 'A': {
			System.out.println("Mükemmel : Geçtiniz");
			break;
		}
		case 'B':{
			System.out.println("Çok güzel : Geçtiniz");
			break;
		}
		case 'C':{
			System.out.println("İyi : Geçtiniz");
			break;
		}
		case 'D':{
			System.out.println("Fena Değil : Geçtiniz");
			break;
		}
		case 'F':{
			System.out.println("Kaldın. Azıcık çalısaydın ya kardeşim");
			break;
		}
		
		default:
			System.out.println("Geçersiz not girdiniz");
			;
		}
	}

}
