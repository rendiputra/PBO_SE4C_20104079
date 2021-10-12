# Modul 2: Input, Operasi bilangan Aritmatika & Tipe data primitif

## Dasar Teori

- ### Definisi Scanner
    Scanner merupakan kelas yang menyediakan fungsi–fungsi untuk membaca dan mengambil input dari pengguna. Kelas dalam java ini merupakan paket dari Java.util.Scanner. Scanner memiliki kemudahan yang dapat membaca teks, baik yang memiliki tipe data primitive maupun tipe data reference seperti string.

- ### Definisi Tipe data primitif
    Tipe data primitif adalah tipe data yang sudah didefinisikan oleh suatu bahasa pemograman dan tidak boleh ada method yang mengikat.
  Berikut contoh tipe data primitif:
  
  | Tipe data | Nilai default |
  | ---- | ----- |
  | Byte | 0 |
  | Boolean | false |
  | char | ‘\u0000’ |
  | short | 0 |
  | int | 0 |
  | long | 0L |
  | float | 0.0F |
  | double | 0.0 |
  
---

## Praktikum
**Soal  praktikum**
1. menganalisa batasan maksimum dari suatu tipe data(long) kemudian berikan solusi untuk mengatasi persoalan tersebut.
2. membuat cerita anak ayam dengan bahasa java.
3. Diberikan 3 buah bilangan bulat a, b, c tentukan hasil operasi matematika a + b -c dan cetak hasilnya !. dengan ketentuan input jumlah testcase adalah T(T <= 10) dan setiap testcase akan terdiri dari integer a, b, c adalah (-100 <= a, b, c <= 100).

---
**Jawaban**
1. [**Soal 1: Link source code file BigInteger.java**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul2/src/com/rendiputra/pbo/modul2/latihan/BigInteger.java)
   Analisa:
   ```java
   long p = 2147483648;
   ```
   Syntax diatas akan menampilkan pesan error:
   ```text
   D:\Program Kuliah\PBO_SE4C_20104079\src\com\rendiputra\pbo\modul2\latihan\BigInteger.java:5:18 java: integer number too large: 2147483648
   ```
   
   Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ?
   Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long.
   
   Contoh:
   ```java
    long p = 2147483648L;
   ```

2. [**Soal 2: Link source code file CeritaAnakAyam.java**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul2/src/com/rendiputra/pbo/modul2/latihan/CeritaAnakAyam.java)

   **Berikut Capture text output dari class CeritaAnakAyam ketika dijalankan:**
   ```text
    Anak ayam turun 10
    Mati 1 tingal 9
    Anak ayam turun 9
    Mati 1 tingal 8
    Anak ayam turun 8
    Mati 1 tingal 7
    Anak ayam turun 7
    Mati 1 tingal 6
    Anak ayam turun 6
    Mati 1 tingal 5
    Anak ayam turun 5
    Mati 1 tingal 4
    Anak ayam turun 4
    Mati 1 tingal 3
    Anak ayam turun 3
    Mati 1 tingal 2
    Anak ayam turun 2
    Mati 1 tingal 1
    Anak ayam turun 1
    Mati 1 tinggal induknya
    
    Process finished with exit code 0
    ```
   
3. [**Soal 3: Link source code file TestCaseAbc.java**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul2/src/com/rendiputra/pbo/modul2/latihan/TestCaseAbc.java)
   
   **Berikut Capture text output dari class TestCaseAbc ketika dijalankan:**
     ```text
     Masukan jumlah test case yang akan dijalankan (1 - 10): 7
    
    57 + 57 - 10 = 104
    
    46 + 70 - 70 = 46
    
    80 + 65 - 58 = 87
    
    97 + 53 - 49 = 101
    
    45 + 58 - 3 = 100
    
    43 + 52 - 26 = 69
    
    42 + 89 - 15 = 116
    
    Process finished with exit code 0
    ```
   
---

## Kesimpulan
Dimodul ke-2 ini kita mengulas lagi apa itu tipe data primitif, cara pengimplementasian operasi bilangan aritmatika dan cara membaca/mengambil input pengguna. Kita juga mengerjakan study kasus-study kasus yang telah diberikan.