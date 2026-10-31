# Day 25 - Hollow Diamond

## Java Code

```java
public class PatternDay25 {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print boundary stars and inside spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print boundary stars and inside spaces
            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1) {
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
*       *
 *     *
  *   *
   * *
    *
```

## Logic

The Hollow Diamond is divided into two parts:

1. Upper half
2. Lower half

### Upper Half

- The outer loop runs from `i = 1` to `i = n`.
- Leading spaces decrease in each row.
- The number of positions increases in each row.
- Only the first and last positions print stars.

### Lower Half

- The outer loop runs from `i = n - 1` down to `1`.
- It starts from `n - 1` so the middle row is not printed twice.
- Leading spaces increase in each row.
- The number of positions decreases in each row.
- Only the first and last positions print stars.

## Important Formulas

### Leading Spaces

```java
n - i
```

### Positions in Each Row

```java
2 * i - 1
```

### Boundary Condition

```java
j == 1 || j == 2 * i - 1
```

- `j == 1` prints the left boundary star.
- `j == 2 * i - 1` prints the right boundary star.
- Otherwise, a space is printed.

## Dry Run

### Upper Half

| Row (`i`) | Leading Spaces | Positions | Output |
|---|---:|---:|---|
| 1 | 4 | 1 | `*` |
| 2 | 3 | 3 | `* *` |
| 3 | 2 | 5 | `*   *` |
| 4 | 1 | 7 | `*     *` |
| 5 | 0 | 9 | `*       *` |

### Lower Half

| Row (`i`) | Leading Spaces | Positions | Output |
|---|---:|---:|---|
| 4 | 1 | 7 | `*     *` |
| 3 | 2 | 5 | `*   *` |
| 2 | 3 | 3 | `* *` |
| 1 | 4 | 1 | `*` |

## Step-by-Step Example

For `n = 5`:

**Upper row 3 (`i = 3`)**

- Spaces = `5 - 3 = 2`
- Positions = `2 * 3 - 1 = 5`
- `j = 1` prints `*`
- `j = 2, 3, 4` print spaces
- `j = 5` prints `*`

Output:

```text
  *   *
```

**Lower row 3 (`i = 3`)**

- Spaces = `5 - 3 = 2`
- Positions = `2 * 3 - 1 = 5`
- First and last positions print stars.
- Middle positions print spaces.

Output:

```text
  *   *
```

## Important Points

- `i` controls the rows.
- `j` controls positions within each row.
- `n - i` controls alignment.
- `2 * i - 1` creates odd position counts: `1, 3, 5, 7, 9`.
- The middle row is printed only once.
- Boundary stars form the hollow diamond shape.

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
