package kampus;

public class Kelas{
    String kode_ruangan, nama_kelas, jenis_ruangan;

    void getDetailKelas()
    {
        kode_ruangan = "RM_001";
        nama_kelas = "Ruang Kelas Mahasiswa 1";
        jenis_ruangan = "Kelas Reguler";

        System.out.println("Kode Ruangan : " + kode_ruangan);
        System.out.println("Nama Kelas : " + nama_kelas);
        System.out.println("Jenis Ruangan : " + jenis_ruangan);
    }

    private String setBelajar() 
    {
        return "Pintar";
    }

    void getPembelajaran()
    {
        System.out.println("Jika anda belajar di " + nama_kelas + " maka anda akan " + setBelajar());
    }
}
