import java.util.Date;

public class ExpressionStatementAndBlock {
    public static void main(String[] args) {


        /**
         * 1. EXPRESSION
         * - expression adalah konstruksi dari variabel, operator, dan pemanggilan method yang mengevaluasi menjadi
         * sebuah single value
         * - expression adalah core component dari statement
         */
        int a;     // contoh expression
        a = 10;    // contoh expression


        /**
         * 2. STATEMENT
         * - statement bosa dibilang adalah kalimat lengkap dalam bahasa
         * - sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma (;)
         * - ada beberapa jenis statement:
         *   a. assigment expression
         *   b. penggunaan ++ dan --
         *   c. method invocation
         *   d. object creation expression
         */

        // a. assigment statement
        int b = 10;  // selain expresion, ini juga adalah statement

        //b increment statement
        b++;
        --b;

        // c. method invocation statement
        System.out.println(b);

        // d. object creation statement
        Date date = new Date();


        /**
         * 3. BLOCK
         * - block adalah kumpulan statement yang terdiri dari nol atau lebih statement
         * - block diawali dan diakhiri dengan kurung kurawal
         * - di dalam block, boleh ada block lagi
         */

        {
            System.out.println("block 1");
            {
                System.out.println("block 2");
                {
                    System.out.println("block 3");
                }
            }
        }
    }
}