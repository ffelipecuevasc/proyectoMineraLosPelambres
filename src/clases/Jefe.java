package clases;

/**
 *
 * @author ffeli
 */
public class Jefe extends Empleado {

    private String escalafon;

    public Jefe() {
        super();
    }

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon() {
        System.out.println("Ingrese la escala (A o B)");
        escalafon = leer.nextLine();

        if (escalafon.equalsIgnoreCase("A")) {
            sueldoL = sueldoL * 1.15;
        }
        if (escalafon.equalsIgnoreCase("B")) {
            sueldoL = sueldoL * 1.07;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Jefe [escalafon=");
        builder.append(escalafon);
        builder.append("]");
        return builder.toString();
    }
}
