Berikut adalah teks yang telah diperbarui dengan menyertakan kode yang telah disesuaikan:

---

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mobil menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa model dan plat nomor mobil, dan memberikan output berupa informasi detail seperti tahun pembuatan, tipe, merk, dan nomor registrasi mobil berdasarkan plat nomor.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilDetail`, dan `MobilBeraksi` adalah contoh dari class.

```java
package uas;

public class Mobil {
    private String model;
    private String platNomor;

    public Mobil(String model, String platNomor) {
        this.model = model;
        this.platNomor = platNomor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getModel() {
        return model;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String tampilkanInfo() {
        return "Model: " + getModel() +
                "\nPlat Nomor: " + getPlatNomor();
    }

    public String tampilkanInfo(String warna) {
        return tampilkanInfo() + "\nWarna: " + warna;
    }
}
```

```java
package uas;

public class MobilDetail extends Mobil {

    public MobilDetail(String model, String platNomor) {
        super(model, platNomor);
    }

    public int getTahun() {
        return Integer.parseInt(getPlatNomor().substring(0, 2)) + 2000;
    }

    public String getTipe() {
        String kode = getPlatNomor().substring(2, 4);
        if (kode.equals("01")) {
            return "SUV";
        } else {
            return "Sedan";
        }
    }

    public String getMerk() {
        String kode = getPlatNomor().substring(4, 6);
        switch (kode) {
            case "01":
                return "Toyota";
            case "02":
                return "Honda";
            default:
                return "Merk Lain";
        }
    }

    public int getNoRegistrasi() {
        return Integer.parseInt(getPlatNomor().substring(6));
    }

    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
                "\nTahun: " + getTahun() +
                "\nTipe: " + getTipe() +
                "\nMerk: " + getMerk() +
                "\nNo Registrasi: " + getNoRegistrasi();
    }
}
```

```java
package uas;

import java.util.Scanner;

public class MobilBeraksi {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            MobilDetail[] mobils = new MobilDetail[2];

            for (int i = 0; i < mobils.length; i++) {
                System.out.print("Masukkan model mobil ke-" + (i + 1) + ": ");
                String model = scanner.nextLine();
                System.out.print("Masukkan plat nomor mobil ke-" + (i + 1) + ": ");
                String platNomor = scanner.nextLine();

                mobils[i] = new MobilDetail(model, platNomor);
            }

            for (MobilDetail mobil : mobils) {
                System.out.println("============");
                System.out.println("Data mobil: ");
                System.out.println(mobil.tampilkanInfo());
            }

        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format plat nomor: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mobils[i] = new MobilDetail(model, platNomor);` adalah contoh pembuatan object.

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `model` dan `platNomor` adalah contoh atribut.

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil` dan `MobilDetail`.

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setModel` dan `setPlatNomor` adalah contoh method mutator.

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getModel`, `getPlatNomor`, `getTahun`, `getTipe`, `getMerk`, dan `getNoRegistrasi` adalah contoh method accessor.

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `model` dan `platNomor` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilDetail` mewarisi `Mobil` dengan sintaks `extends`.

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Mobil` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `MobilDetail` merupakan override dari method `tampilkanInfo` di `Mobil`.

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getTipe` dan `getMerk`, serta seleksi `switch` dalam method `getTahun`.

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input model dan plat nomor mobil, serta untuk menampilkan data mobil.

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input model dan plat nomor mobil, dan method `System.out.println` untuk menampilkan output informasi mobil.

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MobilDetail[] mobils = new MobilDetail[2];` adalah contoh penggunaan array untuk menyimpan objek `MobilDetail`.

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani berbagai jenis exception yang dapat terjadi selama eksekusi program.

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**     

 | **100** |

## Pembuat

Nama: Muhammad Alghifarie 
NPM: 2210010580

---
