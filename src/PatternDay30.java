public class PatternDay30 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Left side: Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle: Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side: Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            // Left side: Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle: Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side: Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}