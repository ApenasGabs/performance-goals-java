package coffeeStore;

import java.util.Scanner;

import coffeeStore.controller.CoffeeController;
import coffeeStore.model.Coffee;

public class Menu {

	public static Scanner inputValues = new Scanner(System.in);
	public static CoffeeController storeActions = new CoffeeController();

	public static void main(String[] args) {
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
	}

	private static void showInvalidOptionMessage() {
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void exit() {
		System.out.println("========== Exiting... ======================");
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
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void updateCoffee() {
		System.out.println("======== Oops, type a valid option ==========");
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
