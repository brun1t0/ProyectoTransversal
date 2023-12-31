
package proyecto_transversal.Entidades;


public class Inscripciones {
    
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripciones() {
    }

    public Inscripciones(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripciones(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
    
    public Inscripciones(int IdInscripcion, Alumno alumno, double nota) {
        this.alumno = alumno;
        this.idInscripcion = IdInscripcion;
        this.nota = nota;
    }
    
    public Inscripciones(int IdInscripcion, Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.idInscripcion = IdInscripcion;
    }

    public Inscripciones(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc=idInscripcion +" "+alumno.getNombre() +" "+ nota;
        return insc;                   
    }
    
    
    
}
