package br.com.java.animalTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.java.animal.classe.Animal;

public class AnimalTest {
	static Scanner teclado = new Scanner(System.in);
	static List<Animal> animalLista = new ArrayList<>();

	public static void main(String[] args) {

		Animal animal = new Animal();
		
		animal.setNome("Tubarao");
		animal.setComportamento("vive na agua");
		
		animalLista.add(animal);

		

		String resposta = " ";
		String respostaContinuar = " ";
		do {
			System.out.println("Pense em um animal e digite ' OK ' para continuar");
			 respostaContinuar = teclado.next();
			 if(!respostaContinuar.equals("ok")) {
				 break;
			 }
			for (int i = 0; i < animalLista.size(); i++) {
				System.out.println("o animal que voce pensou "+animalLista.get(i).getComportamento()+" ? ");

				resposta = teclado.next();
				if (resposta.equals("sim")) {
					System.out.println("o animal que voce pensou e um(a) " + animalLista.get(i).getNome()+" ? ");
					resposta = teclado.next();
					if(resposta.equals("sim")) {
						System.out.println("Acertei!");
						break;
					}else {
						criarAnimal();
						break;
					}
				
				}
				if(resposta.equals("nao")&& i+1 == animalLista.size()) {
					criarAnimal();
					break;
				}
			}

		} while (respostaContinuar.equals("ok"));
	}
	
	private static void criarAnimal() {
		Animal animalNovo = new Animal();
		
		System.out.println("qual animal voce pensou?");
		animalNovo.setNome(teclado.next());
		System.out.println("um(a) " + animalNovo.getNome() + "__" + " mas um(a) " + animalLista.get(0).getNome() + " nao ");
		animalNovo.setComportamento(teclado.next());
		animalLista.add(animalNovo);
	}
	
}







