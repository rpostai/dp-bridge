package com.rp.dp.bridge.printer;

public class ImpressoraInkjet implements ImpressoraImpl {

	@Override
	public void print() {
		System.out.println("Imprimindo a partir da impressora inkjet");
	}

}
