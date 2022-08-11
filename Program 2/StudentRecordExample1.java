
public class StudentRecordExample1 {
    public static void main(String[] args){
    //membuat 3 object StudentRecord
	StudentRecord1 annaRecord = new StudentRecord1();
	StudentRecord1 beahRecord = new StudentRecord1();
	StudentRecord1 crisRecord = new StudentRecord1();
	//versi baru yang ditambahkan
	StudentRecord1 karyono = new StudentRecord1("Karyono");
	StudentRecord1 songjongki = new StudentRecord1("Song JongKi","Cibaduyut");
	StudentRecord1 masbejo = new StudentRecord1(80,90,100);
	//memberi nama siswa
	annaRecord.setName("Anna");
	beahRecord.setName("Beah");
	crisRecord.setName("Cris");
	//menampilkan nama siswa "Anna"
	System.out.println(annaRecord.getName());
	//menampilkan jumlah siswa
	System.out.println("Count="+StudentRecord1.getStudentRecord());
	StudentRecord1 anna2Record = new StudentRecord1();
	anna2Record.setName("Anna");
	anna2Record.setAddress("Philipina");
	anna2Record.setAge(15);
	anna2Record.setMathGrade(80);
	anna2Record.setEnglishGrade(95.5);
	anna2Record.setScienceGrade(100);
	//overload method
	anna2Record.print(anna2Record.getName());
	anna2Record.print(anna2Record.getEnglishGrade(),
	anna2Record.getMathGrade(),
	anna2Record.getScienceGrade());
	annaRecord.print(annaRecord.getName());
	anna2Record.getAverage();
	
	}

}
