public class MethodBasic {
    public static void main(String[] args) {

        /**
         * - Method adalah block kode program yang akan berjalan saat kits panggil
         * - Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
         * - Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method,
         * kurung () dan diakhiri dengan block
         * - Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
         * - Di bahasa pemrograman lain, Method juga disebut dengan function
         * - Methodnya dibuat di luar blok main
         */

        sayHelloWorld(); // --> memanggil method

    }

    // pembuatan method
    static void sayHelloWorld() { // --> kebiasaan org java, nama method huruf besar semua kecuali hruf awal (beda dngan class yg hruf besar ssemua)
        for (int i=1;i<=3;i++){
            System.out.println("Hello World ke-"+i);
        }
    }
}