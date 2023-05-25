package buku_oop;

public class Perkalian {
    
    public void kali_1() {
        int a = 5, b = 3;
        System.out.println("Hasil Perkalian dari methode kali_1() PERTAMA : " + (a * b));
    }

    public void kali_1(int x, int y) {
        System.out.println("Hasil Perkalian dari methode kali_1() KEDUA : " + (x * y));
    }

    public static void main(String[] args) {

        Perkalian kali;
        kali = new Perkalian();

        kali.kali_1();
        kali.kali_1(10, 5);

    }

}
