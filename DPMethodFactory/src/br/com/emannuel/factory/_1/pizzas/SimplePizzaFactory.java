package br.com.emannuel.factory._1.pizzas;

public class SimplePizzaFactory {

	private SimplePizzaFactory() {}
	
	public static Pizza createPizza(String type) {
		if ("muzzarela".equals(type)) {
			return new MuzzarelaPizza();
		}
		throw new IllegalArgumentException("Illegal pizza type");
	}
	
}
