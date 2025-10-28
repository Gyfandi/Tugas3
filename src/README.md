# 💎 Aplikasi Top Up Diamond Game

---


## 🧾 Deskripsi Program

Program ini merupakan **simulasi aplikasi Top Up Diamond Game** yang dibuat menggunakan bahasa pemrograman **Java**.  
Aplikasi ini memungkinkan pengguna (Player) untuk:
- Melihat daftar paket diamond yang tersedia
- Melakukan pembelian (top up) berdasarkan paket yang dipilih
- Menampilkan hasil transaksi dan total harga

---

Aplikasi menerapkan konsep **Pemrograman Berorientasi Objek (OOP)** seperti:
- **Class & Object** (`Player`, `TopUp`, `ListDiamond`, `User`)
- **Encapsulation** (penggunaan atribut `private` dan method getter/setter)
- **Inheritance** (`Player` mewarisi `User`)
- **Polymorphism** 
- **Interface Implementation**
- **Exception Handling**

Program ini diorganisasikan menggunakan struktur yang rapi agar mudah dipahami dan dikembangkan kembali.

---

## 🏗️ Struktur Folder / Package
src/

└── Modul3/

└── Tugas2/


├── MainApp.java # Kelas utama untuk menjalankan aplikasi

├── User.java # Kelas induk yang menyimpan data dasar pengguna

├── Player.java # Subclass dari User, menyimpan informasi pemain

├── ListDiamond.java # Menyimpan daftar paket diamond dan harganya

└── TopUp.java # Proses transaksi top up dan perhitungan harga

---

## ⚙️ Cara Menjalankan Program

1. Buka project di **IntelliJ IDEA / VSCode / NetBeans**
2. Pastikan semua file berada dalam package yang sama (`Modul2.Tugas3.After`)
3. Jalankan program melalui kelas `MainApp.java`
4. Program akan menampilkan daftar paket diamond dan meminta input dari pengguna

Contoh tampilan di console:

=== MENU DIAMOND ===

Paket A - 86 Diamond (Rp 20.000)

Paket B - 170 Diamond (Rp 40.000)

Paket C - 257 Diamond (Rp 60.000)

Masukkan pilihan paket: 1

Masukkan nama player: Gyfandi

Top up berhasil! Total harga: Rp 20.000


---

## 🧰 Fitur Program

- ✅ Menampilkan daftar paket diamond
- ✅ Memproses transaksi top up berdasarkan pilihan pengguna
- ✅ Menghitung total harga berdasarkan paket yang dipilih
- ✅ Menampilkan data player dan hasil transaksi
- ✅ Menggunakan konsep OOP (class, inheritance, encapsulation)
- ✅ Menerapkan dokumentasi Javadoc untuk setiap class dan method

---

## 📘 Dokumentasi Javadoc

Program ini sudah dilengkapi dengan komentar **JavaDoc** di setiap kelas dan method.