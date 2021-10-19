# Modul 3: Pengenalan Pemograman Beronrientasi Objek

## Dasar Teori
  1. **Pemrograman Berorientasi Objek**
     Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class-class atau object-object.
     
     PBO memiliki beberapa karakteristik mendasar, antara lain adalah abstraksi, encapculation (pembungkusan), inheritance(pewarisan), dan polymorphism.


  2. **Mendeklarasikan suatu class**
     Class adalah wadah yang berisi abstraksi (pemodelan) dari suatu fungsi objek (benda), yang mendeskripsikan data (sifat karakteristik) dan fungsi yang dimiliki oleh objek tersebut.
     Deklarasi class dapat dilakukan dengan sintaks sebagai berikut:
     ```java
      <modifier> class <nama_class> { 
        [isi class]
      }
      Contoh : 
      public class Mobil{ }
     ```


  3. **Mendeklarasikan suatu atribut**
     Attributes merupakan nilai (type) data yang terdapat pada suatu object yang berasal dari class. Attributes merepresentasikan karakteristik dari suatu object.
     Deklarasi atribut dapat dilakukan dengan sintaks sebagai berikut:
     ```java
      <modifier> <tipe> <nama_atribut> ;
      Contoh : 
      public String warna;
      ```
     
  4. **Mendeklarasikan suatu metode**
     Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek.
     Deklarasi metode dapat dilakukan dengan sintaks sebagai berikut:

     ```java
      <modifier> <return_type> <nama_metode> 
        ([daftar_argumen])
      [<statement>]
      }
      Contoh : 
      public void info(){
        System.out.println(warna);
      }
      ```
     

  5. **Mengakses anggota suatu obyek**
     Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini adalah contoh pengaksesan anggota-anggota dari class Mobil:

     ```java
      public class Mobil {
        public static void main(String args[]) { 
          Mobil m=new Mobil();
          m.warna=”hitam”;
          m.no_Plat=”KT 2837 UE”;
          m.info();
        }
      }
      ```

---
## Praktikum
**Soal  praktikum**

**1. Mengimplementasikan UML class diagram dalam program untuk  class Tabungan**
  
  ![image](https://user-images.githubusercontent.com/34341857/137890033-1959fd23-15da-4f2d-80de-9d84920faa10.png)
  
  Transformasikan class diagram diatas kedalam betuk program..?

  Jika tampilan di output seperti dibawah ini, maka program anda sudah benar. Jika tidak sama, benahi kembali program anda dan lakukan hal yang sama seperti diatas.
  
  ```text
  Saldo awal : 10000
  Jumlah uang yang disimpan : 8000
  Jumlah uang yang diambil : 7000 ok
  Jumlah uang yang disimpan : 1000
  Jumlah uang yang diambil : 10000 ok 
  Jumlah uang yang diambil : 2500 gagal 
  Jumlah uang yang disimpan : 2000
  Saldo sekarang = 4000
  ```

---
**Jawaban**

[**1. Berikut link source code class Tabungan.java**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul3/src/com/rendiputra/pbo/modul3/latihan/Tabungan.java)

  Class Tabungan.java mempunyai atribut saldo bertipe data integer. lalu didalam class Tabungan.java terdapat 4 method antara lain:
  - **Tabungan(int saldo)**
    Method ini adalah termasuk method constructor berfungsi untuk memberikan nilai awal pada objek yang dibuat dari class Tabungan.java
  - **getSaldo()**
    Method ini berfungsi untuk membaca atribut saldo saat ini.
  - **simpanUang(int jumlah)**
    Method ini berfungsi untuk menambahkan jumlah nilai saldo sesuai dari parameter jumlah.
  - **ambilUang(int jumlah)**
    Method ini berfungsi untuk mengurangi jumlah nilai saldo sesuai dari parameter jumlah.

[**Berikut link source code class TesTabungan.java**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul3/src/com/rendiputra/pbo/modul3/latihan/TesTabungan.java)

  **Berikut Capture text output dari class TesTabungan.java ketika dijalankan:**
  
  ```text
  Saldo awal : 10000
  Jumlah uang yang disimpan : 8000
  Jumlah uang yang diambil : 7000 ok
  Jumlah uang yang disimpan : 1000
  Jumlah uang yang diambil : 10000 ok
  Jumlah uang yang diambil : 2500 gagal
  Jumlah uang yang disimpan : 2000
  Saldo sekarang = 4000
  
  Process finished with exit code 0
  ```
    
---

## Kesimpulan
  Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class-class atau object-object.
  
   PBO memiliki beberapa karakteristik mendasar, antara lain adalah abstraksi, encapculation (pembungkusan), inheritance(pewarisan), dan polymorphism.
