# Day 04 - Number Triangle

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
public class PatternDay04 {

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

* Outer loop controls rows.
* Inner loop controls columns/numbers.
* `j <= i` means the number of values depends on the current row.
* We print `j` instead of `*`.
* Each row starts from `1`.
* Each next row contains one extra number.

### Number Count

```text
Row 1 → 1
Row 2 → 1 2
Row 3 → 1 2 3
Row 4 → 1 2 3 4
Row 5 → 1 2 3 4 5
```

## Dry Run

### Row 1

`i = 1`

* `j = 1` → `1 <= 1` → true → print `1`
* `j = 2` → `2 <= 1` → false → inner loop stops
* `println()` → next line

Output:

```text
1
```

### Row 2

`i = 2`

* `j = 1` → `1 <= 2` → true → print `1`
* `j = 2` → `2 <= 2` → true → print `2`
* `j = 3` → `3 <= 2` → false → inner loop stops
* `println()` → next line

Output:

```text
1 2
```

### Row 3

`i = 3`

* `j = 1` → print `1`
* `j = 2` → print `2`
* `j = 3` → print `3`
* `j = 4` → `4 <= 3` → false
* `println()` → next line

Output:

```text
1 2 3
```

### Row 4

`i = 4`

* `j = 1` → print `1`
* `j = 2` → print `2`
* `j = 3` → print `3`
* `j = 4` → print `4`
* `j = 5` → `5 <= 4` → false
* `println()` → next line

Output:

```text
1 2 3 4
```

### Row 5

`i = 5`

* `j = 1` → print `1`
* `j = 2` → print `2`
* `j = 3` → print `3`
* `j = 4` → print `4`
* `j = 5` → print `5`
* `j = 6` → `6 <= 5` → false
* `println()` → next line

Output:

```text
1 2 3 4 5
```

## Dry Run Summary

```text
i = 1 → j = 1              → 1
i = 2 → j = 1, 2           → 1 2
i = 3 → j = 1, 2, 3        → 1 2 3
i = 4 → j = 1, 2, 3, 4     → 1 2 3 4
i = 5 → j = 1, 2, 3, 4, 5  → 1 2 3 4 5
```

## Important Interview Points

### Q1. What does `i` represent?

`i` represents the current row.

### Q2. What does `j` represent?

`j` represents the current number/column being printed.

### Q3. Why are we printing `j`?

Because we want numbers instead of stars.

```java
System.out.print(j + " ");
```

### Q4. Why `j <= i`?

Because every row should contain numbers equal to its row number.

**Interview Answer:**

"The outer loop controls the rows, and the inner loop runs according to the current row number, so we use `j <= i`."

## Day 02 vs Day 04

### Day 02

```java
System.out.print("* ");
```

Output contains stars.

### Day 04

```java
System.out.print(j + " ");
```

Output contains numbers.

The loop structure is almost the same; only the printed value changes.

## What I Learned

* Nested loops
* Outer loop for rows
* Inner loop for columns/numbers
* `j <= i` logic
* Printing variable `j`
* Difference between star and number patterns
* How the number of elements increases row by row
