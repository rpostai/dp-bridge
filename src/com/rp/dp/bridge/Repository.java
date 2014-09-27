package com.rp.dp.bridge;

import com.rp.dp.bridge.implementor.RepositoryImpl;

public abstract class Repository {
	
	private RepositoryImpl repositoryImpl;
	
	public Repository(RepositoryImpl repository) {
		repositoryImpl = repository;
	}
	
	public void criar(Object o) {
		repositoryImpl.persist(o);
	}
	
	public void remover(Object o) {
		repositoryImpl.remove(o);
	}
	
	public void todosObjetos() {
		repositoryImpl.getAll();
	}

}
