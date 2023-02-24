
package tombok;
import java.util.Random;

public class equalizer {
    
     private static Random rnd = new Random();
    
     public static void main(String[] args) {
         
     
         
         equalizer_5_sorbol();
         
         
     }

    private static void equalizer_5_sorbol() {
        int db = 0;
        db = rnd.nextInt(1, 8);
        if (db == db) {
            db = rnd.nextInt(1, 8);
        }
        
        eq(db);
        eq(12);
        eq(db);
        eq(8);
        eq(db);
    }
         
         private static void eq(int db) {
             
             String szin = "\u001B[45m";
             for (int i = 0; i < db; i++) {
                 System.out.print(szin + " ");
                 
             }
             System.out.println("");
         
         
         
         }
         
         
     
}
