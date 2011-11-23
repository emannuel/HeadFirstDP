package br.com.emannuel.factory._2.pizza;

public abstract class Pizza {

	
	
	public void prepare() {
		System.out.println("Preparando a pizza");
	}
	
	public void bake() {
		System.out.println(" Amassando a pizza");
	}
	
	public void cut() {
		System.out.println(" Cortando a pizza");
	}
	
	public void box() {
		System.out.println("Empacotando a pizza");
	}
	
}
