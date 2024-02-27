package coffeeStore;

import java.util.Scanner;

import coffeeStore.controller.CoffeeController;

public class Menu {

	public static Scanner inputValues = new Scanner(System.in);
	public static CoffeeController storeActions = new CoffeeController();

	public static void main(String[] args) {
		do {
			showMenu();
			switch (inputValues.nextLine()) {
				case "1" -> CoffeeMenuActions.showAllCoffees(storeActions);
				case "2" -> CoffeeMenuActions.showCoffeeById(storeActions, inputValues);
				case "3" -> CoffeeMenuActions.addNewCoffee(storeActions, inputValues);
				case "4" -> CoffeeMenuActions.updateCoffee(storeActions, inputValues);
				case "5" -> CoffeeMenuActions.deleteCoffee(storeActions, inputValues);
				case "0" -> exit();
				default -> showInvalidOptionMessage();
			}
		} while (inputValues.nextLine() != "0");
		inputValues.close();
	}

	private static void showInvalidOptionMessage() {
		System.out.println("======== Oops, type a valid option ==========");
    System.out.println("\nPress Enter key to return to the menu...");

	}

	private static void exit() {
		System.out.println("========== Exiting... ======================");
		System.exit(0);
	}

	private static void showMenu() {
		System.out.println("\n============================================");
		System.out.println("\n========== Premium Coffee Store ============");
		System.out.println("\n========== 1 - Show all products ===========");
		System.out.println("\n========== 2 - Search by product Id ========");
		System.out.println("\n========== 3 - Add products ================");
		System.out.println("\n========== 4 - Update product ==============");
		System.out.println("\n========== 5 - Delete product ==============");
		System.out.println("\n========== 0 - Exit ========================");
		System.out.println("\n============================================");
	}

}
