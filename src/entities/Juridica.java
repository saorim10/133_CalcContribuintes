package entities;

public class Juridica extends Contribuintes{
	private int nFunc;
	
	public Juridica() {
	}
	
	public Juridica(String nome, double rendaAnual, int nFunc) {
		super(nome, rendaAnual);
		this.nFunc = nFunc;
	}


	public int getnFunc() {
		return nFunc;
	}
	public void setnFunc(int nFunc) {
		this.nFunc = nFunc;
	}

	@Override
	public double imposto() {
		double valorImposto = 0.0;
		
		if(nFunc > 10) {
			valorImposto = getRendaAnual() * 0.14;
		} else {
			valorImposto = getRendaAnual() * 0.16;
		}
		return valorImposto;
	}
}
