# Day 02 - Right-Angled Triangle

## Pattern Output

```text
*
* *
* * *
* * * *
* * * * *
```

## Java Code

```java
public class PatternDay02 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

## Logic

* Outer loop controls rows.
* Inner loop controls columns/stars.
* `j <= i` means the number of stars depends on the current row.
* Row 1 → 1 star
* Row 2 → 2 stars
* Row 3 → 3 stars
* Row 4 → 4 stars
* Row 5 → 5 stars

## Dry Run

### Row 1

`i = 1`

* `j = 1` → `1 <= 1` → true → print `*`
* `j = 2` → `2 <= 1` → false → inner loop stops
* `println()` → moves to next line

Output:

```text
*
```

### Row 2

`i = 2`

* `j = 1` → `1 <= 2` → true → print `*`
* `j = 2` → `2 <= 2` → true → print `*`
* `j = 3` → `3 <= 2` → false → inner loop stops
* `println()` → moves to next line

Output:

```text
* *
```

### Row 3

`i = 3`

* `j = 1` → `1 <= 3` → true → print `*`
* `j = 2` → `2 <= 3` → true → print `*`
* `j = 3` → `3 <= 3` → true → print `*`
* `j = 4` → `4 <= 3` → false → inner loop stops
* `println()` → moves to next line

Output:

```text
* * *
```

### Row 4

`i = 4`

* `j = 1` → print `*`
* `j = 2` → print `*`
* `j = 3` → print `*`
* `j = 4` → print `*`
* `j = 5` → `5 <= 4` → false
* `println()` → moves to next line

Output:

```text
* * * *
```

### Row 5

`i = 5`

* `j = 1` → print `*`
* `j = 2` → print `*`
* `j = 3` → print `*`
* `j = 4` → print `*`
* `j = 5` → print `*`
* `j = 6` → `6 <= 5` → false
* `println()` → moves to next line

Output:

```text
* * * * *
```

## Important Interview Point

### Why `j <= i`?

`j <= i` is used because the number of stars should be equal to the current row number.

**Interview Answer:**

"The outer loop controls the rows, and the inner loop prints stars according to the current row number, so we use `j <= i`."

## Dry Run Summary

```text
i = 1 → j = 1              → 1 star
i = 2 → j = 1, 2           → 2 stars
i = 3 → j = 1, 2, 3        → 3 stars
i = 4 → j = 1, 2, 3, 4     → 4 stars
i = 5 → j = 1, 2, 3, 4, 5  → 5 stars
```

## What I Learned

* Nested loops
* Outer loop for rows
* Inner loop for columns
* `j <= i` logic
* Difference between `print()` and `println()`
* Right-angled triangle pattern
* How the number of stars increases with each row
