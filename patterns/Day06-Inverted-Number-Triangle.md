# Day 06 - Inverted Number Triangle

## Pattern Output

```text
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

## Java Code

```java
public class PatternDay06 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
```

## Logic

* Outer loop controls rows.
* Inner loop prints numbers.
* `i` represents the row number.
* `j` represents the number being printed.
* `n - i + 1` decreases the number of values in each row.

## Dry Run

### Row 1

`i = 1`

```text
j <= 5 - 1 + 1
j <= 5
Output: 1 2 3 4 5
```

### Row 2

`i = 2`

```text
j <= 5 - 2 + 1
j <= 4
Output: 1 2 3 4
```

### Row 3

`i = 3`

```text
j <= 5 - 3 + 1
j <= 3
Output: 1 2 3
```

### Row 4

`i = 4`

```text
j <= 5 - 4 + 1
j <= 2
Output: 1 2
```

### Row 5

`i = 5`

```text
j <= 5 - 5 + 1
j <= 1
Output: 1
```

## Important Interview Point

We use `n - i + 1` to decrease the number of values in every row.

## What I Learned

* Nested loops
* Outer loop controls rows.
* Inner loop prints numbers.
* `j` starts from 1 in every row.
* `n - i + 1` decreases the number of printed values.
* How to print an inverted number triangle.
