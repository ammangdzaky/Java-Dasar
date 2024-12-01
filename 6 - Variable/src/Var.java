/**
 *
 * - java mendukung pembuatan variable dengan kata kunci var,
 * sehingga kita tidak perlu menyebutkan tipe datanya
 * - saat kita menggunakan kata kunci var dalam pembuatan variable, maka
 * DEKLARASI DAN INISIALISASI HARUS DILAKUKAN BERSAMAAN (supaya java tidak bingung apa tipe data untu variable ini toh)
 */

public class Var {
    public static void main(String[] args) {

        var nama = "Dzaky";
        var umur = 30;
        System.out.println("nama = " + nama + ", umur = " + umur);

        nama = "Mbappe";
        System.out.println("nama = " + nama + ", umur = " + umur);

        // nama = 30; -> eror yah

//        var alamat;          -> ini akan menyebabkan eror karena deklarasi dan inisialisasi terpisah
//        alamat = "Jln PK 7"  -> hal ini terjadi karena java bingung apa tipe data untuk alamat karena inisialisasinya tidak langsung
    }
}
