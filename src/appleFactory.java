public class appleFactory implements GroceryProductFactory{
    
    products a = new apples(0);
    
    public void setPrice(double price){
        a.setPrice(price);
    }

    public String toString(){
        return("The price of apples is " + a.getPrice());
    }
}
