# Day 01 - Solid Square Pattern

## Pattern Output

```text
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

## Java Code

```java
public class PatternDay01 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

## Logic

* Outer loop controls rows.
* Inner loop controls columns.
* Each row contains 5 stars.
* After each row, `println()` moves to the next line.

## Dry Run

* `i` represents rows.
* `j` represents columns.
* Outer loop runs 5 times.
* Inner loop runs 5 times for every row.
* Total stars printed = 5 × 5 = 25.

## What I Learned

* Nested loops
* Rows and columns
* Difference between `print()` and `println()`
* How to print a solid square pattern
