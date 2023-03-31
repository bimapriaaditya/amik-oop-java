import java.util.Scanner;

public class InputScanner {

    public void main()
    {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Masukan nama anda : ");
        nama=input.nextLine();

        System.out.print("Masukan umur anda : ");
        umur=input.nextInt();

        System.out.println("Nama Anda :" + nama + "\n Umum anda : " + umur);

        input.close();
    }

}
