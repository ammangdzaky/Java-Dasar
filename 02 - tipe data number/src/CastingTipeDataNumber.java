/**
konversi tipe data number:
1. widening casting (otomatis): byte -> short -> int -> long -> float -> double (kecil ke besar)
2. narrowing casting (manual) : double -> float -> long -> int -> short -> byte (besar ke kecil)
 */

public class CastingTipeDataNumber {
    public static void main(String[] args) {

        //otomatis
        byte iniByte = 10;
        int iniInt = iniByte;
        float iniFloat = iniInt;

        System.out.println(iniInt);
        System.out.println(iniFloat);

        // manual
        long IniLong = 10000000000L;
        int IniInt = (int) IniLong;
        byte IniByte = (byte) IniInt;
        System.out.println(IniInt);
        System.out.println(IniByte);

        // tapi harus hati hati ketika manual karena akan terjadi number overflow.
        // misal jika int 1000 di casting ke byte, dimana byte tidak bisa menampung 1000.
        // maka ketika sampai di 127, maka dia akan mutar ke -127, begiru terus hingga mencapai 1000.

        short a = 128;
        byte b = (byte) a;
        System.out.println(b);

    }
}
