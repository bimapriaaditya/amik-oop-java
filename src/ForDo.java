import java.util.Scanner;


public class ForDo {
    
    public void ForloopJava()
    {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Jumlah Loop");
        int jumlah_loop = scan.nextInt();

        for(i = 1; i <= jumlah_loop; i++) {
            System.out.println("Ini Loopingan ke-" + i);
        }

    }

    public void WhileLoop()
    {
        int i = 1;
        boolean check = true;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kondisi Berakhir pada bilangan? ");
        int conditions = scan.nextInt();

        while (check==true) {
            System.out.println("Looping ke-" + i);
            if (i == conditions) {
                check = false;
            }
            i++;
        }
    }

    public void DoWhileLoop()
    {
        Scanner scan = new Scanner(System.in);
        String jawaban;
        
        do {
            System.out.print("Masukkan tahun lahir : ");
            int tahun = scan.nextInt();
            
            System.out.println("Umur anda : " + (2023 - tahun));
            System.out.println("----------------------------------------");
            System.out.print("Input lagi (Y/T) : ");
            jawaban = scan.next();	
        } while (jawaban.equalsIgnoreCase("Y"));	

    }

}
