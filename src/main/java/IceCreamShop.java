public class IceCreamShop {
    public static void main(String [] args) {
        IceCream soft = new SoftIceCream();
    
        soft = new CoverDecorator(soft);
        soft = new GranolaDecorator(soft);
        soft = new ToppingDecorator(soft);
        soft = new JamDecorator(soft);
        soft = new CookieDecorator(soft);
    
        System.out.println("[Purchase Ticket]");
        System.out.println(soft.getDescription());
        System.out.println("$" + soft.getPrice());
      }
}
