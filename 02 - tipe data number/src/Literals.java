// literals number: -> decimal, hexadecimal, binary

public class Literals {
    public static void main(String[] args) {

        int IniDesimal = 25; // desimal : langsung saja tulis angkanya
        int IniHexa = 0xA132B; // hexadecimal : diawali dengan 0x
        int IniBiner = 0b001110; // binary : diawali dengan 0b

        System.out.println(IniHexa);
        System.out.println(IniDesimal + IniHexa);
    }
}
