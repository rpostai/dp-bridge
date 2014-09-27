package com.rp.dp.bridge.exercicio.bridge;

import com.rp.dp.bridge.exercicio.implementor.TamanhoGrande;
import com.rp.dp.bridge.exercicio.implementor.TamanhoPequeno;
import com.rp.dp.bridge.exercicio.implementor.TamanhoRefrigerante;

public class Sistema {
	
	public static void main(String[] args) {
		Refrigerante coca = new CocaCola();
		TamanhoRefrigerante t1 = new TamanhoGrande(coca);
		t1.beber();
		
		TamanhoRefrigerante t2 = new TamanhoPequeno(coca);
		t2.beber();
	}
}
