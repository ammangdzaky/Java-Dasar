/**
 * - di java, variable hanya bisa diaksses di dalam area dimana mereka dibuat
 * - hal ini disebut scope
 * - contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat didalam block,
 * maka hanya bisa diakses di dalam block tersebut
 */

public class Scope {
    public static void main(String[] args) {

        var name = "Dzaky";
        if (!name.isBlank()) {   // name.isBlank() true jika blang false ketika ada (tapi ada negasi sibelakanya)
            var teman = "Ambatron";
            System.out.println(teman);
            System.out.println(name);
        }
        System.out.println(name);
//      System.out.println(teman);  -> bakal error ketika mncba akses variable teman
    }
}