public class Mahasiswa {

    // Attribute
    String nama;
    String nim;
    double nilai;

    // Method: menampilkan seluruh data mahasiswa
    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    // Method: menentukan lulus / tidak lulus (nilai >= 60 -> Lulus)
    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}
