package modul.Modul5;
import java.lang.*;
public class Buku {
	public String penulis;
	public String judul;
	public String nomorISBN;

	public void cetakPoint(String penulis, String judul, String nomorISBN){
		System.out.println("Penulis :" + penulis);
		System.out.println("Judul :" + judul);
		System.out.println("Nomor ISBN :" + nomorISBN);
	}
}
