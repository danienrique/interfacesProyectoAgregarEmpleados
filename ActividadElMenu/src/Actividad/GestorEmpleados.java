package Actividad;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
     static List<Empleado> empleados = new ArrayList<>();

    public static void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public static List<Empleado> getEmpleados() {
        return empleados;
    }
}