package br.com.emannuel.dd.encapsularvaria.quack;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println(":X");
	}
}
