package br.com.emannuel.factory._2;

public class Teste {

	public static void main(String[] args) {
		
		PizzaStore pizzaStore = new DCPizzaStore();
		
		System.out.println("Chesse pizza of DC:");
		pizzaStore.orderPizza("cheese");
		
		System.out.println("");
		
		pizzaStore = new NYPizzaStore();
		System.out.println("Chesse pizza of NY");
		pizzaStore.orderPizza("cheese");
	}
	
}
