# Day 05 - Same Number Triangle

## Pattern Output

```text
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

## Java Code

```java
public class PatternDay05 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
```

## Logic

* Outer loop controls the rows.
* Inner loop controls how many numbers are printed.
* `i` is the row number.
* We print `i`, so the same number is printed in one row.
* `j <= i` means the number is printed according to the row number.

Example:

```text
i = 1 → 1
i = 2 → 2 2
i = 3 → 3 3 3
i = 4 → 4 4 4 4
i = 5 → 5 5 5 5 5
```

## Dry Run

### Row 1

```text
i = 1
j = 1 → print 1
j = 2 → condition false
```

Output:

```text
1
```

### Row 2

```text
i = 2
j = 1 → print 2
j = 2 → print 2
j = 3 → condition false
```

Output:

```text
2 2
```

### Row 3

```text
i = 3
j = 1 → print 3
j = 2 → print 3
j = 3 → print 3
j = 4 → condition false
```

Output:

```text
3 3 3
```

### Row 4

```text
i = 4
j = 1 → print 4
j = 2 → print 4
j = 3 → print 4
j = 4 → print 4
j = 5 → condition false
```

Output:

```text
4 4 4 4
```

### Row 5

```text
i = 5
j = 1 → print 5
j = 2 → print 5
j = 3 → print 5
j = 4 → print 5
j = 5 → print 5
j = 6 → condition false
```

Output:

```text
5 5 5 5 5
```

## Important Interview Point

**`i` decides the number to print, and `j` decides how many times to print it.**

```text
i → Row / Number
j → Repetition
```

## Day 04 vs Day 05

**Day 04:**

```java
System.out.print(j + " ");
```

Output:

```text
1
1 2
1 2 3
```

**Day 05:**

```java
System.out.print(i + " ");
```

Output:

```text
1
2 2
3 3 3
```

## What I Learned

* Outer loop controls rows.
* Inner loop controls repetitions.
* `i` represents the current row.
* `j <= i` controls the number of times to print.
* Printing `i` gives the same number in each row.
