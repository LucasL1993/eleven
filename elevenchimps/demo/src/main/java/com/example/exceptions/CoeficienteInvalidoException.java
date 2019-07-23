package com.example.exceptions;

public class CoeficienteInvalidoException extends RuntimeException{

	private static final long serialVersionUID = -1976843183978576445L;
	
	public CoeficienteInvalidoException() {
		super("Coeficiente inválido");
	}
	
}
