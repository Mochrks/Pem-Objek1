package modul9;

public class Baju extends Pakaian {
	//kode warna R=Merah, B=Biru, G=Hijau, U=Belum Ditentukan
	public char kodeWarna = 'U';
	
	public Baju(){
        super.setHarga(15000.0);
        super.setJmlStok(10);
        super.setKeterangan("biru");
    }
	//method ini menampilkan nilai untuk suatu item
	public void tampilInformasiBaju() {
		System.out.println("ID Baju: " + getID());
		System.out.println("Keterangan : " + getKeterangan());
		System.out.println("Kode Warna : " + kodeWarna);
		System.out.println("Harga Baju : " + getHarga());
		System.out.println("Jumlah stok : " + getJmlStok());
	} 
	 public static void main(String[] args) {
        Baju b = new Baju();
        b.tampilInformasiBaju();
    }
}
