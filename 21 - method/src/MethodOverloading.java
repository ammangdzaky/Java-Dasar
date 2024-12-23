import org.w3c.dom.ls.LSOutput;

/**
 * - method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
 * - namun ada ketentuannya, yaotu data parameter di method tersebut harus berbeda-beda, entah jumlah atau tipe data parameternya
 * - jika ada yang sama, maka program java kita akan eror.
 */

public class MethodOverloading {
    public static void main(String[] args) {


        myWaifu();
        myWaifu("TSUKASA");
        myWaifu("Alya", "Yuki");
        myWaifu(9999999);
    }

    static void myWaifu() {
        System.out.println("Waifuku ada banyak. (method with nothing parameter)");
    }

//    static void myWaifu() {     ---> bakal eror karena parameter sama persis dengan method sebelumnya
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");
//    }

    static void myWaifu(String waifuNo1) {
        System.out.println("Waifuku yang paling kusayangi adalah: " + waifuNo1);
    }

    static void myWaifu(String waifu1, String waifu2) {
        System.out.println("Aku punya waifu yang sering bertengkar, yaitu " + waifu1 + " dan " + waifu2);
    }

    static void myWaifu(int jumlahWaifu){
        System.out.println("Jumlah waifuku lebih banyak dari " + jumlahWaifu);
    }

}
