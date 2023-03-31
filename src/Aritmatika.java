public class Aritmatika {

    public void main() {

        int A = 100, B=30;
        int jumlah = A+B;
        int kurang = A-B;
        int kali = A*B;
        float bagi = (float)A/B;
        int modulo = A%B;

        // Tampilan Hasil
        System.out.println("Hasil penjumlahan :" + A + " + " + B + " = " + jumlah);
        System.out.println("Hasil pengurangan :" + A + " - " + B + " = " + kurang);
        System.out.println("Hasil perkalian :" + A + " * " + B + " = " + kali);
        System.out.println("Hasil permbagian :" + A + " / " + B + " = " + bagi);
        System.out.println("Hasil jumlah hasil bagi :" + A + " %" + B + " = " + modulo);

    }
}