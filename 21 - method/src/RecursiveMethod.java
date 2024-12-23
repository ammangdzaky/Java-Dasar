/**
 * - recusive method adalah kemampuan method memanggil method dirinya sendiri
 * - kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti kasus factorial
 *
 */

public class RecursiveMethod {
    public static void main(String[] args) {


        System.out.println(factorialLoop(9));
        System.out.println(factorial(9));
        stackOverflow(10000);  //     -> tapi kalau angkanya kecil tidak erorji

    // KODE : factorial tanpa recursive
    static int factorialLoop(int n) {
        var result = 1;
        for (var temp = n ; temp > 0; temp--) {
            result *= temp;
        }
        return result;
    }

    // KODE : factorial with recursive
    static int factorial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorial(value -1);
        }
    }


    /**
     * PROBLEM DENGAN RECURSIVE
     * - walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
     * - jika recursive terlalu dalam, maka akan ada kemungkinan terjadi eror StackOverflow, yaitu eror dimana stack
     * method terlalu banyak di Java
     * - kenapa error ini bisa terjadi? karena ketika kita memanggil method, Java akan mennyimpannya dslam stack, jika method
     * tersebut memanggiil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan
     * terlalu besar, dan bisa menyebabkan eror StackOverflow
     */


    // KODE : Error StackOverflow
    static void stackOverflow(int value) {
        if (value == 0) {
            System.out.println("selesai");;
        } else {
            System.out.println("Sisa loop = " + value);
            stackOverflow(value - 1);
        }
    }
}
