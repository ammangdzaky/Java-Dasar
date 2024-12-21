public class SwitchStatement {
    public static void main(String[] args) {

        // kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        // switch adalah percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
        // kondisi di switch statement hanya untuk perbandingan ==

        var waifu = "sakura";

        switch (waifu) {
            case "miku":
                System.out.println("Cantik dan Pintar memeasak");
                break;
            case "tsukasa":
                System.out.println("Sempurna");
                break;
            case "sakura":  // jika tidak ada break, maka akan syntaks akan diteruskan sampai menemukan break
            case "malty":
                System.out.println("BEBAN BEBAN");
            case "emilia":
                System.out.println("polos dan imut");
                break; // jika tidak ada break diatas, maka dia akan berhenti di break ini, ototmatis semua syintaks diatas akan dieksekusi
            default: // miriplah sama else di if statement
                System.out.println("Anda masih normal");

        }

        //Switch lambda
        // ini lebih mempermudah saat menggunakan switch expression karena tidak perlu lagi menggunakan kata kunci break
        System.out.println("\nSwitch Lambda");

        char nilai = 'O';

        switch (nilai) {
            case 'A' -> System.out.println("IPK 4.0");
            case 'B' -> System.out.println("IPK 3.5");
            case 'C' -> System.out.println("IPK 3.0");
            case 'D' -> System.out.println("IPK 2.5");
            default -> {  // jika kode eksekusi lebih dari satu baris, maka gunakan kurung kurawal
                for (int temp = 1; temp <= 5; temp++){
                    System.out.println("afaan tuh ke-" + temp);
                }
            }
        }

        //yield
        // kata kunci yield menge,balikan nilai pada switch statement
        // ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
        System.out.println("\nyield");

        // swith tanpa yield

//        var nilaiAkhir = "A";
//        int ipk;
//        switch (nilaiAkhir) {
//            case "A" -> ipk = 4;
//            case "B" -> ipk = 3;
//            case "C" -> ipk = 2;
//            case "D" -> ipk = 1;
//            default -> ipk = 0;
//        }
//        System.out.println(ipk);
    }


}