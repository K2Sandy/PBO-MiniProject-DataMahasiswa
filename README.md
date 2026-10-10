<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f6e7d,100:e07b1f&height=200&section=header&text=Data%20Mahasiswa%20CLI&fontSize=44&fontColor=ffffff&desc=Mini%20Project%20Pemrograman%20Berorientasi%20Objek&descSize=18&descAlignY=68" alt="Banner Data Mahasiswa CLI" width="100%" />

![Java](https://img.shields.io/badge/Java-JDK_8+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![CLI](https://img.shields.io/badge/Interface-CLI-0f6e7d?style=for-the-badge&logo=gnubash&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigma-OOP-e07b1f?style=for-the-badge)
![PBO](https://img.shields.io/badge/Mata_Kuliah-PBO-2ea44f?style=for-the-badge)
![USK](https://img.shields.io/badge/Universitas-Syiah_Kuala-1f2937?style=for-the-badge)

**Program berbasis terminal untuk mencatat nilai mahasiswa dan menentukan status kelulusannya.**

Minggu 3 & 4 &nbsp;|&nbsp; Java Control Flow &amp; Dasar OOP

</div>

---

## 👤 Identitas

| | Keterangan | Isi |
|:-:|:--|:--|
| 🧑‍💻 | **Nama** | Muhammad Albharaka Putrosandy |
| 🪪 | **NIM** | 250810701100022 |
| 📚 | **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |
| 👨‍🏫 | **Dosen Pengampu** | Maulyanda, S.Tr.Kom., M.Kom. |
| 🎓 | **Program Studi** | S1 Informatika, Fakultas MIPA |
| 🏛️ | **Universitas** | Universitas Syiah Kuala |

---

## ✨ Fitur

- 🔢 **Input fleksibel**: jumlah mahasiswa ditentukan sendiri oleh user (minimal 3).
- 📝 **Data lengkap**: nama, NIM, dan nilai tiap mahasiswa.
- 🛡️ **Validasi input**: bukan angka atau di luar rentang 0 - 100 akan ditolak dan diminta ulang (tidak crash) dengan `try-catch`.
- ✅ **Cek kelulusan**: nilai `>= 60` dinyatakan **Lulus**, selain itu **Tidak Lulus**.
- 📊 **Ringkasan akhir**: total mahasiswa, jumlah yang lulus, dan jumlah yang tidak lulus.

---

## 🧩 Komponen Materi yang Digunakan

| Komponen | Penerapan di program |
|:--|:--|
| 🔤 **variable** | `jumlah`, `jumlahLulus`, `daftar`, dan lainnya |
| 🏷️ **data type** | `int`, `double`, `String`, serta konversi `parseInt` / `parseDouble` |
| ⌨️ **Scanner** | Membaca input dari keyboard dengan `nextLine()` |
| 🔀 **if / else** | `cekKelulusan()`, validasi input, dan penghitungan jumlah lulus |
| 🔁 **loop** | `do-while` (jumlah), `for` (input dan tampil data), `while` (validasi nilai) |
| 🏗️ **class** | `Mahasiswa` dengan attribute `nama`, `nim`, `nilai` |
| 📦 **object** | Minimal 3 object `Mahasiswa` dibuat dengan `new Mahasiswa()` |
| ⚙️ **method** | `tampilkanData()` dan `cekKelulusan()` |

---

## 📁 Struktur Repository

```
.
|-- Main.java        # Program utama (input, loop, tampil hasil)
|-- Mahasiswa.java   # Class Mahasiswa (attribute dan method)
|-- README.md
|-- .gitignore
```

---

## 🚀 Cara Menjalankan

> [!NOTE]
> Pastikan **JDK 8 atau lebih baru** sudah terpasang. Cek dengan `javac -version`.

```bash
# 1. Clone repository
git clone https://github.com/K2Sandy/PBO-MiniProject-DataMahasiswa.git
cd PBO-MiniProject-DataMahasiswa

# 2. Compile
javac Mahasiswa.java Main.java

# 3. Jalankan
java Main
```

---

## 💻 Contoh Penggunaan

**Alur normal**

```
Jumlah mahasiswa (minimal 3): 3

=== Data Mahasiswa ke-1 ===
Nama  : Andi
NIM   : 2301001
Nilai : 80

=== Data Mahasiswa ke-2 ===
Nama  : Budi
NIM   : 2301002
Nilai : 55

=== Data Mahasiswa ke-3 ===
Nama  : Citra
NIM   : 2301003
Nilai : 60.5

########## HASIL ##########

--- Mahasiswa ke-1 ---
Nama  : Andi
NIM   : 2301001
Nilai : 80.0
Status: Lulus

--- Mahasiswa ke-2 ---
Nama  : Budi
NIM   : 2301002
Nilai : 55.0
Status: Tidak Lulus

--- Mahasiswa ke-3 ---
Nama  : Citra
NIM   : 2301003
Nilai : 60.5
Status: Lulus

Total mahasiswa : 3
Lulus           : 2
Tidak lulus     : 1
```

**Saat input salah**

```
Jumlah mahasiswa (minimal 3): abc
Input harus berupa bilangan bulat, coba lagi.
Jumlah mahasiswa (minimal 3): 2
Jumlah minimal 3 mahasiswa, coba lagi.
Jumlah mahasiswa (minimal 3): 3
...
Nilai : 60,5
Nilai harus berupa angka (desimal pakai titik), coba lagi.
Nilai : 150
Nilai harus 0 - 100, coba lagi.
Nilai : 80
```

---

## 📌 Catatan

> [!TIP]
> Bilangan desimal pada kolom nilai ditulis dengan **titik** (contoh: `60.5`), bukan koma.

> [!NOTE]
> Penanganan error dengan `try-catch` adalah tambahan di luar materi Minggu 3 & 4.

---

<div align="center">

Dibuat oleh **[K2Sandy](https://github.com/K2Sandy)** untuk tugas mata kuliah PBO, Universitas Syiah Kuala.

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:e07b1f,100:0f6e7d&height=100&section=footer" alt="Footer" width="100%" />

</div>
