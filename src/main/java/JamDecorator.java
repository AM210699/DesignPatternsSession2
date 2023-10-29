public class JamDecorator implements IceCream{

    private IceCream iceCream;
    
    public JamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
      return iceCream.getDescription() + ", with extra jam";
    }
  
    @Override
    public int getPrice() {
      return iceCream.getPrice() + 10;
    }
    
}
