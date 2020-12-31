package entities;

public class Fisica extends Contribuintes{
	private double gastosSaude;
	
	public Fisica() {
	}
	
	public Fisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double imposto() {
		double valorImposto = 0.0;
		if (gastosSaude > 0.0) {
			valorImposto -= (gastosSaude / 2);
		}

		if (getRendaAnual() < 20000) {
			valorImposto += getRendaAnual() * 0.15;
		} else {
			valorImposto += getRendaAnual() * 0.25;
		}
		return valorImposto;
	}
}
