/**
jadi tipe data number dibagi 2, yaitu integer dan floating point number

INTEGER

- byte : -128 sampai 127
- short : -32.768 sampai 32.767
- int : -2.147.483.648 sampai 2.147.483.647
- long : -9triliunsekian sampai 9triliunsekian

semakin kebawah, maka memerlukan lebih banyak penyimpanan
*/


public class Integer{
    public static void main(String[] args){

        byte IniByte = 100; // IniByte adalah variable, jika di byte saya isi 1000, maka eror karena diluar kapasitas
        short IniShort = 10000;
        int IniInt = 1000000;
        long IniLong = 1000000000;
        long IniLong2 = 1000000000000L; // jadi untuk long, dibelakang angka bisa ditambhkan L/l sebagai penanda

        System.out.println(IniByte);
        System.out.println(IniLong2);

        // angka bisa diselpikan underscore (_) agar mudah dibaca

        int miliar = 1_000_000_000;
        System.out.println(miliar);
        System.out.println(1);
    }
}