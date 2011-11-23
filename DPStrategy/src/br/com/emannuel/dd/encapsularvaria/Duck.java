package br.com.emannuel.dd.encapsularvaria;

import br.com.emannuel.dd.encapsularvaria.fly.FlyBehavior;
import br.com.emannuel.dd.encapsularvaria.quack.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void swing(){
		System.out.println("Swining...");
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public abstract void display();
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
