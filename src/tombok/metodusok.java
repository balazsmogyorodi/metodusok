
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
        
        oszeadva = osszead(2, 2);
         oszeadva += osszead(2, 3);
         kiir("5+6+2+10=" + Math.sqrt(oszeadva) +"\n");
              
        
        oszeadva = osszead(1,osszead(2, osszead(3,4)));
        kiir("1+2+3+4=" + oszeadva +"\n");
        
        oszeadva = osszead(10, osszead(14, osszead(7, osszead(9, 10))));
        kiir("10+14+7+9+10=" + oszeadva +"\n");
        
        
   
    }
    

    private static int elso10Szamosszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
   

    private static int osszead(int a, int b) {
        int eredmeny = a + b;
        return eredmeny;   
    }
    
    private static void kiir(String szoveg) {
     System.out.println(szoveg);
    }
    
   

}
