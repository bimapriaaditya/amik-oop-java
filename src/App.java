public class App {
    public static void main(String[] args) throws Exception {

        // Initial data pada variable (dibentuk array agar lebih rapih dengan ketentuan key, value)
        String[][] data = {
            {"NPM","2242807"}, 
            {"NAMA", "Bima Pria Aditya"}, 
            {"TTL" ,"Bandung, 02 Nov 2001"}, 
            {"HOBI", "Main Game, Design Mockup, CSS, JavaScript"}, 
            {"ALAMAT", "Jl Sadang Saip no 34"}, 
            {"NO TELP.", "087878182791"}, 
            {"EMAIL", "bpabima@gmail.com"}
        };
        int co1lWidth = 15; // Lebar kolom pertama
        int col2Width = 46; // lebar kolom kedua

        // Membuat Format string print pada kolom 1 & 2
        String tableFormat = "| %-"+co1lWidth+"s | %-"+col2Width+"s |\n";

        System.out.format("+------------------------------------------------------------------+\n");

        for(int i = 0; i < data.length; i++) {
            // Melakukan print terhadap data di variable array yang telah didefinisikan
            System.out.format(tableFormat, data[i][0], data[i][1]);
        }

        System.out.format("+------------------------------------------------------------------+\n");
    }
}
