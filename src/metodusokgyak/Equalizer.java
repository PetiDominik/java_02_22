
package metodusokgyak;

import java.util.Random;

public class Equalizer {
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        
        program();
        
    }

    private static void program() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }

    private static void eq(int hossz) {
        System.out.println(blokkGeneralas(hossz));
    }
    private static void eq() {
        System.out.println(blokkGeneralas(rnd.nextInt(3, 8)));
    }

    private static String blokkGeneralas(int hossz) {
        String szoveg = "";
        for (int i = 0; i < hossz; i++) {
            szoveg += "\u001B[45m" + " ";
            
        }
        return szoveg;
    }
    
    
}
