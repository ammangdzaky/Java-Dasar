public class Main {
    public static void main(String[] args) {


        /**
         * TERNARY OPERATOR
         * - ternary operator adalah operator sederhana dari if statement
         * - ternary operator terdiri dari kondis yang dievaluasi, jika menghasilkan true maka nilai pertama
         * diambil, jika false maka nilai kedua diambil
         */

        // tanpa ternary
        var nilai = 80;
        String keterangan;
        if (nilai > 75) {
            keterangan = "lulus";
        } else {
            keterangan = "tidak lulus";
        }
        System.out.println(keterangan);


        // dengan ternary
        var Nilai = 70;
        var Keterangan = Nilai > 75 ? "lulus" : "tidak lulus";
        System.out.println(Keterangan);

        var isMc = false;
        var status = isMc == true? "Aku main char" : "Aku Kroco";
        System.out.println(status);
    }
}