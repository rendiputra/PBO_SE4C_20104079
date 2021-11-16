# Modul 7: Overloading dan Overriding
## Dasar Teori
1. **Overloading**
    Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama. 
   Contoh :
    ```java
    public void print(String temp){ 
        System.out.println("Name:" + name);
        System.out.println("Address:" + address); 
        System.out.println("Age:" + age);
    }
   
    public void print(double eGrade, double mGrade, doublesGrade) {
        System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("English Grade:" + eGrade);
        System.out.println("Science Grade:" + sGrade);
    }
    ```
   
   Overloading ini dapat terjadi pada class yang sama atau pada suatu parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai berikut:
   - Nama Method harus sama,
   - Daftar parameter harus berbeda,
   - Return type boleh sama,juga boleh berbeda.
    
2. **Overriding**
   Overriding tidak sama dengan overloading, Overriding merupakan mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas turunannya. Overriding mempunyai ciri-ciri sebagai berikut:
   - Nama Method harus sama,
   - Daftar parameter harus sama,
   - Return type harus sama.
    
    Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method RupiahVsDolar() pada class Dulu.

    ```java
    class Dulu {
        public String RupiahVsDolar() {
            System.out.println(“Rp 10.000”);
        }
    }
   
    class Sekarang extends Dulu {
        public String RupiahVsDolar() {
            System.out.println(“Rp 14.000”);
        }
    }
    ```

   Method yang terkena override (overiden method) diharuskan tidak boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng-overide (overriding method).

---
## Praktikum
### Membuat contoh pengimplementasian Overloading dan Overriding.

1. [**`class Kendaraan`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul7/src/com/rendiputra/pbo/modul7/latihan/Kendaraan.java) sebagai class parent.
    Contoh method overloading pada class `Kendaraan`:
    ```java
    public Kendaraan() {
    }

    public Kendaraan(String name) {
        this.name = name;
    }

    public Kendaraan(String name, String bahanBakar) {
        this.name = name;
        this.bahanBakar = bahanBakar;
    }
    ```
   
2. [**`class Mobil`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul7/src/com/rendiputra/pbo/modul7/latihan/Mobil.java) sebagai class child.
    Contoh method overloading pada class `Mobil`:
    ```java
    public Mobil() {
    }

    public Mobil(String name) {
        super(name);
    }

    public Mobil(String name, String bahanBakar) {
        super(name, bahanBakar);
    }
    ```

   Contoh method Overriding pada class `Mobil`:
    ```java
    @Override
    public void berjalan() {
        System.out.println(this.getName() + " melaju diaspal menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " berhenti.");
    }
    ```
   
3. [**`class Kapal`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul7/src/com/rendiputra/pbo/modul7/latihan/Kapal.java) sebagai class child.
   Contoh method overloading pada class `Kapal`:
    ```java
    public Kapal() {
    }

    public Kapal(String name) {
        super(name);
    }

    public Kapal(String name, String bahanBakar) {
        super(name, bahanBakar);
    }
    ```

   Contoh method Overriding pada class `Kapal`:
    ```java
    @Override
    public void berjalan() {
        System.out.println(this.getName() + " berlayar menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " berhenti dan mengeluarkan jangkar.");
    }
    ```
   
4. [**`class Pesawat`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul7/src/com/rendiputra/pbo/modul7/latihan/Pesawat.java) sebagai class child.
   Contoh method overloading pada class `Pesawat`:
    ```java
    public Pesawat() {
    }

    public Pesawat(String name) {
        super(name);
    }

    public Pesawat(String name, String bahanBakar) {
        super(name, bahanBakar);
    }
    ```

   Contoh method Overriding pada class `Pesawat`:
    ```java
    @Override
    public void berjalan() {
        System.out.println(this.getName() + " lepas landas menggunakan bahan bakar " + this.getBahanBakar());
    }

    @Override
    public void berhenti() {
        System.out.println(this.getName() + " landing di bandara.");
    }
    ```

4. [**`class MainClass`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul7/src/com/rendiputra/pbo/modul7/latihan/MainClass.java) sebagai main class.
    Berikut ini adalah capture text ketika method main() dari class MainClass dijalankan:
    ```text
    Mobil F1 berjalan.
    Avanza melaju diaspal menggunakan bahan bakar Pertamax
    Titanic berlayar menggunakan bahan bakar Batu bara
    Boeing lepas landas menggunakan bahan bakar Aftur
    
    Mobil F1 berhenti.
    Avanza berhenti.
    Titanic berhenti dan mengeluarkan jangkar.
    Boeing landing di bandara.
    
    Process finished with exit code 0
    ```

---
# Kesimpulan
Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada satu class tetapi dengan parameter yang berbeda. sedangkan Overriding merupakan mekanisme dimana sebuah metode dideklarasikan ulang pada kelas turunannya(subclass) dengan nama dan parameter yang sama.
