package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring {

    // Atributos
    private String title;
    private String description;
    private LocalDate date;

    // Construtor
    public Mentoring(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }
    // Getters e Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Método toString
    @Override
    public String toString() {
        return "Mentoria {" +
                "Título ='" + title + '\'' +
                ", Descrição ='" + description + '\'' +
                ", Data=" + date +
                '}';
    }
   
}
