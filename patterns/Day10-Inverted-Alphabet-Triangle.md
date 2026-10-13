# Day 10 - Inverted Alphabet Triangle

## Pattern Output

```text
A B C D E
A B C D
A B C
A B
A
```

## Java Code

```java
public class PatternDay10 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
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
- `(char) ('A' + j - 1)` generates alphabets.
- `n - i + 1` decreases the number of alphabets in every row.
- `System.out.println();` moves to the next line.

## Dry Run

### Row 1

`i = 1`

```text
Limit = 5 - 1 + 1 = 5
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> D
j = 5 -> E
j = 6 -> Condition false, stop

Output: A B C D E
```

### Row 2

`i = 2`

```text
Limit = 5 - 2 + 1 = 4
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> D
j = 5 -> Condition false, stop

Output: A B C D
```

### Row 3

`i = 3`

```text
Limit = 5 - 3 + 1 = 3
j = 1 -> A
j = 2 -> B
j = 3 -> C
j = 4 -> Condition false, stop

Output: A B C
```

### Row 4

`i = 4`

```text
Limit = 5 - 4 + 1 = 2
j = 1 -> A
j = 2 -> B
j = 3 -> Condition false, stop

Output: A B
```

### Row 5

`i = 5`

```text
Limit = 5 - 5 + 1 = 1
j = 1 -> A
j = 2 -> Condition false, stop

Output: A
```

## Important Interview Points

- The outer loop controls rows.
- The inner loop controls columns and repetitions.
- `(char)` converts a numeric character value into a character.
- `'A' + j - 1` generates alphabets in sequence.
- `n - i + 1` decreases the number of alphabets in each row.

## What I Learned

- Nested loops
- Row and column variables
- Character type casting
- Alphabet generation using character arithmetic
- How to print an inverted alphabet triangle
