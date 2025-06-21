package br.com.dio.desafio.dominio;

public class Course {

    // Atributos
    private String title;
    private String description;
    private int workload;

    // Construtor
    public Course(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
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
    public int getWorkload() {
        return workload;
    }
    public void setWorkload(int workload) {
        this.workload = workload;
    }

    // Método toString
    @Override
    public String toString() {
        return "Curso {" +
                "Título ='" + title + '\'' +
                ", Descrição ='" + description + '\'' +
                ", Carga Horária=" + workload +
                '}';
    }


    // Método para calcular XP
    public int calculateXP() {
        return 10 * workload; // Exemplo de cálculo de XP
    }

   
}
