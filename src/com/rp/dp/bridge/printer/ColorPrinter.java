package com.rp.dp.bridge.printer;

public class ColorPrinter extends Printer {

	public ColorPrinter(ImpressoraImpl impressora) {
		super(impressora);
	}

	@Override
	public void print() {
		System.out.println("imprimindo na impressora colorida");
		impressora.print();
	}

	
}
