package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.Cerveja;

public class CervejaNegocio {
	
	
	
	public static String imprimirDadosCerveja(Cerveja cerveja){
		   
		 return 
				 "CADASTRO CERVEJA"+
				 "\nMarca = " + cerveja.getMarca() +
				 "\nFabricante = " + cerveja.getFabricante() +
				 "\nRegi�o = " + cerveja.getRegiao()+
				 "\nPa�s = "+ cerveja.getPais() +
				 "\nTeor Alcoolico = " + cerveja.getTeorAlcoolico() +
				 "\nTemperatura = " + cerveja.getTemperatura() +
				 "\nEscola Cervejeira = " + cerveja.getEscolaCervejeira();
				
		}

}
