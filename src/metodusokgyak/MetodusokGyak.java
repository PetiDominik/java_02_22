
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        
        
        
    }
    
    private static int elso10SzamOsszege() {
        int n = 10;
        int osszeg = nSzamOsszege(n);
        return osszeg;
        //kiir("Az első %d szám összege: %d\n".formatted(n, osszeg));
    }
    
    private static int nSzamOsszege(int max) {
        int osszeg = 0;
        for (int i = 0; i < max; i++) {
            osszeg += i;
            
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b) {
        int osszeg = a+b;
        return osszeg;
        //kiir("%d + %d = %d\n".formatted(a, b, osszeg));
    }
    
    private static void kiir(int a, int b) {
        System.out.printf("Az első %d szám összege: %d\n", 10, elso10SzamOsszege());
        System.out.printf("%d + %d = %d\n", a, b,osszead(a, b));
    }

    
}
