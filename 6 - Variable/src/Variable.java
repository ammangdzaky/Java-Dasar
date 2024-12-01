/**
 *
 * - java adalah bahasa static, sehinnga sebuah variable hanya bisa digunakan
 * untuk menyimpan TIPE DATA YANG SAMA, tidak bisa berubah ubah kayak python
 * - untuk membuat variable, kita menggunakan nama tipe lalu diikuti dengan nama variablennya
 * - nama variable tidak boleh mengandung whitespce dan tidak boleh seluruhnya number dan diawali number
 *
 */


public class Variable {
    public static void main(String[] args) {


        // String = nama tipe, namaDepan = nama variable
        String namaDepan;      // deklarasi dan inisialisasi terpisah
        namaDepan = "Dzaky";

        String namaBelakang = "Safrullah";  // deklarasi dan inisialisasi bersamaan
        int umur = 18;

        System.out.println(namaDepan);
        System.out.println("umur: " + umur);

        umur = 20;
        System.out.println("umur: " + umur);

//      namaDepan = 30;  ->  bakal menyebabkan eror karena namaDepan pada awalnya string

    }
}