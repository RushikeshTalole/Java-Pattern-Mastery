public class PatternDay29 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;

            // Print numbers in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Calculate the next number in the row
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}