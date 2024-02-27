package coffeeStore;

import java.util.Scanner;

public class Menu {

	public static Scanner inputValues = new Scanner(System.in);

	public static void main(String[] args) {
		showMenu();
		switch (inputValues.nextLine()) {
			case "1" -> System.out.println("========== 1 Show all products =============");
			case "2" -> System.out.println("========== 2 Search by product Id ==========");
			case "3" -> System.out.println("========== 3 Add products ==================");
			case "4" -> System.out.println("========== 4 Update product ================");
			case "5" -> System.out.println("========== 5 Delete product ================");
			case "0" ->	exit();
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
