# SOFE-3650U

# Assignment 1: Design Patterns

## Group #9

#### Kunal Pandya - 100792272

#### Kramptj KC - 100787909

#### Syed Nasir - 100809447

---

## Project Overview

- [Repository Structure](#repository-structure)
- [UML Diagram](#uml-diagram)
- [Test Driver](#test-driver)

---

## Repository Structure

```
- Arch_Assign1
	- screenDumps
		- data_ss.jpg
		- Test_Output.jpg
		- UML_Diagram.png
	- src
		- data
			- data.txt
		- GroceryProductFactory.java
		- appleFactory.java
		- apples.java
		- bananaFactory.java
		- bananas.java
		- factoryProducer.java
		- products.java
	- UML
		- UML.drawio
	- REAME.md
	- test.java
```

## UML Diagram

![](./screenDumps/UML_Diagram.png)

## Test Driver

> data.txt

![](./screenDumps/data_ss.jpg)

---

> test.java

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test{

    public static void main(String[] args) {
              try {
            // Read and Scan file
            File dataFile = new File("./src/data/data.txt");
            Scanner read = new Scanner(dataFile);

            while (read.hasNextLine()) {
                String data = read.nextLine();

                // Split Product name and price
                String[] parts = data.split(" ");

                String product = parts[0];
                double price = Double.parseDouble(parts[1]);

                // Get the factory for the product
                GroceryProductFactory factory = factoryProducer.getFactory(product);
                if (factory != null) {
                    // Set the price and print the factory
                    factory.setPrice(price);
                    System.out.println(factory);
                }
            }
        read.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong -_-");
            e.printStackTrace();
        }

    }
}
```

- We test our Abstract Factory Design Pattern using a `data.txt` file that contains product names and prices of grocery items.
- We read each line, split it into `product` and `price`, and store these in their respective variables.
- Using the product name, we call the `getFactory` method from the `factoryProducer` abstract class to get a `GroceryProductFactory` instance.
- If the `factory` instance exists for the product, we set its `price` and print its results.
- If a `FileNotFoundException` occurs during execution of the `try` block, we `catch` it and print an error message along with the exception's stack trace.

> test.java | Output

---

![](./screenDumps/Test_Output.jpg)
