package entities;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
public class Tabuleiro {

	private String[][] tabuleiroJogo = new String[3][3];

	public Tabuleiro() {
		// iniciar a matriz com zero
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				this.tabuleiroJogo[i][j] = " ";
			}
		}

		

	}
	
	
//jogador e maquina fazem as jogadas, se ja existir uma casa jogada, ele faz o loop la fora para
//poder jogar novamente
	public boolean jogada(int coluna, int linha, String jogador) {
		int verificadorJogada = 0;

		if (jogador == "pc") {
			if (this.tabuleiroJogo[coluna][linha] == " ") {
				this.tabuleiroJogo[coluna][linha] = "O";
				
				for (int l = 0; l < 3; l++) {
					for (int c = 0; c < 3; c++) {
						System.out.print(tabuleiroJogo[l][c] + " "); // imprime caracter a caracter
					}
					System.out.println(" ");// muda de linha
				}
				
				
				return true;
			} else {
				System.out.println("já esta marcado, escolha outro");
				return false;
			}
		} else {
			if (this.tabuleiroJogo[coluna][linha] == " ") {
				this.tabuleiroJogo[coluna][linha] = "X";
				
				
				for (int l = 0; l < 3; l++) {
					for (int c = 0; c < 3; c++) {
						System.out.print(tabuleiroJogo[l][c] + " "); // imprime caracter a caracter
					}
					System.out.println(" ");// muda de linha
				}
				
				return true;
			} else {
				System.out.println("já esta marcado, escolha outro");
				return false;
			}
		}	
	}

	public boolean verificarGanhador(String[][] matriz) {
		// verificando se todas as horizontais sao iguais
		if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X"
				|| matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X"
				|| matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X") {
			System.out.println("jogador Pessoa Ganhou");
			return true;
		} else if (matriz[0][0] == "O" && matriz[0][1] == "O" && matriz[0][2] == "O"
				|| matriz[1][0] == "O" && matriz[1][1] == "O" && matriz[1][2] == "O"
				|| matriz[2][0] == "O" && matriz[2][1] == "O" && matriz[2][2] == "O") {
			System.out.println("o Computador ganhou");
			return true;
		}

		// verificando se todas as verticais sao iguais
		if (matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0] == "X"
				|| matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1] == "X"
				|| matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2] == "X") {
			System.out.println("jogador Pessoa Ganhou");
			return true;
		} else if (matriz[0][0] == "O" && matriz[1][0] == "O" && matriz[2][0] == "O"
				|| matriz[0][1] == "O" && matriz[1][1] == "O" && matriz[2][1] == "O"
				|| matriz[0][2] == "O" && matriz[1][2] == "O" && matriz[2][2] == "O") {
			System.out.println("o Computador ganhou");
			return true;
		}
		
		//verificando diagonais
		if (matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X"
				|| matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X"
				) {
			System.out.println("jogador Pessoa Ganhou");
			return true;
		} else if (matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2] == "O"
				|| matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0] == "O") {
			System.out.println("o Computador ganhou");
			return true;
		}
		
		//verifica se todas as casas sao diferentes de vazio
		//se forem verifica se é igual a 9 e deu velha
		//pois se nao, teria caido nos ifs anteriores
		int contador=0;
		for(int i=0 ; i<3 ; i++) {
			for(int y=0 ; y < 3 ; y++) {
				if(matriz[i][y] != " ") {
					contador++;
				}
			}
		}
		
		if(contador == 9) {
			System.out.println("o Jogo deu Velha");
			return true;
		}
		
		return false;
	}

	public String[][] getTabuleiroJogo() {
		return tabuleiroJogo;
	}

	public void setTabuleiroJogo(String[][] tabuleiroJogo) {
		this.tabuleiroJogo = tabuleiroJogo;
	}

}
