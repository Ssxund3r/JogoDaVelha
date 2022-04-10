package entities;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
public class ComputadorFacilMaisUm extends Computador{
	
	private int contadorColuna =0;
	private int contadorLinha =1;
	
	
	public int[] marcarAutomatico(String [][]matriz) {
		int []guardar = new int[2];
		for(int i=0 ; i<3 ; i++) {
			for(int y=0 ; y<3 ; y++) {
				if(matriz[i][y] == " ") {
					guardar[0] = i;
					guardar[1] = y;
					break;
				}
			}
		}
		return guardar;
	}
	
	
	
	public int gerarColunaFacil() {
		
		if(this.contadorColuna == 2) {
			this.contadorColuna = 0;
		}else {
			this.contadorColuna ++;
		}
		
		
		return this.contadorColuna;
	}
	
public int gerarLinhaFacil() {
		
		if(this.contadorLinha == 2) {
			this.contadorLinha = 0;
		}else {
			this.contadorLinha ++;
		}
		
		
		return this.contadorLinha;
	}
}
