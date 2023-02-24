
package tombok;
import java.util.Random;

public class Equalizer {
    
     private static Random rnd = new Random();
    
     public static void main(String[] args) {
         
     
         
         equalizer_5_sorbol();
         
         
     }

    private static void equalizer_5_sorbol() {
       
       
        
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq(false);
    }
         
         private static void eq() {
             
             eq(false);
         }
         
         private static void eq(int db) {
             eq(db, false);
             
         }
         
          
          private static void eq(boolean jo) {
              int db = rnd.nextInt(3,8);
              eq(db, jo);
          }
          
        
         
          private static void eq(int hossz, boolean jo) {
             String szin = "\u001B[45m";
             for (int i = 0; i < hossz; i++) {
                 System.out.print(szin + " ");
                 
             }
             if (jo) {
                 System.out.print(" " + "(" + hossz + ")");
             }
             System.out.println("");
         
          }
         
         }
         
         
     
