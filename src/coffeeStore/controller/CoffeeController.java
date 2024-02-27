package coffeeStore.controller;

import java.util.ArrayList;
import java.util.List;
import coffeeStore.model.Coffee;
import coffeeStore.repository.CoffeeCRUD;

public class CoffeeController implements CoffeeCRUD {
	private List<Coffee> coffees = new ArrayList<>();

	@Override
	public void addCoffee(Coffee coffee) {
		boolean existingId = coffees.stream().anyMatch(c -> c.getCoffeeId().equals(coffee.getCoffeeId()));

		if (!existingId) {
			coffees.add(coffee);
			System.out.println("\n Coffee " + coffee.getCoffeeId() + " was added successfully!");
		} else {
			System.out.println("\n Coffee " + coffee.getCoffeeId() + " already exists!");
		}
	}

	@Override
	public Coffee getCoffeeById(String id) {
		for (var coffee : coffees) {
			if (coffee.getCoffeeId().equals(id)) {
				return coffee;
			}
		}
		System.out.println("\nCoffee " + id + " was not found!");
		return null;
	}

	@Override
	public List<Coffee> getAllCoffees() {
		return coffees;
	}

	@Override
	public void updateCoffee(String id, Coffee updatedCoffee) {
		var coffee = getCoffeeById(id);

		if (coffee != null) {
			coffees.set(coffees.indexOf(coffee), updatedCoffee);
			System.out.println("\nCoffee " + updatedCoffee.getCoffeeId() + " was updated successfully!");
		} else {
			System.out.println("\nCoffee " + id + " was not found!");
		}
	}

	@Override
	public void deleteCoffee(String id) {
		var coffee = getCoffeeById(id);

		if (coffee != null) {
			coffees.remove(coffee);
			System.out.println("\nCoffee " + id + " was deleted successfully!");
		} else {
			System.out.println("\nCoffee " + id + " was not found!");
		}
	}
}
