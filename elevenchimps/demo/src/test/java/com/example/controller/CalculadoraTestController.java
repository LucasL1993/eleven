package com.example.controller;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.bussiness.CalculadoraBusinessTest;
import com.example.constants.ConstantsTest;
import com.example.exceptions.CoeficienteInvalidoException;
import com.example.rest.CalculadoraController;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraTestController {
	
	private CalculadoraController calculadoraController;
	
	@Mock
	private CalculadoraBusinessTest calculadoraBussiness;
	
	@Before
	public void setUp() {
		calculadoraController = new CalculadoraController();
	}

	
	
	@Test
	public void deve_receber_post_com_valor_maximo() {
		
	}
	
	@Test
	public void deve_receber_post_com_valor_minimo() {
		
	}
	
	@Test
	public void deve_receber_post_valor_maximo_e_minimo() {
		
	}

}
