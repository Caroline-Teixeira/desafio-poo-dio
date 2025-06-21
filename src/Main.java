import java.time.LocalDate;

import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Mentoring;

public class Main {

  public static void main(String[] args) {
    System.out.println("Desafio");
    Course course1 = new Course(
      "Curso Java",
      "Aprenda Java do básico ao avançado",
      8
    );
    Course course2 = new Course(
      "Curso Python",
      "Aprenda Python do básico ao avançado",
      6
    );

    Mentoring mentoring1 = new Mentoring("Java", "Aprendendo tipos primitivos", LocalDate.now());

    System.out.println(course1);
    System.out.println(course2);
    System.out.println(mentoring1);
  }
}
