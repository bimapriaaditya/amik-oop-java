package turunan;

public class OrangTua {
    String nama;
    int umur, berat;

    public static void main(String[] args) {
        OrangTua anak1 = new OrangTua();
        OrangTua anak2 = new OrangTua();

        anak1.nama = "Bima";
        anak1.umur = 21;
        anak1.berat = 80;

        System.out.println("Anak Pertama : " + anak1.nama + " (" + anak1.umur + ")");
        System.out.println("Beratnya : " + anak1.berat);
        anak1.makan();

        anak2.nama = "Dadan";
        anak2.berat = 75;
        anak2.umur = 23;

        System.out.println("Anak Kedua : " + anak2.nama + " (" + anak2.umur + ")");
        System.out.println("Beratnya : " + anak2.berat);
        anak2.jalan();
    }

    void makan() {
        System.out.println("Makan Seblak");
    }

    void tidur() {
        System.out.println("Tidurnya ngorok");
    }

    void jalan() {
        System.out.println("Jalannya Lama");
    }
}


class anak1 extends OrangTua {
    
    void renang() {
        System.out.println(" Renangnya Gaya Batu");
    }

    class anak2 extends OrangTua {
        
        void bernyanyi() {
            System.out.println(" Nyayi lagu jepang");
        }

    }

}