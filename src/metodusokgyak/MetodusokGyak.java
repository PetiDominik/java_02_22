
package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int elso10Osszeg = elso10SzamOsszege();
        kiir(String.format("Az első 10 szám összege: %d", elso10Osszeg));
        int aBOsszeg = osszead(a, b);
        kiir(String.format("%d + %d = %d", a, b, a+b));
        
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
