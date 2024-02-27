package coffeeStore.model;

public class CoffeeBean extends Coffee {
  private String beanType;

  public CoffeeBean(String name, String origin, String roastType, String flavorProfile, String preparationProcess,
      int weightGrams, String roastDate, String beanType) {
    super(name, origin, roastType, flavorProfile, preparationProcess, weightGrams, roastDate);
    this.beanType = beanType;
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