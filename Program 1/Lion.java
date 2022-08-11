package modul7;
public class Lion {
	private String nama;
	private int usia;
	private double BB;
	private String diadopsi;

	public void setNama(String tempnama){
        this.nama = tempnama;
    }
    public String getNama(){
        return this.nama;
    }

    public void setUsia(int tempusia){
        this.usia = tempusia;
    }
    public int getUsia(){
        return this.usia;
    }
    public void setBB(double tempbb){
        this.BB = tempbb;
    }
    public double getBB(){
        return this.BB;
    }
    public void setDiadopsi(String tempadopsi){
        this.diadopsi = tempadopsi;
    }
    public String getDiadopsi(){
        return this.diadopsi;
    }

	public void cetakInformasi(){
		System.out.println("singa Bernama : " +nama);
		System.out.println("Usia : " +usia);
		System.out.println("Berat Badan : " +BB);
		System.out.println("Diadopsi Oleh : " +diadopsi);
	}
}