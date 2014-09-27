package com.rp.dp.bridge.exercicio.implementor;

import com.rp.dp.bridge.exercicio.bridge.Refrigerante;

public class TamanhoPequeno extends TamanhoRefrigerante {

	public TamanhoPequeno(Refrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Bebendo um refrigerando pequeno de " + getNomeRefrigerante());
	}

}
