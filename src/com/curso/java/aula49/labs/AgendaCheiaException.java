package com.curso.java.aula49.labs;

public class AgendaCheiaException extends Exception{
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}
}
