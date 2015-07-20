_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FArquitectura)_

Para poder decidir que deben generar los asistentes de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, previamente se han identificado y definido los componentes software básicos que compondrán el sistema final así como sus responsabilidades y modelos de interacción, es decir, primero se ha establecido su arquitectura y después cómo se automatiza su generación. Es evidente por lo tanto que los sistemas desarrollados a partir de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> siguen siempre una arquitectura predefinida.

<h1>Arquitectura conceptual</h1>

Entendemos como arquitectura conceptual al proceso de definición de la arquitectura software, intentando aislar en la medida de lo posible las tecnologías de implementación finales. Es decir, se trata de la definición de la estructura y comportamiento de los componentes del sistema, utilizando en primer lugar las ideas base o patrones de diseño que mejor se adapten a nuestras necesidades, posteriormente, concretando  las tecnologías que las soportan (qué tecnologías), y finalmente definiendo el modelo de programación (cómo utilizamos las tecnologías).

El hecho de intentar trabajar sobre ideas o patrones en primer lugar facilita la sustitución de las tecnologías seleccionadas en primera instancia. Además simplifica el desarrollo de aplicaciones al trabajar sobre conceptos funcionales y no sobre tecnologías concretas. Por ejemplo, dentro de la definición de la arquitectura conceptual podemos hablar de que queremos una arquitectura local o que es necesario aislar cada módulo mediante interfaces (sin depender de la implementación) evitando en lo posible la forma o el lenguaje en el que se implementará posteriormente.

Con el objetivo de que la arquitectura conceptual que se defina para los sistemas generados con <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> sea fácil de entender, se ha procurado tomar como referencia el estándar de descripción marcado por el modelo IEEE "Recommended Practice for Architectural Description of Software Intensive Systems", completándolo en algún caso por otras aportaciones más concretas y prácticas.

<h2>Principios fundamentales</h2>

La arquitectura conceptual definida debe facilitar el proceso de desarrollo de aplicaciones web, aumentando al máximo la productividad de los desarrolladores. Tratamos además de reutilizar, de mantener las cosas simples, no limitar la evolución e independizar la solución de las tecnologías en la medida de lo posible. En definitiva estamos describiendo un sistema basado en componentes reutilizables que unidos a generadores de código nos permitan producir software de calidad con poco esfuerzo.

Dejando claro que la productividad es nuestro primer objetivo hay otros aspectos que se han tenido en cuenta a la hora de elaborar esta solución. Se prima la selección de herramientas existentes frente al desarrollo propietario. De entre éstas prevalecen aquellas que se apoyan en estándares. Si además éstas son Open Source mejor. Este concepto es igualmente válido a la hora de componer nuestra arquitectura conceptual ya que está basada en arquitecturas de referencia actuales. Así pues, optamos por un diseño por capas que maximice la separación de responsabilidades y por tanto haga más fácil conseguir los requerimientos técnicos que se presuponen a una arquitectura de este tipo, los denominados “ilities” (exensibility, flexibility, testability, reliability…).

La arquitectura debe dar solución tanto a entornos Intranet como a entornos Internet para lo cual el aspecto de accesibilidad se ha debatido y tenido en cuenta especialmente. De la misma forma se han tenido en cuenta aspectos que tanto afectan al rendimiento en estos entornos como minimizar el tráfico a través de la red. Para ello una vez más utilizaremos estándares en forma de patrones de diseño (facade, value object, etc.)

La arquitectura también cubre la relación entre aplicaciones, es decir,  la forma en la que unas aplicaciones exponen servicios para que otras las consuman.

Como punto de partida de la definición de la arquitectura conceptual es necesario cumplir con los requerimientos o características más habituales: fomentar la Productividad del desarrollador, reutilización de código, rendimiento, escalabilidad, fiabilidad, disponibilidad, extensibilidad, mantenibilidad, fácil manejo, y seguridad.

## Capas ##

Dentro del desarrollo de aplicaciones software, en este caso dirigido fundamentalmente al desarrollo de aplicaciones web, existen tareas de muy diferente índole, por ejemplo: la creación del interface gráfico, la persistencia y consulta de datos, etc.

Con el objeto de dividir la complejidad de la arquitectura en módulos más manejables se han establecido las siguientes capas lógicas:

<ul>
<li><b>Capa de presentación:</b> Es la responsable de ofrecer a los usuarios la posibilidad de interactuar con la aplicación de forma sencilla e intuitiva, proporcionando una experiencia de usuario Web satisfactoria. A grandes rasgos se podría decir que la capa de presentación se compone de:<br>
<br>
<ol>
<li>La interfaz de usuario: ofrece a los usuarios información, sugerencias, acciones y captura los datos de entrada a través del teclado y el ratón.</li>
<li>La lógica de presentación: se ejecuta en cliente y hace referencia a todo el procesamiento requerido para mostrar datos y transformar los datos de entrada en acciones que podemos ejecutar contra el servidor.</li>
<li>La lógica de control de peticiones: reside en el servidor y se encarga de interactuar con lógica de presentación, encargándose principalmente de transformar el modelo de datos para la recepción/envío, gestionar las reglas de navegación y enlazar con la capa de servicios de negocio.</li>
</ol>
</li>

<li><b>Capa de servicios de negocio:</b> En  esta capa  es donde  se deben  implementar  todas  aquellas  reglas obtenidas a partir  del  análisis  funcional  del  proyecto. Un servicio se compone de funciones sin estado, auto-contenidas, que aceptan una(s) llamada(s) y devuelven una(s) respuesta(s) mediante una interfaz bien definida. Los servicios no dependen del estado de otras funciones o procesos. Los servicios pueden también enmarcarse en unidades discretas de trabajo, como son las transacciones, que coordinan el uso de la capa de acceso a datos.<br>
</li>

<li><b>Capa de acceso a datos:</b> La capa de acceso a datos es la responsable de la gestión de la persistencia de la información manejada en  las capas superiores. En un modelo académicamente purista, la  interfaz  de  esta  capa  estaría  compuesta  por  vistas  de  las  entidades  a  persistir  (una vista  de  “factura”,  otra  de  “cliente”),  pero  a  efectos  prácticos,  y  con  objeto  de aprovechar  la  habitual potencia  de  los  gestores de  bases de datos,  la  interfaz muestra una  serie de  métodos que pueden  agrupar operaciones  en  lo que  se puede denominar “lógica de persistencia”, como  insertar cliente o  inserción factura, en  la que podrían darse de alta al mismo tiempo una factura y todos las entidades que dependan de dicha factura (porque no, el mismo cliente).<br>
</li>

<li><b>Capa de Remoting:</b> Su propósito será el de permitir ofrecer un acceso a los servicios de negocio debidamente empaquetados a aplicaciones diferentes a la que contiene dichos servicios. Para ello, se utilizan técnicas de Remoting o invocación remota a Objetos. En general en las aplicaciones que no necesiten accesos remotos esta capa no es necesaria. Por esto último se deduce que la capa de Remoting no puede contener lógica de negocio y ha de actuar como Proxy.<br>
</li>

<li><b>Capa de modelo de datos:</b> Uno de los elementos fundamentales del diseño de una aplicación es la definición de los objetos que conforman el modelo de datos de la aplicación. En un modelo de capas cada una de ellas tiene acceso únicamente a las funciones expuestas por la capa siguiente con la excepción del modelo. El modelo es una capa vertical  utilizada por todas las capas horizontales, es por ello que el modelo no utiliza las funciones de ninguna de las capas horizontales. Cuando se dice que el modelo es utilizado por todas las capas horizontales se hace referencia a que habitualmente forma parte de los parámetros de entrada y salida que definen sus interfaces. El modelo de datos es una abstracción del modelo relacional de base de datos representado en clases Java.<br>
</li>

</ul>

<img src='http://uda.googlecode.com/svn/wiki/images/Arquitectura-conceptual-capas2.png' />

<h1>Tecnologías asociadas</h1>

| **Tecnología** | **Versión** | **Función** | **Capa** |
|:---------------|:------------|:------------|:---------|
|jQuery          |1.8.0        |Vista y Ajax |Presentación|
|jQueryUI        |1.8.23       |Vista y Ajax |Presentación|
|Tiles           |2.2.2        |Plantillado  |Presentación|
|JSTL            |1.2          |Vista        |Presentación|
|Spring MVC      |3.1.2        |Control      |Presentación|
|Enterprise Java Beans|3.0          |Remoting     |Remoting  |
|Spring Framework|3.1.2        |Servicio     |Servicio  |
|JTA             |1.1          |Transaccionalidad|Acceso a datos|
|Spring JDBC     |3.1.2        |Persistencia JDBC|Acceso a datos|
|EclipseLink     |2.3.0        |Persistencia JPA2.0|Acceso a datos|
|Spring Framework|3.1.2        |Modelo de datos|Modelo    |
|Spring Framework|3.1.2        |Contenedor IoC|Todas     |
|Spring AOP      |3.1.2        |Aspectos     |Todas     |
|Spring Security |3.1.2        |Seguridad    |Todas     |
|Logback         |1.0.6        |Trazas       |Todas     |
|Slf4j           |1.6.6        |Trazas       |Todas     |
|Hibernate Validator|4.2          |Validación   |Todas     |
|Weblogic        |10.3.5       |Servidor de aplicaciones|Contenedor JEE|
|Java Development Kit|6            |Maquina Virtual Java|JVM       |

<h2>Documentación</h2>
<ul>
<li>Arquitectura conceptual</li>
<li>Selección de Tecnologías</li>
</ul>