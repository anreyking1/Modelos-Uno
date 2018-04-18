# Factory Method


__ Libera al desarrollador sobre la forma correcta de crear objetos. Define la interfaz de creación de un cierto tipo de objeto, permitiendo que las subclases decidan que clase concreta necesitan instancias.
Muchas veces ocurre que una clase no puede anticipar el tipo de objetos que debe crear, ya que la jerarquía de clases que tiene requiere que deba delegar la responsabilidad a una subclase.

Este patrón debe ser utilizado cuando:
Una clase no puede anticipar el tipo de objeto que debe crear y quiere que sus subclases especifiquen dichos objetos.
Hay clases que delegan responsabilidades en una o varias subclases. Una aplicación es grande y compleja y posee muchos patrones creacionales.

## Model
![Model](Factory_Method.png)

## Codigo

### Functional Model
  ![functional](exercise/java_model/functional.png)


<pre><code>
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.factorymethod;

import patrones.Ejemplo;
import patrones.creacionales.factorymethod.creadores.CreadorAbstracto;
import patrones.creacionales.factorymethod.creadores.CreadorConcreto;
import patrones.creacionales.factorymethod.productos.Producto;

/**
 *
 * @author chamo
 */
public class EjemploFactoryMethod implements Ejemplo{
    CreadorAbstracto creador;
    Producto producto;
    @Override
    public void operacion() {
        creador = new CreadorConcreto();
        producto = creador.crearProducto();
        System.out.println(producto.operacion());
    }
    
}
<code>
