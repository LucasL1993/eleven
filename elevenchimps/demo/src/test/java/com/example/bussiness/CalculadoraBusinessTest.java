package com.example.bussiness;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.stereotype.Component;

import com.example.constants.ConstantsTest;
import com.example.exceptions.CoeficienteInvalidoException;

@RunWith(MockitoJUnitRunner.class)
public class CalculadoraBusinessTest {

	@Test
	public void deve_realizar_calculo_de_dieta_default() throws Exception{
//		calculadoraBussiness.calculaPreco(ConstantsTest.mValorMinimoInicialDefault, ConstantsTest.tValorMaximoInicialDefault, ConstantsTest.aFator, ConstantsTest.xQuilosPorMes,ConstantsTest.constanteZeroVirgulaSeteCinco);
		double m = ConstantsTest.mValorMinimoInicialDefault;
		double t = ConstantsTest.tValorMaximoInicialDefault;
		double x = ConstantsTest.xQuilosPorMes;
		double a = ConstantsTest.aFator;
		double elevado = Math.pow(ConstantsTest.constanteZeroVirgulaSeteCinco,x);
		double tMenosM = t - m;
		double aVezesM = a*m;
		//tem que testar o coeficiente
//		a = -2;
		if(a < 0 || a > 1) {
			throw new CoeficienteInvalidoException();
		}
		
//		(0,9*(10))*(0.31640625)+0,9*10
//
//		9*0.31640625
//
//		2,84765625 + 0,9*10
//
//		11,85
//
//		x4
//
//		47

		//aqui testa se o valor todo do primeira parte do calculo é maior ou = a m
		double calculo = (a*(tMenosM))*elevado + (aVezesM);
//		f(x) = if(((a*(t-m))(0,75^x) + a*m)>=m;
//			 ((a*(t-m))(0,75^x) + a*m);
//			 m)
		m = 11.84765625;
		BigDecimal bd = new BigDecimal(m).setScale(2, RoundingMode.HALF_EVEN);
		
		if(calculo > m) {
			System.out.println(calculo+"  Parou aqui no metodo");
			
		}
		
		assertEquals(ConstantsTest.precoQuilo, bd.toString() );
	}
	
	@Test(expected = CoeficienteInvalidoException.class)
	public void testa_se_coeficiente_e_invalido() {
		
	}
	
	@Test
	public void deve_realizar_calculo_de_dieta_com_parametros(){
		
	}
	
	@Test
	public void deve_retornar_valor_da_dieta() {
		
	}

}
