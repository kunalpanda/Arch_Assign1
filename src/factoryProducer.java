public abstract class factoryProducer {
    public static GroceryProductFactory getFactory(String product){
        if(product.equalsIgnoreCase("apples")){
            return new appleFactory();
        }
        else if (product.equalsIgnoreCase("bananas")){
            return new bananaFactory();
        }
        else{
            System.out.println("This is not a valid factory");
            return null;
        }
    }
}
