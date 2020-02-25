package Vehiculos;

public class Caguano extends Carro {

		public Caguano(int ocupantes, String fechaIngreso, int x, int y) {
		super(ocupantes, fechaIngreso, x, y);
		// TODO Auto-generated constructor stub
	}
		int alcanceTiro;
		String colorConfetti;
		public int getAlcanceTiro() {
			return alcanceTiro;
		}
		public void setAlcanceTiro(int alcanceTiro) {
			this.alcanceTiro = alcanceTiro;
		}
		public String getColorConfetti() {
			return colorConfetti;
		}
		public void setColorConfetti(String colorConfetti) {
			this.colorConfetti = colorConfetti;
		}
		
}
