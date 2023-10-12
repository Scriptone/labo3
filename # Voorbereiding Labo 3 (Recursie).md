# Voorbereiding Labo 3 (Recursie)

## 1. Recursie

Recursie is een techniek waarbij een functie zichzelf aanroept.

```java
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}
```

## 2. Staartrecursie (Tail Recursion)

Staartrecursie is een speciale vorm van recursie waarbij de laatste actie van een recursieve functie een aanroep naar zichzelf is. Dit kan worden geoptimaliseerd door sommige compilers om te voorkomen dat het een grote stapel aanroepen creëert.

```java
public static int factorial(int n, int result) {
    if (n == 0) {
        return result;
    } else {
        return factorial(n - 1, n * result);
    }
}
```

Mutuele recursie verwijst naar een situatie waarin twee of meer functies elkaar wederzijds aanroepen om een taak uit te voeren. Een klassiek voorbeeld is de relatie tussen isEven en isOdd functies.

## 3. Mutuele recursie

```java
public static boolean isEven(int n) {
    if (n == 0) {
        return true;
    } else {
        return isOdd(n - 1);
    }
}

public static boolean isOdd(int n) {
    if (n == 0) {
        return false;
    } else {
        return isEven(n - 1);
    }
}
```

## 4. Iteratie

Iteratie is een proces waarbij een set instructies herhaaldelijk wordt uitgevoerd totdat een bepaalde voorwaarde is voldaan. Dit kan worden gedaan met behulp van lussen, zoals for, while, etc.

```java
public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}
```

## 5. Backtracking

Backtracking is een algoritme voor het oplossen van problemen waarbij de oplossing wordt opgebouwd door stap voor stap keuzes te maken, waarbij elke keuze kan leiden tot een dead end. Als een dead end wordt bereikt, wordt teruggegaan naar de vorige stap en wordt een andere keuze gemaakt.

```java
/*
This code is a recursive function called solveMaze that takes in two integer parameters, x and y. The function is used to solve a maze represented by a 2D character array called maze. The function returns a boolean value indicating whether or not the maze has been solved.

The function first checks if the current position (x, y) is out of bounds of the maze. If it is, the function returns false. If the current position is a wall ('X'), the function also returns false. If the current position is the finish ('F'), the function returns true.

If the current position is empty (' '), the function marks the current position as visited by changing it to a wall ('X'). Then, the function recursively calls itself with the positions to the left, right, up, and down of the current position. If any of these recursive calls return true, the function returns true. If none of the recursive calls return true, the function backtracks by changing the current position back to empty (' ') and returns false.
*/
public static boolean solveMaze(int x, int y) {
    if (x < 0 || x >= MAZE_WIDTH || y < 0 || y >= MAZE_HEIGHT) {
        return false;
    } else if (maze[x][y] == 'X') {
        return false;
    } else if (maze[x][y] == 'F') {
        return true;
    } else if (maze[x][y] == ' ') {
        maze[x][y] = 'X';
        if (solveMaze(x - 1, y) || solveMaze(x + 1, y) || solveMaze(x, y - 1) || solveMaze(x, y + 1)) {
            return true;
        }
        maze[x][y] = ' ';
        return false;
    }
    return false;
}
```

## Visuele voorstelling van recursie

![Recursie](https://jonathanmann.github.io/public/img/recursion_tree.png)

## Voorbeeldoefeningen

Faculteit op 3 wijzen

```java
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

public static int factorial(int n, int result) {
    if (n == 0) {
        return result;
    } else {
        return factorial(n - 1, n * result);
    }
}

public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}
```

Fibonacci op 3 wijzen

```java
public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public static int fibonacci(int n, int a, int b) {
    if (n == 0) {
        return a;
    } else if (n == 1) {
        return b;
    } else {
        return fibonacci(n - 1, b, a + b);
    }
}

public static int fibonacci(int n) {
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
        int temp = a;
        a = b;
        b = temp + b;
    }
    return a;
}
```

Som van de cijfers van een getal

```java
public static int sumOfDigits(int n) {
    if (n < 10) {
        return n;
    } else {
        return n % 10 + sumOfDigits(n / 10);
    }
}

public static int sumOfDigits(int n, int sum) {
    if (n < 10) {
        return n + sum;
    } else {
        return sumOfDigits(n / 10, sum + n % 10);
    }
}

public static int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
```

Torens van Hanoi

```java
public static void hanoi(int n, char from, char to, char aux) {
    if (n == 1) {
        System.out.println("Move disk 1 from rod " + from + " to rod " + to);
        return;
    }
    hanoi(n - 1, from, aux, to);
    System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
    hanoi(n - 1, aux, to, from);
}

hanio(3, 'A', 'C', 'B');

```
