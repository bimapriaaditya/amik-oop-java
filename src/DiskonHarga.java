public class DiskonHarga {
    
    public void main()
    {
        // Variable awal
        float hargaAwal = (float) 9500;
        float diskon = (float) 0.1; // 10%

        // hasil 
        float total_diskon = diskon * hargaAwal;
        float harga_bayar = hargaAwal - total_diskon;

        String hargaSetelahDiskonFormatted = String.format("%,.0f", harga_bayar);


        System.out.print("Total Harga bayar setelah diskon adalah : " + hargaSetelahDiskonFormatted);
    }

}
