package coffeeStore.model;

public class CoffeeBean extends Coffee {
  private String beanType;  

  public CoffeeBean() {
    super();
  }

  public String getBeanType() {
    return beanType;
  }

  public void setBeanType(String beanType) {
    this.beanType = beanType;
  }

  @Override
  public void showCoffeeDetails() {
    super.showCoffeeDetails(); 
    System.out.println("\n Bean Type: " + beanType);
  }
}