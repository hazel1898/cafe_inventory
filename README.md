# Campus Cafe Inventory

## Run

Use a standard JDK from this folder:

```powershell
javac Product.java Main.java Warmup.java
java Main
```

## 1. What did you predict for Warmup.java, and what did it actually print? Explain the lines that surprised you.

The output that I predicted was:

```text
7 5.0 127
Two
Three
```

The actual output was:

```text
7 5.0 -126
Two
Three
```

I predicted that casting 130 to byte would still give 130 because I thought byte can store it
The surprising result was -126 because Java keeps the lowest eight bits and interprets them as a signed byte.


## 2. What is the difference between the static variable totalProducts and the instance variable name?

The static variable `totalProducts` belongs to the class, so all Product objects share one counter and see any updates made to it.
The instance variable `name` belongs to each individual object, so every product has its own name and changing one product's name does not change another's.

## 3. What does the copy constructor do, and why does changing p2.name not change p1.name?

The copy constructor creates a separate Product object with the same name, price and quantity as an existing product, and increases `totalProducts`.
Changing `p2.name` does not change `p1.name` because they are fields in two different Product objects; 

## 4. Why does Java force you to write (int) average when converting a double to an int, and what happens to the decimal part?

Java requires `(int) average` because converting a double to an int is a narrowing conversion that can lose information, and the cast explicitly confirms that we accept this loss.
The decimal part is removed rather than rounded to the nearest integer, so 12.75 becomes 12.


## Test Session

`output.txt` contains a full session using every menu option