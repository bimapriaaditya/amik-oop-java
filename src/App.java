public class App {

    public static void main(String[] args) {
        Dokter dokter1 = new Dokter(
            "D001", 
            "Dr. John Doe", 
            "14 Mei 1995", 
            3,
            8
        );
        Dokter dokter2 = new Dokter(
            "D002", 
            "Dr. Jane Smith", 
            "14 Mare 1990", 
            2, 
            3
        );
        NonDokter nonDokter1 = new NonDokter(
            "N001", 
            "Mr. James Lee", 
            "20 Maret 1899", 
            5
        );

        System.out.println("Data Dokter 1");
        dokter1.getDetailsDokter();

        System.out.println("\nData Dokter 2");
        dokter2.getDetailsDokter();

        System.out.println("\nData Non-Dokter 1");
        nonDokter1.getDetailsNonDokter();
    }

}
