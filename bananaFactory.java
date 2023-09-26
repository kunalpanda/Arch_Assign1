public class bananaFactory implements GroceryProductFactory{
    bananas b = new bananas(0);

    public void setPrice(double price){
        b.setPrice(price);
    }

    public String toString(){
        return("The price of bananas is " + b.getPrice());
    }
}
