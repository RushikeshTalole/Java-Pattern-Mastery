# Day 03 - Inverted Right-Angled Triangle

## Pattern Output

```text
* * * * *
* * * *
* * *
* *
*
```

## Java Code

```java
public class PatternDay03 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

## Logic

* Outer loop controls rows.
* Inner loop controls stars.
* `j` starts from the current value of `i`.
* Inner loop runs while `j <= n`.
* Therefore, the number of stars decreases by 1 in every row.

### Star Count

```text
Row 1 → 5 stars
Row 2 → 4 stars
Row 3 → 3 stars
Row 4 → 2 stars
Row 5 → 1 star
```

## Dry Run

### Row 1

`i = 1`

* `j = 1` → `1 <= 5` → true → print `*`
* `j = 2` → `2 <= 5` → true → print `*`
* `j = 3` → `3 <= 5` → true → print `*`
* `j = 4` → `4 <= 5` → true → print `*`
* `j = 5` → `5 <= 5` → true → print `*`
* `j = 6` → `6 <= 5` → false → loop stops
* `println()` → next line

Output:

```text
* * * * *
```

### Row 2

`i = 2`

* `j = 2` → `2 <= 5` → true → print `*`
* `j = 3` → `3 <= 5` → true → print `*`
* `j = 4` → `4 <= 5` → true → print `*`
* `j = 5` → `5 <= 5` → true → print `*`
* `j = 6` → `6 <= 5` → false → loop stops
* `println()` → next line

Output:

```text
* * * *
```

### Row 3

`i = 3`

* `j = 3` → print `*`
* `j = 4` → print `*`
* `j = 5` → print `*`
* `j = 6` → `6 <= 5` → false
* `println()` → next line

Output:

```text
* * *
```

### Row 4

`i = 4`

* `j = 4` → print `*`
* `j = 5` → print `*`
* `j = 6` → `6 <= 5` → false
* `println()` → next line

Output:

```text
* *
```

### Row 5

`i = 5`

* `j = 5` → print `*`
* `j = 6` → `6 <= 5` → false
* `println()` → next line

Output:

```text
*
```

## Dry Run Summary

```text
i = 1 → j = 1,2,3,4,5 → 5 stars
i = 2 → j = 2,3,4,5   → 4 stars
i = 3 → j = 3,4,5     → 3 stars
i = 4 → j = 4,5       → 2 stars
i = 5 → j = 5         → 1 star
```

## Important Interview Point

### Why `j = i`?

`j` starts from the current row number because we want the number of stars to decrease in every row.

### Interview Answer

"The outer loop controls the rows. The inner loop starts from `i` and runs up to `n`, so the number of stars decreases by one in each row."

## Day 02 vs Day 03

### Day 02

```java
for (int j = 1; j <= i; j++)
```

Stars increase:

```text
1
2
3
4
5
```

### Day 03

```java
for (int j = i; j <= n; j++)
```

Stars decrease:

```text
5
4
3
2
1
```

## What I Learned

* Nested loops
* Outer loop controls rows
* Inner loop controls stars
* How `j = i` changes the pattern
* How `j <= n` controls the ending condition
* Increasing vs decreasing pattern logic
* Difference between Day 02 and Day 03
