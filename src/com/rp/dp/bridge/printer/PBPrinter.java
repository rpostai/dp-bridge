package com.rp.dp.bridge.printer;

public class PBPrinter extends Printer {

	public PBPrinter(ImpressoraImpl impressora) {
		super(impressora);
	}

	@Override
	public void print() {
		System.out.println("Imprimindo na impressora pb");
		impressora.print();
	}

}
