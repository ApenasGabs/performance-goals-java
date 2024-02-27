package coffeeStore.controller;

import java.util.ArrayList;
import java.util.List;

import coffeeStore.model.Coffee;
import coffeeStore.repository.CoffeeCRUD;

public class CoffeeController implements CoffeeCRUD {
	private List<Coffee> coffees = new ArrayList<>();

	@Override
	public void addCoffee(Coffee coffee) {
		// TODO Auto-generated method stub
	}

	@Override
	public Coffee getCoffeeById(int id) {
		return coffees.stream()
				.filter(coffee -> coffee.getCoffeeId() == id)
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<Coffee> getAllCoffees() {
		return null;
	}

	@Override
	public void updateCoffee(int id, Coffee coffee) {

	}

	@Override
	public void deleteCoffee(int id) {

	}

}
