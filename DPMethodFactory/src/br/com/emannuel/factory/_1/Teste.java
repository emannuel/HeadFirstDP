package br.com.emannuel.factory._1;

import br.com.emannuel.factory._1.pizzas.Pizza;
import br.com.emannuel.factory._1.pizzas.SimplePizzaFactory;

public class Teste {

	
	public static void main(String[] args) {
		
		/*
		 * Busca a pizza pelo factory. As implementa��es de pizza s�o default e s� poder�m ser
		 * isntanciadas dentro do pacote do factory, ou seja, somente por ele
		 */
		Pizza pizza = SimplePizzaFactory.createPizza("muzzarela");
		pizza.prepare();
	}
}
