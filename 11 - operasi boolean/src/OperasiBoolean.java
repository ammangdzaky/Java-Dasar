/**
 *
 *   &&  -> dan
 *   ||  -> atau
 *   !   -> negasi
 */

public class OperasiBoolean {
    public static void main(String[] args) {

        // dan dan dan
        System.out.println("&& atau dan");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));


        // atau atau atau
        System.out.println("|| atau atau");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        // negasi
        System.out.println("negasi atau kebalikan");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));


        // contoh peberapan
        var absen = 76;
        var nilai = 75;

        var lulusAbsen = absen > 75;
        var lulusNilai = nilai > 75;
        var naikKelas = lulusAbsen && lulusNilai;

        System.out.println("\ncontoh penerapan");
        System.out.println("naik kelas = " + naikKelas);


    }
}