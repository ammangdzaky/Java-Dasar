/**
 * - tipe data string adalah kumpulan dari tipe data character,
 * atau sederhananya adalah teks
 * - di Java, tipe data string direpresentasikan dengan kata kunci String
 * - tipe data String menggunakan petik dua ("")
 * - nilai default dari string adalah null
 */


public class Main {
    public static void main(String[] args) {


        String namaDepan;
        namaDepan = "Abdurrahman Dzaky";

        String namaBelakang = "Safrullah";
        String fullName = namaDepan + " " + namaBelakang;

        System.out.println(namaDepan);
        System.out.println(namaBelakang);
        System.out.println(fullName);
        System.out.println("Abdurrahman" + "Dzaky" + "Safrullah");

        namaDepan = "Ubaidillah Zhafran";
        System.out.println(fullName);
        System.out.println(namaDepan);
        fullName = namaDepan + " " + namaBelakang;
        System.out.println(fullName);

    }
}