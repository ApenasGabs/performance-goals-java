package coffeeStore.model;

public abstract class Coffee {
  private String name;
  private String origin;
  private String roastType;
  private String flavorProfile;
  private static int lastId = 0;
  private final String coffeeId;

  public Coffee() {
    this.coffeeId = generateCoffeeId();
  }

  private String generateCoffeeId() {
    return this.name + (++lastId); 
  }

  public String getCoffeeId() {
    return this.coffeeId;
  }


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrigin() {
    return this.origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public String getRoastType() {
    return this.roastType;
  }

  public void setRoastType(String roastType) {
    this.roastType = roastType;
  }

  public String getFlavorProfile() {
    return this.flavorProfile;
  }

  public void setFlavorProfile(String flavorProfile) {
    this.flavorProfile = flavorProfile;
  }

  public String getPreparationProcess() {
    return this.preparationProcess;
  }

  public void setPreparationProcess(String preparationProcess) {
    this.preparationProcess = preparationProcess;
  }

  public int getWeightGrams() {
    return this.weightGrams;
  }

  public void setWeightGrams(int weightGrams) {
    this.weightGrams = weightGrams;
  }

  public String getRoastDate() {
    return this.roastDate;
  }

  public void setRoastDate(String roastDate) {
    this.roastDate = roastDate;
  }

  private String preparationProcess;
  private int weightGrams;
  private String roastDate;

  public void showCoffeeDetails() {
    System.out.println("============================================");
    System.out.println("\n Name: " + name);
    System.out.println("\n Origin: " + origin);
    System.out.println("\n Roast Type: " + roastType);
    System.out.println("\n Flavor Profile: " + flavorProfile);
    System.out.println("\n Preparation Process: " + preparationProcess);
    System.out.println("\n Weight (grams): " + weightGrams);
    System.out.println("\n Roast Date: " + roastDate);
    System.out.println("\n============================================");
  }
}
