# Day 16 - Inverted Number Pyramid

## Problem

Print an inverted number pyramid using nested loops.

## Java Code

```java
public class PatternDay16 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
```

## Output

```text
123456789
 1234567
  12345
   123
    1
```

## Logic

The pattern contains three loops:

1. The outer loop controls the rows.
2. The first inner loop prints spaces.
3. The second inner loop prints numbers.

### Space Formula

```java
j < i
```

The number of spaces increases by one in every row.

### Number Formula

```java
2 * (n - i) + 1
```

This formula decreases the number of printed digits by two in every row.

For `n = 5`:

| Row (`i`) | Spaces | Number of digits |
|---|---:|---:|
| 1 | 0 | 9 |
| 2 | 1 | 7 |
| 3 | 2 | 5 |
| 4 | 3 | 3 |
| 5 | 4 | 1 |

## Dry Run

### Row 1: `i = 1`

Spaces: `0`

Number limit:

`2 * (5 - 1) + 1 = 9`

Printed numbers: `123456789`

### Row 2: `i = 2`

Spaces: `1`

Number limit:

`2 * (5 - 2) + 1 = 7`

Printed numbers: `1234567`

### Row 3: `i = 3`

Spaces: `2`

Number limit:

`2 * (5 - 3) + 1 = 5`

Printed numbers: `12345`

### Row 4: `i = 4`

Spaces: `3`

Number limit:

`2 * (5 - 4) + 1 = 3`

Printed numbers: `123`

### Row 5: `i = 5`

Spaces: `4`

Number limit:

`2 * (5 - 5) + 1 = 1`

Printed number: `1`

## Time Complexity

**O(n²)** — The nested loops perform a quadratic amount of work.

## Space Complexity

**O(1)** — Only a fixed number of variables are used.

## Interview Questions

**1. What is the role of the outer loop?**

It controls the number of rows.

**2. Why do we use `j < i` for spaces?**

To increase the leading spaces by one in each row.

**3. Why do we use `2 * (n - i) + 1`?**

To print an odd number of digits that decreases by two in each successive row.

**4. What happens if `n = 4`?**

The number of digits in each row will be `7, 5, 3, 1`.

## Key Learning

This pattern strengthens understanding of nested loops, leading spaces, and formulas for decreasing odd-number sequences.