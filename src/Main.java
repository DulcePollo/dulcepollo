/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dulce
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo("Chevy");
        carro.setLlantas(4);
        carro.setOcupantes(789);
        
        Vehiculo auto = new Vehiculo("Swift");
        auto.setLlantas(2);
        auto.setOcupantes(234);
             
        
        Vehiculo camioneta = new Vehiculo("Toyota");
        camioneta.setLlantas(6);
        camioneta.setOcupantes(987);
        camioneta.abrochar();
        
        Vehiculo moto = new Vehiculo("Honda");
        moto.setLlantas(3);
        moto.setOcupantes(5);
     
        JOptionPane.showMessageDialog(null, carro);
        JOptionPane.showMessageDialog(null, auto);
        JOptionPane.showMessageDialog(null, camioneta);
        JJOptionPane.showMessageDialog(null, moto);
        
    }
}
