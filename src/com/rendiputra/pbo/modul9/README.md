# Modul 9: Exeption
## Dasar Teori
1. **Exception**
    Exception adalah suatu kondisi abnormal yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan exception handling. Karena dalam java segala sesuatu merupakan objek, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh exception adalah pembagian bilangan dengan 0, pengisian elemen array diluar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu:
    a. Menangani sendiri exception tersebut.
    b. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method(method yang didalamnya terdapat exception) tersebut.
   
2. **Tipe-Tipe Exception**
    Pada exception, superclass tertinggi adalah class Throwable, tetapi kita hampir tidak pernah menggunakan class ini secara langsung. Dibawah class Throwable terdapat dua subclass yaitu class Error dan class Exception.

    ![image](https://user-images.githubusercontent.com/34341857/145985982-755d25c4-e05e-40e2-a9ae-686b89e99756.png)

3. **Penggunaan Blok `try`-`catch`**
    Untuk menangani exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception didalam blok `try`, diikuti dengan blok `catch` yang menentukan jenis exception yang ingin ditangani. Contoh :
    ```java
    public class Percobaan2 {
        public static void main(String[] args) { 
            int a[] = new int[5];
   
            try{
                a[5] = 100 ;
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Indeks Array melebihi batas");
            }
   
            System.out.println("Setelah blok try-catch"); 
        }
    }
    ```

   Dapat terjadi error lebih dari satu yang terdapat dalam blok `try` mengakibatkan lebih dari satu exception. Dalam hal ini, kita dapat menuliskan lebih dari satu blok `catch`. 
   Contoh :

    ```java
    public class Percobaan5 {
        public static void main(String[] args) {
            int bil=10;
            String b[] = {
                "a","b","c"
            };
   
            try{
                System.out.println(bil/0);
                System.out.println(b[3]);
            } catch(ArithmeticException e) {
                System.out.println("Error Aritmetik");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error Kapasitas Array Melebihi Batas");
            }catch(Exception e){
                System.out.println("Terdapat Error");
            }
        }
    }
    ```

4. **Keyword `finally`**
    Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi exception, misalkan kita membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada, file tidak bisa dibuka, selanjutnya yang harus dilakukan adalah menutup file tersebut. 
    Contoh :
    ```java
    public class Percobaan2 {
        public static void main(String[] args) {
            int a[] = new int[5];
   
            try{
            a[5] = 100 ;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Terjadi exception karena Indeks Array melebihi batas");
            } finally {
                System.out.println("Selalu Dijalankan");
            } 
   
            System.out.println("Setelah blok try-catch");
        }
    }
    ```
   
5. **Keyword `throw` dan `throws`**
    Secara eksplisit, kita dapat melempar (throw) exception dari program menggunakan keyword throw. Jika exception tersebut adalah checked exception, maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.
   
    ```java
    public class Percobaan6 {
        public static void method1() throws FileNotFoundException {
            throw new FileNotFoundException("File Tidak Ada");
        } 
   
        public static void main(String[] args) {
            try {
                method1();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } 
    }
    ```
   
---
## Praktikum
Source code:
1. [**Latihan1**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul9/src/com/rendiputra/pbo/modul9/latihan/Latihan1.java)
2. [**Latihan2**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul9/src/com/rendiputra/pbo/modul9/latihan/Latihan2.java)
3. [**Latihan3**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul9/src/com/rendiputra/pbo/modul9/latihan/Latihan3.java)

Berikut adalah capture hasil dari program diatas:
1. **Latihan1**
    Function `Method1()` melemparkan error `FileNotFoundException` dengan membawa isi pesan "File Tidak Ada". Sehingga pada saat `Method1()` di`try`-`catch` maka akan menampilkan pesan error "File Tidak Ada".
    ```text
    File Tidak Ada

    Process finished with exit code 0
    ```
2. **Latihan2**
    Apabila nilai dari variable `num` > 10 maka akan melemparkan Exception baru dan syntax ```System.out.println("Angka kurang dari atau sama dengan 10");``` tidak akan dijalankan, tetapi jika nilai dari variable `num` <= 10 maka tidak akan melemparkan Exception baru sehingga Syntax ```System.out.println("Angka kurang dari atau sama dengan 10");``` dapat dijalankan.
   
    Jika masukan angka <10 :
    ```text
    Masukan Angka : 5
    Angka kurang dari atau sama dengan 10
    Selesai
    
    Process finished with exit code 0
    ```
   
    Jika masukan angka >= 10 :
    ```text
    Masukan Angka : 15
    Angka lebih dari 10
    Selesai
   
    Process finished with exit code 0
    ```

3. **Latihan3**
    Pada saat blok `try` pertama dijalankan maka akan melempar(throw) `ExceptionC()` baru dan ketika ditangkap(catch) akan muncul sebuah MessageDialog(pop up) dengan isi pesan yang tak lain merupakan nama dari class yang dipanggil ketika method `throw` dijalankan karena method `toString()` akan me-return nama class dari object. Begitu juga pada blok `try` kedua saat dijalankan maka akan menampilkan MessageDialog(pop up) berupa pesan dari nama class yang dipanggil ketika method `throw` dijalankan.

    ![image](https://user-images.githubusercontent.com/34341857/145986199-b8d16551-cc07-4b0c-a601-f4c8e9c62773.png)
    
    ![image](https://user-images.githubusercontent.com/34341857/145986242-7eb72a86-3c54-42f0-9644-4dd0a43c8735.png)

---
## Kesimpulan
Exception Handling merupakan mekanisme yang paling diperlukan dalam menangani error yang terjadi pada saat runtime (program berjalan) atau yang lebih dikenal dengan sebutan runtime error.
