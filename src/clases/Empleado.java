package clases;
import interfaces.IProyecto;
/**
 *
 * @author ffeli
 */
public class Empleado implements IProyecto{

    protected String rut, nombre, profesion;
    protected Double sueldoB, bonoP, sueldoL;

    public Empleado() {
        setRut();
        setNombre();
        setProfesion();
        setSueldoB();
        setSueldoL();
    }

    public String getRut() {
        return rut;
    }

    public void setRut() {
        System.out.println("Ingrese el rut del empleado: ");
        rut = leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = leer.nextLine();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion() {
        System.out.println("Ingrese una profesion del empleado: ");
        profesion = leer.nextLine();
    }

    public Double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB() {
        System.out.println("Ingrese el sueldo base del empleado: ");
        sueldoB = leer.nextDouble();
        leer.nextLine();
    }

    public Double getBonoP() {
        return bonoP;
    }

    public void setBonoP(String cargo) {
        if (cargo.equals("empleado")) {
            bonoP = sueldoL * 0.2;
        } else if (cargo.equals("supervisor")) {
            bonoP = sueldoL * 0.3;
        } else if (cargo.equals("jefe")) {
            bonoP = sueldoL * 0.4;
        }
        sueldoL = sueldoL + bonoP;
    }

    public Double getSueldoL() {
        return sueldoL;
    }

    public void setSueldoL() {
        sueldoL = sueldoB - (sueldoB * 0.2);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Empleado [rut=");
        builder.append(rut);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", profesion=");
        builder.append(profesion);
        builder.append(", sueldoB=");
        builder.append(sueldoB);
        builder.append(", bonoP=");
        builder.append(bonoP);
        builder.append(", sueldoL=");
        builder.append(sueldoL);
        builder.append("]");
        return builder.toString();
    }

}
