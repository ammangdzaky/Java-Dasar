/**
 *
 * Tipe Data Array
 *
 * - array adalah tipe data yang berisikan kumpulan data dengan TIPE SAMA
 * - jumlah data di array tidak bisa berubah setelah pertama kali dibuat
 * - array dimulai dari index 0
 * - dalam membuat array, kita juga harus menentukan berapa jumlah data yang bisa ditampung
 *
 * operasi di array:
 * 1. array[index]          -> mengambil data di array
 * 2. array[index] = value  -> mengubah data di array
 * 3. array.length          -> mengambil panjang array
 */


public class TipeDataArray {
    public static void main(String[] args) {

        // deklarasi manual
        String[] stringArray;
        stringArray = new String[2]; // artinya data yang bisa ditampung itu 2
        stringArray[0] = "Abdurrahman";
        stringArray[1] = "Dzaky";
        // stringArray[1] = 1;  -> eror karena bukan String
        System.out.println(stringArray);
        System.out.println(stringArray[1]);


        // deklarasi otomatis
        String[] namaArray = new String[]{          // panjang tidak perlu ditentukan karena sudah otomatis ditentukan oleh java
                "Abdurrahman", "Dzaky", "Safrullah"
        };
        System.out.println(namaArray.length);

        int[] IniJugaBisaKetikaMalas = {
                1,2,3,4,5,6,7,8,9,10
        };
        System.out.println(IniJugaBisaKetikaMalas.length);

        Long[] longArray = {10l, 20l, 30l};
        longArray[2] = null;
        System.out.println(longArray.length);
        System.out.println(longArray[2]);



        // nested array (array didalam array)
        String[][] orangSukses = {
                {"Abdurrahman", "Dzaky"},
                {"Nurullah", "Purnama"},
                {"Nauval", "Huzaimin"}
        };

        System.out.println(orangSukses[0]);
        System.out.println(orangSukses[0][1]);
        System.out.println(orangSukses[1][1]);
        System.out.println(orangSukses[2][0]);

        String[] orangSukses1 = orangSukses[0];
        System.out.println(orangSukses1[1]);
    }
}