package poli;

public class Hewan {

    public void suara() {
        System.out.println("Hewan Bersuara, ");
    }

}

class Ayam extends Hewan {
    public void suara() {
        System.out.println("Suara Ayam : Okokokok");
    }
}

class Kucing extends Hewan {
    public void suara() {
        System.out.println("Suara Kocheng : Maaung Maung Meong...");
    }
}

class SuaraHewan {

    public static void main(String[] args) {

        Hewan animal = new Hewan();
        Kucing cat = new Kucing();
        Ayam kfc = new Ayam();

        animal.suara();
        cat.suara();
        kfc.suara();

    }

}