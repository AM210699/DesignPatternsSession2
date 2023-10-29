public class GranolaDecorator implements IceCream {

    private IceCream iceCream;
    
    public GranolaDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
      return iceCream.getDescription() + ", with extra granola";
    }
  
    @Override
    public int getPrice() {
      return iceCream.getPrice() + 10;
    }
    
}
