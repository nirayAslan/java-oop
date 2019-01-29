public class Musteri {
    public String adi;  // Members
    public String soyadi; // Members
    public String firmaAdi; //Members
    public String telefon; //Members

    public void selamla(){      //Method tanımladık
        System.out.println("Step By Step Java"); //Methodun islevi

    }

    public void cevir() {
        System.out.println("Adım Adım Java");
    }

    public static void main(String args[]) {
        Musteri ipek = new Musteri(); // create an object
        Musteri ece = new Musteri(); // create an object

        ipek.adi ="İpek";     //objelere özelliklerini tanımladık.
        ipek.soyadi="Aslan";
        ipek.firmaAdi="Aslan Lmt.";
        ipek.telefon="25854565";

        ece.adi="Ece";
        ece.soyadi="Aslan";
        ece.firmaAdi="Aslan Lmt.";
        ece.telefon="2568956";

        ipek.selamla(); //Methodu cagırdık.
        ece.cevir();


    }
}
