package bermudezdiaz_elena_projecte_uf4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.util.Scanner;

/**
 * Classe d'utilitats varies
 *
 * @author elena_BeDi
 */
public class Util {

    // Regla de 3
    // a --> b
    // c --> x
    // Regla de 3 --> x = b*c/a
    public double reglaDouble(double b, double c, double a) { //Calculo de regla de 3

        double resultado2 = (b * c) / a;
        return resultado2;

    }

    /**
     * Llegir un integer amb control d'errors
     *
     * @param text Missatge que posarà en pantalla
     * @return integer llegit
     */
    public static int demanaInt(String text) {
        Scanner sc = new Scanner(System.in);
        boolean esNum = false;
        int num = 0;
        do {
            System.out.print(text + "\n");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                sc.nextLine();
                esNum = true;
            } else {
                System.out.println("\nError! El caracter introduït ha de ser un número. Introdueix un altre: ");
                sc.nextLine();
            }

        } while (!esNum);
        return num;
    }

    /**
     * Llegir un double amb control d'errors
     *
     * @param text Missatge que posarà en pantalla
     * @return double llegit
     */
    public static double demanaDouble(String text) {
        Scanner sc = new Scanner(System.in);
        boolean esNum = false;
        double num = 0;
        do {
            System.out.print(text + "\n");
            if (sc.hasNextDouble()) {
                num = sc.nextDouble();
                esNum = true;
            } else {
                System.out.println("Error! El caracter introduït ha de ser un número real. Introdueix un altre número, si us plau:");
                sc.nextLine();
                esNum = false;
            }

        } while (!esNum);
        return num;
    }

    /**
     * Llegir un char amb control d'errors
     *
     * @param text Missatge que posar en pantalla
     * @param charsValid
     * @return char llegit
     */
    public static char demanaCharSiNo(String text) {
        Scanner sc = new Scanner(System.in);
        char opcio;
        System.out.println(text);
        opcio = sc.nextLine().toLowerCase().charAt(0);
        if (opcio == 's') {
            return opcio = 's';
        } else if (opcio == 'n') {
            return opcio = 'n';
        } else if (opcio == ' ') {
            System.out.println("La resposta no conté la informació requerida, si us plau, torna a provar.");
            return demanaCharSiNo(text);
        } else {
            System.out.println("La resposta no conté la informació requerida, si us plau, torna a provar.");
            return demanaCharSiNo(text);
        }
    }

    /**
     * Demana una String
     *
     * @param frase Missatge que se li envia al mètode per demanar el String
     * @return Es torna la String
     */
    public static String demanarStringWithNext(String frase) {
        Scanner teclat = new Scanner(System.in);
        String paraula;

        do {
            System.out.print(frase + "\n");
            paraula = teclat.next();
        } while (paraula.length() == 0);

        return paraula;
    }

    /**
     * Demana una String
     *
     * @param frase Missatge que se li envia al mètode per demanar el String
     * @return Es torna la String
     */
    public static String demanarStringWithNextLine(String frase) {
        Scanner teclat = new Scanner(System.in);
        String paraula;

        do {
            System.out.print(frase + "\n");
            paraula = teclat.nextLine();
        } while (paraula.length() == 0);

        return paraula;
    }

    // ARXIUS
    //================================================================================================================================================
    /**
     * Interpreta un directori, diu el nom dels arxius que hi ha dins i la mida.
     * Ha de rebre el nom d'una classe File.
     *
     * @param text Missatge que posarà en pantalla
     * @return integer opcio
     */
    public static void mostraDirectori(File arxiu) {
        if (arxiu.isDirectory()) {
            File[] ll = arxiu.listFiles();
            long total = 0;
            long mida = 0;
            for (int i = 0; i < ll.length; i++) {
                mida = ll[i].length();
                System.out.printf("%-20s %10d\n", ll[i].getName(), mida);
                total += mida;
            }
            System.out.printf("%-20s %10d\n ", "Total Bytes: ", total);
        } else {
            System.out.println("No és directori");
        }
        System.out.println("------------------------------");

    }

    /**
     * Llegir un menú a través d'un switch
     *
     * @param text Missatge que posarà en pantalla
     * @return integer opcio
     */
    public static int OpcioMenu(String text, int opcioLimitmin, int opcioLimitMax) {
        int opcio;

        String menu = text;
        do {
            opcio = Util.demanaInt(menu);
            if (opcio < opcioLimitmin || opcio > opcioLimitMax) {
                System.out.print("Introdueix un número del" + opcioLimitmin + "al" + opcioLimitMax + ": ");
            }
        } while (opcio < opcioLimitmin || opcio > opcioLimitMax);

        return opcio;
    }

    /**
     * Demana ruta per accedir a un arxiu o directori
     *
     * @return String de tipus File
     */
    public static String demanaRuta() {
        String ruta = Util.demanarStringWithNextLine("Introdueix el nom o la ruta d'un arxiu: ");
        return ruta;
    }

    /**
     * Llegeix un archiu .txt i requereix de l'entrada d'una ruta
     *
     * @return la impresió de l'arxiu de text
     */
    public static void llegirDades(String nom) {

        Scanner lector = null;

        try {

            File fi = new File(nom);
            lector = new Scanner(fi);
            System.out.println("---------------CONTINGUT---------------");
            while (lector.hasNext()) {
                String lin = lector.nextLine();
                System.out.println(lin);
            }
            System.out.println("-----------------FINAL-----------------");

        } catch (Exception e) {
            System.out.println("\nERROR: " + e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
    
}
