// Class: Kontak (Nama, NomorHP, Email, Grup misal: "Keluarga/Kantor").

// Fitur:
// cariKontak(): Cari berdasarkan nama di HashMap.
// panggilan(): Print "Memanggil [Nama] di nomor [NomorHP]...".
// blokirKontak(): Ubah status kontak jadi "Diblokir", kalau ditelepon print "Nomor sibuk".

import java.util.Scanner;
import java.util.HashMap;

class Kontak{
    String nama;
    String nomorHP;
    String email;
    String grup;

    
}

public class FilePhonebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashMap<String, Kontak> penyimpananKontak = new HashMap<>();
        
        while (true){
            System.out.println("----- PhoneBook -----");
            System.out.println("1. Cari kontak berdasarkan nama");
            System.out.println("2. Telepon kontak");
            System.out.println("3. Ubah status kontak");
            System.out.println("4. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 4){
                System.out.println();
            }


        }
    }
}