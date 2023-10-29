public class CoverDecorator implements IceCream {
    
    private IceCream iceCream;
    
    public CoverDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
      return iceCream.getDescription() + ", with extra cover";
    }
  
    @Override
    public int getPrice() {
      return iceCream.getPrice() + 20;
    }
    
}
