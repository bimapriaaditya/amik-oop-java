package bangun_datar;

abstract class BangunDatar {
    public abstract double hitungLuas();
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(1.25);
        System.out.println("Luas Lingkaran adalah = " + lingkaran.hitungLuas());

        Segitiga segitiga = new Segitiga(8.0, 10.0);
        System.out.println("Luas Segitiga adalah = " + segitiga.hitungLuas());

        PersegiPanjang persegiPanjang = new PersegiPanjang(5.0, 9.0);
        System.out.println("Luas Persegi Panjang adalah = " + persegiPanjang.hitungLuas());
    }
}
