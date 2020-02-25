package Vehiculos;

public class Trupalla extends Carro {
	int armadura;
	String conductor;
	
	public Trupalla(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}
	public Trupalla(int armadura, String conductor) {
		
	}
	


	Trupalla patrulla1 = new Trupalla(5, "Sebastian") ;
	Trupalla patrulla2 = new Trupalla(4, "Pepe") ;
	Trupalla patrulla3 = new Trupalla(3, "Manolito") ;
	Trupalla patrulla4 = new Trupalla(2, "Joaquin") ;
	Trupalla patrulla5 = new Trupalla(1, "Matias") ;
	Trupalla patrulla6 = new Trupalla(3, "Hernando") ;
	Trupalla patrulla7= new Trupalla(5, "Fernando") ;
	Trupalla patrulla8 = new Trupalla(3, "Orlando") ;
	Trupalla patrulla9 = new Trupalla(1, "Wando") ;
	Trupalla patrulla10 = new Trupalla(1, "Camilo") ;
	
	

	
	
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	
}
