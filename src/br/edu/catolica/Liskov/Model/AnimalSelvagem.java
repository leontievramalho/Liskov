package br.edu.catolica.Liskov.Model;

public class AnimalSelvagem extends Animal{
    public AnimalSelvagem(String nome, int idade, int patas, String cor) {
        super(nome, idade, patas, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Raaawr!");
    }

    @Override
    public String toString() {
        return "AnimalSelvagem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", patas=" + patas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
