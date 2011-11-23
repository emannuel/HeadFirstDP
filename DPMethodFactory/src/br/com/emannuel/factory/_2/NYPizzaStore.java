package br.com.emannuel.factory._2;

import br.com.emannuel.factory._2.pizza.NYStyleChessePizza;
import br.com.emannuel.factory._2.pizza.NYStylePeperoniPizza;
import br.com.emannuel.factory._2.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {

		if ("cheese".equals(type)) {
			return new NYStyleChessePizza();
		}
		else if ("peperoni".equals(type)) {
			return new NYStylePeperoniPizza();
		}
		return null;
	}

}
