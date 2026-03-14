
public class Test4 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = 4 - Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(val);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
