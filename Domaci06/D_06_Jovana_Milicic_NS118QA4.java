package domaci;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class D_06_Jovana_Milicic_NS118QA4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String igrac = " ";
        String racunar = " ";
        boolean pomocnaPromenljiva = true;
        int brojac = 0;
        String[] tabla = new String[9];


        System.out.print("Izaberite X ili O: ");
        igrac = s.next().toUpperCase(Locale.ROOT);

        if (igrac.equals("X")) {
            racunar = "O";
        } else if (igrac.equals("O")) {
            racunar = "X";
        } else {
            System.out.println(":(");
            System.exit(1);
        }


        while (pomocnaPromenljiva) {
            System.out.println("\nBirajte poziciju, od 1 do 9: ");
            int positionIgrac = s.nextInt();
            if (tabla[positionIgrac-1] == null) {
                tabla[positionIgrac-1] = igrac;
                brojac++;
            } else {
                System.out.println("Niste izabrali slobodnu poziciju, birajte opet: ");
                continue;
            }
            if (brojac > tabla.length) break;

            boolean provera = Arrays.asList(tabla).contains(null);

            while (provera) {
                int pozicijaRacunara =(int) Math.floor(Math.random() * tabla.length);
                if(tabla[pozicijaRacunara] == null) {
                    tabla[pozicijaRacunara] = racunar;
                    brojac++;
                    break;
                }
            }
            for (int i = 0; i < tabla.length; i++) {
                if (i == 3) {
                    System.out.println();
                    System.out.print(tabla[i] + " | ");
                } else if (i == 6) {
                    System.out.println();
                    System.out.print(tabla[i] + " | ");
                } else {
                    System.out.print(tabla[i] + " | ");
                }
            }

            if(!provera){
                System.out.println("\nHvala na igranju :)");
                System.exit(0);
            }
        }
    }
}

