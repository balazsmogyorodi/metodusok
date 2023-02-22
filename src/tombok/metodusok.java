
package tombok;

public class metodusok {
  
    static int oszeadva;
    static String s;
    
    public static void main(String[] args) {
        feladatok();
    }
        
        
        
        
      private static void feladatok() {
        sorozatosOsszadas();
        ketSzamOsszeadasa();
        tobbSzamOsszeadasa();
        gyokvonas1();
        gyokvonas2();
}

    private static void tobbSzamOsszeadasa() {
        oszeadva = osszead(1,osszead(2, osszead(3,4)));
        kiir("1+2+3+4=" + oszeadva +"\n");
        
        oszeadva = osszead(10, osszead(14, osszead(7, osszead(9, 10))));
        kiir("10+14+7+9+10=" + oszeadva +"\n");
    }

    private static void gyokvonas2() {
        int a = 1, b = 2, c= 13;
        oszeadva = osszead(a, osszead(b, c));
        double gyok = Math.sqrt(oszeadva);
        s = String.format("%d+%d+%d gyöke:".formatted(a, b, c));
        String kimenet = String.format("%s %.4f\n", s, gyok);
        kiir(kimenet);
    }

    private static void gyokvonas1() {
        oszeadva = osszead(2, 2);
        oszeadva += osszead(2, 3);
        kiir("2+2+2+3 =" + oszeadva +" ennek a gyöke=" + Math.sqrt(oszeadva) +"\n");
    }

    private static void ketSzamOsszeadasa() {
        int szam1 = 7, szam2 = 4;
        oszeadva = osszead(szam1, szam2);
        s = String.format("%d + %d = %d\n", szam1, szam2, oszeadva);
        kiir(s);
    }

    private static void sorozatosOsszadas() {
        int oszeg = elso10Szamosszege();
        String kimenet = "Az első 10 szám összege: " + oszeg + "\n";
        kiir(kimenet);
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
