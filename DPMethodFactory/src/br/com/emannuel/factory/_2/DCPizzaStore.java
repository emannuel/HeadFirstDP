package br.com.emannuel.factory._2;

import br.com.emannuel.factory._2.pizza.DCStyleChessePizza;
import br.com.emannuel.factory._2.pizza.DCStylePeperoniPizza;
import br.com.emannuel.factory._2.pizza.Pizza;

public class DCPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {

		if ("cheese".equals(type)) {
			return new DCStyleChessePizza();
		}
		else if ("peperoni".equals(type)) {
			return new DCStylePeperoniPizza();
		}
		
		return null;
	}

}
