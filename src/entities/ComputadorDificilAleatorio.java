package entities;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
public class ComputadorDificilAleatorio extends Computador {
	
	public int[] marcarAutomatico(String [][]matriz) {
		
		//conta o array de tras para frente mudando as formas como sao selecionadas 
		// as primeiras e as seguintes casas que serao escolhidas pelo algoritimo
		//sendo assim é percorrer o array ao contrario
		
		int []guardar = new int[2];
		for(int i=2 ; i >= 0 ; i--) {
			for(int y=2 ; y >= 0 ; y--) {
				if(matriz[y][i] == " ") {
					guardar[0] = y;
					guardar[1] = i;
					break;
				}
			}
		}
		return guardar;
	}
	
}
