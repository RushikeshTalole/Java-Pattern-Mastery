# Day 08 - Column Number Pattern

## Pattern Output

```text
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

## Java Code

```java
public class PatternDay08 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
```

## Logic

- `n = 5` means the pattern has 5 rows.
- The outer loop (`i`) controls rows.
- The inner loop (`j`) controls columns.
- `System.out.print(j + " ");` prints the current column number.
- `j <= i` means each row prints one more number than the previous row.
- `System.out.println();` moves to the next line.

## Dry Run

### Row 1

`i = 1`

```text
j = 1 -> Condition true -> Print 1
j = 2 -> Condition false -> Stop
Output: 1
```

### Row 2

`i = 2`

```text
j = 1 -> Print 1
j = 2 -> Print 2
j = 3 -> Condition false -> Stop
Output: 1 2
```

### Row 3

`i = 3`

```text
j = 1 -> Print 1
j = 2 -> Print 2
j = 3 -> Print 3
j = 4 -> Condition false -> Stop
Output: 1 2 3
```

### Row 4

`i = 4`

```text
j = 1 -> Print 1
j = 2 -> Print 2
j = 3 -> Print 3
j = 4 -> Print 4
j = 5 -> Condition false -> Stop
Output: 1 2 3 4
```

### Row 5

`i = 5`

```text
j = 1 -> Print 1
j = 2 -> Print 2
j = 3 -> Print 3
j = 4 -> Print 4
j = 5 -> Print 5
j = 6 -> Condition false -> Stop
Output: 1 2 3 4 5
```

## Important Interview Point

The outer loop controls rows, and the inner loop controls columns. We print `j` to display the current column number.

## Day 04 vs Day 08

Both patterns use the same code and logic. Day 04 focuses on the number triangle, while Day 08 focuses on understanding how the column variable `j` controls the printed numbers.

## What I Learned

- Nested loops
- Outer loop controls rows.
- Inner loop controls columns.
- `i` represents the row number.
- `j` represents the column number.
- How to print increasing numbers in each row.
