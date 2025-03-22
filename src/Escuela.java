import java.util.List;
import java.util.ArrayList;
public class Escuela {
    private List<Estudiante> estudiantes;

    public Escuela() {
        this.estudiantes = new ArrayList<>();
    }


    public void addEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Escuelas disponibles{" +
                "estudiantes=> \n" + estudiantes +
                '}';
    }
}
