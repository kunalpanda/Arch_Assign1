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
            System.out.println("Sonething went wrong -_-");
            e.printStackTrace();
        }

    }
}