package br.com.emannuel.dd.encapsularvaria.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("SQUEAK!");
	}

}
