public class Dokter extends Pegawai {
    private int golongan;

    public Dokter(
            String nid, 
            String nama, 
            String tanggalLahir, 
            int lamaKerja, 
            int golongan
        ) {

        super(nid, nama, tanggalLahir, lamaKerja);
        this.golongan = golongan;
    }

    public double hitungGaji() {
        double gajiPokok = 0;
        switch (golongan) {
            case 1:
                gajiPokok = 4000000;
                break;
            case 2:
                gajiPokok = 5000000;
                break;
            case 3:
                gajiPokok = 6000000;
                break;
            case 4:
                gajiPokok = 7000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                break;
        }

        double tunjanganFungsional = 0;
        if (lamaKerja < 5) {
            tunjanganFungsional = 1500000;
        } else if (lamaKerja >= 5 && lamaKerja <= 10) {
            tunjanganFungsional = 3000000;
        } else if (lamaKerja > 10) {
            tunjanganFungsional = 5000000;
        }

        return gajiPokok + tunjanganFungsional;
    }

    public void getDetailsDokter()
    {
        System.out.println("NID: " + this.nid);
        System.out.println("Nama: " + this.nama);
        System.out.println("Golongan: " + this.golongan);
        System.out.println("Masa Kerja: " + this.lamaKerja + " tahun");
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}


