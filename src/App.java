

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller1 = new EmpleadoContoller();
        empleadoContoller1.addEmpleado(new Empleado(1,"Steven","John"));
        empleadoContoller1.addEmpleado(new Empleado(1,"Steven","John"));
        empleadoContoller1.addEmpleado(new Empleado(1,"Steven","John"));
        empleadoContoller1.addEmpleado(new Empleado(1,"Steven","John"));
        empleadoContoller1.addEmpleado(new Empleado(1,"Steven","John"));
        empleadoContoller1.imprimirEmpleados();
    }

    private static void runMapExamlpe() {
       new Mapa();
    }

    private static void runEjerccios() {
      
        String str1 = "listen";
        String str2 = "silent";

        // Llamar a la clase AnagramChecker y su método sonAnagramas
        boolean resultado = Ejercicios.areAnagrams(str1, str2);
        if (resultado) {
            System.out.println("Las cadenas son anagramas");
        } else {
            System.out.println("Las cadenas no son anagramas");
        }
        
        


    }
}
