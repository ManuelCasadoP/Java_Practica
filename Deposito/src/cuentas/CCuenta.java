package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
        
    }
    /**
     * Crea una cuenta bancaria con los datos de los parámetros.
     * @param nom String. Nombre del usuario de la cuenta
     * @param cue String. Número de la cuenta.
     * @param sal. Double. Saldo de la cuenta.
     * @param tipo Double. Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta= cue;
        saldo = sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return saldo Double.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Realiza un ingreso de la cantidad del parámetro
     * @param cantidad Double.
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Realiza una retirada de la cantidad del parámetro.
     * @param cantidad Double.
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el valor del atributo nombre
     * @return nombre String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el valor del atributo cuenta.
     * @return cuenta String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Actualiza el valor del atributo cuenta.
     * @param cuenta String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el valor del atributo saldo.
     * @return saldo Double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza el valor del atributo saldo.
     * @param saldo Double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el valor del atributo tipoInterés.
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Actualiza el valor del atributo tipoInterés.
     * @param tipoInterés Double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
