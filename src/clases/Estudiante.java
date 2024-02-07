package clases;

import java.util.ArrayList;

public class Estudiante {
        String nombre;
        String apellido;
        int edad;
        String telefono;
        boolean becado;
        String matricula;
        String carrera;
        ArrayList <String> materias;
        static int count_estudiante;

        public Estudiante(String nombre,String matricula){
            this.nombre=nombre;
            this.matricula=matricula;
            Estudiante.count_estudiante++;
        }

        public Estudiante(String nombre, String matricula,String carrera){
            this.nombre=nombre;
            this.matricula=matricula;
            this.carrera=carrera;
            Estudiante.count_estudiante++;
        }

        //metodos acessores getter and setter
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre =nombre;
        }
        public String getApellido(){ 
            return apellido;
        }
        public void setApellido(String apellido ){
            this.apellido =apellido;
        }
        public int getEdad () {
            return edad ;
        }
        public void setEdad (int edad) {
            this.edad =edad;
        }
        public String getTelefono() {
            return telefono ;
        }
        public void setTelefono(String telefono) {
            this.telefono =telefono;
        }

        public String getMatricula() {
            return matricula ;
        }

        public void setBecado(boolean becado) {
            this.becado =becado;
        }
        public boolean getBecado() {
            return becado;
        }
        public String getCarrera() {
            return carrera ;
        }
        public void setCarrera(String carrera){
            this.carrera=carrera;
        }

        public ArrayList<String> getMaterias(){
            return materias;
        }

        public  void setMateria(String materias){
           this.materias.add(materias);
        }

        //metodos de la clase

        public void agregarMateria(ArrayList<String> materiasList){
            for (int i =0; i < materiasList.size(); i++) {
                this.materias.add(materiasList.get(i));
            }
        }

        public void agregarMateria(String materia){
            if (!this.materias.contains(materia)) {
                this.materias.add(materia);
            }else{
                System.out.println("esta materia ya se registro");
            }
        }

        public void mostrarInformacion(){
            System.out.println("estos son los datos del estudante");
            System.out.println("nombre: "+ getNombre() + " apellido: " + getApellido() + " matricula: " + 
            getMatricula() + " edad: " + getEdad() + " carrera: " + getCarrera() + " telefono: " + getTelefono());
        }

        public static int obtenerCantidadEstudiantes(){
            return count_estudiante;
        }



}
