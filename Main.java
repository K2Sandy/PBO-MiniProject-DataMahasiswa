/*
 * ============================================================
 *  Program Data Mahasiswa (CLI)
 *  Mini Project PBO - Minggu 3 & 4
 * ============================================================
 *  Alur program:
 *    1. Minta jumlah mahasiswa dari user (minimal 3).
 *    2. Minta nama, NIM, dan nilai untuk tiap mahasiswa.
 *    3. Tampilkan data tiap mahasiswa beserta status kelulusannya.
 *    4. Tampilkan ringkasan (total, jumlah lulus, jumlah tidak lulus).
 */


import java.util.Scanner;  // untuk membaca input dari keyboard

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

          // Input jumlah mahasiswa, diulang sampai valid (angka dan minimal 3)
          // menggunakan algotitma do-while
        int jumlah = 0;
        boolean valid;
        do {
            valid = false;
            System.out.print("Jumlah mahasiswa (minimal 3): ");
            String teksJumlah = input.nextLine().trim();
            try {
                jumlah = Integer.parseInt(teksJumlah);   // String -> int
                if (jumlah >= 3) {
                    valid = true;
                } else {
                    System.out.println("Jumlah minimal 3 mahasiswa, coba lagi.");
                }
            } catch (NumberFormatException e) {  //penanganan error menggunakan sistem try catch
                System.out.println("Input harus berupa bilangan bulat, coba lagi.");
            }
        } while (!valid);

        // Array untuk menampung banyak object Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        // for: jumlah pengulangan sudah diketahui, input data sebanyak jumlah tsb
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("=== Data Mahasiswa ke-" + (i + 1) + " ===");

            Mahasiswa mhs = new Mahasiswa();   // membuat object baru

            //print2 disini
            System.out.print("Nama  : ");
            mhs.nama = input.nextLine();

            System.out.print("NIM   : ");
            mhs.nim = input.nextLine();

            // while: ulangi sampai nilai berupa angka dan berada di rentang 0 - 100
            boolean nilaiValid = false;
            while (!nilaiValid) {
                System.out.print("Nilai : ");
                String teksNilai = input.nextLine().trim();
                try {
                    mhs.nilai = Double.parseDouble(teksNilai);   // String menggunakan double
                    if (mhs.nilai >= 0 && mhs.nilai <= 100) {
                        nilaiValid = true;
                    } else {
                        System.out.println("Nilai harus 0 - 100, coba lagi.");
                    }
                } catch (NumberFormatException e) {     //penanganan error menggunakan sistem try catch
                    System.out.println("Nilai harus berupa angka (desimal pakai titik), coba lagi.");
                }
            }

            daftar[i] = mhs;        //pada akhir loop menyimpan object mhs ke daftar
        }

        // for: tampilkan hasil semua mahasiswa
        System.out.println();
        System.out.println("########## HASIL ##########");
        int jumlahLulus = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("--- Mahasiswa ke-" + (i + 1) + " ---");
            
                //manggil fungsi dari mahasiswa.java
            daftar[i].tampilkanData();
            daftar[i].cekKelulusan();

            if (daftar[i].nilai >= 60) {
                jumlahLulus++;
            }
        }

        System.out.println();
        System.out.println("Total mahasiswa : " + jumlah);
        System.out.println("Lulus           : " + jumlahLulus);
        System.out.println("Tidak lulus     : " + (jumlah - jumlahLulus));

        input.close();
    }
}
