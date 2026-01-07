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

    void cariKontak(){
        System.out.println("Nomor HP Kontak : " + this.nomorHP);
        System.out.println("Email Kontak    : " + this.email);
        System.out.println("Grup Kontak     : " + this.grup);
        System.out.println("Status Kontak   : " + this.status);
    }
}

public class FilePhonebook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        HashMap<String, Kontak> penyimpananKontak = new HashMap<>();
        
        while (true){
            System.out.println("\n----- PhoneBook -----");
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
                System.out.println("\nInvalid input!");
                continue;
            }
            else {
                switch (opsi) {

                    // Tambah kontak
                    case 1:
                        scanner.nextLine();
                        System.out.print("\nMasukkan nama: ");
                        String namaKontak = scanner.nextLine();

                        System.out.print("Masukkan nomor HP: ");
                        String noHP = scanner.nextLine();

                        System.out.print("Masukkan email: ");
                        String emailKontak = scanner.nextLine();
                        
                        System.out.print("Grup (Keluarga / Kantor): ");
                        String grupKontak = scanner.nextLine();

                        String statusKontak = "Belum di-blokir";

                        if ((grupKontak.equalsIgnoreCase("Keluarga")) || (grupKontak.equalsIgnoreCase("Kantor"))){
                            Kontak dataKontakBaru = new Kontak(noHP, emailKontak, grupKontak, statusKontak);
                            penyimpananKontak.put(namaKontak, dataKontakBaru);
                            System.out.println("\nBerhasil menyimpan kontak bernama '" + namaKontak + "'.");
                        }
                        else {
                            System.out.println("\nInput Grup Kontak harus Keluarga / Kantor!");
                        }
                        break;
                    
                    // Cari kontak
                    case 2:
                        scanner.nextLine();
                        System.out.print("\nMasukkan nama kontak yang ingin dicari: ");
                        String namaKontakYangDicari = scanner.nextLine();

                        if (!penyimpananKontak.containsKey(namaKontakYangDicari)){
                            System.out.println("\nNama kontak '" + namaKontakYangDicari + "' tidak ada di dalam penyimpanan!");
                        }
                        else {
                            Kontak ambilData = penyimpananKontak.get(namaKontakYangDicari);
                            System.out.println(penyimpananKontak);
                            System.out.println("\nNama Kontak     : " + namaKontakYangDicari);
                            ambilData.cariKontak();
                        break;
                        }
                    
                    // Telepon kontak
                    case 3:
                        scanner.nextLine();
                        System.out.print("\nMasukkan nama kontak yang ingin ditelepon: ");
                        String namaYangInginDiTelepon = scanner.nextLine();

                        if (!penyimpananKontak.containsKey(namaYangInginDiTelepon)){
                            System.out.println("\nKontak bernama '" + namaYangInginDiTelepon + "' tidak ada");
                        }
                        else {
                            Kontak ambilNomor = penyimpananKontak.get(namaYangInginDiTelepon);
                            String cekDataStatus = ambilNomor.status;
                            if (cekDataStatus.equalsIgnoreCase("Blokir")){
                                System.out.println("\nKontak bernama '" + namaYangInginDiTelepon + "' tidak bisa ditelpon dikarenakan sudah di-blokir");
                            }
                            else {
                                String noTelp = ambilNomor.nomorHP;
                                System.out.println("\nMemanggil " + namaYangInginDiTelepon + " di nomor " + noTelp + ".");
                            }
                        }
                        break;
                    
                    // Ubah status
                    case 4:
                        scanner.nextLine();
                        System.out.print("\nMasukkan nama kontak yang ingin di-ubah statusnya: ");
                        String namaKontakYangInginDirubahStatusnya = scanner.nextLine();
                        
                        if (!penyimpananKontak.containsKey(namaKontakYangInginDirubahStatusnya)){
                            System.out.println("\nKontak bernama '" + namaKontakYangInginDirubahStatusnya + "' tidak ada!");
                            break;
                        }
                        else {
                            System.out.println();
                            Kontak ubahStatus = penyimpananKontak.get(namaKontakYangInginDirubahStatusnya);
                            ubahStatus.status = "Blokir";
                            System.out.println("\nKontak bernama '" + namaKontakYangInginDirubahStatusnya + "' status sudah di-blokir!");
                        }
                        break;
                }
            }


        }
    }
}