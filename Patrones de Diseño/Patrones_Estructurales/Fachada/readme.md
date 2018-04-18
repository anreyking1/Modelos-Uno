# Facade

>"Provide an unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem
easier to use.
Busca simplificar el sistema, desde el punto de vista del cliente, proporcionando una interfaz unificada para un conjunto de subsistemas, definiendo una interfaz de nivel más alto. Esto hace que el sistema sea más fácil de usar.

Este patrón busca reducir al mínimo la comunicación y dependencias entre subsistemas. Para ello, utilizaremos una fachada, simplificando la complejidad al cliente. El cliente debería acceder a un subsistema a través del Facade. De esta manera, se estructura un entorno de programación más sencillo, al menos desde el punto de vista del cliente (por ello se llama "fachada").

Se debe utilizar cuando:
Se quiera proporcionar una interfaz sencilla para un subsistema complejo.
Se quiera desacoplar un subsistema de sus clientes y de otros subsistemas, haciéndolo más independiente y portable.
Se quiera dividir los sistemas en niveles: las fachadas serían el punto de entrada a cada nivel. Facade puede ser utilizado a nivel aplicación." [GoF]

## Model
![Model](facade.png)

## Example

### Functional Model
  ![functional](exercise/functional.png)

### Structural Model
  ![structural](exercise/structural.png)
>
