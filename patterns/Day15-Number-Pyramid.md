# Day 15 - Number Pyramid

## Java Code

```java
public class PatternDay15 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
```

## Output

```text
    1
   123
  12345
 1234567
123456789
```

## Logic

- Outer loop controls rows.
- First inner loop prints spaces.
- Second inner loop prints numbers from 1 onward.
- Spaces decrease in every row.
- Numbers increase in every row.

## Dry Run

| Row | Spaces | Numbers Printed |
|---|---:|---|
| 1 | 4 | `1` |
| 2 | 3 | `123` |
| 3 | 2 | `12345` |
| 4 | 1 | `1234567` |
| 5 | 0 | `123456789` |

## What I Learned

- Nested loops
- Number patterns
- Pyramid alignment
- Formula: `2 * i - 1`