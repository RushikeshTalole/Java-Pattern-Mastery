# Day 09 - Alphabet Triangle

## Pattern Output

```text
A
A B
A B C
A B C D
A B C D E
```

## Java Code

```java
public class PatternDay09 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }

            System.out.println();
        }
    }
}
```

## Logic

- `n = 5` means the pattern has 5 rows.
- The outer loop (`i`) controls rows.
- The inner loop (`j`) controls the number of alphabets printed.
- `(char) ('A' + j - 1)` generates the alphabet.
- `j <= i` increases the number of alphabets in each row.
- `System.out.println();` moves to the next line.

## Dry Run

### Row 1

`i = 1`

```text
j = 1 -> 'A' + 1 - 1 -> A
j = 2 -> Condition false -> Stop
Output: A
```

### Row 2

`i = 2`

```text
j = 1 -> A
j = 2 -> B
j = 3 -> Condition false -> Stop
Output: A B
```

### Row 3

`i = 3`

```text
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> Condition false -> Stop
Output: A B C
```

### Row 4

`i = 4`

```text
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> D
j = 5 -> Condition false -> Stop
Output: A B C D
```

### Row 5

`i = 5`

```text
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> D
j = 5 -> E
j = 6 -> Condition false -> Stop
Output: A B C D E
```

## Important Interview Points

- The outer loop controls rows.
- The inner loop controls columns.
- Type casting using `(char)` converts a numeric character value into a character.
- `'A' + j - 1` generates alphabets in sequence.

## What I Learned

- Nested loops
- Difference between row and column variables
- Character type casting
- Generating alphabets using character arithmetic
- Printing an alphabet triangle
