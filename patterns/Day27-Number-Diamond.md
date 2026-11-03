
# Day 27: Number Diamond Pattern

## Pattern Output

```text
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
```

## Java Program

```java
public class PatternDay27 {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
```

## Logic

The Number Diamond Pattern consists of an upper half and a lower half.

- The upper half increases from `i = 1` to `n`.
- The lower half decreases from `i = n - 1` to `1`.
- Each row prints leading spaces, increasing numbers, and decreasing numbers.

## Formulas

| Part | Formula |
|---|---|
| Leading spaces | `n - i` |
| Increasing numbers | `1` to `i` |
| Decreasing numbers | `i - 1` to `1` |
| Upper half | `i = 1` to `n` |
| Lower half | `i = n - 1` to `1` |
| Total rows | `2 * n - 1` |

## Dry Run (n = 5)

### Upper Half

| `i` | Spaces | Increasing | Decreasing | Output |
|---:|---:|---|---|---|
| 1 | 4 | `1` | — | `    1` |
| 2 | 3 | `12` | `1` | `   121` |
| 3 | 2 | `123` | `21` | `  12321` |
| 4 | 1 | `1234` | `321` | ` 1234321` |
| 5 | 0 | `12345` | `4321` | `123454321` |

### Lower Half

| `i` | Spaces | Increasing | Decreasing | Output |
|---:|---:|---|---|---|
| 4 | 1 | `1234` | `321` | ` 1234321` |
| 3 | 2 | `123` | `21` | `  12321` |
| 2 | 3 | `12` | `1` | `   121` |
| 1 | 4 | `1` | — | `    1` |

## Important Points

- The outer loop controls the rows.
- The first inner loop prints leading spaces.
- The second inner loop prints numbers in increasing order.
- The third inner loop prints numbers in decreasing order.
- The lower half starts from `n - 1` to avoid repeating the middle row.

## Complexity

- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`
