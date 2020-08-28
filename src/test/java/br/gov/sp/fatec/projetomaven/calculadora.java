package br.gov.sp.fatec.projetomaven;

public class calculadora {
	private Integer n1, n2;
	
	
	public calculadora (Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public calculadora() {
		this(1, 1);
	}
	public Integer soma() {
		
		return n1 + n2;
	}
}
