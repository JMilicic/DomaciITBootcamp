package domaci.Domaci09;

public class Kafa {

    private String naziv;
    private String velicina;
    private String [] sastojci;
    private int cena;

    public Kafa (String naziv, String velicina, String [] sastojci, int cena){
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getVelicina() {
        return velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public double setCena(double procenat) {
        double popust = this.cena * procenat / 100;
        this.cena = (int) (this.cena - popust);
        return this.cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }


}
