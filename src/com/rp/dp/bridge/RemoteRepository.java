package com.rp.dp.bridge;

import com.rp.dp.bridge.implementor.RepositoryImpl;


public class RemoteRepository extends Repository {

	public RemoteRepository(RepositoryImpl repository) {
		super(repository);
	}
}
