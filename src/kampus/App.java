package kampus;
public class App {

    public static void main(String[] args) {

        // Initialisai object karyawan
        Karyawan karyawan = new Karyawan();

        karyawan.cetakData(
            "KAD123",
            "Budidaya Emas",
            "Amil Jakat",
            3.900000
        );


        // Memanggil Zakat
        System.out.println("Jumlah Zakat harus bayar : " + karyawan.hitungSumbanganZakat());
    }
}
