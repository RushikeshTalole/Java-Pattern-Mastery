# Day 24 - Diamond Pattern

## Java Code

```java
public class PatternDay24 {

    public static void main(String[] args) {

        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
```

## Output

```text
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

## Logic

The Diamond Pattern is divided into two parts:

1. Upper Half
2. Lower Half

### 1. Upper Half

```java
for (int i = 1; i <= n; i++)
```

- The outer loop controls the rows.
- It runs from 1 to 5.
- Spaces decrease in every row.
- Stars increase in every row.

**Space formula:**

`n - i`

**Star formula:**

`2 * i - 1`

### 2. Lower Half

```java
for (int i = n - 1; i >= 1; i--)
```

- The lower loop starts from `n - 1`.
- It starts from 4 because the middle row is already printed by the upper half.
- Spaces increase in every row.
- Stars decrease in every row.

**Space formula:**

`n - i`

**Star formula:**

`2 * i - 1`

## Understanding the Formulas

### Upper Half

| Row (`i`) | Spaces (`n - i`) | Stars (`2 * i - 1`) |
|---|---:|---:|
| 1 | 4 | 1 |
| 2 | 3 | 3 |
| 3 | 2 | 5 |
| 4 | 1 | 7 |
| 5 | 0 | 9 |

### Lower Half

| Row (`i`) | Spaces (`n - i`) | Stars (`2 * i - 1`) |
|---|---:|---:|
| 4 | 1 | 7 |
| 3 | 2 | 5 |
| 2 | 3 | 3 |
| 1 | 4 | 1 |

## Dry Run

### Upper Half

**Row 1: `i = 1`**

- Spaces = `5 - 1 = 4`
- Stars = `2 * 1 - 1 = 1`

Output: `    *`

**Row 2: `i = 2`**

- Spaces = `5 - 2 = 3`
- Stars = `2 * 2 - 1 = 3`

Output: `   ***`

**Row 3: `i = 3`**

- Spaces = `5 - 3 = 2`
- Stars = `2 * 3 - 1 = 5`

Output: `  *****`

**Row 4: `i = 4`**

- Spaces = `5 - 4 = 1`
- Stars = `2 * 4 - 1 = 7`

Output: ` *******`

**Row 5: `i = 5`**

- Spaces = `5 - 5 = 0`
- Stars = `2 * 5 - 1 = 9`

Output: `*********`

### Lower Half

**Row 1: `i = 4`**

- Spaces = 1
- Stars = 7

Output: ` *******`

**Row 2: `i = 3`**

- Spaces = 2
- Stars = 5

Output: `  *****`

**Row 3: `i = 2`**

- Spaces = 3
- Stars = 3

Output: `   ***`

**Row 4: `i = 1`**

- Spaces = 4
- Stars = 1

Output: `    *`

## Important Points

- `i` controls the rows.
- `j` controls spaces and stars.
- Upper half creates the top triangle.
- Lower half creates the bottom triangle.
- `n - 1` prevents the middle row from repeating.
- `2 * i - 1` generates odd numbers of stars: 1, 3, 5, 7, 9.

## Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)
