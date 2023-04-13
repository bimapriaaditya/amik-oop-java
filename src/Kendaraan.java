import java.util.Scanner;

public class Kendaraan {
    public void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Pilih Kendaraan =====");
        System.out.println("== 1. Pesawat Terbang ==");
        System.out.println("== 2. Kereta Api ==");
        System.out.println("== 3. Bus ==");
        System.out.println("== 4. Taksi ==");
        System.out.println("== 5. Mobil ==");
        System.out.println("== 6. Motor ==");
        System.out.println("===== Pilih Kendaraan =====");

        System.out.print("pilih kendaraan\t:");
        int userInput = input.nextInt();
        String result = null;

        switch (userInput) {
            case 1: result = "Naik Pesawat Terbang"; break;
            case 2: result = "Naik Kereta Api"; break;
            case 3: result = "Naik Bus"; break;
            case 4: result = "Naik Taksi"; break;
            case 5: result = "Naik Mobil"; break;
            case 6: result = "Naik Motor"; break;
            default: result = "Anda salah memilih";
        }

        System.out.println(result);
    }
}
