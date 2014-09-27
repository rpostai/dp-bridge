package com.rp.dp.bridge;

import com.rp.dp.bridge.implementor.RepositoryImpl;


public class LocalRepository extends Repository{

	public LocalRepository(RepositoryImpl repository) {
		super(repository);
	}

	
}
