public class BangunRuang {
    public void main()
    {
        // Input jari-jari dan tinggi tabung
        double jariJariTabung = 5;
        double tinggiTabung = 10;
        
        // Input jari-jari bola
        double jariJariBola = 3;
        
        // Hitung dan tampilkan hasil
        double volumeBola = 4/3.0 * Math.PI * Math.pow(jariJariBola, 3);
        System.out.println("Volume Bola: " + volumeBola);
        
        double luasBola = 4 * Math.PI * Math.pow(jariJariBola, 2);
        System.out.println("Luas Bola: " + luasBola);
        
        double luasLingkaran = Math.PI * Math.pow(jariJariTabung, 2);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        
        double volumeTabung = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;
        System.out.println("Volume Tabung: " + volumeTabung);
    }
}
