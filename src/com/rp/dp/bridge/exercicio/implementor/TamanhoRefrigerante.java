package com.rp.dp.bridge.exercicio.implementor;

import com.rp.dp.bridge.exercicio.bridge.Refrigerante;

public abstract class TamanhoRefrigerante {
	
	private Refrigerante refrigerante;

	public TamanhoRefrigerante(Refrigerante refrigerante) {
		this.refrigerante = refrigerante;
	}
	
	public abstract void beber();
	
	protected String getNomeRefrigerante() {
		return refrigerante.toString();
	}
}
