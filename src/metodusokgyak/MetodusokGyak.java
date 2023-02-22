
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Az első 10 szám összege: %d", elso10Osszeg));
        int aBOsszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, aBOsszeg));
        
        //írjuk ki 4 szám összegét
        int[] szamok = {3, 2, 1, 3};
        kiir(String.format("%d + %d + %d + %d = %d", szamok[0], szamok[1], szamok[2], szamok[3], osszead2(szamok)));
        //írjuk ki 3 szám összegének a gyökét
        int c = 4;
        kiir("sqrt(%d + %d + %d) = %.2f".formatted(a, b, c, haromszamOsszegGyok(a, b, c)));
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
        return osszeg;
    }
    
    private static double haromszamOsszegGyok(int a, int b, int c) {
        return Math.sqrt(a + b + c);
    }
    
    private static int osszead(int a, int b) {
        return a+b;
    }
    
    private static int osszead2(int[] szamok) {
        int osszeg = 0;
        for (int szam:szamok) {
            osszeg += szam;
        }
        return osszeg;
    }
    
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    
}
