
package tombok;

public class metodusok {
    
    public static void main(String[] args) {
      int a = 10;
      int b = 12;
      
      elso10Szamosszege();
        osszead(a, b);
        
        
        
        
        
        
       
        
    }

    private static void elso10Szamosszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        
        
        }
        System.out.println("Az első 10 szám összege: " + osszeg);
    }

    private static void osszead(int a, int b) {
        
        
        System.out.printf("%d + %d = %d\n", a, b,  a+b);
        
    }
    
   
    
}