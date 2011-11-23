package br.com.emannuel.dd.encapsularvaria;

import br.com.emannuel.dd.encapsularvaria.fly.FlyWithWings;
import br.com.emannuel.dd.encapsularvaria.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("A real Mallard Duck!");
	}

}
