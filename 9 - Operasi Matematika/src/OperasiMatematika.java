/**
 *
 * operasi matematika
 * +
 * -
 * *
 * /
 * %
 */



public class OperasiMatematika {
    public static void main(String[] args) {


        var a = 10;
        var b = 3;
        var tambah = a + b;
        var kurang = a - b;
        var kali = a * b;
        var bagi = a / b;
        var modulo = a % b;
        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(kali);
        System.out.println(bagi);
        System.out.println(modulo);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);



        // augmented assigments
        // a = a + value  -> a += value

        int aug = 10;
        int cupu = aug + 3;
        System.out.println("Augmented assigments");
        System.out.println(cupu);
        System.out.println(aug += 3);  // sekarang a = 13
        System.out.println(aug -= 3);  // sekarang a = 10
        System.out.println(aug *= 3);  // sekarang a = 30
        System.out.println(aug /= 2);  // sekarang a = 15
        System.out.println(aug %= 2);  // sekarang a = 1
        System.out.println(aug);


        /**
         * tips:
         * var -> ringkas, cocok digunakan untuk skala kecil
         * int -> tipe data jelas, cocok dgunakan dalam projek besar
         */





        // UNARY OPERATOR
        /**
         *   ++  -> var = var + 1
         *   --  -> var = var - 1
         *   +   -> positif
         *   -   -> negatif
         *   !   -> ngeasi untuk boolean
         */

        int unaryPositif = +100;
        int unaryNegatif = -100;
        ++unaryPositif;                          // bisa didepan
        System.out.println(unaryPositif);
        unaryPositif++;                          // bisa dibelakang
        System.out.println(unaryPositif);
        --unaryNegatif;
        System.out.println(unaryNegatif);
        unaryNegatif--;
        System.out.println(unaryNegatif);

        boolean benar = true;
        boolean salah = !benar;
        System.out.println(salah);

    }
}