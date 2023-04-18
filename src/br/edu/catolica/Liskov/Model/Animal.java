package br.edu.catolica.Liskov.Model;

public abstract class Animal {
    public String nome;
    public int idade;
    public int patas;
    public String cor;

    public Animal(String nome, int idade, int patas, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.patas = patas;
        this.cor = cor;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", patas=" + patas +
                ", cor='" + cor + '\'' +
                '}';
    }
}
