/**
 *
 * - secara default, variable di Java bisa diubah-ubah nilainya selama tipe datanya sama
 * - jika ingin membuat variable yang datanya tidak boleh diubah setelah pertama kali dibuat,
 * maka kita bisa menggunakan kata kunci vinal
 * - isitilah variable seperti ini, banyak juga yang menyebutnya konstan
 *
 */


public class Final {
    public static void main(String[] args) {


        final String nama;
        nama = "Abdurrahman Dzaky Safrullah";

        final var agama = "Islam";
        final String kelamin = "Laki-laki";

        var umur = 18;

        // agama = "Yahudi"; -> bakal menyebabkan eror karena variable agama sudah final

        System.out.println("nama : " + nama);
        System.out.println("agama : " + agama);
        System.out.println("kelamin : " + kelamin);
        System.out.println("umur : " + umur);
        umur = 20;
        System.out.println("umur 2 tahun kemudian : " + umur);
    }
}
