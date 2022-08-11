package modul6;
public class Dimensi {
    public static void main(String[] args){
        int[][] aMatrix = new int[4][];
        int[][] aMatrix1 = new int[4][];
        int[][] aMatrix2 = new int[4][];

        for(int i = 0; i < aMatrix.length; i++){
            aMatrix[i] = new int[4];
            for(int j = 0; j < aMatrix[i].length; j++){
                aMatrix[i][j] = i + j;
            }
        }

        for(int i = 0; i < aMatrix1.length; i++){
            aMatrix1[i] = new int[4];
            for(int j = 0; j < aMatrix1[i].length; j++){
                aMatrix1[i][j] = i + j;
            }
        }

        for(int i = 0; i < aMatrix2.length; i++){
            aMatrix2[i] = new int[4];
            for(int j = 0; j < aMatrix2[i].length; j++){
                aMatrix2[i][j] = (aMatrix[i][j] + aMatrix1[i][j]);
            }
        }

        for(int i = 0; i < aMatrix2.length; i++){
            for(int j = 0; j < aMatrix2[i].length; j++){
                System.out.print(aMatrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
