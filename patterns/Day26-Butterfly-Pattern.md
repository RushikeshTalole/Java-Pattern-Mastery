
# Day 26: Butterfly Pattern

## Java Program

```java
public class PatternDay26 {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half (start from n - 1 to avoid duplicate middle row)
        for (int i = n - 1; i >= 1; i--) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## Output

```text
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

## Logic

The butterfly pattern has two parts:

1. Upper half: stars increase from `1` to `n`.
2. Lower half: stars decrease from `n - 1` to `1`.

Each row contains:

- Left stars
- Middle spaces
- Right stars

### Formulas

| Part | Formula |
|---|---|
| Left stars | `i` |
| Middle spaces | `2 * (n - i)` |
| Right stars | `i` |

## Dry Run (n = 5)

### Upper Half

| `i` | Left stars | Middle spaces | Right stars |
|---:|---:|---:|---:|
| 1 | 1 | 8 | 1 |
| 2 | 2 | 6 | 2 |
| 3 | 3 | 4 | 3 |
| 4 | 4 | 2 | 4 |
| 5 | 5 | 0 | 5 |

### Lower Half

| `i` | Left stars | Middle spaces | Right stars |
|---:|---:|---:|---:|
| 4 | 4 | 2 | 4 |
| 3 | 3 | 4 | 3 |
| 2 | 2 | 6 | 2 |
| 1 | 1 | 8 | 1 |

## Important Points

- The outer loop controls the rows.
- The first inner loop prints the left stars.
- The second inner loop prints the middle spaces.
- The third inner loop prints the right stars.
- The lower half starts at `n - 1` because the middle row is already printed by the upper half.

## Time and Space Complexity

- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`

## Git Commands

```bash
git add README.md patterns/Day26-Butterfly-Pattern.md src/PatternDay26.java
git status
git commit -m "Complete Day 26 Butterfly Pattern"
git push origin main
```
