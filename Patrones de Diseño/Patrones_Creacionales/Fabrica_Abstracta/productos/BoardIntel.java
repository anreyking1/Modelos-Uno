/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.productos;

/**
 *
 * @author chamo
 */
public class BoardIntel implements Board{

    @Override
    public String operacion() {
        return "creando board compatible intel";
    }
    
}
