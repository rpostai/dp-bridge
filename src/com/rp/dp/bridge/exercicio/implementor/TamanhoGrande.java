package com.rp.dp.bridge.exercicio.implementor;

import com.rp.dp.bridge.exercicio.bridge.Refrigerante;

public class TamanhoGrande extends TamanhoRefrigerante {

	public TamanhoGrande(Refrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Bebendo refrigerante grande de " + getNomeRefrigerante());
	}

}
