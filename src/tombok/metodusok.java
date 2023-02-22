
package tombok;

public class metodusok {
    
    public static void main(String[] args) {
        
        
       feladatok();
     
    }
    
    private static void feladatok() {
    elso10Szamosszege();
    osszegek();

}

    private static void elso10Szamosszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        kiir("Az első 10 szám összege: " + osszeg);
    }
    
    private static void osszegek() {
    osszead(15, 18);
    }

    private static void osszead(int a, int b) {     
        System.out.printf("%d + %d = %d\n", a, b,  a+b);    
    }
    
    private static void kiir(String szoveg) {
        
     System.out.println(szoveg);
    
    
    }
    
   
    
}
