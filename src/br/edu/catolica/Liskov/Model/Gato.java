package br.edu.catolica.Liskov.Model;

public class Gato extends Animal{
    public Gato(String nome, int idade, String cor) {
        super(nome, idade, 4, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", patas=" + patas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
