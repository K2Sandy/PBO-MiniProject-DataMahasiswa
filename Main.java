import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // do-while: minimal berjalan satu kali, ulangi sampai jumlah valid (>= 3)
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
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat, coba lagi.");
            }
        } while (!valid);

        // Array untuk menampung banyak object Mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[jumlah];

        // for: jumlah pengulangan sudah diketahui -> input data
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("=== Data Mahasiswa ke-" + (i + 1) + " ===");

            Mahasiswa mhs = new Mahasiswa();   // membuat object baru

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
                    mhs.nilai = Double.parseDouble(teksNilai);   // String -> double
                    if (mhs.nilai >= 0 && mhs.nilai <= 100) {
                        nilaiValid = true;
                    } else {
                        System.out.println("Nilai harus 0 - 100, coba lagi.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Nilai harus berupa angka (desimal pakai titik), coba lagi.");
                }
            }

            daftar[i] = mhs;
        }

        // for: tampilkan hasil semua mahasiswa
        System.out.println();
        System.out.println("########## HASIL ##########");
        int jumlahLulus = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("--- Mahasiswa ke-" + (i + 1) + " ---");
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
