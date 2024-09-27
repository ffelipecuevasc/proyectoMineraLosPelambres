package clases;

/**
 *
 * @author ffeli
 */
public class Supervisor extends Empleado {

    private String turno;

    public Supervisor() {
        super();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno() {
        System.out.println("Ingrese el turno: ");
        turno = leer.nextLine();

        if (turno.equalsIgnoreCase("nocturno")) {
            sueldoL = sueldoL * 1.1;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Supervisor [turno=");
        builder.append(turno);
        builder.append("]");
        return builder.toString();
    }
}
