# Day 13 - Pyramid Pattern

## Java Code

```java
public class PatternDay13 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## Output

```text
    *
   ***
  *****
 *******
*********
```

## Logic

- Outer loop controls rows.
- First inner loop prints spaces.
- Second inner loop prints stars.
- Spaces decrease in every row.
- Stars increase by two in every row.

## Dry Run

| Row | Spaces | Stars |
|---|---:|---:|
| 1 | 4 | 1 |
| 2 | 3 | 3 |
| 3 | 2 | 5 |
| 4 | 1 | 7 |
| 5 | 0 | 9 |

## What I Learned

- Nested loops
- Space and star patterns
- Pyramid alignment
- Formula: `2 * i - 1`