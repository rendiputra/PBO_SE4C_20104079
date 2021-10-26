# Modul 4: Dasar Pemograman Berorientasi Objek

## Dasar Teori
1. **Information Hiding**
   Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain. Informasi dari suatu class disembunyikan agar anggotaanggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method. 
   Contoh :
    ```java
    private int nilai;
    ```
   Berikut tabel yang menunjukan level akses : 
   
   | Modifier | Class | Package | Subclass | World |
   | --- | --- | --- | --- | --- |
   | public | Y | Y | Y | Y | 
   | protected | Y | Y | Y | N | 
   | no modifier | Y | Y | N | N | 
   | private | Y | N | N | N | 
   
2. **Encapsulation (Enkapsulasi)**
    Encapsulation adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:
    - Information hiding.
    - Menyediakan suatu perantara (method) untuk pengaksesan data.
      Contoh :
    ```java
    public class Siswa {
        private int nilai;
        public void setnilai(int n) {
            nilai = n; 
        }
    }
    ```

3. **Constructor (konstruktor)**
    Constructor adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Beberapa karakteristik yang dimiliki oleh constructor:
    - Method constructor harus memiliki nama yang sama dengan nama class.
    - Tidak mengembalikan suatu nilai (tidak ada keyword return).
    -  Satu class memiliki lebih dari satu constructor (overloading constructor).
    - Dapat ditambah access modifier public, private, protected maupun default.
    - Suatu constructor bisa dipanggil oleh constructor lain dalam satu class.
   Struktur dari konstruktor yaitu :
        
    ```java
    class Nama_kelas { 
        Nama_kelas() { //ini adalah constructor
        //isi konstruktor
        }
        //isi dari kelas 
    }
    ```
    Contoh :
    ```java
    public class Siswa { 
        private int nilai;
        private String nama;
        public Siswa(int n, String m) {
            nilai = n;
            nama = m;
        } 
    }
    ```
   
4. **Overloading Constructor**
   Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. 
   Contoh :
    ```java
    public class Siswa {
        private int nilai; 
        public Siswa() {
            nilai=0;
        }
        public Siswa(int n) {
            nilai = n;
        }
    }
    ```
   Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.

---
## Praktikum
[**Soal praktikum:**](https://github.com/rendiputra/PBO_SE4C_20104079/issues/5)

Buatlah 2 class dalam project kalian kemudian beri nama dan isi sebagai berikut :
- ### Class StudentRecord
```java
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;

    public String getName(){
        return name;
    }

    public void setName( String temp ){
        name = temp;
    }

    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    }

    public static int getStudentCount(){
        return studentCount;
    }
}
```
- ### Class StudentRecordExample
```java
public class StudentRecordExample {
    public static void main( String[] args ){
        StudentRecord Wahyu = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama = new StudentRecord();
        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");
        System.out.println( Wahyu.getName() );
        System.out.println("Hitung=" + StudentRecord.getStudentCount() );
    }
}
```

Hasil dari running program diatas adalah sebagai berikut:

![image](https://user-images.githubusercontent.com/34341857/138889035-c1fb2066-3d09-4cab-9a2d-408efaf859ba.png)

**Analisislah dan tentukan konsep apa saja yang digunakan (dari modul ke-4) serta mengapa hasil akhirnya seperti itu !**

---

**Jawaban**

Konsep yang digunakan oleh program diatas:
- Information Hiding
- Enkapsulasi
- Terdapat setter dan getter
   
Mengapa nilai `StudentRecord.getStudentCount()` tidak menghasilkan hasil yang diharapkan?
Karena nilai atribut `studentCount` tidak pernah diolah/dimanipulasi maka nilai `studentCount` akan menampilkan nilai default `int` yaitu 0.

Bagaimana solusi agar nilai `StudentRecord.getStudentCount()` menampilkan hasil output yang diharapkan?
Supaya dapat menghasilkan output sesuai harapan maka kita harus mengelolah/memanipulasi atribut `studentCount`. Caranya ialah:
Kita harus membuat method `setStudentCount()` pada class `StudentRecord` untuk meng-increment-kan nilai `studentCount`(menghitung jumlah siswa) seperti berikut:
```java
public static void setStudentCount() {
    StudentRecord.studentCount++;
}
```
Kita juga membuat method constructor pada class `StudentRecord` agar dapat memanggil method `setStudentCount()` atau dalam artian kita dapat menghitungkan jumlah siswa saat membuat suatu objek(StudentRecord). Berikut ini syntax method constructornya:
```java
public StudentRecord() {
    setStudentCount();
}
```
Berikut ketika class `StudentRecordExample` dijalankan:
```text
Wahyu
Hitung=3
```
Maka akan menampilkan nilai hasil output yang diinginkan.

---
## Kesimpulan
Dimodul ke-4 ini kita mempelajari apa itu Information Hiding, Encapsulation (Enkapsulasi), Constructor, dan Overloading Constructor. Kita juga diperintahkan untuk menganalisa suatu studi kasus, mengapa output yang ditampilkan tidak sesuai harapan yang kita inginkan dan kita juga membuat solusi untuk permasalah tersebut.
