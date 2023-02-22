
package tombok;

public class metodusok {
    
    public static void main(String[] args) {
        int oszeg = elso10Szamosszege();
        String kimenet = "Az első 10 szám összege: " + oszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4;
        int oszeadva;
        oszeadva = osszead(szam1, szam2);
        String s = String.format("%d + %d = %d\n", szam1, szam2, oszeadva);
        kiir(s);
   
    }
    

    private static int elso10Szamosszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
   

    private static void osszead(int a, int b) {     
        System.out.printf("%d + %d = %d\n", a, b,  a+b);    
    }
    
    private static void kiir(String szoveg) {
     System.out.println(szoveg);
    }
    
   

}
