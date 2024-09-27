package clases;

import java.util.ArrayList;
import interfaces.IProyecto;

/**
 *
 * @author ffeli
 */
public class Departamento implements IProyecto {

    private Integer codigo;
    private Jefe jefe;
    private ArrayList<Supervisor> arrayS;
    private ArrayList<Empleado> arrayE;

    public Departamento() {
        arrayS = new ArrayList<Supervisor>();
        arrayE = new ArrayList<Empleado>();
        setCodigo();
        System.out.println("Ingresando datos del jefe.");
        setJefe();
        setArrayS();
        setArrayE();
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        System.out.println("Ingrese el codigo del departamento: ");
        codigo = leer.nextInt();
        leer.nextLine();
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe() {
        jefe = new Jefe();
        jefe.setBonoP("jefe");
        jefe.setEscalafon();
    }

    public ArrayList<Supervisor> getArrayS() {
        return arrayS;
    }

    public void setArrayS() {
        String rpta;
        do {
            System.out.println("Aqui estamos ingresando un supervisor.");
            Supervisor sup = new Supervisor();
            sup.setBonoP("supervisor");
            sup.setTurno();
            arrayS.add(sup);
            System.out.println("¿Desea ingresar otro supervisor? (Si o No): ");
            rpta = leer.nextLine();
        } while (rpta.equalsIgnoreCase("Si"));
    }

    public ArrayList<Empleado> getArrayE() {
        return arrayE;
    }

    public void setArrayE() {
        String rpta;
        do {
            System.out.println("Aqui estamos ingresando un empleado.");
            Empleado emp = new Empleado();
            emp.setBonoP("empleado");
            arrayE.add(emp);
            System.out.println("¿Desea ingresar otro empleado? (Si o No): ");
            rpta = leer.nextLine();
        } while (rpta.equalsIgnoreCase("Si"));
    }

}
