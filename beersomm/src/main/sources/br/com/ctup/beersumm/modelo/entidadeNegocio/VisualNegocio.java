package br.com.ctup.beersumm.modelo.entidadeNegocio;

import br.com.ctup.beersumm.modelo.entidade.Visual;


public class VisualNegocio  {
	

	public static  String imprimirDadosVisual(Visual visual) {
		   
				return "\nAVALIA��O VISUAL"+
						"\n - Colora��o da Espuma  = " + visual.getColoracaoEspuma()+
						"\n - Limpidez = " + visual.getLimpidez()+
						"\n - Carbonata��o = "   + visual.getCarbonatacao()+
						"\n - Qualidade Visual = "+ visual.getQualidadeVisual()+
						"\n - Dura��o da Espuma = "+ visual.getDuracaoEspuma()+
						"\n - Colora��o da Cerveja = "+ visual.getColoracaoCerveja() +
						"\n - Pontuacao Visual = "+ visual.getPontuacaoVisual();
		}
	}


	


