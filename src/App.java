import clases.Estudiante;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Estudiante> listado_estudiantes = new ArrayList<>();

        listado_estudiantes.add(new Estudiante("daniel santos","2023-0365" ));
        listado_estudiantes.add(new Estudiante("maria perez","2020-1202"));
        listado_estudiantes.add(new Estudiante("andrez santos", "2019-0396", "software"));

        for(Estudiante estudiante : listado_estudiantes){
            estudiante.mostrarInformacion();
        }
    }
}