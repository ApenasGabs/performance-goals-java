package coffeeStore;

import java.util.Scanner;

import coffeeStore.controller.CoffeeController;

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
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void showCoffeeById() {
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void addNewCoffee() {
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void updateCoffee() {
		System.out.println("======== Oops, type a valid option ==========");
	}

	private static void deleteCoffee() {
		System.out.println("======== Oops, type a valid option ==========");
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
