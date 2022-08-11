package modul6;
import java.awt.Color;
public class Zoo2{
	public static void main (String args[]){
		Lion[] singa = new Lion[5];
        Horse[] kuda = new Horse[5];
        Kangoroo[] kangguru = new Kangoroo[5];
        int i;
 		
 		singa[0] = new Lion();
		singa[0].warnaBulu = new Color (1, 2, 3);
		singa[0].nama = "Jimbon";
		singa[0].usia = 20;
		singa[0].bb = 55;
		singa[0].diadopsi ("Rizki\n");

		singa[1] = new Lion();
		singa[1].warnaBulu = new Color (1, 2, 3);
		singa[1].nama = "Kelly";
		singa[1].usia = 20;
		singa[1].bb = 55;
		singa[1].diadopsi ("Rizki\n");

		singa[2] = new Lion();
		singa[2].warnaBulu = new Color (1, 2, 3);
		singa[2].nama = "Beta";
		singa[2].usia = 20;
		singa[2].bb = 55;
		singa[2].diadopsi ("Rizki\n");

		singa[3] = new Lion();
		singa[3].warnaBulu = new Color (1, 2, 3);
		singa[3].nama = "Broto";
		singa[3].usia = 20;
		singa[3].bb = 55;
		singa[3].diadopsi ("Rizki\n");

		singa[4] = new Lion();
		singa[4].warnaBulu = new Color (1, 2, 3);
		singa[4].nama = "Manu";
		singa[4].usia = 20;
		singa[4].bb = 55;
		singa[4].diadopsi ("Rizki\n");

		//kuda
		kuda[0] = new Horse();
		kuda[0].warnaBulu = new Color (1, 2, 3);
		kuda[0].nama = "Simon";
		kuda[0].usia = 20;
		kuda[0].bb = 60;
		kuda[0].diadopsi ("Rizki\n");

		kuda[1] = new Horse();
		kuda[1].warnaBulu = new Color (1, 2, 3);
		kuda[1].nama = "Rimba";
		kuda[1].usia = 20;
		kuda[1].bb = 60;
		kuda[1].diadopsi ("Rizki\n");

		kuda[2] = new Horse();
		kuda[2].warnaBulu = new Color (1, 2, 3);
		kuda[2].nama = "Deki";
		kuda[2].usia = 20;
		kuda[2].bb = 60;
		kuda[2].diadopsi ("Rizki\n");

		kuda[3] = new Horse();
		kuda[3].warnaBulu = new Color (1, 2, 3);
		kuda[3].nama = "Selma";
		kuda[3].usia = 20;
		kuda[3].bb = 60;
		kuda[3].diadopsi ("IRizki\n");

		kuda[4] = new Horse();
		kuda[4].warnaBulu = new Color (1, 2, 3);
		kuda[4].nama = "Kumay";
		kuda[4].usia = 20;
		kuda[4].bb = 60;
		kuda[4].diadopsi ("Rizki\n");

		//kangguru
		kangguru[0] = new Kangoroo();
		kangguru[0].warnaBulu = new Color (1, 2, 3);
		kangguru[0].nama = "Kolaa";
		kangguru[0].usia = 21;
		kangguru[0].bb = 49;
		kangguru[0].diadopsi ("Rizki\n");

		kangguru[1] = new Kangoroo();
		kangguru[1].warnaBulu = new Color (1, 2, 3);
		kangguru[1].nama = "Simba";
		kangguru[1].usia = 21;
		kangguru[1].bb = 49;
		kangguru[1].diadopsi ("Rizki\n");

		kangguru[2] = new Kangoroo();
		kangguru[2].warnaBulu = new Color (1, 2, 3);
		kangguru[2].nama = "Laly";
		kangguru[2].usia = 21;
		kangguru[2].bb = 49;
		kangguru[2].diadopsi ("Rizki\n");

		kangguru[3] = new Kangoroo();
		kangguru[3].warnaBulu = new Color (1, 2, 3);
		kangguru[3].nama = "Sucaho";
		kangguru[3].usia = 21;
		kangguru[3].bb = 49;
		kangguru[3].diadopsi ("Rizki\n");

		kangguru[4] = new Kangoroo();
		kangguru[4].warnaBulu = new Color (1, 2, 3);
		kangguru[4].nama = "Dell";
		kangguru[4].usia = 21;
		kangguru[4].bb = 49;
		kangguru[4].diadopsi ("Rizki\n");

		System.out.print(" Lion ");
        System.out.println(" ");
        for(i = 0; i < 5; i++){
            singa[i].cetakInformasi();
            System.out.println(" ");
        }


        System.out.print(" Horse ");
        System.out.println(" ");
        for(i = 0; i < 5; i++){
            kuda[i].cetakInformasi();
            System.out.println(" ");
        }

 

        System.out.print(" Kangoroo ");
        System.out.println(" ");
        for(i = 0; i < 5; i++){
		 kangguru[i].cetakInformasi();
            System.out.println(" ");
        }
	}
}
