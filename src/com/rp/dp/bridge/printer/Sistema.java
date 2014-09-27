package com.rp.dp.bridge.printer;

public class Sistema {
	
	public static void main(String[] args) {
		Printer p = new ColorPrinter(new ImpressoraLaser());
		p.print();
		
		Printer p1 = new PBPrinter(new ImpressoraInkjet());
		p1.print();
	}

}
