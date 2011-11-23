package br.com.emannuel.dd.interfaceresolved;

public class RubberDuck extends Duck implements Quackable{

	@Override
	public void quack() {
		System.out.println("WIIII!");
	}
	
	@Override
	public void display() {
		System.out.println("display");
	}
}
