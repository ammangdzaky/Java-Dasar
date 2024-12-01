public class DoWhileLoop {
    public static void main(String[] args) {


        /**
         *  - do while loop mirip dengan while
         *  - perbedaanya hanya pada pengecekan kondisi
         *  - pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di
         *  do while loop dilakukan setelah perulangan dilakukan
         *  - oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi
         *  tidak bernilai true
         */

        var temp = 1;
        do {
            System.out.println(temp);
            temp++;
        } while (temp <= 10);


        System.out.println("\n");


        var counter = 100;
        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 10);


        var count = 100;
        while (count <= 10) {
            System.out.println("ini tidak akan tereksekusi");
        }
    }
}