# Patrones de Creacion
  - Proporcione formas de crear objetos mientras oculta la lógica de creación..}

  * [Fabrica_Abstracta](Fabrica_Abstracta/readme.md)

    __ "Proporcionar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas". __ [GoF]


  * [Builder](builder/readme.md)

  __ "Separe la construcción de un objeto complejo de su representación para que el mismo proceso de construcción pueda crear representaciones diferentes." __ [GoF]

  * [Factory Method](factory_method/readme.md)

   __ "Defina una interfaz para crear un objeto, pero deje que las subclases decidan a qué clase instanciar. Factory Method permite que una clase retrase la creación de instancias en subclases." __ [GoF]
 
 * [Pool_Objetos](Pool_Objetos/readme.md)
   __  "retorna el objeto al pool para que lo retenga hasta que vuelva a necesitar usarse. Es decir, los objetos no se crean (salvo la primera vez) ni se destruyen, simplemente se van reciclando." __ [GoF]
  
  * [Prototype](prototype/readme.md)

   __ "Especifique los tipos de objetos para crear usando una instancia prototípica y cree nuevos objetos copiando este prototipo". __ [GoF]

  * [Singleton](singleton/readme.md)

  __ "Asegúrese de que una clase tenga solo una instancia y proporcione un punto de acceso global a ella." __ [GoF]
  
  <pre><code>
  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractfactory;

import java.util.Scanner;
import patrones.Ejemplo;
import patrones.creacionales.abstractfactory.fabricas.FabricaAbstracta;
import patrones.creacionales.abstractfactory.fabricas.FabricaAmd;
import patrones.creacionales.abstractfactory.fabricas.FabricaIntel;
import patrones.creacionales.abstractfactory.productos.Board;
import patrones.creacionales.abstractfactory.productos.Memoria;
import patrones.creacionales.abstractfactory.productos.Procesador;

/**
 *
 * @author chamo
 */
public class EjemploAbstractFactory implements Ejemplo {

    FabricaAbstracta fabrica;
    Memoria memoria;
    Procesador procesador;
    Board board;
    Scanner escaner;
    int opcion = 0;

    @Override
    public void operacion() {
        escaner = new Scanner(System.in);

        do {
            System.out.println("Ingrese 1 para AMD o 2 para Intel");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2);

        switch (opcion) {
            case 1:
                fabrica = new FabricaAmd();
                break;
            case 2:
                fabrica = new FabricaIntel();
                break;
        }

        board = fabrica.crearBoard();
        memoria = fabrica.crearMemoria();
        procesador = fabrica.crearProcesador();

        System.out.println(board.operacion());
        System.out.println(procesador.operacion());
        System.out.println(memoria.operacion());

    }
}
<code>
