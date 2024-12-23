/**
 * KOMENTAR
 * - kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
 * - komentar adalah kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code java, tidak
 * akan ada kode komentar tersebut
 * - biasanya komentar digunakan untuk dokumentasi
 */

public class Command {
    public static void main(String[] args) {


        // ini adalah komentar oneline

        /*
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         * ini adalah komentar multiline
         */

        System.out.println(sum(5,5));
    }

    /**
     * coba gunakan komentar multiline diatas method, pasti langsung ada auto complite
     * seperti dibawah (param, etc tekan @ kemudian ctrl+spasi untuk lebih banyak)
     * @param val1 ini untuk bilangan pertama
     * @param val2 ini untuk bilangan kedua
     * @return menghasilkan return berupa bilangan bulat
     */
    static int sum(int val1, int val2){
        return val1 + val2;
    }
}