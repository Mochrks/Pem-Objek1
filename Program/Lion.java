
package modul6;
import java.awt.Color;
public class Lion {
    public String nama;
    public String asal;
	public Color warnaBulu;
	public int usia;
	public double bb;
	public boolean statusJinak;
	public String majikan;
	
	public void cetakInformasi(){
		System.out.println("Lion Bernama : " +nama);
                System.out.println("Asal Wilayah   : "+asal);
		System.out.println("Warna Bulu : " +warnaBulu);
                System.out.println("Usia : " +usia);
		System.out.println("Berat Badan : " +bb);
                System.out.println("Jinak : " +apakahJinak());
		System.out.println("Diadopsi Oleh : " +majikan);
	}

	public void diadopsi (String m) {
		majikan = m;
		statusJinak = false;
	}

	public boolean apakahJinak(){
		return statusJinak;
	}

}
