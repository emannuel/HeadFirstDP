package br.com.emannuel.dd.interfaceresolved;

public class RedheadDuck extends Duck implements Flyable, Quackable{

	@Override
	public void display() {
		System.out.println("Display a Red Head Duck!");
		
	}

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying...");
		
	}
}
