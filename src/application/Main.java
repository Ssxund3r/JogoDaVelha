package application;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
import java.util.Scanner;

import entities.ComputadorDificilAleatorio;
import entities.ComputadorFacilMaisUm;
import entities.ComputadorMedioMaisDois;
import entities.Jogador;
import entities.Tabuleiro;

public class Main {

	public static void main(String[] args) {
		
		
		
		Tabuleiro tabuleiro = new Tabuleiro();
		Scanner scanner = new Scanner(System.in);
		
		int nivelDificuldade =0;
		int contaJogada = 1; // conta para trocar as jogadas entre maquina e pessoa
		boolean verificaQuemGanhou = false; // veririfca se alguem ganhou o jogo

		System.out.println(
				"bem vindo ao jogo da Velha \n\n\n\n\n " + "--------------------------------------------------------");

		System.out.println("\nQual seu nome:\n");
		String nomeJogador = scanner.next();
		System.out.println("\nQual sua idade:\n");
		int idadeJogador = scanner.nextInt();
		
		

		Jogador player = new Jogador(nomeJogador, idadeJogador);
		
		System.out.println("deseja jogar contra qual nivel de maquina?\n 1-Facil \n 2-Medio \n 3-Dificil");
		nivelDificuldade = scanner.nextInt();
		
		//escolhe qual dificuldade jogar
		if(nivelDificuldade == 1) {
			
			System.out.println("Vamos começar o jogador sempre começa INICIANDO a partida, sempre será o X");
			//verfica se alguem ganhou
			while (verificaQuemGanhou == false) {
				//verifica a vez de quem é, jogador ou maquina
				if ((contaJogada % 2) != 0) {
					
					boolean verificaJogadaRepetida = false;
					while (verificaJogadaRepetida == false) {
						System.out.println("digite a coluna que deseja jogar de 0 a 2:");
						int coluna = scanner.nextInt();
						System.out.println("digite a linha que deseja jogar de 0 a 2:");
						int linha = scanner.nextInt();
						
						//anota as jogadas do humano
						player.anotandoJogadasExecutadas(coluna, linha);
						
						//faz a jogada pegando as casas
						verificaJogadaRepetida = tabuleiro.jogada(coluna, linha, nomeJogador);
					}

					contaJogada++;
					System.out.println("essa é a jogada número: " +contaJogada);
				} else {
					//instancia a maquina
					ComputadorFacilMaisUm wally = new ComputadorFacilMaisUm();
					boolean verificaJogadaPc = false;
					//array que recebe os resultados
					int receber[] = wally.marcarAutomatico(tabuleiro.getTabuleiroJogo());
					
						int colunaPc = receber[0];
						int linhaPC = receber[1];
						
						
						verificaJogadaPc = tabuleiro.jogada(colunaPc, linhaPC, wally.getNome());

					
					contaJogada++;
					System.out.println("essa é a jogada número: " +contaJogada);
				}

				verificaQuemGanhou = tabuleiro.verificarGanhador(tabuleiro.getTabuleiroJogo());
			}
			player.imprimirJogadasFeitas();
			
		}else if(nivelDificuldade == 2) {
			
			System.out.println("Vamos começar o jogador sempre começa INICIANDO a partida, sempre será o X");
			
			while (verificaQuemGanhou == false) {

				if ((contaJogada % 2) != 0) {
					
					boolean verificaJogadaRepetida = false;
					while (verificaJogadaRepetida == false) {
						System.out.println("digite a coluna que deseja jogar de 0 a 2:");
						int coluna = scanner.nextInt();
						System.out.println("digite a linha que deseja jogar de 0 a 2:");
						int linha = scanner.nextInt();
						
						player.anotandoJogadasExecutadas(coluna, linha);

						verificaJogadaRepetida = tabuleiro.jogada(coluna, linha, nomeJogador);
					}

					contaJogada++;
					System.out.println("essa é a jogada número: " +contaJogada);
				} else {
					
					ComputadorMedioMaisDois wally = new ComputadorMedioMaisDois();
					boolean verificaJogadaPc = false;
					
					int receber2[] = wally.marcarAutomatico(tabuleiro.getTabuleiroJogo());
					
						int colunaPc = receber2[0];
						int linhaPC = receber2[1];

						verificaJogadaPc = tabuleiro.jogada(colunaPc, linhaPC, wally.getNome());

					
					contaJogada++;
					System.out.println("essa é a jogada número: " +contaJogada);
				}

				verificaQuemGanhou = tabuleiro.verificarGanhador(tabuleiro.getTabuleiroJogo());
			}
			player.imprimirJogadasFeitas();
			
		}else if(nivelDificuldade ==  3) {
			
			System.out.println("Vamos começar o jogador sempre começa INICIANDO a partida, sempre será o X");
			
			while (verificaQuemGanhou == false) {

				if ((contaJogada % 2) != 0) {
					
					boolean verificaJogadaRepetida = false;
					while (verificaJogadaRepetida == false) {
						System.out.println("digite a coluna que deseja jogar de 0 a 2:");
						int coluna = scanner.nextInt();
						System.out.println("digite a linha que deseja jogar de 0 a 2:");
						int linha = scanner.nextInt();
						
						player.anotandoJogadasExecutadas(coluna, linha);

						verificaJogadaRepetida = tabuleiro.jogada(coluna, linha, nomeJogador);
					}

					contaJogada++;
					System.out.println("essa é a jogada número: " + contaJogada);
				} else {
					ComputadorDificilAleatorio wally = new ComputadorDificilAleatorio();
					boolean verificaJogadaPc = false;
					
					int receber3[] = wally.marcarAutomatico(tabuleiro.getTabuleiroJogo()); 
					
						int colunaPc = receber3[0];
						int linhaPC = receber3[1];

						verificaJogadaPc = tabuleiro.jogada(colunaPc, linhaPC, wally.getNome());

					
					contaJogada++;
					System.out.println("essa é a jogada número: " +contaJogada);
				}

				verificaQuemGanhou = tabuleiro.verificarGanhador(tabuleiro.getTabuleiroJogo());
			}
			
			player.imprimirJogadasFeitas();
		}else {
			System.out.println("nao tem essa dificuldade, desculpe!");
		}
		
		
		

	}

}
