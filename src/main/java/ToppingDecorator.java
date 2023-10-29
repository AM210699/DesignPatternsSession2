public class ToppingDecorator implements IceCream {

    private IceCream iceCream;
    
    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
      return iceCream.getDescription() + ", with extra toppings";
    }
  
    @Override
    public int getPrice() {
      return iceCream.getPrice() + 20;
    }

    
}
