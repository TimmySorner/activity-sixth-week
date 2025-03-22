
public class Main {
    public static void main(String[] args) {
    Estudiante estudiante1 = new Estudiante("Json", 17);
    Estudiante estudiante2 = new Estudiante("Colgate Rodriguez", 13);
    Estudiante estudiante3 = new Estudiante("Maricarmen Ospina", 14);


    Escuela escuelitaDominical = new Escuela();

    escuelitaDominical.addEstudiante(estudiante1);
    escuelitaDominical.addEstudiante(estudiante2);
    escuelitaDominical.addEstudiante(estudiante3);
    System.out.println(escuelitaDominical.toString());
    estudiante1.setEdad(25);
        System.out.println(estudiante1.getNombre());
        System.out.println(estudiante1.getEdad());
    System.out.println("La nueva edad de "+estudiante1.getNombre()+" es "+estudiante1.getEdad());

    }
}