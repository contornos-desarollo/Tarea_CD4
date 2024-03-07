package tareacd4;

/**
 *
 * @author Misha
 */
public class CtaCorriente {
    public String nombre;
    private String cuenta;
    public double saldocuenta;
    public double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    public double estado()
    {
        return saldocuenta;
    }
    public void ingresar(double cantidad) throws IllegalArgumentException {
        if (cantidad<0)
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
        saldocuenta = saldocuenta + cantidad;
    }

    public void retirar(double cantidad) throws IllegalArgumentException
    {
        if (cantidad <= 0)
            throw new IllegalArgumentException ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new IllegalArgumentException ("No se hay suficiente saldo");
        saldocuenta = saldocuenta - cantidad;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}