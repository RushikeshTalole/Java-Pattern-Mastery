# Day 07 - Row Number Pattern

## Pattern Output

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

## Java Code

```java
public class PatternDay07 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
```

## Logic

- The outer loop controls the rows.
- The inner loop controls how many times a number is printed.
- `i` represents the current row number.
- `j` is the inner loop counter.
- `System.out.print(i + " ");` prints the current row number repeatedly.
- `j <= i` increases the number of printed values in each row.

## Dry Run

### Row 1

`i = 1`

```text
j = 1
Print i = 1
Output: 1
```

### Row 2

`i = 2`

```text
j = 1 -> Print 2
j = 2 -> Print 2
Output: 2 2
```

### Row 3

`i = 3`

```text
j = 1 -> Print 3
j = 2 -> Print 3
j = 3 -> Print 3
Output: 3 3 3
```

### Row 4

`i = 4`

```text
j = 1 -> Print 4
j = 2 -> Print 4
j = 3 -> Print 4
j = 4 -> Print 4
Output: 4 4 4 4
```

### Row 5

`i = 5`

```text
j = 1 -> Print 5
j = 2 -> Print 5
j = 3 -> Print 5
j = 4 -> Print 5
j = 5 -> Print 5
Output: 5 5 5 5 5
```

## Important Interview Point

We print `i` to repeat the same number in each row. The condition `j <= i` controls how many times that number is printed.

## Day 04 vs Day 07

- Day 04 prints `j`, so each row contains increasing numbers.
- Day 07 prints `i`, so each row contains the same repeated number.

## What I Learned

- Nested loops
- Outer loop controls rows.
- Inner loop controls repetitions.
- Difference between `i` and `j`.
- How to print the row number repeatedly.
