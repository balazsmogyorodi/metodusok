package tombok;

import java.util.Random;

public class Feladatok02_17_ {

    public static void main(String[] args) {

        int[] korok = {7, 11};
        for (int i = 0; i < korok.length; i++) {
            System.out.println(korok[i] + " ");
        }
        System.out.println(" ");

        int[] ures = new int[3];
        ures[0] = 7;
        ures[1] = 11;
        ures[2] = 3;

        for (int i = 0; i < ures.length; i++) {
            System.out.println(ures[i] + " ");
        }

        System.out.println("");
        System.out.println("Feladat:");
        int[] szamok = new int[10];
        int hanyadik = 1;
        int minimum = 0;
        int maximum = 999999;

        for (int i = 0; i < 10; i++) {
            if (hanyadik % 2 == 1) {
                szamok[i] = 1;
            } else {
                szamok[i] = (int) (Math.random() * (maximum - minimum + 1) + minimum);
                while (szamok[i] % 2 == 1) {
                    szamok[i] = (int) (Math.random() * (maximum - minimum + 1) + minimum);
                }
            }
            hanyadik++;
        }

        for (int i = 0; i < szamok.length; i++) {
            System.out.print(szamok[i] + " ");
        }
        System.out.println("");

        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        int n = 28;
        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n += 2;
        }
        System.out.println("");

        for (int i = 0, m = 28; i < 10; i++, m += 2) {
            System.out.print(m + " ");
        }
        System.out.println("");

        int szam = 3;
        int eleres = -3;
        while (szam >= eleres) {

            System.out.printf("|%2d| = %d\n", szam, Math.abs(szam));
            szam--;
        }

        Random rnd = new Random();
        boolean[] szelveny = new boolean[91];
        int db = 0;
        while (db < 5) {
            szam = rnd.nextInt(90) + 1;
            if (szelveny[szam] == false) {
                szelveny[szam] = true;
                db++;
            }
        }

        
        for (int i = 0; i < szelveny.length; i++) {
            if (szelveny[i] == true) {
                System.out.print(i + " ");
                
            
            }
            
            System.out.println("");
            
        }
        
        
        
        
        
        
    }

}
