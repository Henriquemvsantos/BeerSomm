package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.Olfativo;

public class OlfativoNegocio extends AvaliacaoNegocio{


	public static  String imprimirDadosOlfativo(Olfativo olfativo) {
    
			return "\nAVALIAÇÃO OLFATIVO"+
					"\n - Impressões Gerais Olfativas  = " + olfativo.getImpressoesGeraisOlfativas() +
					"\n - Reconhecimento de Aromas = " +olfativo.getReconhecimentodeAromas()+
					"\n - Pontuação Olfativa = "+olfativo.getPontuacaoOlfativa();
		
	}

	

}
