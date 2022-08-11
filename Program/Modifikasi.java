package modul6;
public class Modifikasi {
    public static void main(String[] args){
        String[] anArray = {"Rizki", "Bisma", "Sony"};
        char[] arChar = {'a', 'b', 'c'};

        for(int i = 0; i < anArray.length; i++){
            System.out.println(anArray[i].toLowerCase());
        }

        for(int j = 0; j < arChar.length; j++){
            System.out.print(arChar[j] + " ");
        }
    }
}
