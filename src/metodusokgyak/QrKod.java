
package metodusokgyak;

import java.util.Random;

public class QrKod {
    private static final Random rnd = new Random();
    private static final String ALAP_SZIN = "\u001B[0m";
    private static final String SAROK_NEGYZET_SZIN = "\u001B[44m";
    private static final String[] SZINEK = {"\u001B[0m", "\u001B[45m"};
    
    private static final String[] SAROK_JEL = {"%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN),
                                               "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, ALAP_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
                                               "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
                                               "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, ALAP_SZIN, ALAP_SZIN, ALAP_SZIN, SAROK_NEGYZET_SZIN),
                                               "%s %s %s %s %s ".formatted(SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN, SAROK_NEGYZET_SZIN)};
    
    public static void main(String[] args) {
        kiir(qr());
        kiir(qr(true));
        kiir(qr(20));
        kiir(qr(20, true));
    }
    
    private static String qr() {
        return qr(false);
    }
    private static String qr(boolean jobbFentiKocka) {
        return qr(10, jobbFentiKocka);
    }
    private static String qr(int meret) {
        return qr(meret, false);
    }
    private static String qr(int meret, boolean jobbFentiKocka) {
        String str = "";
        
        for (int i = 0; i < meret / 2; i++) {
            
            int ciklusJVege = meret - ((jobbFentiKocka) ? ((i < SAROK_JEL.length) ? SAROK_JEL.length : 0) : 0);
            
            for (int j = 0; j < ciklusJVege; j++) {
                str += SZINEK[rnd.nextInt(SZINEK.length)] + " ";
            }
            str += (i < SAROK_JEL.length) && (jobbFentiKocka) ? sarokJel(i) : "";
            str += "\n";
        }
        return str;
    }
    
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    
    private static String sarokJel(int sor) {
        return SAROK_JEL[sor];
    }
    
}
