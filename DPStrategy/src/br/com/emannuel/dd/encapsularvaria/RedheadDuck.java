package br.com.emannuel.dd.encapsularvaria;

import br.com.emannuel.dd.encapsularvaria.fly.FlyWithWings;
import br.com.emannuel.dd.encapsularvaria.quack.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Display a Red Head Duck!");
		
	}
}
