package modul9;
public class NewStudent extends StudentRecord{
    public NewStudent() {
	System.out.println("NewStudent merupakan Subclass");
   }

   public static void main(String[] args) {
	NewStudent inet = new NewStudent();
	System.out.println("Nama   : " +inet.getName());
	System.out.println("Alamat : " +inet.getAddress());
	System.out.println("Umur   : " +inet.getAge());
	System.out.println("Nilai Matematika :" +inet.getMathGrade());
    System.out.println("Nilai B. Inggris :" +inet.getEnglishGrade());
	System.out.println("Nilai Sains      :" +inet.getScienceGrade());
	System.out.println("Nilai Ilmu Kompi :" +inet.getComputerGrade());
    }

}
