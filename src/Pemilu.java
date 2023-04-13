import java.util.Scanner;

public class Pemilu {
    void main()
    {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Umur anda");
        age = input.nextInt();

        if (age > 17) {
            System.out.println("Anda boleh nyoblos pemilu");
        } else {
            System.out.println("Anda masih terlalu muda untuk mengikuti pemilu");
        }
    }
}
