package main;

import student.Student;

/**
 * Clase principal para ejecutar el programa de prueba.
 */
public class Main {

  /**
   * Método principal de ejecución.
   * 
   */
  public static void main(String[] args) {
    Student s = new Student("abc", "null");
    s.addG(100);
    s.addG("Ninety");
    s.average();
    s.checkHonorStatus();
    s.removeGrade(9);
    s.reportCard();
    System.out.println(s.average());
  }
}