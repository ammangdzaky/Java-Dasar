/**
 *
 * - tipe data primitif adalah tipe bawaan di bahasa pemprograman, Tipe data primitf tidak bisa
 * diubah lagi
 * - tipe data number, char, boolean adalah tipe data primitf. Tipe data primitif selalu memiliki dafault value
 * - tipe data String bukan tipe data primitf, tipe data bukan primitf tidak memiliki default value (null)
 * - tipe data bukan primitf bisa memiliki method/function
 * - di java, semua tipe data  primitf memeilili representasi tipe data bukan primitifnya
 *
 * BUKAN PRIMITIF == OBJECT
 *
 */

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {


        int angka = 100; // ini primitf
        Integer angkaObject = 100;

        Byte bit; // nilai defaultnya adalah null
        bit = -10;

        System.out.println(angka);
        System.out.println(angkaObject);
        System.out.println(bit);


        // CASTING

        // primer -> bukan primer
        int integer = 1;
        Integer integerObject = integer;
        // untuk casting ke tipe data yang lain (int -> short misalnay), maka menggunakan method
        Short shortObject = integerObject.shortValue();
        Float floatObject = integerObject.floatValue();
        // Short shortObject = integer.ShortValue(); -> ini eror

        System.out.println(integerObject);
        System.out.println(shortObject);
        System.out.println(floatObject);


        // bukan prime -> primer
        Byte byteObject = 100;
        byte bytePrimer = byteObject;
        long longPrimer = bytePrimer;
        long a = byteObject;
        // long longPrimer = byteObject.longValue(); -> ini eror

        System.out.println(bytePrimer);
        System.out.println(longPrimer);
        System.out.println(a);



    }
}