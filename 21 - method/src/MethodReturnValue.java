/**
 *
 * - secara default, method tdk menghasilkan value apapun, namun jika kita ignin, kita bisa membuat agar method
 * mengambalikan value/nilai
 * - agar meethod bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
 * - dan di dalam blok method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu diikuti
 * dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
 * - Di java, kita hnya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu

 */

public class MethodReturnValue {
    public static void main(String[] args) {


        System.out.println(mathOperaton(2,3,'+'));
        System.out.println(mathOperaton(8,3,'-'));
        System.out.println(mathOperaton(1,5,'*'));
        System.out.println(mathOperaton(50,10,'/'));
        System.out.println(mathOperaton(12,12,'a'));
    }

    static int mathOperaton(int n1, int n2, char operation) {
        int result = 0;
        if (operation == '+') {
            result = n1 + n2;
        } else if (operation == '-') {
            result =  n1 - n2;
        } else if (operation == '*') {
            result = n1 * n2;
        } else if (operation == '/') {
            result = n1 / n2;
        } else {
            throw new IllegalArgumentException("Invalid Operation");
        }
        return result;
    }
}
