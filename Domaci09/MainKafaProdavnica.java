package domaci.Domaci09;

public class MainKafaProdavnica {

    public static void main(String[] args) {

        Kafa kafa1 = new Kafa("espresso", "shot", new String[]{"shot of espresso"}, 120);
        Kafa kafa2 = new Kafa("americano", "large", new String[]{"shot of espresso", "hot water"}, 110);
        Kafa kafa3 = new Kafa("turkish", "standard", new String[]{"two scoops of coffee", "cup of boiling water"}, 100);
        Kafa kafa4 = new Kafa ("latte", "small", new String[]{"shot of espresso","glass of milk"},130);
        Kafa kafa5 = new Kafa ("turkish", "standard", new String[]{"two scoops of cofee", "cup of boiling water"},105);

        Kafa [] kafeProdavnice1 = {kafa1, kafa2, kafa3};
        Kafa [] kafeProdavnice2 = {kafa4, kafa5};

        Prodavnica prodavnica1 = new Prodavnica(kafeProdavnice1, "Cara Dusana 68");
        Prodavnica prodavnica2 = new Prodavnica(kafeProdavnice2, "Ribareva 107");

        Prodavnica [] sveProdavnice = {prodavnica1,prodavnica2};

        System.out.println("Broj kreiranih prodavnica je " + Prodavnica.getBrProdavnica());

        System.out.println("Cena kupljenih kafa je " + prodavnica1.kupiKafu(kafa1,2));
        System.out.println("Cena kupljenih kafa je " + prodavnica2.kupiKafu(kafa4, 1));
        System.out.println("Cena kupljenih kafa je " + prodavnica2.kupiKafu(kafa5, 3));

        System.out.println("Najuspesnija prodavnica je: " + Prodavnica.najuspesnijaProdavnica(sveProdavnice));

        if (Prodavnica.najuspesnijaProdavnica(sveProdavnice).equals("prodavnica1")){
            prodavnica1.izracunajPopust(20);
            for (Kafa k : kafeProdavnice1){
                System.out.println("Nova cena kafe " + k.getNaziv() + " je " + k.getCena());
            }
        } else if (Prodavnica.najuspesnijaProdavnica(sveProdavnice).equals("prodavnica2")) {
            prodavnica2.izracunajPopust(20);
            for (Kafa k : kafeProdavnice2) {
                System.out.println("Nova cena kafe " + k.getNaziv() + " je " + k.getCena());
            }
        }

        System.out.println(kafa4.getCena());
        System.out.println(kafa5.getCena());
    }
}
