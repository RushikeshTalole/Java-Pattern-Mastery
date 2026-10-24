# Day 19 - Continuous Number Pyramid

## Java Code

```java
public class PatternDay19 {

    public static void main(String[] args) {

        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
```

## Output

```text
        1
      2 3
    4 5 6
  7 8 9 10
11 12 13 14 15
```

## Logic

- `n = 5` means 5 rows.
- The first inner loop prints spaces.
- The second inner loop prints numbers.
- `num++` increases the number after every print.
- Each row prints one more number than the previous row.

## Dry Run

| Row | Numbers |
|---|---|
| 1 | 1 |
| 2 | 2 3 |
| 3 | 4 5 6 |
| 4 | 7 8 9 10 |
| 5 | 11 12 13 14 15 |

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)