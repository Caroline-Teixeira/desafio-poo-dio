package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    // Atributos
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>(); // Lista em ordem de inserção e elementos únicos
    private Set<Content> completedContents = new LinkedHashSet<>(); // Lista em ordem de inserção  e elementos únicos
    // polimorfismo da classe Content, que é a superclasse de Course e Mentoring


    // Construtor
    public Dev(String name) {
        this.name = name;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }
    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }
    public Set<Content> getCompletedContents() {
        return completedContents;
    }
    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }


    // Método para inscrever-se em bootcamp
    public void subscribeBootcamp(Bootcamp bootcamp){}


    // Método para progredir no bootcamp
    public void progress() {}


    // Método para calcular XP total
    public void calculateTotalXP() {
    }

    // Método equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContents, dev.subscribedContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, completedContents);
    }
   
}
