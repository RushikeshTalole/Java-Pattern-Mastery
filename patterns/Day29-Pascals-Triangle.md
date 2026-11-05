
# Day 29: Pascal's Triangle

## Pattern Output

```text
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
```

## Java Program

```java
public class PatternDay29 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int num = 1;

            // Print numbers in the current row
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");

                // Calculate the next number
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
```

## Introduction

Pascal's Triangle is a number pattern in which every row starts and ends with `1`. The numbers between them are formed by adding two numbers from the previous row.

For example:

```text
       1
      1 1
     1 2 1
    1 3 3 1
   1 4 6 4 1
```

The number `2` is formed by adding `1 + 1` from the previous row. Similarly, the two `3`s are formed by adding `1 + 2` and `2 + 1`.

## Logic Explanation

### 1. Outer Loop

```java
for (int i = 0; i < n; i++)
```

The outer loop controls the rows.

We start from `i = 0` because the first row contains only one number: `1`.

For `n = 5`, the row values are:

`i = 0, 1, 2, 3, 4`

### 2. Printing Spaces

```java
for (int j = 0; j < n - i - 1; j++) {
    System.out.print(" ");
}
```

This loop prints spaces before the numbers to make the triangle shape.

As the row number increases, the number of spaces decreases.

| Row (`i`) | Spaces (`n - i - 1`) |
|---:|---:|
| 0 | 4 |
| 1 | 3 |
| 2 | 2 |
| 3 | 1 |
| 4 | 0 |

### 3. Starting Number

```java
int num = 1;
```

Every row starts with `1`, so we reset `num` to `1` at the beginning of each row.

### 4. Printing and Calculating Numbers

```java
for (int j = 0; j <= i; j++) {
    System.out.print(num + " ");
    num = num * (i - j) / (j + 1);
}
```

The inner loop prints the numbers in the current row.

The formula calculates the next number without using another array:

```java
num = num * (i - j) / (j + 1);
```

Here:

- `i` represents the current row.
- `j` represents the current position in that row.
- `num` stores the current Pascal number.

## Dry Run (n = 5)

### Row 1: `i = 0`

- `num = 1`
- Only one number is printed.

Output:

```text
1
```

### Row 2: `i = 1`

| `j` | `num` printed | Next number calculation |
|---:|---:|---|
| 0 | 1 | `1 * (1 - 0) / (0 + 1) = 1` |
| 1 | 1 | Last number |

Output:

```text
1 1
```

### Row 3: `i = 2`

| `j` | `num` printed | Next number calculation |
|---:|---:|---|
| 0 | 1 | `1 * 2 / 1 = 2` |
| 1 | 2 | `2 * 1 / 2 = 1` |
| 2 | 1 | Last number |

Output:

```text
1 2 1
```

### Row 4: `i = 3`

| `j` | `num` printed | Next number calculation |
|---:|---:|---|
| 0 | 1 | `1 * 3 / 1 = 3` |
| 1 | 3 | `3 * 2 / 2 = 3` |
| 2 | 3 | `3 * 1 / 3 = 1` |
| 3 | 1 | Last number |

Output:

```text
1 3 3 1
```

### Row 5: `i = 4`

| `j` | `num` printed | Next number calculation |
|---:|---:|---|
| 0 | 1 | `1 * 4 / 1 = 4` |
| 1 | 4 | `4 * 3 / 2 = 6` |
| 2 | 6 | `6 * 2 / 3 = 4` |
| 3 | 4 | `4 * 1 / 4 = 1` |
| 4 | 1 | Last number |

Output:

```text
1 4 6 4 1
```

## Important Observations

- The first and last number of every row is `1`.
- Each row contains one more number than the previous row.
- The values are symmetrical.
- The middle values are formed by adding adjacent numbers from the previous row.
- The formula calculates each next value using the previous value in the same row.
- For `n = 5`, the triangle contains 5 rows.

## Complexity Analysis

**Time Complexity: `O(n²)`**

The nested loops print the numbers and spaces for each row.

**Space Complexity: `O(1)`**

Only a few variables are used; no additional array or collection is required.
