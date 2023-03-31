// Class disimpan pada satu package / folder bernama kampus
package kampus;

// Main Class
public class App {

    public static void main(String[] args) {

        // panggil class kampus dan di initialisasi dengan kata academy
        Kampus academy = new Kampus();

        academy.nama_kampus = "STMIK AMIK";
        academy.jenis_kampus = "Sekolah Tinggi";
        academy.akreditasi = "B";
        academy.jumlah_lulusan = 250;

        System.out.println("SekoBimalah ku di : " + academy.nama_kampus + "(" + academy.jenis_kampus + ")");
        System.out.println("Dengan akreditasi : " + academy.akreditasi);
        System.out.println("Sekolah ini memiliki jumlah kelulusan : " + academy.jumlah_lulusan);

        System.out.println("=========================");

        // Memanggil methode pada class "Kelas"
        academy.kelas.getDetailKelas();
        academy.kelas.getPembelajaran();
    }
}
