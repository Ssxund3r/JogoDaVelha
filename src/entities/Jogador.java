package entities;
/*@author: Gabriel Filipe da Costa; Email: gabrielfillip@gmail.com; RU: 3618909*/
import java.util.ArrayList;

public class Jogador {
	private String nome;
	private int idade;
	private ArrayList<String> anotarJogadas;
	
	public Jogador(String nome, int idade) {
		this.nome=nome;
		this.idade = idade;
		anotarJogadas = new ArrayList<String>();
	}
	//recebe a coluna e linha jogada
	//transforma em string
	//acrescenta as informações e adiciona dentro de um arrayList proprio para gravar as 
	//jogadas
	public void anotandoJogadasExecutadas(int coluna,int linha) {
		String transformarColuna = String.valueOf(coluna);
		String transformarLinha = String.valueOf(linha);
		
		
		String juncaoJogadas = transformarColuna +" Coluna " +transformarLinha + " Linha";
		
		this.anotarJogadas.add(juncaoJogadas);
	}	
	
	
	public void imprimirJogadasFeitas() {
		System.out.println("\n\n\nAs jogadas foram:\n primeiro numero a coluna espaço depois a linha jogada:\n\n");
		for(int i=0 ; i< this.anotarJogadas.size() ; i++) {
			System.out.println("jogada:"+ i + "=  "+ anotarJogadas.get(i));
		}
	}
	
}
