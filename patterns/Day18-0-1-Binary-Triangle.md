# Day 18 - 0-1 Binary Triangle

## Java Code

```java
public class PatternDay18 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
}
```

## Output

```text
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```

## Logic

- `n = 5` means 5 rows.
- `i` controls the rows.
- `j` controls the columns.
- If `(i + j) % 2 == 0`, print `1`.
- Otherwise, print `0`.

## Dry Run

| Row (`i`) | Output |
|---|---|
| 1 | 1 |
| 2 | 0 1 |
| 3 | 1 0 1 |
| 4 | 0 1 0 1 |
| 5 | 1 0 1 0 1 |

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)