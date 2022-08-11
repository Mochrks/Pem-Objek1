package modul7;
public class StudentRecordExample { 
	public static void main( String[] args ){ 
		//membuat 3 object StudentRecord 
		StudentRecord annaRecord = new StudentRecord(); 
		StudentRecord beahRecord = new StudentRecord(); 
		StudentRecord crisRecord = new StudentRecord(); 
		//Memberi nama siswa 
		annaRecord.setName("Anna");
		beahRecord.setName("Beah");
		crisRecord.setName("Cris");
		//lengkapi untuk nama 2 siswa lainnya! 
		//Menampilkan nama siswa “Anna” 
		System.out.println( annaRecord.getName() );
		System.out.println( beahRecord.getName() );
		System.out.println( crisRecord.getName() );
		//lengkapi untuk 2 nama lainnya 
		//Menampilkan jumlah siswa 
		System.out.println("Count="+StudentRecord.getStudentCount());
		
		} 
	} 