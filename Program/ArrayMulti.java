package modul6;
public class ArrayMulti {
    public static void main(String[] args){
        //Elemen 512 x 128 dari integer array
        int[][] twoD = new int[512][128];
        //Karakter array 8 * 12 * 24

        char[][][] threeD = new char[8][16][24];
        //String array 4 Baris * 2 Kolom

        String[][] Kiddos = {
            {"Albarra", "Aldebaran"},
            {"Koko", "Zyo"},
            {"Kalista", "Zaki"}
        };
        System.out.println(Kiddos[0][0]);
    }
}
