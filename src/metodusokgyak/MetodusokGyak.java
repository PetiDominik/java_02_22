
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        program();
    }
    
    private static void program() {
        elsoFeladat10szamKiir();
        masodikFeladat2SzamOsszeg();
        //írjuk ki 4 szám összegét
        harmadikFeladat4SzamOsszeg();
        negyedikFeladat3SzamOsszegGyoke();
    }

    private static void negyedikFeladat3SzamOsszegGyoke() {
        int a = 1;
        int b = 4;
        int c = 4;
        int osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        kiir("sqrt(%d + %d + %d) = %.2f".formatted(a, b, c, Math.sqrt(osszeg)));
    }

    private static void harmadikFeladat4SzamOsszeg() {
        int a = 1;
        int b = 4;
        int c = 4;
        int d = 6;
        int osszeg = osszead(a, b);
        osszeg += osszead(c, d);
        kiir(String.format("%d + %d + %d + %d = %d", a, b, c, d, osszeg));
    }

    private static void masodikFeladat2SzamOsszeg() {
        int a = 1;
        int b = 4;
        int aBOsszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, aBOsszeg));
    }

    private static void elsoFeladat10szamKiir() {
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Az első 10 szám összege: %d", elso10Osszeg));
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b) {
        return a+b;
    }

    
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    
}
