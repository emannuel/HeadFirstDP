package br.com.emannuel.dd.encapsularvaria;

import br.com.emannuel.dd.encapsularvaria.fly.FlyNoWay;
import br.com.emannuel.dd.encapsularvaria.quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("display");
	}
}
