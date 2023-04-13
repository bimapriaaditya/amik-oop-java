
public class OddEven {
    public void main() {

        // For Loop
        for (int i = 0; i < 11; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }

        // whlile loop
        int i = 1;
        int j = 10;
        while (i <= j) {
            if (i%2==1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
