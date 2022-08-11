package modul6;
public class ArrayOfStringDemo {
    public static void main(String[] args){
        String[] anArray = {"String One", "String Two", "String Three"};
        char[] arChar = {'a', 'b', 'c'};

        for(int i = 0; i < anArray.length; i++){
            System.out.println(anArray[i].toLowerCase());
        }

        for(int j = 0; j < arChar.length; j++){
            System.out.print(arChar[j] + " ");
        }
    }
}
