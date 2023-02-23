
package metodusokgyak;

import java.util.Random;

public class Equalizer {
    private static final Random rnd = new Random();
    private static final String DEFAULT_COLOR = "\u001B[0m";
    private static final String COLOR = "\u001B[45m";
    
    
    public static void main(String[] args) {
        
        program();
        
    }

    private static void program() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq();
    }

    private static void eq(int hossz) {
        System.out.println(blokkGeneralas(hossz));
    }
    private static void eq() {
        eq(rnd.nextInt(3, 8));
    }
    
    
    private static void eq(int hossz, boolean hosszKiir) {
        String kiSzoveg = blokkGeneralas(hossz);
        kiSzoveg += (hosszKiir ? "%s (%d)".formatted(DEFAULT_COLOR, hossz) : "");
        System.out.println(kiSzoveg);

    }
    private static void eq(boolean hosszKiir) {
        eq(rnd.nextInt(3, 8), hosszKiir);
    }

    private static String blokkGeneralas(int hossz) {
        String szoveg = "";
        for (int i = 0; i < hossz; i++) {
            szoveg += COLOR + " ";
            
        }
        return szoveg;
    }
    
    
}
