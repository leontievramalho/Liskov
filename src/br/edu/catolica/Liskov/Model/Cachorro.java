package br.edu.catolica.Liskov.Model;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String cor){
        super(nome, idade, 4, cor);
    }
    @Override
    public void emitirSom() {
        System.out.println("au au!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", patas=" + patas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
