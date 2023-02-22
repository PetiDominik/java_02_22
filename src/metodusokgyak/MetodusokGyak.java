
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        
        
        
    }
    
    private static void elso10SzamOsszege() {
        int n = 10;
        int osszeg = nSzamOsszege(n);
        kiir("Az első %d szám összege: %d\n".formatted(n, osszeg));
    }
    
    private static int nSzamOsszege(int max) {
        int osszeg = 0;
        for (int i = 0; i < max; i++) {
            osszeg += i;
            
        }
        return osszeg;
    }
    
    private static void osszead(int a, int b) {
        int osszeg = a+b;
        kiir("%d + %d = %d\n".formatted(a, b, osszeg));
    }
    
    private static void kiir(String szoveg) {
        System.out.println(szoveg);
    }

    
}
