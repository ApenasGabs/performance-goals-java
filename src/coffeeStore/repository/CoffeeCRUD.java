package coffeeStore.repository;

import coffeeStore.model.Coffee;
import java.util.List;

public interface CoffeeCRUD {

  void addCoffee(Coffee coffee);

  Coffee getCoffeeById(String id);

  List<Coffee> getAllCoffees();

  void updateCoffee(String id, Coffee coffee);

  void deleteCoffee(String id);

}