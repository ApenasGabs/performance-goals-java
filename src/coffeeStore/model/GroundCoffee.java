package coffeeStore.model;

public class GroundCoffee extends Coffee {
  private String grindSize;

  public GroundCoffee(String name, String origin, String roastType, String flavorProfile, String preparationProcess,
      int weightGrams, String roastDate, String grindSize) {
    super(name, origin, roastType, flavorProfile, preparationProcess, weightGrams, roastDate);
    this.grindSize = grindSize;
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
