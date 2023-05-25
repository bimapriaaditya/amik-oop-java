package buku_oop;

class Mahasiswa {
    int nim;
    public String nama;
    private double ipk;

    public void setIPK(double nilai) {
        ipk = nilai;
    }

    public double getIPK() {
        return ipk;
    }
}

public class PengaruhHakAkses {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Bima Pria Aditya";
        mhs.nim = 2242807;
        // mhs.ipk = 3.75;

        mhs.setIPK(3.85);

        System.out.println("Nama Siswa : " + mhs.nama);
        System.out.println("NIM : " + mhs.nim);
        System.out.println("IPK nys : " + mhs.getIPK());
    }
}