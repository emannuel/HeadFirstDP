package br.com.emannuel.dd.encapsularvaria.fly;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}
}
