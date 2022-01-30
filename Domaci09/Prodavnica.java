package domaci.Domaci09;

public class Prodavnica{

    private static int brProdavnica;
    private Kafa[] kafa;
    private String adresa;
    private int brKupljenihProizvoda;


    public Prodavnica (Kafa[] kafa, String adresa){
        this.kafa = kafa;
        this.adresa = adresa;
        brProdavnica++;
    }

    public String getAdresa() {
        return adresa;
    }

    public Kafa[] getKafa() {
        return kafa;
    }

    public static int getBrProdavnica() {
        return brProdavnica;
    }

    public int getBrKupljenihProizvoda() {
        return brKupljenihProizvoda;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setBrKupljenihProizvoda(int brKupljenihProizvoda) {
        this.brKupljenihProizvoda = brKupljenihProizvoda;
    }

    public double kupiKafu(Kafa kafa, int kolicina){
        brKupljenihProizvoda = brKupljenihProizvoda + kolicina;
        return kafa.getCena() * kolicina;
    }

    public void izracunajPopust (int popust){
        for (Kafa k : kafa){
            k.setCena(popust);
        }
    }

    public static String najuspesnijaProdavnica(Prodavnica[] niz){
        String najuspesnijaProdavnica = "";
        if (niz[0].getBrKupljenihProizvoda() > niz[1].getBrKupljenihProizvoda()){
            najuspesnijaProdavnica = "prodavnica1";
        } else if (niz[0].getBrKupljenihProizvoda() < niz[1].getBrKupljenihProizvoda()){
            najuspesnijaProdavnica = "prodavnica2";
        } else {
            System.out.println("Obe prodavnice su podjednako uspesne.");
        }
        return najuspesnijaProdavnica;
    }

}
