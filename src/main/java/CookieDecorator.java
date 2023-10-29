public class CookieDecorator implements IceCream {

    private IceCream iceCream;
    
    public CookieDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
      return iceCream.getDescription() + ", with extra cookie";
    }
  
    @Override
    public int getPrice() {
      return iceCream.getPrice() + 15;
    }
    
}
