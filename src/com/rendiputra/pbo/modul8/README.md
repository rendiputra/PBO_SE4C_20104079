# Modul 8: Polimorfisme
## Dasar Teori
1. **Polimorfisme**
    Polymorphism (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui subclass. Misalnya deklarasi pernyataan berikut ini:
    
    Dimana `Manager()` adalah kontruktor pada class Manager yang merupakan ubclass dari class `Employee`.
    ```java
    Employee employee = new Manager();
    //<nama class> <variable objek bebas> = new <kontruktor>();
    ```

2. **Virtual Method Invocation(VMI)**  
    Virtual Method Invocation (VMI) bisa terjadi jika terjadi polimorfisme dan overriding. Pada saat obyek yang sudah dibuat tersebut memanggil overridden method pada parent class, kompiler Java akan melakukan invocation (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridding method. 
    Berikut contoh terjadinya VMI:
    ```java
    class Parent {
        int x = 5;
        public void Info() {
            System.out.println(“Ini class Parent”);
        }
    }
   
    class Child extends Parent {
        int x = 10;
        public void Info() {
            System.out.println(“Ini class Child”);
        }
    }
   
    public class Tes {
        public static void main(String args[]) {
            Parent tes = new Child();
            System.out.println(“Nilai x = “ + tes.x);
            tes.Info();
        }
    }
   ```

   Hasil dari running program diatas adalah sebagai berikut:
    ```text
    Nilai x = 5
    Ini class Child
    ```

   Polymorphic arguments adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Berikut contoh dari polymorphics arguments:

    ```java
    class Pegawai {
        // ...
    }
    class Manajer extends Pegawai {
        // ...
    }
    public class Tes {
        public static void Proses(Pegawai peg) {
            // ...
        }
    }
    public static void main(String args[]) { 
        Manajer man = new Manajer(); 
        Proses(man);
    }
    ```

   Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Untuk lebih jelasnya, misalnya dari contoh program sebelumnya, kita sedikit membuat modifikasi pada class Tes dan ditambah sebuah class baru Kurir, seperti yang tampak dibawah ini:
    
    ```java
    // ...
    class Kurir extends Pegawai {
        // ...
    }
   
    public class Tes {
        public static void Proses(Pegawai peg) {
        if (peg instanceof Manajer) {
            // lakukan tugas-tugas manajer…
        } else if (peg instanceof Kurir) {
            // lakukan tugas-tugas kurir…
        } else {
            // lakukan tugas-tugas lainnya…
        }
   
        public static void main(String args[]) { 
            Manajer man = new
            Manajer();
            Kurir kur = new Kurir(); 
            Proses(man);
            Proses(kur);
        }
    }
    ```

   Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting object ke tipe asalnya, yaitu Manajer. Caranya adalah seperti berikut:

    ```java
    // …
    if (peg instanceof Manajer) { 
        Manajer man = (Manajer) peg;
        //…lakukan tugas-tugas manajer…
    }
    ```

---
## Praktikum
[**Soal:**](https://github.com/rendiputra/PBO_SE4C_20104079/issues/11)

Buatlah 3 class dalam project kalian kemudian beri nama dan isi sebagai berikut :
1. Class `Pegawai`
    ```java
    public class Pegawai {
        private String name;
        private String address;
        private int number;
   
        public Pegawai(String name, String address, int number){
            System.out.println("Menyusun Pegawai");
            this.name = name;
            this.address = address;
            this.number = number;
        }
   
        public void mailCheck(){
            System.out.println("Memeriksa Surat Untuk " + this.name+ " " + this.address);
        }
   
        public String toString(){
            return name + " " + address + " " + number;
        }
   
        public String getName(){
            return name;
        }
   
        public String getAddress(){
            return address;
        }
   
        public void setAddress(String newAddress){
            address = newAddress;
        }
   
        public int getNumber(){
            return number;
        }
    }
    ```
   
2. Class `Gaji`
    ```java
    public class Gaji extends Pegawai {
        private double salary; //Gaji Tahunan
        public Gaji(String name, String address, int number, double salary){
            super(name, address, number);
            setSalary(salary);
        }
   
        public void mailCheck(){
            System.out.println("Memeriksa kelas gaji dalam surat ");
            System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
        }
   
        public double getSalary(){
            return salary;
        }
   
        public void setSalary(double newSalary){
            if(newSalary >= 0.0){
                salary = newSalary;
            }
        }
        public double computePay(){
            System.out.println("Menghitung pembayan gaji untuk " + getName());
            return salary/52;
        }
    }
    ```
   
3. Class `VirtualDemo`
    ```java
    public class VirtualDemo{
        public static void main(String [] args){
            Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
            System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
            s.mailCheck();
   
            Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);
            System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
            e.mailCheck();
        }
    }
    ```

Hasil dari running program diatas adalah sebagai berikut:

![image](https://user-images.githubusercontent.com/34341857/145064000-18c2ae53-1876-41a8-9821-262eabea8857.png)

**Analisislah mengapa hasil akhirnya seperti ini !**


**Jawaban:**

Pada saat kita menjalankan syntax:
```java
Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
s.mailCheck();
```
akan memanggil method `mailCheck()` yang berasal dari class Gaji.

Tapi mengapa pada saat kita menjalankan syntax:
```java
Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);
System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
e.mailCheck();
```
Method yang dipanggil berdasarkan class Gaji, padahal kita mendlekarasikan class Pegawai sebagai objek dari `e`?

Jawabannya adalah karena kita menggunakan **Virtual Method Invocation (VMI)** dan method `mailCheck()` telah ditimpa(overridding) oleh class child(class `Gaji`) maka dari itu method `mailCheck()` yang dipanggil berasal dari class `Gaji`(class child), kecuali jika method `mailCheck()` bersifat `final` atau `static` maka method `mailCheck()` tidak akan ditimpa(overridding) oleh class child.

---
# Kesimpulan
Polymorphism(polimorfisme) dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak “bentuk” method yang berbeda-beda meskipun namanya sama.