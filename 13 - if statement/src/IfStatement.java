public class IfStatement {
    public static void main(String[] args) {


        /**
         * if (expresi boolean){
         *     kode yang dijalankan;
         * } else{
         *     kode yang dijalankan;
         * }
         */


        var sks = "selesai";
        var mkpk = 15;

        if (sks == "selesai" && mkpk == 20) {
            System.out.println("Selamat, anda sarjana");
        } else {
            System.out.println("Kasihan kali anda");
        }


        var wife = "Miku";
        wife = "Tsukasa";

        if (wife == "Miku") {
            System.out.println("aku senang");
        } else if (wife == "Tsukasa") {
            System.out.println("aku senang sekali");
        } else {
            System.out.println("Aku tidak senang");
        }

    }
}