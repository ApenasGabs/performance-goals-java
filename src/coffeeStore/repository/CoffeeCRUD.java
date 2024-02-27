package coffeeStore.repository;

import coffeeStore.model.Coffee;
import java.util.List;

public interface CoffeeCRUD {

  void addCoffee(Coffee coffee);

  Coffee getCoffeeById(int id);

  List<Coffee> getAllCoffees();

  void updateCoffee(int id, Coffee coffee);

  void deleteCoffee(int id);

}