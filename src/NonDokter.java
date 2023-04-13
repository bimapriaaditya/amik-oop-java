public class NonDokter extends Pegawai {

    public NonDokter(
        String nid, 
        String nama, 
        String tanggalLahir, 
        int lamaKerja
    ) {
        super(nid, nama, tanggalLahir, lamaKerja);
    }

    public double hitungGaji() {
        return 4000000;
    }

    public void getDetailsNonDokter() {
        System.out.println("NID: " + this.nid);
        System.out.println("Nama: " + this.nama);
        System.out.println("Masa Kerja: " + this.lamaKerja + " tahun");
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}