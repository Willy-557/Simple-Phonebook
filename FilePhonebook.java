// Class: Kontak (Nama, NomorHP, Email, Grup misal: "Keluarga/Kantor").

// Fitur:
// cariKontak(): Cari berdasarkan nama di HashMap.
// panggilan(): Print "Memanggil [Nama] di nomor [NomorHP]...".
// blokirKontak(): Ubah status kontak jadi "Diblokir", kalau ditelepon print "Nomor sibuk".

import java.util.Scanner;
import java.util.HashMap;

class Kontak{
    String nomorHP;
    String email;
    String grup;
    String status;

    public Kontak(String nomorHP, String email, String grup, String status){
        this.nomorHP = nomorHP;
        this.email = email;
        this.grup = grup;
        this.status = status;
    }







    
}

public class FilePhonebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashMap<String, Kontak> penyimpananKontak = new HashMap<>();
        
        while (true){
            System.out.println("----- PhoneBook -----");
            System.out.println("1. Tambah kontak");
            System.out.println("2. Cari kontak berdasarkan nama");
            System.out.println("3. Telepon kontak");
            System.out.println("4. Ubah status kontak");
            System.out.println("5. Keluar");
            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 5){
                System.out.println();
            }
            else if (opsi > 5 || opsi < 0){
                System.out.println("Invalid input!");
                continue;
            }
            else {
                switch (opsi) {
                    case 1:
                        scanner.nextLine();
                        System.out.print("Masukkan nama: ");
                        String namaKontak = scanner.nextLine();

                        System.out.print("Masukkan nomor HP: ");
                        String noHP = scanner.nextLine();

                        System.out.print("Masukkan email: ");
                        String emailKontak = scanner.nextLine();
                        
                        System.out.print("Grup (Keluarga / Kantor): ");
                        String grupKontak = scanner.nextLine();

                        String statusKontak = "Belum di-blokir";

                        Kontak dataKontakBaru = new Kontak(noHP, emailKontak, grupKontak, statusKontak);
                        
                        penyimpananKontak.put(namaKontak, dataKontakBaru);
                        System.out.println("Berhasil menyimpan kontak bernama '" + namaKontak + "'.");
                        break;
                
                }
            }


        }
    }
}