# Day 22 - Hollow Pyramid

## Java Code

```java
public class PatternDay22 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
```

## Output

```text
    *
   * *
  *   *
 *     *
*********
```

## Logic

- `n = 5` means 5 rows.
- The first inner loop prints spaces to center the pyramid.
- `2 * i - 1` calculates the number of positions in each row.
- `j == 1` prints the left boundary star.
- `j == 2 * i - 1` prints the right boundary star.
- `i == n` prints stars across the last row.
- `else` prints spaces inside the pyramid.

## Dry Run

| Row (`i`) | Leading Spaces | Positions | Output |
|---|---:|---:|---|
| 1 | 4 | 1 | `*` |
| 2 | 3 | 3 | `* *` |
| 3 | 2 | 5 | `*   *` |
| 4 | 1 | 7 | `*     *` |
| 5 | 0 | 9 | `*********` |

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
