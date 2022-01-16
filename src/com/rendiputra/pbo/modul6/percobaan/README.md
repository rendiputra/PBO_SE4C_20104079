# Modul 6: Konsep Inheritance
## Dasar Teori
1. **Inheritance**
   Dengan konsep inheritance, sebuah class dapat mempunyai class turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa suatu subclass adalah tidak lain hanya memperluas (extend) parent class-nya.

   Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Berikut adalah contoh deklarasi inheritance.
   

   Contoh:

    ```java
    public class B extends A {
        // Isi class
    }
    ```

   Contoh diatas memberitahukan kompiler Java bahwa kita ingin meng-extend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B.

   Java hanya memperkenankan adanya single inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu parent class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah.

   Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan). Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini:

   | Modifier | Class yang sama | Package yang sama | Subclass | Class manapun |
      | --- | --- | --- | --- | --- |
   | private | Y | N | N | N |
   | no modifier | Y | Y | N | N |
   | protected | Y | Y | Y | N |
   | public | Y | Y | Y | Y |

2. **Kata kunci `super`**
   Kata kunci `super` dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci `this` yang dipakai untuk merujuk pada member dari class itu sendiri.
   
3. **Method @Overriding**
   Method Overriding dilakukan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak. Method Overriding dapat dibuat dengan menambahkan anotasi @Override di atas nama method atau sebelum pembuatan method.
   Contoh:
   ```java
   public class B extends A {
        @Override
        public void namaMethod() {
            // isi method
        }
   }
   ```
---
## Praktikum

### Mengimplementasikan UML class diagram kedalam bentuk program
![uml diagram modul6](https://user-images.githubusercontent.com/34341857/140905586-26e55f9b-0869-4a96-a521-700e7ab52c8a.jpeg)

Berikut adalah link untuk source code
1. [**`class Animal`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul6/src/com/rendiputra/pbo/modul6/percobaan/Animal.java) sebagai class parent.
2. [**`class Bird`** ](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul6/src/com/rendiputra/pbo/modul6/percobaan/Bird.java) sebagai class child dari clsas animal.
3. [**`class Cat`**](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul6/src/com/rendiputra/pbo/modul6/percobaan/Cat.java)  sebagai class child dari clsas animal.
4. dan yang terakhir adalah [**`class Zoo`** ](https://github.com/rendiputra/PBO_SE4C_20104079/blob/modul6/src/com/rendiputra/pbo/modul6/percobaan/Zoo.java) sebagai class main

Berikut ini adalah capture text ketika method `main()` dari `class Zoo` dijalankan:

```text
   Lion name: Leon
   Lion age: 0
   
   Unknow name : Unanmed Animanl
   Unknow name : 0
   
   Bird name : Eagle
   Bird name : 5
   
   Eagle walks!
   
   Eagle flies!
   
   
   cat name : Miya
   cat name : 3
   
   Black Miya walks!
   
   
   Process finished with exit code 0
```

---
## Kesimpulan
Dimodul ke-6 ini kita mempelajari apa itu Inheritance dan bagaimana cara pengimplentasianya dalam bahasa java melalui panduan UML class diagram. 