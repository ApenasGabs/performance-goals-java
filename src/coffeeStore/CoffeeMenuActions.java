package coffeeStore;

import java.util.Scanner;

import coffeeStore.controller.CoffeeController;
import coffeeStore.model.Coffee;
import coffeeStore.model.CoffeeBean;
import coffeeStore.model.GroundCoffee;

public class CoffeeMenuActions {

  public static void showAllCoffees(CoffeeController storeActions) {
    System.out.println("Listing all coffees:");
    var coffees = storeActions.getAllCoffees();
    if (coffees.isEmpty()) {
        System.out.println("No coffees available.");
    } else {
        coffees.forEach(coffee -> coffee.showCoffeeDetails());
    }
  }

  public static void showCoffeeById(CoffeeController storeActions, Scanner inputValues) {
    System.out.println("Please enter Coffee ID:");
    String id = inputValues.nextLine();
    Coffee coffee = storeActions.getCoffeeById(id);

    if (coffee != null) {
      coffee.showCoffeeDetails();
    } else {
      System.out.println("Coffee not found.");
    }
  }

  public static void addNewCoffee(CoffeeController storeActions, Scanner inputValues) {
    System.out.println("Choose the type of coffee to add:");
    System.out.println("1 - Coffee Bean");
    System.out.println("2 - Ground Coffee");
    String type = inputValues.nextLine();

    System.out.println("Enter Coffee Name:");
    String name = inputValues.nextLine();

    System.out.println("Enter Origin:");

    String origin = inputValues.nextLine();

    System.out.println("Enter Roast Type:");
    String roastType = inputValues.nextLine();

    System.out.println("Enter Flavor Profile:");
    String flavorProfile = inputValues.nextLine();

    System.out.println("Enter Preparation Process:");
    String preparationProcess = inputValues.nextLine();

    System.out.println("Enter Weight in Grams:");
    int weightGrams = Integer.parseInt(inputValues.nextLine());

    System.out.println("Enter Roast Date (YYYY-MM-DD):");
    String roastDate = inputValues.nextLine();

    if ("1".equals(type)) {
      System.out.println("Enter Bean Type:");
      String beanType = inputValues.nextLine();

      CoffeeBean coffeeBean = new CoffeeBean(name, origin, roastType, flavorProfile, preparationProcess, weightGrams,
          roastDate, beanType);

      storeActions.addCoffee(coffeeBean);
      System.out.println("Coffee Bean added successfully!");

    } else if ("2".equals(type)) {
      System.out.println("Enter Grind Size:");
      String grindSize = inputValues.nextLine();

      GroundCoffee groundCoffee = new GroundCoffee(name, origin, roastType, flavorProfile, preparationProcess,
          weightGrams, roastDate, grindSize);

      storeActions.addCoffee(groundCoffee);
      System.out.println("Ground Coffee added successfully!");
    } else {
      System.out.println("Invalid coffee type selected.");
    }
  }

  public static void updateCoffee(CoffeeController storeActions, Scanner inputValues) {
    System.out.println("Enter the ID of the coffee to update:");
    String coffeeId = inputValues.nextLine();

    Coffee coffee = storeActions.getCoffeeById(coffeeId);

    if (coffee == null) {
      System.out.println("Coffee not found!");
      return;
    }

    System.out.println("Enter new Coffee Name (leave blank to keep current: " + coffee.getName() + ")");
    String name = inputValues.nextLine();

    System.out.println("Enter new Origin (leave blank to keep current: " + coffee.getOrigin() + ")");
    String origin = inputValues.nextLine();

    System.out.println("Enter new Roast Type (leave blank to keep current:  " + coffee.getRoastType() + ")");
    String roastType = inputValues.nextLine();

    System.out.println("Enter new Flavor Profile (leave blank to keep current:  " + coffee.getFlavorProfile() + ")");
    String flavorProfile = inputValues.nextLine();

    System.out.println("Enter new Preparation Process (leave blank to keep current:  " + coffee.getPreparationProcess() + ")");
    String preparationProcess = inputValues.nextLine();

    System.out.println("Enter new Weight in Grams (0 to keep current:  " + coffee.getWeightGrams() + ")");
    int weightGrams = Integer.parseInt(inputValues.nextLine());

    System.out.println("Enter new Roast Date (YYYY-MM-DD, leave blank to keep current:  " + coffee.getRoastDate() + ")");
    String roastDate = inputValues.nextLine();

    if (!name.isBlank())
      coffee.setName(name);

    if (!origin.isBlank())
      coffee.setOrigin(origin);

    if (!roastType.isBlank())
      coffee.setRoastType(roastType);

    if (!flavorProfile.isBlank())
      coffee.setFlavorProfile(flavorProfile);

    if (!preparationProcess.isBlank())
      coffee.setPreparationProcess(preparationProcess);

    if (weightGrams > 0)
      coffee.setWeightGrams(weightGrams);

    if (!roastDate.isBlank())
      coffee.setRoastDate(roastDate);

    if (coffee instanceof CoffeeBean) {
      System.out.println("Enter new Bean Type (leave blank to keep current:  " + ((CoffeeBean) coffee).getBeanType() + ")");
      String beanType = inputValues.nextLine();

      if (!beanType.isBlank())
        ((CoffeeBean) coffee).setBeanType(beanType);

    } else if (coffee instanceof GroundCoffee) {
      System.out.println("Enter new Grind Size (leave blank to keep current): " + ((GroundCoffee) coffee).getGrindSize()  + ")");
      String grindSize = inputValues.nextLine();

      if (!grindSize.isBlank())
        ((GroundCoffee) coffee).setGrindSize(grindSize);
    }

    storeActions.updateCoffee(coffeeId, coffee);
    System.out.println("Coffee updated successfully!");
  }

  public static void deleteCoffee(CoffeeController storeActions, Scanner inputValues) {
    System.out.println("Enter Coffee ID to delete:");
    String id = inputValues.nextLine();

    storeActions.deleteCoffee(id);
  }

}