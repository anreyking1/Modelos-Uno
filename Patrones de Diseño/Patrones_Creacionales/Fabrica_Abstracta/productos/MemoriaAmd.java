/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory.productos;

/**
 *
 * @author chamo
 */
public class MemoriaAmd implements Memoria{
    
    @Override
    public String operacion() {
        return "creando memoria compatible AMD";
    }
}
