package coffeeStore.model;

public class GroundCoffee extends Coffee {
  private String grindSize; 

  public GroundCoffee() {
      super();
  }

  public String getGrindSize() {
      return grindSize;
  }

  public void setGrindSize(String grindSize) {
      this.grindSize = grindSize;
  }

  @Override
  public void showCoffeeDetails() {
      super.showCoffeeDetails(); 
      System.out.println("\n Grind Size: " + grindSize);
  }
}
