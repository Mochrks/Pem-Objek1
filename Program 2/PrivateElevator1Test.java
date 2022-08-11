public class PrivateElevator1Test {
    public static void main(String[] args){
        PrivateElevator1 privElevator = new PrivateElevator1();

        privElevator.bukaPintu = true; //Penumpang masuk
        privElevator.bukaPintu = false; //Pintu ditutup
        //Pergi ke lantai 0 dibawah gedung
        privElevator.lantaiSkrg--;
        privElevator.lantaiSkrg++;

        //Lompat ke lantai 7 (Hanya ada 5 lantai dalam gedung)
        privElevator.lantaiSkrg = 7;
        privElevator.bukaPintu = true; //Penumpang Masuk/Keluar
        privElevator.bukaPintu = false;
        privElevator.lantaiSkrg = 1; //Menuju lantai pertama
        privElevator.bukaPintu = true; //Penumpang Masuk/Keluar
        privElevator.lantaiSkrg++; //Elevator bergerak tanpa menutup pintu
        privElevator.bukaPintu = false;
        privElevator.lantaiSkrg--;
        privElevator.lantaiSkrg--;

    }
}
