package com.rp.dp.bridge;

import com.rp.dp.bridge.implementor.CSVRepository;
import com.rp.dp.bridge.implementor.RepositoryImpl;

public class Sistema {

	public static void main(String[] args) {
		
		RepositoryImpl csv = new CSVRepository();
		
		Repository repo1 = new LocalRepository(csv);
		Repository repo2 = new RemoteRepository(csv);
		
		repo1.criar("Teste");
		repo2.criar("Teste");
		
		
	}
}
