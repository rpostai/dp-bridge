package com.rp.dp.bridge.printer;

public class ImpressoraLaser implements ImpressoraImpl {

	@Override
	public void print() {
		System.out.println("Imprimindo a partir da impressora a laser");
	}

}
