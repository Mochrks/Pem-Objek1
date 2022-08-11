package modul6;
import java.util.Scanner;

public class PopulasiMatrik2 {
    public static void main(String[] args){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai X = ");
        x = input.nextInt();

        int[][] aMatrix = new int[x][x];

        for(int i = 0; i < aMatrix.length; i++){
            aMatrix[i] = new int[x];
            for(int j = 0; j < aMatrix[i].length; j++){
                aMatrix[i][j] = i + j ;
            }
        }

        for(int i = 0; i < aMatrix.length; i++){
            for(int j = 0; j < aMatrix[i].length; j++){
                System.out.print(aMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
