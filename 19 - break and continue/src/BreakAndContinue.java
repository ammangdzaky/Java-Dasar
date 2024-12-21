public class BreakAndContinue {
    public static void main(String[] args) {


        // break -> digunakan untuk menghentikan  seluruh perulangan
        // continue -> digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya


        // contoh break
        var temp = 1;
        while (true) {
            System.out.println("perulangan ke "+temp);
            temp++;
            if (temp >= 6){
                break;
            }
        }

        System.out.println("\n");

        //contoh continue
        int[] angka = {1,2,2,3,5,4,7,8,9};
        for (int i : angka) {
            if (i % 2 != 0){
                continue;  // ketika kondisi continue terpebuhi, maka semua kode dibawahnya distop kemudian lanjut ke iterasi selanjutnya
            }
            System.out.print(i+"\t");
        }
    }
}