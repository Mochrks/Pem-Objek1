package modul7;
import java.awt.Color;
public class Kucing {
	private String nama;
	private Color warnabulu;
	private int usia;
	private double bb;
	private boolean statusJinak;
	private String majikan;

	public void cetakInformasi(){
	System.out.println("Kucing Bernama : " +getNama());
	System.out.println("Warna Bulu : " +getWarnabulu());
	System.out.println("Usia : " +getUsia());
	System.out.println("Berat Badan : " +getBb());
	System.out.println("Jinak : " +getStatusJinak());
	System.out.println("Diadopsi Oleh : " +getMajikan());
	}
	public void diadopsi (String m) {
	majikan = m;
	statusJinak = true;
	}
	public boolean apakahJinak(){
		return statusJinak;
	}
	public void dilepas(){
		majikan = " ";
		statusJinak = false;
	}
	public String getNama(){
	return nama;
	}
	public void setNama(String temp){
		nama = temp;
	}
	public Color getWarnabulu(){
		return warnabulu;
	}
	public void setWarnabulu(Color temp){
		warnabulu = temp;
	}
	public int getUsia(){
		return usia;
	}
	public void setUsia(int temp){
		usia = temp;
	}
	public double getBb(){
		return bb;
	}
	public void setBb(double temp){
		bb = temp;
	}
	public String getMajikan(){
		return majikan;
	}
	public void setMajikan(String temp){
		majikan = temp;
	}
	public boolean getStatusJinak(){
		return statusJinak;
	}
}