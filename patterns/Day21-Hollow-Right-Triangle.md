# Day 21 - Hollow Right Triangle

## Java Code

```java
public class PatternDay21 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
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
* * * * *
```

## Logic

- `n = 5` means 5 rows.
- `i` controls the rows.
- `j` controls the columns.
- `j == 1` prints stars on the left boundary.
- `j == i` prints stars on the right boundary.
- `i == n` prints stars in the last row.
- `else` prints spaces inside the triangle.

## Dry Run

| Row (`i`) | Output | Reason |
|---|---|---|
| 1 | `*` | First and last position |
| 2 | `* *` | Boundary stars |
| 3 | `*   *` | Middle position is empty |
| 4 | `*     *` | Middle positions are empty |
| 5 | `* * * * *` | Last row prints all stars |

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
