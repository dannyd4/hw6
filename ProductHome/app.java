package ProductHome;

class Products {
    
  public int count;
  public String name;
  public double price;
  public StringBuilder description;


   
  class ProxyName {
    String val;
    
    public ProxyName(String v) {
      // this.val = v != null ? v : "EMPTY";
    
      if (v != null)
        this.val = v;
      else
        this.val = "EMPTY";
    }
    
    public String getVal() {
      return val;
    }
  }
   
  public Products(String name) {
      this.name = new ProxyName(new ProxyName(name).getVal()).getVal();
  }
}

public class app {
  public static void main(String[] args) {
    Product curreProduct = new Product();
    curreProduct = new CreateProduct()
                  .setCount(10)
                  .setName("soap")
                  .setDescription("мыло")
                  .setPrice(5)
                  .Create();
            curreProduct.print();
    
    curreProduct = new CreateProduct()
                  .setName("plate")
                  .setCount(65)
                  .setDescription("тарелка")
                  .Create();
                  curreProduct.print();
                
    curreProduct = new CreateProduct()
                  .setName("towel")
                  .Create();
                  curreProduct.print();

    curreProduct = new CreateProduct()
                  .setName("cup")
                  .setCount(40)
                  .Create();
                  curreProduct.print();
  }
  
}