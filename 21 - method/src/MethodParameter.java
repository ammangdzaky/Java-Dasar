/**
 * - kita bisa mengirim informasi ke method  yang ingin kita panggil
 * - untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yg sudah kita buat
 * - cara menambahkan parameter sama seperti cara membuat variable
 * - parameter ditempatkan di dalam kurung () di deklarasi method
 * - parameter bisa kebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
 *
 */

public class MethodParameter {
    public static void main(String[] args) {

        myWaifu(5, "Tsukasa");
        myWaifu(5, "Miku");
    }

    static void myWaifu(int i, String waifu){   // --> deklarasi method
        for (int j = 0; j < i ; j++){
            System.out.println("Aku cinta " + waifu + " dan " + waifu + " cinta saya.");
        }
    }
}
