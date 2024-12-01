public class ForLoop {
    public static void main(String[] args) {


        /**
         * - for adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
         * - blok kode yang terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi
         *
         *                        for (init statement ; kondisi ; post statement) {
         *                            blok yang dijalankan
         *                        }
         *
         *                        - init statemnt : akan dieksekusi hanya sekali di awal perulangan
         *                        - kondisi : akan dilakukan pengecekan dalam setiap perulangan, jika true prulangan akan dilakukan,
         *                        jika false perulangan akan berhenti
         *                        - post statement : akan dieksekusi setiap kali di akhit perulangan
         *                        - init statement, kondisi, dan post statement tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi
         *                        selalu bernilai ture (looping endless)
         */


        // endless looping
//        for (;;) {
//            System.out.println("endless looping");
//        }

        // looping with kondisi
        var temp = 1;
        for (;temp <= 5;) {
            System.out.println("perulangan ke-"+temp);
            temp++;
        }

        System.out.println("\n");

        // looping with init statement
        for (var counter = 5; counter > 0; ) {
            System.out.println("sisa perulangan = "+counter);
            counter--;
        }

        System.out.println("\n");

        // looping with post statement
        for (var i = 1; i <= 13.5 ; i++) {
            System.out.println("final looping ke-" + i);
        }


    }
}