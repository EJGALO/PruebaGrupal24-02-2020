package Vehiculos;

public abstract class Carro {

	int ocupantes;
	String fechaIngreso;
	int X;
	int Y;
	
	


	
	public Carro(int ocupantes, String fechaIngreso, int x, int y) {
		super();
		this.ocupantes = ocupantes;
		this.fechaIngreso = fechaIngreso;
		X = x;
		Y = y;
	}

//desplega sus datos básicos, y sus coordenadas en el tablero.
 public void datosBasicos() {
 }

public int getOcupantes() {
	return ocupantes;
}

public void setOcupantes(int ocupantes) {
	this.ocupantes = ocupantes;
}

public String getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(String fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}

public int getX() {
	return X;
}

public void setX(int x) {
	X = x;
}

public int getY() {
	return Y;
}

public void setY(int y) {
	Y = y;
}
	
}
