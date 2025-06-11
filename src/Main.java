public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Simon", "Perez", "45835771", 20, "Murillo 172", "3541580938");
        persona.saludar();
        persona.mostrarInformacion();
    }
}

class Persona {

    // Atributos privados
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;
    private String direccion;
    private String telefono;

    // Constructor
    public Persona(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setNumeroIdentificacion(numeroIdentificacion);
        setEdad(edad);
        setDireccion(direccion);
        setTelefono(telefono);
        System.out.println("Se ha creado una persona: " + this.nombre + " " + this.apellido);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
        }
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método para mostrar toda la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Número de Identificación: " + numeroIdentificacion);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }

    // Método saludar
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " " + apellido);
    }
}

