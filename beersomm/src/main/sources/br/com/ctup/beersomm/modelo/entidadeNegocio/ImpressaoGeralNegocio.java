package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.ImpressaoGeral;

public class ImpressaoGeralNegocio {

	
	public static String imprimirDadosImpressaoGeral(ImpressaoGeral impressaoGeral) {
		
		
			return "\nIMPRESSAO GERAL "+ 
					"\n - Descri��o  = " + impressaoGeral.getDescricao() +
				    "\n - Pontua��o Impress�o = "+impressaoGeral.getPontuacaoImpressao() ;
					
		
	}
	
	

}
