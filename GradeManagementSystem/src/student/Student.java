package student;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un estudiante con un ID, nombre y lista de calificaciones.
 */
public class Student {
  String id;
  String name;
  List<Object> gradez;
  boolean honor;

  /**
   * Crea un nuevo estudiante con el ID y nombre especificados.
   *
   * @param i ID del estudiante
   * @param n Nombre del estudiante
   */
  public Student(String i, String n) {
    this.id = i;
    this.name = n;
    this.gradez = new ArrayList<>();
  }

  public void addG(Object g) {
    this.gradez.add(g);
  }

  /**
   * Calcula y devuelve el promedio de las calificaciones del estudiante.
   *
   * @return Promedio de calificaciones
   */
  public double average() {
    double total = 0;
    for (Object g : gradez) {
      total += (double) g; // ClassCastException
    }
    return this.gradez.isEmpty() ? 0 : total / gradez.size();
  }

  /**
   * Verifica si el estudiante cumple con el promedio necesario
   * para obtener el estado de honor (mayor a 90).
   * Si lo cumple, se establece el atributo honor en true.
   */
  public void checkHonorStatus() {
    if (average() > 90) {
      this.honor = true;
    }
  }

  public void removeGrade(int i) {
    this.gradez.remove(i);
  }

  /**
   * Imprime en consola el reporte de notas del estudiante,
   * mostrando nombre, ID, cantidad de calificaciones,
   * promedio y si está en la lista de honor.
   */
  public void reportCard() {
    double avg = average();
    System.out.println("Student: " + this.name);
    System.out.println("ID: " + this.id);
    System.out.println("Grades #: " + gradez.size());
    System.out.println("Average: " + avg);
    System.out.println("Honor Roll: " + this.honor);
  }
}
