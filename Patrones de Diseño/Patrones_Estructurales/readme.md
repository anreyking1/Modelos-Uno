# Patrones estructurales
  - Tratar de delegar responsabilidades a otros objetos.

  * [Adapter] (Fabrica_Abstracta / readme.md)
    - Permite la conversión de la interfaz de una clase a otra interfaz que el cliente espera. Comunica las interfaces incompatibles.

  * [Bridge] (Builder / readme.md)
    - Permite la separación de una interfaz abstracta de su implementación.

  * [Cadena_de_responsabilidad] (factory_method / readme.md)
    - Evite acoplar un objeto remitente (solicitud) a un objeto receptor. Permite que un objeto remitente pase su solicitud a lo largo de una cadena de objetos sin tener ningún conocimiento sobre qué objeto manejará la solicitud.

  * [Decorador] (Pool_Objetos / readme.md)
    - Extiende la funcionalidad de un objeto de manera transparente para sus clientes sin usar herencia.

  * [Fachada] (prototype / readme.md)
    - Proporcionar una interfaz de nivel superior a un subsistema de clases, haciendo que el subsistema sea más fácil de usar.

  * [Proxy] (singleton / readme.md)
    - Permite usar un objeto separado como sustituto para proporcionar acceso controlado a un objeto que no es accesible por medios normales.
      - Proxy virtual: ayuda a crear objetos bajo demanda (hasta que se requiera)
      - Proxy de recuento: para proporcionar algún tipo de mecanismo de auditoría antes de ejecutar un método en un objeto de destino.
