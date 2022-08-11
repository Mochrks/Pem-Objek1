package modul6;
public class ArrayCopyDemo {
    public static void main(String[] args){
        
        char[] CopyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd', };
        char[] CopyTo = new char[7];
        
        System.arraycopy(CopyFrom, 2, CopyTo, 0, 7);
        System.out.println(new String(CopyTo));
    }
}
