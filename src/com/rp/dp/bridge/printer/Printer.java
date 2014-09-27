package com.rp.dp.bridge.printer;

public abstract class Printer {
	
	protected ImpressoraImpl impressora;
	
	public Printer(ImpressoraImpl impressora) {
		this.impressora = impressora;
	}
	
	public abstract void print();

}
