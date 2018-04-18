# Builder

__"Separe la construcción de un objeto complejo de su representación para que el mismo proceso de construcción pueda crear representaciones diferentes." __ [GoF]
Permite la creación de un objeto complejo, a partir de una variedad de partes que contribuyen individualmente a la creación y ensamblación del objeto mencionado. Hace uso de la frase "divide y conquistarás". Por otro lado, centraliza el proceso de creación en un único punto, de tal forma que el mismo proceso de construcción pueda crear representaciones diferentes.

Los objetos que dependen de un algoritmo tendrán que cambiar cuando el algoritmo cambia. Por lo tanto, los algoritmos que estén expuestos a dicho cambio deberían ser separados, permitiendo de esta manera reutilizar dichos algoritmos para crear diferentes representaciones. 

Se debe utilizar este patrón cuando sea necesario:
Independizar el algoritmo de creación de un objeto complejo de las partes que constituyen el objeto y cómo se ensamblan entre ellas.
Que el proceso de construcción permita distintas representaciones para el objeto construido, de manera dinámica.
Esta patrón debe utilizarse cuando el algoritmo para crear un objeto suele ser complejo e implica la interacción de otras partes independientes y una coreografía entre ellas para formar el ensamblaje. Por ejemplo: la construcción de un objeto Computadora, se compondrá de otros muchos objetos, como puede ser un objeto PlacaDeSonido, Procesador, PlacaDeVideo, Gabinete, Monitor, etc. 

## Model
![Model](Builder.png)

## Example

### Codigo
<pre><code>
/*
 * Director del patron
 */
package patrones.creacionales.builder;

/**
 * 
 * @author daza
 */
public class Agencia {
    private ConstructorTour constructor;

    public void setConstructor(ConstructorTour constructor) {
        this.constructor = constructor;
    }
    
    public Tour getTour(){
        return constructor.getTour();
    }
    
    public void construirTour(){
        constructor.construirTour();
        constructor.construirHoteles();
        constructor.construirTickets();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

/**
 *
 * @author daza
 */
public class BuguieTour extends ConstructorTour{
    
    @Override
    public void construirTour() {
        tour = new Tour();
    }
    
    @Override
    public void construirHoteles() {
        tour.addHotel("Hilton");
        tour.addHotel("Buckingham Palace");
        tour.addHotel("Holiday Inn");
    }

    @Override
    public void construirTickets() {
        tour.addTicket("Caracas");
        tour.addTicket("Londres");
        tour.addTicket("Madrid");
        
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

/**
 *
 * @author daza
 */
public abstract class ConstructorTour {
    protected Tour tour;

    public Tour getTour() {
        return tour;
    }
    
    public abstract void construirTour();
    public abstract void construirHoteles();
    public abstract void construirTickets();
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

import java.util.Iterator;
import patrones.Ejemplo;

/**
 *
 * @author daza
 */
public class EjemploBuilder implements Ejemplo{

    @Override
    public void operacion() {
        Agencia agencia = new Agencia();
        agencia.setConstructor(new BuguieTour());
        agencia.construirTour();
        
        Tour tour = agencia.getTour();
        Iterator itHoteles = tour.getHoteles().listIterator();
        Iterator itTickets = tour.getTickets().listIterator();
        while(itHoteles.hasNext() ){
            System.out.println(itTickets.next() + " en el " + itHoteles.next());
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.builder;

import java.util.ArrayList;

/**
 *
 * @author daza
 */
public class Tour {
    private ArrayList<String> hoteles = new ArrayList<String>();
    private ArrayList<String> tickets = new ArrayList<String>();
    
    public void addHotel(String h){
        hoteles.add(h);
    }
    
    public void addTicket(String t){
        tickets.add(t);
    }

    public ArrayList<String> getHoteles() {
        return hoteles;
    }

    public ArrayList<String> getTickets() {
        return tickets;
    }
      
    
}

<code>
