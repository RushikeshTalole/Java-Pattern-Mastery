# Day 20 - Hollow Square

## Java Code

```java
public class PatternDay20 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
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
* * * * *
*       *
*       *
*       *
* * * * *
```

## Logic

- `n = 5` means 5 rows and 5 columns.
- `i == 1` prints stars in the first row.
- `i == n` prints stars in the last row.
- `j == 1` prints stars in the first column.
- `j == n` prints stars in the last column.
- `else` prints spaces inside the square.

## Dry Run

| Row (`i`) | Output |
|---|---|
| 1 | `* * * * *` |
| 2 | `*       *` |
| 3 | `*       *` |
| 4 | `*       *` |
| 5 | `* * * * *` |

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)