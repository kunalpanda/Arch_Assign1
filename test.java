public class test{

    public static void main(String[] args) {
        GroceryProductFactory factory1 = factoryProducer.getFactory("apples");
        factory1.setPrice(3.99);
        System.out.println(factory1);
        GroceryProductFactory factory2 = factoryProducer.getFactory("bananas");
        factory2.setPrice(4.99);
        System.out.println(factory2);
        GroceryProductFactory factory3 = factoryProducer.getFactory("FalseValue");
    }
}