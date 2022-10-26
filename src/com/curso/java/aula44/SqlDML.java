package com.curso.java.aula44;

public interface SqlDML {
	
	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);
}
