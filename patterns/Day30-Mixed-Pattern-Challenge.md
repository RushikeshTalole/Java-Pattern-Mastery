
# Day 30: Mixed Pattern Challenge

## Pattern Output

```text
1        1
12      21
123    321
1234  4321
1234554321
1234  4321
123    321
12      21
1        1
```

## Java Program

```java
public class PatternDay30 {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Left side: Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle: Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side: Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Left side: Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Middle: Spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right side: Decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
```

## Introduction

In this pattern, we combine three different concepts: increasing numbers, decreasing numbers, and middle spaces.

The pattern looks like a butterfly because both sides expand towards the middle row and then shrink again.

We divide the program into two parts:

1. Upper half – numbers increase from 1 to 5.
2. Lower half – numbers decrease from 4 to 1.

## Logic Explanation

### 1. Outer Loop – Upper Half

```java
for (int i = 1; i <= n; i++)
```

This loop controls the rows of the upper half.

- First row: `i = 1`
- Second row: `i = 2`
- Third row: `i = 3`
- Fourth row: `i = 4`
- Fifth row: `i = 5`

As `i` increases, the number of digits on both sides increases.

### 2. Printing Left-Side Numbers

```java
for (int j = 1; j <= i; j++) {
    System.out.print(j);
}
```

This loop prints numbers in increasing order, starting from 1.

For example, when `i = 4`, the output is:

```text
1234
```

The number of printed digits is equal to the current row number.

### 3. Printing Middle Spaces

```java
for (int j = 1; j <= 2 * (n - i); j++) {
    System.out.print(" ");
}
```

This loop creates the gap between the left and right sides.

We use the formula:

`2 * (n - i)`

Why multiply by 2?

Because the spaces decrease by two in every next row.

For `n = 5`:

| Row (`i`) | Calculation | Spaces |
|---:|---|---:|
| 1 | `2 * (5 - 1)` | 8 |
| 2 | `2 * (5 - 2)` | 6 |
| 3 | `2 * (5 - 3)` | 4 |
| 4 | `2 * (5 - 4)` | 2 |
| 5 | `2 * (5 - 5)` | 0 |

### 4. Printing Right-Side Numbers

```java
for (int j = i; j >= 1; j--) {
    System.out.print(j);
}
```

This loop prints numbers in decreasing order.

For example, when `i = 4`:

```text
4321
```

Notice that this loop starts from `i`, not `i - 1`, because the right side needs to print the complete reverse sequence.

### 5. Lower Half

```java
for (int i = n - 1; i >= 1; i--)
```

After completing the upper half, we print the lower half.

We start from `n - 1` because the middle row has already been printed in the upper half.

For `n = 5`, the lower half runs through:

`i = 4, 3, 2, 1`

The same three inner loops are used again to print the pattern.

## Dry Run (n = 5)

### Upper Half

| Row (`i`) | Left Numbers | Middle Spaces | Right Numbers | Output |
|---:|---|---:|---|---|
| 1 | `1` | 8 | `1` | `1        1` |
| 2 | `12` | 6 | `21` | `12      21` |
| 3 | `123` | 4 | `321` | `123    321` |
| 4 | `1234` | 2 | `4321` | `1234  4321` |
| 5 | `12345` | 0 | `54321` | `1234554321` |

### Lower Half

| Row (`i`) | Left Numbers | Middle Spaces | Right Numbers | Output |
|---:|---|---:|---|---|
| 4 | `1234` | 2 | `4321` | `1234  4321` |
| 3 | `123` | 4 | `321` | `123    321` |
| 2 | `12` | 6 | `21` | `12      21` |
| 1 | `1` | 8 | `1` | `1        1` |

## Important Observations

- The outer loop controls the rows.
- The first inner loop prints increasing numbers.
- The second inner loop prints middle spaces.
- The third inner loop prints decreasing numbers.
- The middle spaces decrease by 2 in every row.
- The upper half contains `n` rows.
- The lower half contains `n - 1` rows.
- The middle row is printed only once.

## Formula Summary

| Part | Formula |
|---|---|
| Left numbers | `j = 1` to `i` |
| Middle spaces | `2 * (n - i)` |
| Right numbers | `j = i` down to `1` |
| Upper half | `i = 1` to `n` |
| Lower half | `i = n - 1` down to `1` |
| Total rows | `2 * n - 1` |

## Complexity Analysis

**Time Complexity: O(n²)**

The program uses nested loops to print numbers and spaces for every row.

**Space Complexity: O(1)**

Only a few variables are used. No extra array or collection is required.

## What I Learned

After completing this pattern, I practiced:

1. Using multiple inner loops in one outer loop.
2. Printing numbers in increasing and decreasing order.
3. Controlling spaces using mathematical formulas.
4. Dividing a pattern into upper and lower halves.
5. Avoiding duplicate middle rows.

This pattern combines concepts learned in previous days and helps improve nested-loop logic.
