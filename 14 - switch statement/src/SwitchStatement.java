public class SwitchStatement {
    public static void main(String[] args) {


        /**
         * SWITCH STATEMENT
         * - kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya
         * mengunakan perbandingan
         * - switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
         * - kondisi di switch statement hanya untuk perbandingan ==
         */


        var waifu = "emilia";
        waifu = "Melty";

        switch (waifu) {
            case "Sakura":                               // jika kita ingin menggabungkan dua kondisi misalnya, maka kita
            case "Melty":                                // bisa menggunakan contoh seperti pada melty dan sakura
                System.out.println("Waifuku beban");
                break;
            case "Miku":
                System.out.println("Waifuku cantik bet cik");
                break;
            case "Tsukasa":
                System.out.println("Hatiku ndak kuat cuk");
                break;
            case "":
                System.out.println("Aku normal");
                break;
            default:
                System.out.println("aku bersyukur siapapun waifuku");
        }




        /**
         * SWITCH LAMBDA
         * - di java 14, diperkenalkan switch expression dengan lambda
         * - ini lebi mempermudah saat penggunaan switch expression karena tidak perlu lagi menggunakan kata kunci break
         */

        var dewa = "neptunus";

        switch (dewa) {
            case "zeus" -> System.out.println("raja dewa");
            case "kratos" -> System.out.println("dewa perang");
            case "posseidon", "neptunus" -> System.out.println("dewa laut");
            // jika kita ingin statementnnya mengeksekusi lebih dari satu baris
            default -> {
                System.out.println("anda adalah kroco");
                System.out.println("anda adalah labubu");
            }
        }


        /** SWITCH DENGAN  YIELD
         * - intinya value dari suatu var tergantung dari switch
         */

        var barang = "laptop";
        var harga = switch (barang){
            case "stik":
                yield 60000;
            case "mouse", "stand":
                yield 20000;
            case "keyboard":
                yield 100000;
            case "":
                yield 0;
            default:
                yield "harga belum ditentukan";
        };  // jangan lupa titik koma

        System.out.println(harga);
    }
}