
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        program();
    }
    
    private static void program() {
        int a, b, c, d;
        a = 1;
        b = 4;
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Az első 10 szám összege: %d", elso10Osszeg));
        int aBOsszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, aBOsszeg));
        
        //írjuk ki 4 szám összegét
        c = 4;
        d = 6;
        int osszeg = osszead(a, b);
        osszeg += osszead(c, d);
        kiir(String.format("%d + %d + %d + %d = %d", a, b, c, d, osszeg));
        
        //írjuk ki 3 szám összegének a gyökét
        osszeg = osszead(a, b);
        osszeg = osszead(osszeg, c);
        kiir("sqrt(%d + %d + %d) = %.2f".formatted(a, b, c, Math.sqrt(osszeg)));
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
