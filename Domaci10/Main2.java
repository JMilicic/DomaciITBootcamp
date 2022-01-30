package domaci.Domaci10;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Proizvod p1 = new Prehrambeni("457sdi7", "mleko", 100, LocalDate.of(2021, 12, 30));
        Proizvod p2 = new Tehnika("345kh3", "sporet", 35000, 5, 40);
        Proizvod p3 = new AlkoholnaPica("654k33", "pivo", 120, "staklena", 10);
        Proizvod p4 = new Pice("774gg", "sok breskva", "kartonska", 200);

        Proizvod[] proizvodi = {p1, p2, p3, p4};


        System.out.println("Unesite ime i prezime: ");
        Scanner s = new Scanner(System.in);
        Korpa2 mojaKorpa = new Korpa2(s.nextLine());


        while (true){

            System.out.println("Unesite bar kod proizvoda: ");
            String barKod = s.next();

            if (barKod.equals("zavrsi")) break;
            System.out.println(barKod);

            boolean nadjen = false;
            for (Proizvod p : proizvodi){
                if(p.getBarKod().equals(barKod)){
                    mojaKorpa.addProizvod(p);
                    System.out.println("Proizvod dodat");
                    nadjen = true;
                }
            }
        if (!nadjen) System.out.println("Nema proizvoda sa unetim bar kodom");
        }

        mojaKorpa.ispisiRacun();
    }
}
