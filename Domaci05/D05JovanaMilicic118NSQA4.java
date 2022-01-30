import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.IntStream;

public class D05JovanaMilicic118NSQA4 {

    public static void main(String[] args) {
      /*
      ------------1.ZADATAK--------------------------
        Ispisati u konzoli sumu svih parnih brojeva od 1 do n. Korisnik unosi n.
       (za ovaj zadatak nisu potrebni nizovi samo petlje)

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Suma parnih brojeva od 1 do " + n + " je: " + sum);
       */

        Nacrtati pomocu petlji sledeci oblik :
        //Primer za N = 5
        //        *
        //      * *
        //    * * *
        //  * * * *
        //* * * * *

        int n = 8;

        for (int i = 0; i<=n; i++){
            for(int j = 0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }


/*
----------------------------3.ZADATAK-------------------------------------
        //Deklarisati I inicijalizovati proizvoljan niz celih brojeva. Od tog niza napraviti novi koji ce imati obrnuti
        //redosled elemenata. Primer : pocetni niz -> {1,4,6,5,3} , krajnji niz -> {3, 5, 6, 4,1}


        int[] niz = {2,5,6,7,9,11,32,12,45};
        int [] noviNiz = new int[niz.length];

        for (int i = 0; i<niz.length; i++) {
            noviNiz [i] = niz[niz.length-1-i];
        }
        System.out.println(Arrays.toString(niz) + " Ovo je prvi niz.");
        System.out.println(Arrays.toString(noviNiz) + " Ovo je novi niz.");
*/


        /*-------------------4.ZADATAK----------------------------------------
        Deklarisati I inicijalizovati niz celih brojeva. Korisnik unosi jedan ceo broj koji se cuva u promenljivoj x.
        Proveriti da li se broj x nalazi u nizu , ako se nalazi ispisati poruku “Nadjen” ako ne “Ovaj broj ne postoji u
        nizu”
        Primer: niz -> {2,5,4,3,3,6,5} , Korisnik uneo x -> 5 , res -> “Nadjen”
        ** Dodatak : Koliko puta se broj x nalazi u nizu. U primeru bi res bio 2 puta.



        int [] niz = {2, 16, 3, 55, 23, 14, 7, 16, 16, 16};
        Scanner s = new Scanner(System.in);
        int brojac = 0;
        int element = 0;
        boolean nadjen = false;

        System.out.print("Unesite jedan ceo broj: ");

        while(!s.hasNextInt()){
            System.out.println("Uneli ste nevalidan podatak.");
            s.nextLine();
            System.exit(1);
        }
        int x = s.nextInt();

        for (int i = 0; i < niz.length; i++){
            if(x==niz[i]){
                nadjen = true;
                brojac++;
                element=niz[i];//ovo je pomocna varijabla
            }
        }
        if(nadjen){
            System.out.println("Pronadjeni broj " + element + " se nalazi u nizu " + brojac + " puta.");
        } else {
            System.out.println("Broj nije pronadjen.");
        }
*/
                /* ------------------------5.-----------------------------------------------
                ** Dodatni zadatak (opciono) : Korisnik unosi datum u sledecem formatu: MM-DD-YYYY, uneti string prebaciti
                * u niz tako da taj niz izgleda ovako : {M,M,D,D,Y,Y,Y,Y}. Zatim proveriti da li je uneti datum palindrom .
Palindrom je string koji se cita isto sa obe strane.
anavolimilovana -> ovo je palindrom
Primer:  Korisnik unosi datum -> 12-02-2021 ,kada se sklone crtice I pretvori se u niz dobije se {1,2,0,2,2,0,2,1}


        Scanner s = new Scanner(System.in);
        System.out.print("Unesite datum: ");
        String datum = s.next();
        //definisem koji je parser
        String parser = String.valueOf(datum.charAt(2));
        //uklanjam parser iz datuma
        String noviDatum = datum.replace(parser,"");
        //definisem niz
        String [] dat = new String [noviDatum.length()];
        //prolazim kroz ceo niz i popunjavam ga sa odredjenim slovom/brojem iz datuma
        for (int i = 0;i < dat.length; i++){
            dat[i] = String.valueOf(noviDatum.charAt(i));
        }
        System.out.println(Arrays.toString(dat));

        //kreiram novi string koji setujem da je prazan
        String obrnutiString = "";
        //prolazim kroz string i pisem ga obrnutim redom u obrnutistring
        for(int j = (noviDatum.length()-1); j>=0;j--){
            obrnutiString = obrnutiString + noviDatum.charAt(j);
        }
        //proveravam da li su string novidatum i obrnutidatum isti
        if(noviDatum.equals(obrnutiString)){
            System.out.println("String je palindrom.");
        }else {
            System.out.println("String nije palindrom.");
        }
                 */
    }

    }
