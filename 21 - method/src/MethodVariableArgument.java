/**
 *
 * - kadang kita butuh mengirimkan data ke method sejumlah data yang tidak pasti
 * - biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut.
 * - namun di java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumah tak tentu, bisa nol atau lebih
 * - parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
 *
 */

public class MethodVariableArgument {
    public static void main(String[] args) {

        // KODE : Tanpa Variable Argument
        waifuWithoutArgument("Dzaky", new String[] {"miku", "tsukasa", "Kurome"});
        // or
        String[] waifu = {"Anju", "Lena", "Mikasa"};
        waifuWithoutArgument("Dzaky", waifu);


        System.out.println("\n");


        // KODE : Variable Argument
        System.out.println(keteranganLulus("Dzaky", 100,100,100,100,100));  // --> beda juga cara penggunaannya
        System.out.println(keteranganLulus("Haikal", 50,50,100,75,50));


    }

    // KODE : Tanpa Variable Argument
    static void waifuWithoutArgument(String name, String[] waifu){
        System.out.println("Hai "+name+", Waifu-waifumu yaitu:");
        int count = 1;
        for (String wife : waifu) {
            System.out.println(count+". "+wife);
            count++;

        }
    }



    // KODE : Variable Arguement
    static String keteranganLulus(String name, int... nilaiNilai) {   // --> bedanya disini
        int count = 0;
        for (int nilai : nilaiNilai){    // -> penting: args masih dihitung sebagai array yah, makanya tetap menggunakn kode untuk array
            count += nilai;
        }
        float nilaiAkhir =  count / nilaiNilai.length;

        if (nilaiAkhir >= 75){
            return "Selamat " + name + ", anda lulus dengan rata-rata: " + nilaiAkhir;
        } else{
            return "Maaf " + name + ", anda belum lulus karena rata-rata nilai anda: " + nilaiAkhir;
        }
    }
}
