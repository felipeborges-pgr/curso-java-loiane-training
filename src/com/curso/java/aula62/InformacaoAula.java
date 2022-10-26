package com.curso.java.aula62;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	String blog() default "http://fp.com";
	
	String site() default "http://fp.site";

}
