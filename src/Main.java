public class Main {
    public static void main(String[] args) {
        // Actividad 2
        Persona p = new Persona();
        p.nombre = "Juan";
        p.edad = 20;
        p.mostrarInfo();

        // Actividad 3
        Rectangulo r = new Rectangulo();
        r.base = 5;
        r.altura = 3;
        System.out.println("Área del rectángulo: " + r.calcularArea());

        // Actividad 4
        Operaciones op = new Operaciones();
        System.out.println("Suma: " + op.sumar(4, 6));
        System.out.println("Resta: " + op.restar(10, 7));

        // Actividad 5
        Estudiante e = new Estudiante("María", 19);
        e.mostrarDatos();

        // Actividad 1 (Calculadora con GUI)
        new CalculadoraGUI().setVisible(true);
    }
}
