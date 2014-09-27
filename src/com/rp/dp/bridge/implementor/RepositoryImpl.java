package com.rp.dp.bridge.implementor;

import java.util.List;

public abstract class RepositoryImpl {
	
	public abstract void persist(Object o);
	
	public abstract void remove(Object o);
	
	public abstract List<Object> getAll();
}
