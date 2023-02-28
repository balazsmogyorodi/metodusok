package tombok;

import java.util.Random;

public class QR_kod {

    public static void main(String[] args) {
        qrGenerator();

    }

    private static void qrGenerator() {
        System.out.println("*********************************************\n");
        qr();
        System.out.println("*********************************************\n");
        qr(true);
        System.out.println("*********************************************\n");
        qr(20);
        System.out.println("*********************************************\n");
        qr(20, true);
        System.out.println("*********************************************\n");

    }

    private static void qr() {
        qr(false);
    }

    private static void qr(int hossz) {
        if (hossz < 10) {
            hossz = 10;
        }
        qr(hossz, false);
    }

    private static void qr(boolean jo) {
        int hossz = 10;
        qr(hossz, jo);
    }

    private static void qr(int hossz, boolean jo) {  
        qr_kod_kiiras(jo, hossz);
    }

    private static void qr_kod_kiiras(boolean jo, int hossz) {
        if (!jo) {
            sima_qr_kod(hossz);
        } else if (jo) {
            specialis_qr_kod(hossz);
        }
    }

    private static void specialis_qr_kod(int hossz) {
        specialis_szimbolum(hossz);
        maradek(hossz);
    }

    private static void maradek(int hossz) {
        if (hossz > 10) {
            int index = 10;
            while (index < hossz) {
                for (int j = 0; j < 2; j++) {
                    sor_fel();
                    
                }
                System.out.println("");
                
                index++;
            }
        }
    }

    private static void specialis_szimbolum(int hossz) {
        switch (hossz) {
            default:
            case 0:
                felse_also();
            case 1:
                masodik_utolsoElotti();
            case 2:
                belso();
            case 3:
                belso();
            case 4:
                belso();
            case 5:
                belso();
            case 6:
                belso();
            case 7:
                belso();
            case 8:
                masodik_utolsoElotti();
            case 9:
                felse_also();
                
        }
    }

    private static void sima_qr_kod(int hossz) {
        for (int i = 0; hossz > i; i++) {
            for (int j = 0; j < 2; j++) {
                sor_fel();
            }
            System.out.println("");
        }
    }

    private static void belso() {
        sor_fel();
        String szines = "\u001B[45m" + " ";
        String sima = "\u001B[40m" + " ";
        System.out.print(szines);
        for (int i = 0; i < 3; i++) {
            System.out.print(sima);
        }
        System.out.print(szines);
        System.out.print(szines);
        for (int i = 0; i < 3; i++) {
            System.out.print(sima);
        }
        System.out.print(szines);
        System.out.println("");

    }

    private static void masodik_utolsoElotti() {
        sor_fel();
        String szines = "\u001B[45m" + " ";
        String sima = "\u001B[40m" + " ";
        System.out.print(szines);
        for (int i = 0; i < 8; i++) {
            System.out.print(sima);
        }
        System.out.print(szines);
        System.out.println("");

    }

    private static void felse_also() {
        sor_fel();
        String szin = "\u001B[45m" + " ";
        for (int i = 10; i < 20; i++) {
            System.out.print(szin);
        }
        System.out.println("");

    }

    private static void szin_sima() {
        String szin = "\u001B[40m" + " ";

        System.out.print(szin);
    }

    private static void szin_fekete() {
        String szin = "\u001B[47m" + " ";
        System.out.print(szin);

    }

    private static void sor_fel() {
        String szin = "";
        Random rnd = new Random();
        for (int j = 0; j < 10; j++) {
            int szinValasz = rnd.nextInt(2);
            if (szinValasz == 1) {
                szin_sima();
            } else {
                szin_fekete();
            }
            

        }

    }

    
}
