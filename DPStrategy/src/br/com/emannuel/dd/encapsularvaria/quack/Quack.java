package br.com.emannuel.dd.encapsularvaria.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("QUACK!");
	}

}
