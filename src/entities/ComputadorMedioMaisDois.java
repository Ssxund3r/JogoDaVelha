package entities;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
public class ComputadorMedioMaisDois extends Computador{
	
	
	// o jeito que percorre o arrauy é diferente do jeito facil
	//sendo y percorrendo mais vezes a coluna e i percorrendo as linhas
	//fazendo o percurso contrario do Facil
	public int[] marcarAutomatico(String [][]matriz) {
		int []guardar = new int[2];
		for(int i=0 ; i<3 ; i++) {
			for(int y=0 ; y<3 ; y++) {
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
