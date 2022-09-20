
public class Diziler {

	public static void main(String[] args) {
		String[] ogr=new String[3];
		ogr[0]="Sedat";
		ogr[1]="Doğan";
		ogr[2]="Zeynep";
		for(int i=0;i<ogr.length;i++) {
			System.out.println(ogr[i]);
		}
		
		for(String ogrenciler:ogr) {
			System.out.println("Öğrenci: "+ ogrenciler);
		}
	}
}
