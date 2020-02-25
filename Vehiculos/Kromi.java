package Vehiculos;

public class Kromi extends Carro{

			public Kromi(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}
			int anoIngreso;
			String marca;
			public int getAnoIngreso() {
				return anoIngreso;
			}
			public void setAnoIngreso(int anoIngreso) {
				this.anoIngreso = anoIngreso;
			}
			public String getMarca() {
				return marca;
			}
			public void setMarca(String marca) {
				this.marca = marca;
			}
			
			
}
