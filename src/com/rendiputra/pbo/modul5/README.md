# Modul 5: Mengelola Class
## Dasar Teori
1. **Package**
   Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket.
   
   ```java
   package nama-paket;
   <identifier> class <nama_class> { }
   Contoh :
   package Utama;
   public class Utama{ 
       
   }
   ```

2. **Import Class**
   Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.
   Deklarasi import class :
   ```java
   import <nama_package>.*;
   Contoh : 
   import matematik.*;
   ```
   
   Sedangkan untuk mengimpor class tertentu anda dapat menuliskan nama class setelah nama package. Deklarasi import :
   ```java
   import <nama_package>.<nama_class>;
   Contoh : 
   import matematik.bilangan;
   ```

   **Contoh penggunaan import (dengan implementasinya):**
   ```java
   import matematik.bilangan;
   class Utama {
      public static void main(String[] args) {
         Bilangan x = new Bilangan(); 
         x.setDesimal(-44); 
         System.out.println("Bilangan biner dari " + x.getDesimal() + " adalah "+ x.biner()); 
      }
   }
   ```

4. **Kata kunci this**
   Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. 
   
   Adapun format penulisannya adalah:
   
   | format | Keterangan |
   | ----- | ----- |
   | ```java this.data_member ``` | merujuk pada data member |
   | ```java this.function ``` | merujuk pada function member |
   | ```java this() ``` | merujuk pada constructor |

---

## Praktikum
[**Soal praktikum:**](https://github.com/rendiputra/PBO_SE4C_20104079/issues/7)

## Mengimplementasikan UML class diagram dalam program untuk package perbankan

   ![image](https://user-images.githubusercontent.com/34341857/139856588-66a1e566-8b2d-413c-a9c4-410d18fa22cf.png)
   
   Transformasikan class diagram diatas ke dalam bentuk program! dan tulislah listing program berikut ini sebagai pengetesan.

- ### Class `TesLatihan()`
   ```java
   import perbankan.*;
   
   private class TesLatihan {
       private static void main(String args[]) {
           int tmp;
           boolean status;
           Nasabah nasabah=new Nasabah("Agus","Daryanto");
   
           System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
           nasabah.setTabungan(new Tabungan(5000));
           tmp=nasabah.getTabungan().getSaldo();
           System.out.println("Saldo awal : " + tmp);
           nasabah.getTabungan().simpanUang(3000);
           System.out.println("Jumlah uang yang disimpan : 3000");
           status=nasabah.getTabungan().ambilUang(6000);
           System.out.print("Jumlah uang yang diambil : 6000");
           if (status) {
               System.out.println(" ok");
           } else {
               System.out.println(" gagal");
           }
   
           nasabah.getTabungan().simpanUang(3500);
           System.out.println("Jumlah uang yang disimpan : 3500");
           status=nasabah.getTabungan().ambilUang(4000);
           System.out.print("Jumlah uang yang diambil : 4000");
           if (status) {
               System.out.println(" ok");
           } else {
               System.out.println(" gagal");
           }
   
           status=nasabah.getTabungan().ambilUang(1600);
           System.out.print("Jumlah uang yang diambil : 1600");
           if (status) {
               System.out.println(" ok");
           } else {
               System.out.println(" gagal");
           }
           nasabah.getTabungan().simpanUang(2000);
           System.out.println("Jumlah uang yang disimpan : 2000");
           tmp=nasabah.getTabungan().getSaldo();
           System.out.println("Saldo sekarang = " + tmp);
       }
   }
   
   ```
   
   Lakukan kompilasi pada program diatas dan jalankan. Jika tampilan di layar tampak seperti dibawah ini, maka program anda udah benar. Jika tidak sama, benahi kembali program anda dan lakukan hal yang sama seperti diatas.
   
   ![image](https://user-images.githubusercontent.com/34341857/139857124-ddb2a1c0-434a-45fa-bb55-aecec0bbeafb.png)

**Jawaban**

   Berikut adalah link [**source code class `Tabungan()`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul5/src/com/rendiputra/pbo/modul5/latihan/perbankan/Tabungan.java) dan [**source code class `Nasabah()`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul5/src/com/rendiputra/pbo/modul5/latihan/perbankan/Nasabah.java).

   Selanjutnya kita akan mencoba untuk  menjalankan method `main()` pada class `TesLatihan()`. Tetapi jika kita coba untuk menjalankan method `main()` maka akan menampilkan pesan error seperti dibawah ini:
   ```text
   java: modifier `private` not allowed here
   ```

   **Mengapa bisa menimbulkan error seperti pesan diatas?**

   Karena kita tidak dapat mendeklarasikan `top-level class` sebagai `private` atau `protected`. Kita bisa menggunakan `public` atau `default`(no modiefier) seperti contoh dibawah:

   ```java
   // A top level class
    public class TesLatihan {
        // Class body
    }
   ```
   Jika modifier pada class `TesLatihan` sudah diubah ke `public` maka selanjutnya kita akan mencoba kembali untuk menjalankan method `main()` pada class `TesLatihan`. Tetapi pada saat kita mencoba untuk menjalankan method `main()` kita tidak bisa untuk menjalankan program seperti screenshot dibawah ini:

   ![image](https://user-images.githubusercontent.com/34341857/139869195-cec9b4dd-edfd-4521-9d09-9da072933014.png)

   **Kenapa hal itu bisa terjadi?**

   Itu karena jika kita mencoba untuk menjalankan method `main()` maka method `main()` tersebut dipanggil oleh `Run time environment`. `Run time environment` itu adalah sesuatu yang berada diluar class kita. Jadi jika kita tidak memberikan izin untuk mengakses method `main()` maka method `main()` tidak dapat diakses oleh `Run time environment`. Maka solusinya adalah kita harus mengubah access modifiers nya menjadi `public` seperti contoh dibawah:

   ```java
   public class TesLatihan {
      // Class body
      public static void main(String args[]) {
        // method body
      }
   }
   ```

   Maka method `main()` sekarang sudah dapat dijalankan: 
   ![image](https://user-images.githubusercontent.com/34341857/139871727-f78910fe-580e-403a-9275-3f2dc4d039d8.png)

   Berikut capture text ketika method `main()` dijalankan:
   ```text
   Nasabah atas nama : Agus Daryanto
   Saldo awal : 5000
   Jumlah uang yang disimpan : 3000
   Jumlah uang yang diambil : 6000 ok
   Jumlah uang yang disimpan : 3500
   Jumlah uang yang diambil : 4000 ok
   Jumlah uang yang diambil : 1600 gagal
   Jumlah uang yang disimpan : 2000
   Saldo sekarang = 3500
   
   Process finished with exit code 0
   ```
---

## Kesimpulan
   Di modul ini ke-5 ini kita mengenal lebih jauh cara mengelola class dan mempelajari apa itu `package`, `import class`, dan keyword `this`. Kita juga ditugaskan untuk menganalisa suatu stadi kasus dan membuat solusi untuk permasalahan tersebut.
   