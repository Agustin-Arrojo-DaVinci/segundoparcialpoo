public class Main {
    public static void main(String[] args) {
        Profesor primerProfesor = new Profesor(100, "john", "Doe");
        Estudiante primerEstudiante = new Estudiante(44161732, "Agustin", "Arrojo", "Analista");
        primerEstudiante.getMateriasAprobadas().add("Matematica");
        primerEstudiante.getMateriasAprobadas().add("Geografia");
        primerEstudiante.getMateriasAprobadas().add("Historia");
        primerEstudiante.getMateriasInscriptas().add("Literatura");
        primerEstudiante.getMateriasInscriptas().add("Arte");

        System.out.println(primerEstudiante);
        System.out.println(primerProfesor);
        System.out.println(primerEstudiante.getMateriasAprobadas());
        System.out.println(primerEstudiante.getMateriasInscriptas());
    }
}
