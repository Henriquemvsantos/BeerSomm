package br.com.ctup.beersomm.modelo.entidadeNegocio;

import br.com.ctup.beersomm.modelo.entidade.Palativo;

public class PalativoNegocio{

	public static String imprimirDadosPalativo(Palativo palativo) {
		    	
				return "\nAVALIA��O PALATIVO"+
				
                        "\n - Alcool  = " + palativo.getAlcool() +
						"\n - Acidez  = " + palativo.getAcidez() +
						"\n - Textura = " + palativo.getTextura()+
						"\n - Adstrig�ncia = "+ palativo.getAdstringencia() +
						"\n - Corpo = "   + palativo.getCorpo()  +
						"\n - Retrogosto = "+ palativo.getRetrogosto() +
						"\n - Drinkability = "+ palativo.getDrinkability() +
						"\n - Pontuacao Palativa = "   + palativo.getPontuacaoPalativa();
			
		}

	}

	

