import java.util.Scanner;

public class IfSelection {
    
    public void SimpleStatement()
    {
        int na = 70;

        if (na >= 60) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Maaf Anda Gagal");
        }
    }

    public void ScannerStatement()
    {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Nilai Akhir Anda : ");
        int na = inputan.nextInt();

        if (na >= 60) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Maaf Anda Gagal");
        }
    }

    public void SwitchCaseStatement()
    {
        Scanner inputan = new Scanner(System.in);
        int pilihan;

        System.out.println("Pilih Jurusan : 1 - 5");
        pilihan = inputan.nextInt();
        
        switch(pilihan) {
            case 1:
                System.out.println("Jurusan MI/D3 Dipilih");
                break;
            case 2:
                System.out.println("Jurusan TK/D3 Dipilih");
                break;
            case 3:
                System.out.println("Jurusan KA/D3 Dipilih");
                break;
            case 4:
                System.out.println("Jurusan TI/D3 Dipilih");
                break;
            case 5:
                System.out.println("Jurusan SI/D3 Dipilih");
                break;
            default:
                System.out.println("Inputan Salah");
                break;

        }
    }

}
