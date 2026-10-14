# Day 11 - Right-Aligned Triangle

## Java Code

```java
public class PatternDay11 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
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
    * * *
  * * * *
* * * * *
```

## Logic

- Outer loop `i` controls the rows.
- First inner loop prints spaces using `n - i`.
- Second inner loop prints stars using `i`.
- `System.out.println()` moves to the next line.

## Dry Run

| Row (`i`) | Spaces (`n - i`) | Stars (`i`) |
|---|---:|---:|
| 1 | 4 | 1 |
| 2 | 3 | 2 |
| 3 | 2 | 3 |
| 4 | 1 | 4 |
| 5 | 0 | 5 |

## What I Learned

- Nested loops
- Printing spaces and stars
- Right-aligned pattern logic
- Using `n - i` to decrease spaces