package domaci.Domaci10;

import java.util.*;

public class Korpa {

    private String kupac;
    private HashMap<String, Integer> proizvodKolicina = new HashMap<>();

    public Korpa(String kupac) {
        this.kupac = kupac;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public HashMap<String , Integer> getProizvodKolicina() {
        return proizvodKolicina;
    }

    public void addProizvod(String proizvod, int kolicina) {
        if (!getProizvodKolicina().containsKey(proizvod)) {
            getProizvodKolicina().put(proizvod, kolicina);
        } else {
            int current = getProizvodKolicina().get(proizvod);
            getProizvodKolicina().put(proizvod, current + kolicina);
        }
    }

    public void ispisiRacun(ArrayList<Double> cena) {
        double suma = 0;

        Set<Map.Entry<String, Integer>> set = getProizvodKolicina().entrySet();
        Iterator<Map.Entry<String, Integer>> i = set.iterator();
        int counter = 0;
        while(i.hasNext()){
            Map.Entry<String, Integer> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.print(me.getValue() + "     ");
            System.out.println(me.getValue()*cena.get(counter));
            suma = suma + me.getValue()*cena.get(counter);
            counter++;
        }

        System.out.println("Vas racun iznosi:     " + suma + " dinara.");

    }
}
