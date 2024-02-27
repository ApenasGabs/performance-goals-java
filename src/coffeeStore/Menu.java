package coffeeStore;

import java.util.Scanner;

import coffeeStore.controller.CoffeeController;
import coffeeStore.model.Coffee;
import coffeeStore.model.CoffeeBean;
import coffeeStore.model.GroundCoffee;

public class Menu {

	public static Scanner inputValues = new Scanner(System.in);
	public static CoffeeController storeActions = new CoffeeController();

	public static void main(String[] args) {
		do {
			showMenu();
			switch (inputValues.nextLine()) {
				case "1" -> showAllCoffees();
				case "2" -> showCoffeeById();
				case "3" -> addNewCoffee();
				case "4" -> updateCoffee();
				case "5" -> deleteCoffee();
				case "0" -> exit();
				default -> showInvalidOptionMessage();
			}
			inputValues.close();
		} while (inputValues.nextLine() != "0");
	}

	private static void showInvalidOptionMessage() {
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void exit() {
		System.out.println("========== Exiting... ======================");
		System.exit(0);
	}

	private static void showAllCoffees() {
		System.out.println("Listing all coffees:");
		var coffees = storeActions.getAllCoffees();
		coffees.forEach(coffee -> coffee.showCoffeeDetails());
	}

	private static void showCoffeeById() {
		System.out.println("Please enter Coffee ID:");
		String id = inputValues.nextLine();
		Coffee coffee = storeActions.getCoffeeById(id);

		if (coffee != null) {
			coffee.showCoffeeDetails();
		} else {
			System.out.println("Coffee not found.");
		}
	}

	private static void addNewCoffee() {
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

	private static void updateCoffee() {

		System.out.println("Enter the ID of the coffee to update:");
		String coffeeId = inputValues.nextLine();

		Coffee coffee = storeActions.getCoffeeById(coffeeId);

		if (coffee == null) {
			System.out.println("Coffee not found!");
			return;
		}

		System.out.println("Enter new Coffee Name (leave blank to keep current):");
		String name = inputValues.nextLine();

		System.out.println("Enter new Origin (leave blank to keep current):");
		String origin = inputValues.nextLine();

		System.out.println("Enter new Roast Type (leave blank to keep current):");
		String roastType = inputValues.nextLine();

		System.out.println("Enter new Flavor Profile (leave blank to keep current):");
		String flavorProfile = inputValues.nextLine();

		System.out.println("Enter new Preparation Process (leave blank to keep current):");
		String preparationProcess = inputValues.nextLine();

		System.out.println("Enter new Weight in Grams (0 to keep current):");
		int weightGrams = Integer.parseInt(inputValues.nextLine());

		System.out.println("Enter new Roast Date (YYYY-MM-DD, leave blank to keep current):");
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
			System.out.println("Enter new Bean Type (leave blank to keep current):");
			String beanType = inputValues.nextLine();

			if (!beanType.isBlank())
				((CoffeeBean) coffee).setBeanType(beanType);

		} else if (coffee instanceof GroundCoffee) {
			System.out.println("Enter new Grind Size (leave blank to keep current):");
			String grindSize = inputValues.nextLine();

			if (!grindSize.isBlank())
				((GroundCoffee) coffee).setGrindSize(grindSize);
		}

		storeActions.updateCoffee(coffeeId, coffee);
		System.out.println("Coffee updated successfully!");
	}

	private static void deleteCoffee() {
		System.out.println("Enter Coffee ID to delete:");
		String id = inputValues.nextLine();

		storeActions.deleteCoffee(id);
	}

	private static void showMenu() {
		System.out.println("\n============================================");
		System.out.println("\n========== Premium Coffee Store ============");
		System.out.println("\n========== 1 - Show all products ===========");
		System.out.println("\n========== 2 - Search by product Id ========");
		System.out.println("\n========== 3 - Add products ================");
		System.out.println("\n========== 4 - Update product ==============");
		System.out.println("\n========== 5 - Delete product ==============");
		System.out.println("\n========== 0 - Exit========== ==============");
		System.out.println("\n============================================");
	}

}
