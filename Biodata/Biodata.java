import java.io.*;
public class Biodata{
    public static void main(String[] args){
         BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in) );
         
         try{
             System.out.print("Masukan nama anda = ");
             String nama = dataIn.readLine();
             
             System.out.print("Masukan hobi anda = ");
             String hobi = dataIn.readLine();
             
             System.out.println("So your hobby " +hobi+". Nice hobi Mr."+nama);
         } catch (IOException e){
             System.out.println("Error bro!!!");
         }
         
    }
}