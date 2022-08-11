package modul7;
	public class Zoo{
	public static void main (String args[]){
		Lion singa = new Lion ();
		Horse kuda = new Horse ();
		Kangoroo kangguru = new Kangoroo ();

		singa.setNama("Jimno");
		singa.setUsia(13);
		singa.setBB(145);
		singa.setDiadopsi("Rizki\n");

		kuda.setNama("Boni");
        kuda.setUsia(11);
        kuda.setBB(75);
        kuda.setDiadopsi("Rizki\n");

		kangguru.setNama("Cimay");
        kangguru.setUsia(8);
        kangguru.setBB(165);
        kangguru.setDiadopsi("Rizki\n");

		singa.cetakInformasi();
		kuda.cetakInformasi();
		kangguru.cetakInformasi();


	}
}