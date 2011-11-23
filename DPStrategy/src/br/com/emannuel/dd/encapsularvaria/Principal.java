package br.com.emannuel.dd.encapsularvaria;

import br.com.emannuel.dd.encapsularvaria.fly.FlyNoWay;

public class Principal {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		System.out.println("I hit the duck wing!");
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}
	
}
