package buku_oop;

class Pertama {
    public int nilai_java;
    protected int nilai_algo;
    public String nama;
    private String jurusan;
}

class Kedua {
    public static void main(String[] args) {
        Pertama data = new Pertama();
        data.nilai_algo = 75;
        data.nilai_java = 90;
        data.nama = "Bima Pria Aditya";
        System.out.println("Nama Siswa : " + data.nama);
        System.out.println("Nilai Java : " + data.nilai_java);
        System.out.println("Nilai Algoritma : " + data.nilai_algo);
    }
}