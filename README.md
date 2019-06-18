## Multiply with recursion

Multiply two integers using recursion.

In order to multiply `a` and `b`, you will recursively add `a` `b` times.

```
* 2 * 0   = 0
* 2 * 1   = 2           = 2 + 2 * 0
* 2 * 2   = 2 + 2       = 2 + 2 * 1
* 2 * 3   = 2 + 2 + 2   = 2 + 2 * 2
* 2 * 4 ...
```

```
javac -cp .:junit-4.12.jar:mockito-all-1.10.19.jar MultiplyTest.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar:mockito-all-1.10.19.jar org.junit.runner.JUnitCore MultiplyTest
```