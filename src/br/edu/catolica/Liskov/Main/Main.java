package br.edu.catolica.Liskov.Main;

import br.edu.catolica.Liskov.Model.Animal;
import br.edu.catolica.Liskov.Model.AnimalSelvagem;
import br.edu.catolica.Liskov.Model.Cachorro;
import br.edu.catolica.Liskov.Model.Gato;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Cachorro pipoca = new Cachorro("Pipoca", 3, "caramelo");
        Gato mingau = new Gato("Mingau", 2, "preto");
        AnimalSelvagem simba = new AnimalSelvagem("Simba", 5,4, "amarelo");
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(pipoca);
        animais.add(mingau);
        animais.add(simba);
        emitirSom(animais);
    }

    public static void emitirSom(ArrayList<Animal> animais){
        for(Animal a: animais){
            System.out.print(a.getNome() + " faz ");
            a.emitirSom();
        }
    }
}
