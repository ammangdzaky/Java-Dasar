public class ForEach {
    public static void main(String[] args) {

        /**
         *
         * - kadang kita biasa mengakses data array menggunakan perulangan
         * - mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
         * lalu mengakses array menggunakan counter yang kita buat
         * - namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh
         * data di Array secara otomatis
         *
         */

        // KODE : tanpa for each
        System.out.println("Waifu biasa:");
        String[] waifuBiasa = {"rem", "takagi", "hinata", "komi", "yamada"};
        for (int i = 0; i < waifuBiasa.length; i++) {  // panjang dan membosankan huuu malas ngoding
            System.out.print(waifuBiasa[i] + ", ");
        }

        // KODE : for each
        System.out.println("\n\nWaifu titipan tuhan aduhai:");
        String[] waifuByutifuull = {"Tsukasa", "Kurome", "Anju", "Lena", "Yor"};
        for (String waifu : waifuByutifuull) {     // pake ini cuy, waktu bisa dihemat untuk scroll fesnuk
            System.out.println(waifu);
        }
    }
}