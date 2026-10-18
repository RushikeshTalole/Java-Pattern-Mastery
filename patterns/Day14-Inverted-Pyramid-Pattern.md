# Day 14 - Inverted Pyramid Pattern

## Java Code

```java
public class PatternDay14 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## Output

```text
*********
 *******
  *****
   ***
    *
```

## Logic

- Outer loop controls rows.
- First inner loop prints spaces.
- Second inner loop prints stars.
- Spaces increase by one in every row.
- Stars decrease by two in every row.

## Dry Run

| Row | Spaces | Stars |
|---|---:|---:|
| 1 | 0 | 9 |
| 2 | 1 | 7 |
| 3 | 2 | 5 |
| 4 | 3 | 3 |
| 5 | 4 | 1 |

## What I Learned

- Nested loops
- Inverted pyramid logic
- Increasing spaces
- Decreasing stars
- Formula: `2 * (n - i) + 1`