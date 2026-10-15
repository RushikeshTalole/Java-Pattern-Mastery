# Day 12 - Inverted Right-Aligned Triangle

## Java Code

```java
public class PatternDay12 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

## Output

```text
* * * * *
  * * * *
    * * *
      * *
        *
```

## Logic

- Outer loop controls rows.
- First inner loop prints spaces.
- Second inner loop prints stars.
- Spaces increase and stars decrease in every row.

## Dry Run

| Row (`i`) | Spaces | Stars |
|---|---:|---:|
| 1 | 0 | 5 |
| 2 | 1 | 4 |
| 3 | 2 | 3 |
| 4 | 3 | 2 |
| 5 | 4 | 1 |

## What I Learned

- Nested loops
- Inverted right-aligned patterns
- Increasing spaces
- Decreasing stars