
# Day 28: Palindrome Number Pyramid

## Introduction

In this pattern, numbers are printed in increasing order and then decreasing order. Each row looks the same when read from left to right or right to left. This is why it is called a **Palindrome Number Pyramid**.

## Pattern Output

```text
    1
   121
  12321
 1234321
123454321
```

## Java Program

```java
public class PatternDay28 {

    public static void main(String[] args) {

        int n = 5;

        // Outer loop controls the rows
        for (int i = 1; i <= n; i++) {

            // Print spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order
            // Start from i - 1 to avoid repeating the middle number
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next row
            System.out.println();
        }
    }
}
```

## Explanation of the Logic

First, we declare `n = 5`, which means the pyramid will contain 5 rows.

The outer loop uses `i` to represent the current row. For every row, we print spaces first, then numbers in increasing order, and finally numbers in decreasing order.

### 1. Printing Spaces

```java
for (int j = 1; j <= n - i; j++) {
    System.out.print(" ");
}
```

Spaces are used to align the numbers in the shape of a pyramid.

- Row 1 prints 4 spaces.
- Row 2 prints 3 spaces.
- Row 3 prints 2 spaces.
- Row 4 prints 1 space.
- Row 5 prints 0 spaces.

The formula is:

`n - i`

### 2. Printing Increasing Numbers

```java
for (int j = 1; j <= i; j++) {
    System.out.print(j);
}
```

This loop prints numbers from `1` up to the current row number.

For example, when `i = 4`, it prints:

`1234`

### 3. Printing Decreasing Numbers

```java
for (int j = i - 1; j >= 1; j--) {
    System.out.print(j);
}
```

This loop prints numbers in reverse order.

When `i = 4`, it prints:

`321`

We start from `i - 1` because the number `4` is already printed by the increasing loop. Starting from `i` would print the middle number twice.

## Dry Run (n = 5)

### Row 1: `i = 1`

- Spaces: `5 - 1 = 4`
- Increasing numbers: `1`
- Decreasing numbers: none

Output:

```text
    1
```

### Row 2: `i = 2`

- Spaces: `5 - 2 = 3`
- Increasing numbers: `12`
- Decreasing numbers: `1`

Output:

```text
   121
```

### Row 3: `i = 3`

- Spaces: `5 - 3 = 2`
- Increasing numbers: `123`
- Decreasing numbers: `21`

Output:

```text
  12321
```

### Row 4: `i = 4`

- Spaces: `5 - 4 = 1`
- Increasing numbers: `1234`
- Decreasing numbers: `321`

Output:

```text
 1234321
```

### Row 5: `i = 5`

- Spaces: `5 - 5 = 0`
- Increasing numbers: `12345`
- Decreasing numbers: `4321`

Output:

```text
123454321
```

## Dry Run Table

| Row (`i`) | Spaces (`n-i`) | Increasing | Decreasing | Final Row |
|---:|---:|---|---|---|
| 1 | 4 | `1` | — | `    1` |
| 2 | 3 | `12` | `1` | `   121` |
| 3 | 2 | `123` | `21` | `  12321` |
| 4 | 1 | `1234` | `321` | ` 1234321` |
| 5 | 0 | `12345` | `4321` | `123454321` |

## Important Observations

- The outer loop runs from `1` to `n`.
- Spaces decrease by one in every row.
- The increasing part contains `i` numbers.
- The decreasing part contains `i - 1` numbers.
- Total numbers in each row are `2 * i - 1`.
- The middle number is printed only once.
- `System.out.println()` moves the cursor to the next line after each row.

## Complexity Analysis

**Time Complexity: `O(n²)`**

The program uses nested loops to print spaces and numbers for each row.

**Space Complexity: `O(1)`**

The program uses only a few variables and does not require extra memory that grows with `n`.
