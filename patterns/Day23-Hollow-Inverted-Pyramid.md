# Day 23 - Hollow Inverted Pyramid

## Java Code

```java
public class PatternDay23 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and inside spaces
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {

                if (i == 1 || j == 1 || j == 2 * (n - i) + 1) {
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
*********
 *     *
  *   *
   * *
    *
```

## Logic

- `n = 5` means the pattern has 5 rows.
- The outer loop variable `i` controls the rows.
- The first inner loop prints leading spaces to shift each row to the right.
- The second inner loop prints stars and spaces.
- `2 * (n - i) + 1` calculates the number of positions in each row.
- `i == 1` prints stars across the first row.
- `j == 1` prints the left boundary star.
- `j == 2 * (n - i) + 1` prints the right boundary star.
- If no condition is true, the `else` block prints a space.
- `System.out.println()` moves the cursor to the next row.

## Understanding the Formula

Formula for positions:

`2 * (n - i) + 1`

When `n = 5`:

| Row (`i`) | Calculation | Positions |
|---|---|---:|
| 1 | `2 * (5 - 1) + 1` | 9 |
| 2 | `2 * (5 - 2) + 1` | 7 |
| 3 | `2 * (5 - 3) + 1` | 5 |
| 4 | `2 * (5 - 4) + 1` | 3 |
| 5 | `2 * (5 - 5) + 1` | 1 |

The number of positions decreases by 2 in every row.

## Dry Run

| Row (`i`) | Leading Spaces | Positions | Output |
|---|---:|---:|---|
| 1 | 0 | 9 | `*********` |
| 2 | 1 | 7 | `*     *` |
| 3 | 2 | 5 | `*   *` |
| 4 | 3 | 3 | `* *` |
| 5 | 4 | 1 | `*` |

### Row 1: `i = 1`

- Leading spaces: 0
- Positions: 9
- `i == 1` is true, so every position prints a star.

Output: `*********`

### Row 2: `i = 2`

- Leading spaces: 1
- Positions: 7
- `j == 1` prints the first star.
- Positions 2 to 6 print spaces.
- `j == 7` prints the last star.

Output: ` *     *`

### Row 3: `i = 3`

- Leading spaces: 2
- Positions: 5
- First and last positions print stars.
- Middle positions print spaces.

Output: `  *   *`

### Row 4: `i = 4`

- Leading spaces: 3
- Positions: 3
- First and last positions print stars.
- The middle position prints a space.

Output: `   * *`

### Row 5: `i = 5`

- Leading spaces: 4
- Positions: 1
- Only one position is printed, containing a star.

Output: `    *`

## Important Points

- `i` controls rows.
- `j` controls positions within each row.
- `||` means OR; any one true condition prints a star.
- Boundary positions contain stars, while the inside contains spaces.
- The first row is completely filled because of `i == 1`.

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
