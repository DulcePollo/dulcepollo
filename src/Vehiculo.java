/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class Vehiculo {
    private String nombre;
    private int ocupantes, llantas;
    private String cinturon;
    
 public Vehiculo (String n)       {
     this.nombre = n;
 }

    /**
     * @return the nombre
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
     * @return the ocupantes
     */
    public int getOcupantes() {
        return ocupantes;
    }

    /**
     * @param ocupantes the ocupantes to set
     */
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
 
    @Override
    public String toString(){
        return this.getNombre() + "puede llevar a" + this.getOcupantes() + "gracias a sus " + this.getLlantas() + "Llantas" + this.getCinturon() + "se puso los cinturones";
    }

    /**
     * @return the cinturon
     */
    public String getCinturon() {
        return cinturon;
    }

    /**
     * @param cinturon the cinturon to set
     */
    public void setCinturon(String cinturon) {
        this.cinturon = cinturon;
    }
    
    public void abrochar(){
        JOptionPane.showMessageDialog(null, "cinturones abrochados");
    }
}public void abrchar 
