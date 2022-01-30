package domaci;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class D_07_Jovana_Milicic_NS118QA4 {

    public static Scanner s;
    public static void main(String[] args) {
        s = new Scanner(System.in);

        String racunar = "";
        boolean pomocnaPromenljiva = true;
        String [] tabla = new String[9];

        System.out.print("Izaberite X ili O: ");
        String igracSimbol = s.next().toUpperCase(Locale.ROOT);
        racunar = izborSimbolaRacunara(igracSimbol);
        polje(tabla);

        while(pomocnaPromenljiva){
            System.out.println("\nBirajte poziciju, od 1 do 9: ");
            int pozicijaIgraca = s.nextInt();
            igracPotez(tabla, pozicijaIgraca, igracSimbol);
            boolean provera = Arrays.asList(tabla).contains(null);
            racunarPotez(tabla, racunar, provera);
            polje(tabla);
            if(!provera){
                System.out.println("\nHvala sto ste igrali!");
                System.exit(1);
            }
        }
    }

    public static String izborSimbolaRacunara(String simbol){
        String racunarSimbol = "";

        if (simbol.equals("X")) {
            racunarSimbol = "O";
        } else if (simbol.equals("O")) {
            racunarSimbol = "X";
        } else {
            System.out.println(":(");
            System.exit(1);
        }
        return racunarSimbol;
    }

    public static int igracPotez(String [] tbl, int position, String simbol) {

        if (tbl[position - 1] == null) {
            tbl[position - 1] = simbol;
        } else {
            System.out.println("Niste izabrali slobodnu poziciju, birajte opet: ");
        }

        return position;
    }

    public static int racunarPotez(String [] tbl, String simbol, boolean check){
        int pozicijaRacunara = 0;
        while(check){
            pozicijaRacunara = (int) Math.floor(Math.random() * tbl.length);
            if(tbl[pozicijaRacunara] == null) {
                tbl[pozicijaRacunara] = simbol;
                break;
            }
        }
        return pozicijaRacunara;
    }

    public static String [] polje (String[]board) {


        for (int i = 0; i < board.length; i++) {
            if (i == 3) {
                System.out.println();
                System.out.print(board[i] + " | ");
            } else if (i == 6) {
                System.out.println();
                System.out.print(board[i] + " | ");
            } else {
                System.out.print(board[i] + " | ");
            }
        }
        return board;
    }

}

