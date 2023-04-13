public class Segitiga {
    public void main() {
        for (int i=1; i <= 6; i++) {

            for (int j= 6-i; j > 0; j--) {
                System.out.print("   ");
            }


            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
