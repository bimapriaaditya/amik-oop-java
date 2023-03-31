public class Karyawan {
    String id, nama, divisi;
    Double gaji;

    void cetakData(
        String code,
        String name,
        String division,
        Double salary
        )
    {

        id = code;
        nama = name;
        divisi = division;
        gaji = salary;

        System.out.println("Data Karyawan");
        System.out.println("ID :" + id);
        System.out.println("Nama :" + nama);
        System.out.println("Divisi :" + divisi);
        System.out.println("Gaji :" + gaji);
    }

    Double hitungSumbanganZakat()
    {
        double zakat = gaji * 0.025;
        return zakat;
    }
}