
package metodusokgyak;

import java.util.Random;

public class Equalizer {
    private static final Random rnd = new Random();
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            eq();
        }
        
    }

    private static void eq() {
        String szoveg = "";
        int hossz = rnd.nextInt(5)+3;
        for (int i = 0; i < hossz; i++) {
            szoveg += "\u001B[45m" + " ";
            
        }
        System.out.println(szoveg);
    }
    
    
}
