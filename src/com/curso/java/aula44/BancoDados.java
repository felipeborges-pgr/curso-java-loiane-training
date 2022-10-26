package com.curso.java.aula44;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {
	
	void abrirConexao();
	void fecharConexao();

}
