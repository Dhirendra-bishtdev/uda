_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FPatrones)_

<h1>Patrones de interacción</h1>

En el planteamiento y desarrollo de los patrones de interacción analizados se ha tenido en cuenta las guías de accesibilidad [WCAG 2.0](http://www.w3.org/TR/WCAG20/) (Content Accessibility Guidelines) y [WAI-ARIA](http://www.w3.org/WAI/intro/aria.php) (Accessible Rich Internet Applications), estándares de desarrollo web accesible que serán ampliamente utilizados en los próximos años.

A diferencia de las WCAG 1.0 desarrolladas por el W3C y la Norma UNE 139803:2004, <i>“Aplicaciones informáticas para personas con discapacidad. Requisitos de accesibilidad para contenidos en la Web”</i>, desarrollada por AENOR y en la que se basa la legislación española actual en materia de accesibilidad, las WCAG 2.0 asumen que cualquier agente de usuario y tecnología asistiva actual o futura soporta Javascript por lo que no exigen la creación de alternativas sino que los controles RIA estén programados de forma accesible.

En concreto, las WCAG 2.0 que exigen la accesibilidad mediante teclado e independiente del dispositivo de entrada:
<ul>
<li>WCAG 2.0 - Pauta 2.1</li>
Accesible a través del teclado: Haga que toda funcionalidad esté disponible a través del teclado.<br>
</ul>

Además, las WCAG 2.0 añaden nuevas pautas que influyen en la interacción con los controles RIA:
<ul>
<li>WCAG 2.0 - Pauta 2.2</li>
Tiempo suficiente: <i>Proporcione a los usuarios el tiempo suficiente para leer y usar un contenido.</i>

<li>WCAG 2.0 - Pauta 2.4</li>
Navegable: <i>Proporcione medios que sirvan de ayuda a los usuarios a la hora de navegar, localizar contenido y determinar dónde se encuentran.</i>

<li>WCAG 2.0 - Pauta 3.2</li>
Predecible: <i>Cree páginas web cuya apariencia y operabilidad sean predecibles.</i>

<li>WCAG 2.0 - Pauta 3.3</li>
Ayuda a la entrada de datos: <i>Ayude a los usuarios a evitar y corregir errores.</i>
</ul>

En cualquier caso, debido a la multitud de problemas de accesibilidad que se pueden dar y a la propia naturaleza a veces poco accesible de las tecnologías RIA, puede haber patrones difícilmente accesibles.

<h2>Tecnología de desarrollo</h2>
Con el fin de reducir al máximo la curva de aprendizaje en el uso de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, todos los patrones de interacción propuestos han sido desarrollados con el framework JavaScript [jQuery](http://jquery.com/), aprovechando en todos los casos los plugins ya desarrollados por la comunidad.

En general, jQuery es fácil de aprender y tiene un estilo de programación casi coloquial, lo que permite conseguir resultados  rápidamente sin tener que aprender las partes más complejas de JavaScript.

La gestión de ciertas partes visuales de los componentes que implementan los patrones  identificados se han realizado mediante el plugin [jQueryUI](http://jqueryui.com/home), el cual nos permite construir aplicaciones web altamente interactivas, proporcionando abstracciones de bajo nivel de interacción y animación, efectos avanzados de alto nivel y  componentes personalizables (estilos).

Los recursos disponibles para conocer y trabjar con jQuery y jQueryUI son muy numerosos. Un amplia comunidad de desarrolladores muy activos completan continuamente su biblioteca de posibilidades (plugins). La disponibilidad de numerosos libros, articulos, foros, etc. hace que el uso de esta librería se convierta en un ventaja.

Otro aspecto a su favor es que jQueryUI está trabajando activamente en temas de accesibilidad. Cierto soporte WAI-ARIA fue ya introducido en la versión 1.7 y es posible que la versión 2.0 cumpla totalmente con las guías de accesibilidad WAI-ARIA.


## RUP ##

Los componentes (plugins jQuery) que implementan los patrones de interacción identificados han sido agrupados bajo un nombre propio, RUP (Rich Uda Patterns).

Estos componentes RUP son totalmente configurables, es decir, que es posible modificar su comportamiento según interese en cada caso. Por ejemplo, el mismo componente de mantenimiento cubre los patrones de "mantenimiento con formulario" y el de "mantenimiento con creación y edición en celda", de modo que a través de variables de configuración el mismo componente se podrá comportar de la manera deseada.



### 1. Pestañas de contenido ###

Permiten dar acceso de forma compacta a grupos de contenidos mutuamente excluyentes pudiendo ser integradas en zonas muy reducidas de la interfaz.

<h4>Usar cuando</h4>Cuando tengamos un elemento formado por mucha información y podamos dividir ésta en grupos diferenciados dando así a los usuarios acceso a la información de forma rápida y en un espacio compacto.

También es útil cuando tenemos que mostrar mucha información dividida en grupos diferenciados y disponemos de poco espacio para hacerlo.

<h4>Por qué</h4>
<ul>
<li>Cuando la información está correctamente separada y dividida en pestañas se facilita mucho la comprensión de la interfaz por parte del usuario ya que todo parece lógico, puesto en su sitio y correctamente separado.</li>
<li>Dan acceso a información amplia y variada sin agobiar al usuario: él elige qué pestaña mirar</li>
<li>Optimizan el espacio en la interfaz. En ciertas situaciones en las que estamos obligados a incluir una gran cantidad de información en un espacio reducido pueden ser una buena solución.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/pestañas.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 2. Menús de navegación ###

Menú de la aplicación mantenido a lo largo de todas las páginas de forma consistente, que muestra entradas directas a secciones clave de la aplicación.

<h4>Usar cuando</h4>Cuando tengamos un sitio web estructurado jerárquicamente y relativamente amplio y queramos facilitar y agilizar la navegación y dar contexto al usuario.

<h4>Por qué</h4>
<ul>
<li>Los menús de navegación son la forma estándar de estructurar grupos jerárquicos de contenidos y dar acceso a ellos.</li>
<li>Facilitan la comprensión de la estructura de la página y la navegación.</li>
<li>Apoyados de migas de pan y buenos títulos y subtítulos dan buen contexto al usuario.</li>
</ul>

<h4>Ejemplos</h4>

Menú horizontal:

<img src='http://uda.googlecode.com/svn/wiki/images/menuh.png' />

Menú mixto:

<img src='http://uda.googlecode.com/svn/wiki/images/menum.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 3. Pestañas de navegación ###

Menú de navegación de la aplicación que divide ésta en secciones claramente excluyentes entre sí y da acceso a ellas.

<h4>Usar cuando</h4>Cuando tengamos una aplicación web cuyos contenidos se puedan dividir en secciones claramente excluyentes entre sí y queramos proporcionar a los usuarios un menú de navegación para navegar por ellas.

<h4>Por qué</h4>
<ul>
<li>Cuando la información está bien organizada y dividida se facilita mucho la comprensión de la navegación ya que se reduce su ambigüedad.</li>
<li>La metáfora de las pestañas es conocida por los usuarios. Es una metáfora traída del mundo real basada en los clasificadores de papeles.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/pestañas.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 4. Migas de pan ###

Se muestra a los usuarios la ruta de navegación que ha seguido por la aplicación permitiéndoles volver hacia niveles superiores hasta la página de inicio.

<h4>Usar cuando</h4>Cuando queramos mostrar al usuario la ruta de navegación que ha seguido, en qué página está y permitirle volver fácilmente a niveles superiores.

Se recomienda usarlas en aplicaciones web con tres o más niveles de jerarquía ya que es en este tipo de aplicaciones donde son realmente útiles.

<h4>Por qué</h4>
<ul>
<li>Es una solución conocida por los usuarios y fácil de comprender.</li>
<li>Aporta flexibilidad a la navegación al permitir volver a niveles superiores.</li>
<li>Ocupa poco espacio en la interfaz.</li>
<li>Refuerza el contexto y la navegación ya que muestra a los usuarios dónde están y cómo está estructurada la información.</li>
<li>Ayuda a los usuarios a comprender la estructura de la aplicación.</li>
</ul>

<h4>Ejemplo</h4>

Migas de pan, con menú de acceso rápido habilitado

<img src='http://uda.googlecode.com/svn/wiki/images/migas2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 5. Selección de idioma ###

El usuario puede elegir de forma sencilla el idioma en el que se le presenta la aplicación.

<h4>Usar cuando</h4>Cuando tengamos varios idiomas disponibles en el sitio web y queramos que los usuarios puedan elegir fácilmente el que prefieran.

<h4>Por qué</h4>
<ul>
<li>Ocupa poco espacio en la interfaz.</li>
<li>Es fácil de comprender y utilizar.</li>
<li>Es escalable: podemos incluir varios idiomas en el combo desplegable sin afectar al resto de la interfaz.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/idioma2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 6. Fechas ###

El usuario puede introducir manualmente una fecha o seleccionarla de un calendario moviéndose por días, meses y años y recibiendo ayudas y sugerencias para minimizar las posibilidades de que introduzca una fecha incorrecta.

Este patrón también contempla la posibilidad de poder seleccionar más de una fecha en un mismo campo.

<h4>Usar cuando</h4>Cuando el usuario tenga que introducir una fecha y queramos darle flexibilidad para escribirla manualmente o seleccionándola de un calendario.

<h4>Por qué</h4>
<ul>
<li>Vale tanto a usuarios avanzados (eficiencia) como a novatos (sencillez).</li>
<li>La forma de introducir la fecha es flexible: unos usuarios preferirán escribirla a mano y otros seleccionarla del calendario.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/fechas.png' />

<img src='http://uda.googlecode.com/svn/wiki/images/fechas-multiples.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 7. Intervalos de fechas ###

El usuario puede introducir manualmente un intervalo de fechas o seleccionarlo de un calendario por días, meses y años y recibiendo ayudas y sugerencias para minimizar las posibilidades de que introduzca una fecha incorrecta.

<h4>Usar cuando</h4>Cuando el usuario tenga que introducir un intervalo de fechas y queramos darle flexibilidad para escribirlo manualmente o seleccionándolo de un calendario.

<h4>Por qué</h4>
<ul>
<li>El sistema de introducción de fechas de este patrón tiene las ventajas del patrón anterior. Selección e introducción de fechas.</li>
<li>Es eficiente y rápido introducir intervalos.</li>
<li>Ocupa poco espacio en la interfaz en comparación con otras soluciones.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/intervalos-fechas.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 8. Horas ###

El usuario puede introducir manualmente una hora o recibiendo ayudas gráficas para minimizar las posibilidades de que introduzca una hora incorrecta.

<h4>Usar cuando</h4>Cuando el usuario tenga que introducir una hora y queramos darle flexibilidad para escribirla manualmente o bien de manera asistida.

<h4>Por qué</h4>
<ul>
<li>Vale tanto a usuarios avanzados (eficiencia) como a novatos (sencillez).</li>
<li>La forma de introducir la hora es flexible: unos usuarios preferirán escribirla a mano y otros seleccionarla.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/horas.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 9. Controles dependientes (Combos) ###

Permite al usuario seleccionar un elemento de una gran lista o de varias listas relacionadas que ocupan poco espacio en la interfaz.

<h4>Usar cuando</h4>Cuando tengamos que mostrar muchos elementos categorizados en un espacio reducido de la interfaz.

También puede ser útil como componente para crear accesos rápidos a partes de la aplicación que nos interese destacar.

<h4>Por qué</h4>
<ul>
<li>Una vez se conoce su funcionamiento es muy rápido y fácil de usar.</li>
<li>Optimiza espacio en la interfaz ya que podemos incluirlo en espacios reducidos.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/combos.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 10. Autocompletar (Suggest) ###

Ofrece sugerencias de búsqueda en tiempo real coincidentes con la búsqueda que está realizando el usuario.

<h4>Usar cuando</h4>Cuando queramos mejorar la búsqueda ofreciendo sugerencias a los usuarios.

<h4>Por qué</h4>
<ul>
<li>Es una funcionalidad muy fácil y cómoda de utilizar.</li>
<li>Mejora mucho la experiencia de uso de la búsqueda sencilla.</li>
<li>Bien pensada e implementada permite a un usuario descubrir nuevas áreas de conocimiento antes desconocidas para él. Por ejemplo, un estudiante que sólo conozca el método lógico deductivo de investigación y busque información sobre él, puede recibir la sugerencia "método lógico inductivo" descubriendo un método de investigación que antes no conocía.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/autocompletar.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 11. Ayuda (Tooltip) ###

Proporciona distintos tipos y niveles de ayuda adaptados a las distintas necesidades de los usuarios y que facilitan el aprendizaje progresivo de la aplicación.

<h4>Usar cuando</h4>Todas las aplicaciones deben tener un sistema de ayuda, aunque algunas necesiten uno más completo y preciso que otras. El objetivo del sistema de ayuda debe ser, por un lado ayudar al impaciente y/o al usuario ocasional tan extensamente como sea posible y, por otro, ayudar a los usuarios expertos.

<h4>Por qué</h4>
<ul>
<li>El sistema basado en diferentes tipos y niveles de ayudas (ayudas contextuales y sección de ayuda) que hagan aprender a los usuarios de forma progresiva dándoles al mismo tiempo una sección de ayuda completa que les sirva de referencia cubre las necesidades de todos los usuarios: los ocasionales y/o impacientes y los más expertos.</li>
<li>Las ayudas contextuales son una forma poco intrusiva de ofrecer ayuda a los usuarios según la necesitan sin que tengan que dejar la página en la que están e ir a una página de ayuda.<br>
<br>
Este tipo de ayuda es muy útil para todos los usuarios pero especialmente para los novatos o los que necesitan un sistema de ayuda completo pero no tengan tiempo para utilizarlo.</li>
<li>La sección de ayuda ofrece una solución potente para resolver dudas enfocada a los usuarios más expertos o interesados en la aplicación.</li>
</ul>

<h4>Ejemplos</h4>

Ayuda contextual sobre un campo:

<img src='http://uda.googlecode.com/svn/wiki/images/tooltip1-2.0.png' />


Ayuda contextual sobre un campo con estilo diálogo (modal):

<img src='http://uda.googlecode.com/svn/wiki/images/tooltip2-2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 12. Botonera de opciones ###

Grupo de botones icónicos que ejecutan acciones generales o referidas a uno o varios elementos de la interfaz.

<h4>Usar cuando</h4>La botonera general se deberá utilizar para mostrar un menú genérico de opciones que afecten a toda la aplicación mientras que la botonera local deberá utilizarse para mostrar un menú propio de una página o contenido de la aplicación.

<h4>Por qué</h4>
<ul>
<li>Es un sistema de menús muy conocido por todos los usuarios.</li>
<li>Es muy facil de usar.</li>
<li>Es una solución válida tanto para crear menús generales de la aplicación como menús que ejecuten acciones sobre elementos en pantalla.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/botonera2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 13. Presentación de datos en tabla (Grid) ###

Se presentan los datos de forma que sean fácilmente escaneables visualmente y que faciliten encontrar la información que se busca.

<h4>Usar cuando</h4>Cuando tengamos que presentar a los usuarios filas de datos y queramos que les resulte fácil encontrar la información que buscan.

<h4>Por qué</h4>
<ul>
<li>Es la forma más estándar de mostrar filas de datos.</li>
<li>Permite el ojeado rápido y encontrar fácilmente la información.</li>
<li>Los usuarios pueden hacer rollover o click sobre una fila para ver así más claramente su información.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/grid2.0.png' />

Este patrón complementa su funcionalidad con otros patrones definidos a continuación.

#### 13.1. Paginación ####

Permite moverse por una lista larga de elementos presentados en forma de lista o de tabla.

<h4>Usar cuando</h4>Cuando las listas de datos o tablas que se les presentan a los usuarios sean muy grandes y se haga necesario algún mecanismo de navegación para moverse entre tantos resultados y situarse en la serie.

<h4>Por qué</h4>
<ul>
<li>Es un sistema conocido por todos los usuarios, sencillo e intuitivo.</li>
<li>Es fácil de comprender y utilizar.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/paginacion2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.2. Ordenación de filas ####

Los usuarios pueden ordenar las filas de datos de la forma que les resulte más conveniente.

<h4>Usar cuando</h4>Cuando queramos dar al usuario la posibilidad de ordenar las filas de datos en función de sus necesidades para que pueda encontrar la información que busca más cómodamente.

<h4>Por qué</h4>
<ul>
<li>Es muy conocido por los usuarios y el método más estándar en Internet para ordenar filas de datos.</li>
<li>Es un sistema de ordenación sencillo, intuitivo y rápido de utilizar.</li>
<li>Permite encontrar fácilmente la información.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/tabla-ordenación.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.3. Ordenación de columnas ####

Los usuarios pueden ordenar las columnas de datos de la forma que les resulte más conveniente.

<h4>Usar cuando</h4>Este patrón está destinado a los usuarios avanzados y es especialmente útil cuando les queramos dar el mayor grado de control posible sobre la visualización de las filas de datos.

<h4>Por qué</h4>
<ul>
<li>Permite a los usuarios organizar las columnas a su gusto para ver los datos como prefieran.</li>
<li>Es la forma estándar y más conocida de reorganizar las columnas de datos ya que se basa en el drag&drop, un sistema de interacción conocido por los usuarios avanzados.</li>
<li>Ofrece una gran flexibilidad en la presentación de las filas de datos.</li>
<li>Una vez aprendido es fácil de usar así que puede beneficiar tanto a usuarios avanzados como a novatos.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/tabla-ordenación-columnas.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.4. Selección e interacción con elementos ####

Los usuarios pueden seleccionar filas de las tablas y realizar acciones sobre ellas.

<h4>Usar cuando</h4>Cuando tengamos una tabla de datos y queramos que los usuarios puedan interactuar con ellos.

<h4>Por qué</h4>
<ul>
<li>Es fácil de usar e intuitivo.</li>
<li>Es potente y flexible ya que permite interactuar con las filas seleccionando un elemento y/o utilizando la botonera.</li>
<li>Es escalable ya que se pueden implementar muchas opciones de interacción en los menús.</li>
<li>Ofrece feedback en todo momento.</li>
</ul>

<h4>Ejemplos</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/seleccion2.0.png' />

Con opción de multiselección en un solo paso:

<img src='http://uda.googlecode.com/svn/wiki/images/multiseleccion.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.5. Filtrado ####

Los usuarios pueden filtrar los datos de las filas en función de diferentes criterios para obtener la información que buscan.

<h4>Usar cuando</h4>Cuando tengamos un gran número de filas de datos y queramos dar a los usuarios la posibilidad de filtrarlos para encontrar la información que buscan con mayor facilidad.

Es un sistema idóneo para usuarios avanzados y tablas con gran cantidad de datos.

<h4>Por qué</h4>
<ul>
<li>Es un sistema intuitivo y fácil de usar tanto para usuarios novatos como avanzados.</li>
<li>Es una de las formas más estándares y conocidas de implementar el filtrado en tablas de datos.</li>
<li>Es ágil y rápido, lo que beneficia a los usuarios que tienen que trabajar continuamente con gran cantidad de filas de datos.</li>
<li>Proporciona una gran flexibilidad y potencia ya que permite combinar los filtros o filtrar por un sólo criterio o por varios. Por ejemplo, se puede filtrar sólo por fecha o por fecha y título a la vez.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/tabla-filtrar.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.6. Búsqueda ####

Los usuarios pueden buscar datos concretos en las filas presentadas.

<h4>Usar cuando</h4>Cuando tengamos un gran número de filas de datos y queramos dar a los usuarios la posibilidad de buscar la información que buscan con mayor facilidad.

Es un sistema idóneo para usuarios avanzados y tablas con gran cantidad de datos.

<h4>Por qué</h4>
<ul>
<li>Es un sistema intuitivo y fácil de usar tanto para usuarios novatos como avanzados.</li>
<li>Es una de las formas más estándares y conocidas de implementar la búsqueda en tablas de datos.</li>
<li>Es ágil y rápido, lo que beneficia a los usuarios que tienen que trabajar continuamente con gran cantidad de filas de datos.</li>
<li>Proporciona una gran flexibilidad y potencia ya que permite combinar los filtros y las búsquedas. Después de aplicar un  filtro, el numero de filas se reduce, y sobre éstas, se aplica una busqueda sobre cierto dato concreto.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/tabla-buscar.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.7. Menú contextual ####

Menú auxiliar de opciones inicialmente no visible referido a un elemento que se muestra junto a éste para agilizar la interacción y la realización de las tareas.

<h4>Usar cuando</h4>Cuando tengamos una aplicación con un sistema de interacción establecido y queramos implementar un sistema alternativo que mejore la experiencia de uso agilizando la interacción y haciendo más rápida la realización de ciertas tareas.

Los menús contextuales no se deben usar como único sistema de interacción con la aplicación sino como añadido y mejora del sistema de interacción base. Tampoco se debe añadir en un menú contextual una opción que no aparezca en otro sitio visible y accesible de la aplicación. Esto es debido a que estos menús son más difíciles de descubrir al tener que hacer los usuarios una acción extra para mostrarlos.

Para implementar el menú contextual se deben seguir las siguientes recomendaciones:

<ul>
<li>Usar una invitación para que el usuario active el menú. Puede ser mediante un "tooltip" que aparezca sobre el elemento cuando dejemos el ratón sobre él durante 1-2 segundos con el mensaje "Pulse el botón derecho para ver más opciones." Este tooltip podría ir acompañado de un cambio en el cursor del ratón (<img src='http://uda.googlecode.com/svn/wiki/images/context-menu2.png' /> ) cuando el usuario haga rollover sobre el elemento.</li>
<li>La forma más común de desplegar los menús contextuales es haciendo click con el botón derecho del ratón.</li>
<li>Se debe desplegar sobre el elemento seleccionado, lo más cerca posible de él, aunque no debe ocultarlo.</li>
</ul>

<h4>Por qué</h4>
<ul>
<li>Una vez aprendido agiliza la interacción y proporciona un acceso rápido y sencillo a las opciones que se pueden realizar sobre los elementos ya que reduce la distancia que hay que mover el ratón y el número de pasos que hay que realizar para ejecutar una acción.</li>
<li>Añade una mejora a la aplicación sin perjudicar su sistema de interacción base.</li>
<li>Funciona bajo demanda, según lo necesita el usuario, por lo que éste obtiene mayor sensación de control sobre la aplicación.</li>
</ul>

<h4>Ejemplo</h4>

Invita a pulsar el botón derecho para desplegar más acciones:

<img src='http://uda.googlecode.com/svn/wiki/images/menu-contextual-antes2.png' />

Presenta las acciones disponibles sobre el item seleccionado:

<img src='http://uda.googlecode.com/svn/wiki/images/menu-contextual2.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

#### 13.8. Jerarquía ####

Permite presentar los datos de manera jerárquica, estableciendo así relaciones de dependencia entre los ítems de la tabla.

<h4>Usar cuando</h4>Cuando el usuario concibe la información agrupada y ordenada por una relación de dependencia jerárquica, como por ejemplo una relación de jefe-subordinado.

<h4>Por qué</h4>
<ul>
<li>Este patrón permite a los usuarios visualizar la información según una relación de dependencia.</li>
<li>Se podrán colapsar o expandir los elementos dependientes, facilitando así visiones más amplias y agrupaciones por niveles.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/jerarquia2.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 14. Mantenimiento con formulario ###

Añadir(Create): El usuario puede añadir nuevos registros a una tabla cuyos registros pueden contener más campos de los que se muestran en la vista de la tabla.

Visualizar (Read): El usuario puede visualizar datos de forma que sean fácilmente escaneables y que faciliten encontrar la información que se busca.

Editar (Update): El usuario puede editar registros de una tabla cuyos registros pueden contener más campos de los que se muestran en la vista de la tabla.

Eliminar (Delete): El usuario puede eliminar registros de una tabla de manera individual o aquellos que ha seleccionado previamente.

Las acciones de añadir, visualizar y editar se realizarán sobre un formulario de datos.

Este patrón se compone a su vez de otros patrones de interacción.

<h4>Usar cuando</h4>Cuando queramos ofrecer a los usuarios la posibilidad de crear, visualizar, editar, o eliminar registros de una tabla, siempre que el número de campos que se ve en la vista de la tabla sea menor que el número total de campos que forman los registros.

En caso de que se muestren todos los campos de los registros se recomienda utilizar el patrón de "mantenimiento con creación y edición en celda".

<h4>Por qué</h4>
<ul>
<li>Es un sistema de creación sencillo.</li>
<li>Permite crear, editar o eliminar uno o varios registros en una misma pantalla sin tener que moverse continuamente entre la tabla y la pantalla de creación.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/mtoformulario2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 15. Mantenimiento con creación y edición en celda ###

Como en el patrón anterior, éste patrón permite añadir, visualizar, editar o eliminar registros de una entidad de datos presentada en formato de tabla. Sin embargo, en este caso, las acciones de añadir y editar registros se realiza sobre las propias filas de la tabla sin necesidad de navegar a una nueva página.

También como el patrón anterior, este patrón se compone a su vez de otros patrones de interacción.

<h4>Usar cuando</h4>Cuando queramos ofrecer a los usuarios la posibilidad de crear o editar rápidamente los registros de una tabla, siempre que todos los registros de la tabla sean visibles en la misma.

Si la tabla contiene más filas de las que se visualizan se recomienda utilizar el patrón de "mantenimiento con formulario".

<h4>Por qué</h4>
<ul>
<li>Es un sistema sencillo y rápido para editar y crear registros.</li>
<li>Agiliza mucho la interacción.</li>
<li>La interacción se produce en contexto.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/mtoedicionlinea2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 16. Mantenimiento maestro-detalle ###

Permite al usuario realizar el mantenimiento de dos entidades de datos relacionadas en una sola ventana. Al seleccionar una fila de la tabla maestra se recargan las filas de la tabla detalle dependientes de la primera.

Este patrón se compone a su vez de la configuración de dos patrones de "mantenimiento con formulario" o de "mantenimiento con creación y edición en celda" o de una combinación de los dos.

<h4>Usar cuando</h4>Cuando queramos ofrecer a los usuarios la posibilidad de crear, visualizar, editar o eliminar rápidamente los registros de dos tablas relacionadas bajo la misma entidad de datos.

Por ejemplo, la entidad pedido, que consta de los datos identificativos del pedido, y las líneas de detalle de los productos incluidos en el  pedido.

<h4>Por qué</h4>
<ul>
<li>Es un sistema sencillo y rápido para editar y crear registros.</li>
<li>Agiliza mucho la interacción.</li>
<li>La interacción se produce en contexto.</li>
<li>Permite crear, visualizar, editar o eliminar uno o varios registros en una misma pantalla sin tener que moverse continuamente entre la tabla y la pantalla de creación.</li></ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/mantenimiento-maestro-detalle.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 17. Diálogos y mensajes ###

Permite lanzar subprocesos o mensajes importantes dentro de un proceso principal sin salirse de él evitando así la pérdida de contexto en la interacción con la aplicación.

<h4>Usar cuando</h4>Cuando el diálogo a mostrar contiene una información que el usuario no puede ignorar o cuando contiene una interacción clave para el usuario.

También es útil cuando queremos que el usuario pueda rellenar o acceder a un contenido amplio sin tener que salirse del proceso actual.

En general, no se debe abusar de los diálogos modales. Se deben utilizar en casos concretos:

<ul>
<li>Mensajes de sistema muy importantes: Cuando sea imperativo que el usuario vea un mensaje importante del sistema. Si el mensaje no es crítico se le debe presentar como mensaje de sistema integrado en pantalla (ver patrón "Feedback").</li>
<li>Descarga de archivos:Cuando se le ofrezca al usuario la posibilidad de descargar un archivo. En la ventana modal se le pueden presentar opciones para descargar el archivo en diferentes formatos, mostrándole información sobre el tamaño del archivo, etc.</li>
<li>Mensajes de confirmación:Cuando el usuario realice una acción muy importante o que no se pueda deshacer. No se debe pedir confirmación para cada acción que realice el usuario porque se entorpecería mucho la interacción con la aplicación, sólo para las que se consideren especialmente delicadas.</li>
<li>Eliminar elementos: Cuando el usuario vaya a eliminar un elemento importante. En este caso, es recomendable pedir confirmación siempre que el usuario vaya a eliminar un elemento aunque también se podrían implementar soluciones diferentes, como por ejemplo no pedir ninguna confirmación e implementar un sistema que permita deshacer acciones realizadas, o no pedir ninguna confirmación y crear una carpeta "Papelera" similar a la de Windows donde se guarden todos los elementos que hemos borrado y desde la que se puedan eliminar definitivamente.</li>
<li>Subproceso dentro de un proceso principal: Cuando estemos editando un elemento con mucho contenido en un proceso principal (como podría ser la creación de un expediente de un alumno cuyo contenido estaría dividido en pestañas cada una de ellas con muchos campos) y queramos lanzar subprocesos dando la opción de añadir contenidos extra, podemos lanzarlos en ventanas modales.<br>
<br>
Por ejemplo, en Wordpress la creación de un nuevo post se realiza en una pantalla principal pero para añadir una imagen o un elemento multimedia se lanza una ventana modal. Así, no sacamos al usuario del proceso principal, le hacemos ver que está trabajando en un subproceso y le ofrecemos opciones de contenido bajo demanda sin saturar la interfaz de opciones y campos.</li>

<li>Ampliación de imágenes: Cuando el usuario quiera ver una imagen o una galería ampliadas, en vez de mostrárselas en páginas o ventanas nuevas podemos hacerlo en una ventana modal en la que se pueda navegar entre las imágenes si es una galería.</li>
</ul>

<h4>Por qué</h4>
<ul>
<li>Está integrado en el proceso que se está llevando a cabo.</li>
<li>No tiene la mala imagen de los pop-ups y no es bloqueado por los programas anti pop-ups. Además no es un sistema intrusivo.</li>
<li>Cuando se utiliza para lanzar subprocesos funciona enfocando al usuario a lo importante: se le ofrecen unas opciones iniciales en el proceso principal y según pide nuevos contenidos se le lanzan en ventanas modales permitiéndole que se centre en ellos pudiendo realizar así la tarea de forma más progresiva.</li>
</ul>

<h4>Ejemplos</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/msjedialogo2.0.png' />

<img src='http://uda.googlecode.com/svn/wiki/images/msjeerror2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 18. Retroalimentación (Feedback) y validación ###

Mantiene informado al usuario en todo momento del estado del sistema y del resultado de sus acciones, y le proporciona ayudas para realizar las tareas y soluciones a los posibles problemas que pueda encontrar.

Algunas funcionalidades definidas en este patrón se implementan con el mismo componente que se ha creado para el patrón de "diálogos". Y otras hacen uso del componente de validación.

<h4>Usar cuando</h4>Cuando el usuario tenga una necesidad de información ya sea por cambios en el sistema, ejecución de procesos, realización de tareas o confirmación de acciones.

En concreto, los principales tipos de retroalimentación (feedback) que tenemos que considerar son los siguientes:

<ul>
<li>Mensajes de sistema o informativos: Se debe mostrar un mensaje en una zona visible cuando se produzca un cambio, noticia o actualización en el sistema que sea suficientemente interesante para los usuarios. No se debe mostrar mensajes para cada cambio en el sistema, sólo para los cambios que tengan importancia.</li>

Si es crítico que los usuarios vean el mensaje es mejor lanzarlo en un diálogo modal para asegurarnos de que lo ve (ver patrón 2.6. Diálogos)<br>
<br>
<li>Mensajes de confirmación:Cuando un usuario realice una acción correctamente o un proceso se lleve a cabo sin incidencias hay que informar al usuario mediante un mensaje en pantalla.<br>
<br>
Si la confirmación es sobre una acción importante que está realizando un usuario y lo que queremos es informarle de sus consecuencias antes de que la realice debemos lanzarle una ventana modal para asegurarnos de que ve el aviso. Por ejemplo, en una aplicación que envía un newsletter a toda la base de datos de clientes cuando el usuario pulse en "Enviar Newsletter" deberemos lanzarle una ventana modal para que confirme la acción ya que es una acción que no se puede deshacer.<br>
<br>
Tras realizar la acción en la ventana modal se deberá mostrar un mensaje de confirmación o error en la parte superior del área de contenido de la pantalla principal.</li>

<li>Mensajes de error y aviso: También tenemos que informarle cuando realice acciones de forma incorrecta o se produzca algún error en la aplicación.<br>
<br>
Hay que distinguir los errores graves de las acciones o situaciones que requieren avisar al usuario. En general, los errores estarán mas relacionados con errores del sistema como fallos del servidor al enviar un formulario, y los avisos con acciones incorrectas del usuario como al rellenar un formulario.</li>

<li>Retroalimentación de formularios y edición (validaciones): Cuando el usuario rellene un formulario se le debe ofrecer una retroalomentación  continua para agilizar la interacción y reducir las posibilidades de que cometa errores. Además, se le debe ofrecer retroalomentación de estado cuando lo envíe y de confirmación o error cuando le sea devuelto.</li>

<li>Estado de un proceso: Cuando se está procesando una acción (subiéndose un archivo, cargándose una página, etc.) debemos informar al usuario de su estado.</li>

<li>Mensajes previos / previsualización: También es importante informar al usuario de las consecuencias que tendrá el llevar a cabo una acción antes de realizarla. Por ejemplo, si está asignando una persona de contacto a un curso y no se puede cambiar posteriormente esa información sin contactar con un mando superior se debe avisar de ello al usuario.<br>
<br>
Si las posibles consecuencias son muy graves o no hay posibilidad de corregirlas (como en el ejemplo del envío del newsletter a la base de datos de los clientes) se debe lanzar el aviso en una ventana modal para asegurarnos de que es consciente de las consecuencias de la acción antes de realizarla.</li>
</ul>

También puede ser útil mostrar previsualizaciones antes de realizar ciertas acciones como guardar una foto en un perfil, imprimir un documento, etc.

<h4>Por qué</h4>
<ul>
<li>Todas las aplicaciones necesitan informar a los usuarios del estado del sistema y del resultado de sus acciones.</li>
<li>El feedback siempre se proporciona integrado con el elemento al que afecta o directamente tras realizar una acción por lo que la relación entre acción y efecto queda siempre clara.</li>
<li>Mejora la experiencia de uso y reduce al mínimo la frustración al usar la aplicación ya que los mensajes se ofrecen en un lenguaje inteligible para los usuarios y les proporcionan posibles vías de solución a los problemas. Además, se trata de evitar la aparición de problemas antes de que estos se produzcan.</li>
</ul>

<h4>Ejemplos</h4>

Mensaje de confirmación:

<img src='http://uda.googlecode.com/svn/wiki/images/feedbackok2.0.png' />

Mensaje de error:

<img src='http://uda.googlecode.com/svn/wiki/images/feedbackerror2.0.png' />

Retroalimentación de formularios y edición (validaciones):

<img src='http://uda.googlecode.com/svn/wiki/images/validacion2.0.png' />

Estado de un proceso:

<img src='http://uda.googlecode.com/svn/wiki/images/feedbackprocesando2.0.png' />

### 19. Contenidos relacionados ###

Bloques de contenido u opciones de la interfaz que se muestran u ocultan en función de las necesidades de los usuarios.

<h4>Usar cuando</h4>Cuando tengamos muchas opciones para ofrecer a los usuarios y no queramos saturarles sino guiarles suavemente por un proceso de rellenado que vaya adaptándose a lo que van pidiendo.

Cuando no tengamos espacio suficiente en la interfaz para mostrarles a los usuarios todas las opciones disponibles.

Cuando tengamos espacio suficiente será mejor utilizar controles inactivos, poniendo los campos inactivos en semitransparente y activándolos según el usuario selecciona opciones.

<h4>Por qué</h4>
<ul>
<li>Nos permite ofrecer una interfaz inicial limpia que incite al usuario a rellenarla.</li>
<li>Ofrecemos opciones y contenidos a los usuarios según los necesita, no de golpe.</li>
<li>Reducimos el ruido visual y optimizamos el espacio en la interfaz.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/accordion2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 20. Adjuntar archivos externos ###

El usuario puede seleccionar uno o varios archivos de su equipo y subirlos a la aplicación.

<h4>Usar cuando</h4>Cuando necesitemos implementar un sistema sencillo para adjuntar uno o varios archivos.

<h4>Por qué</h4>
<ul>
<li>Es escalable: permite adjuntar desde uno hasta un número indeterminado de archivos.</li>
<li>Es sencillo de utilizar y hace uso del estándar para adjuntar archivos en Internet.</li>
<li>Es flexible: permite adjuntar y borrar fácilmente.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/upload2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 21. Guías paso a paso (Wizard) ###

Permiten guiar al usuario paso a paso a través de un proceso, realizando las tareas dentro de un orden señalado.

<h4>Usar cuando</h4>Cuando la tarea sea larga o complicada.

Cuando la tarea sea nueva para el usuario o no la realice a menudo.

Cuando la tarea sea delicada y requiera un control alto.

En general, las tareas adecuadas para ser enfocadas en guías paso a paso tienden a ser largas, tediosas y, a veces, ramificadas. Suelen usarse en procesos de compra, en procesos de configuración, instalación de programas, etc.

Las guías paso a paso suelen ser especialmente importantes para satisfacer las necesidades de los usuarios poco expertos o que quieren realizar un proceso concreto. Estos usuarios suelen estar dispuestos a ceder el control (“No me hagas pensar, dime sólo qué tengo que hacer”).Sin embargo, ésta guía puede resultar frustrante para los usuarios expertos o que quieren aprender sobre la aplicación ya que no les da libertad de uso del programa. Además, si son demasiado largos o pesados pueden llegar a ser irritantes.

<h4>Por qué</h4>
<ul>
<li>Dividiendo la secuencia en pasos, donde el usuario puede tratar cada paso como un espacio mental discreto, se simplifica la tarea de forma eficaz.</li>
<li>Al añadir los nombres de los pasos durante todo el proceso el usuario puede conocer el camino completo que sigue el proceso y dónde acaba, por lo que en todo momento sabrá que el resultado será bueno si sigue las instrucciones.</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/wizard2.0.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 22. Formularios ###

Permite al usuario, introducir datos que serán enviados a un servidor para ser procesados. O bien presentar información de manera estructurada y ordenada, facilitando así su comprensión.

Un patrón formulario debería implementar las guías de buenas prácticas de diseño de formularios web. En <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, y por ende en RUP, estas recomendaciones de diseño ya están aplicadas en cada uno de los componentes que lo conforman. Por tanto, el componente formulario suministrado por RUP se centra en facilitar sus gestiones básicas indispensables: inicialización de campos, serialización de datos, envío y recepción de una o varias entidades de datos, etc.

<h4>Usar cuando</h4>Cuando el usuario desea almacenar información estructurada en un servidor y necesita que el sistema le asista y oriente en dicha tarea.

Cuando el usuario desea consultar de manera estructurada y ordenada la información que ha almacenado previamente.

<h4>Por qué</h4>
<ul>
<li>La información se recoge o se presenta de manera estructurada y ordenada siguiendo los esquemas mentales aplicados por el usuario.</li>
<li>Ayuda a estructurar y organizar la información gestionada por el sistema.</li>
</ul>

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 23. Grupos de elementos ###

Permite al usuario elegir de forma sencilla varios elementos entre un grupo pudiendo ver claramente todos los elementos disponibles y crear el grupo de forma ágil.

<h4>Usar cuando</h4>Cuando el usuario tenga que crear una lista o grupo de elementos eligiendo estos de una lista más grande de elementos disponibles.

<h4>Por qué</h4>
<ul>
<li>Este patrón permite a los usuarios ver de un vistazo los elementos disponibles y comprender fácilmente cómo elegir los que les interesan.</li>
<li>Optimiza el espacio en la interfaz.</li>
</ul>

El usuario tiene todo lo necesario en el mismo sitio sin tener que navegar a otras páginas, abrir ventanas modales, etc.

<h4>Ejemplo</h4>

En formato "combo":

<img src='http://uda.googlecode.com/svn/wiki/images/multi-combo.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

### 24. Árbol ###

Se presenta al usuario información jerarquizada, pudiendo identificar claramente el nivel de profundidad en que se situa cada dato.

<h4>Usar cuando</h4>Cuando la información está jerarquizada y el usuario está familiarizado con dicha organización.

<h4>Por qué</h4>
<ul>
<li>Se permite a los usuarios ver de un vistazo y localizar rápidamente, un elemento dentro de un organización jerárquica, pudiendo seleccionar rápidamenteue lo que le interesa.</li>
<li>La información, de manera natural, está organizada jerárquicamente (por ejemplo, la estructura organizativa de una empresa en su relación jefe-subordinado)</li>
</ul>

<h4>Ejemplo</h4>

<img src='http://uda.googlecode.com/svn/wiki/images/arbol.png' />

_[Volver al indice](http://code.google.com/p/uda/wiki/Patrones#RUP)_

<h2>Más información</h2>

Para aprender cómo configurar y utilizar los patrones de interacción definidos, consulte la sección "patrones" de la [documentación sumnistrada](https://code.google.com/p/uda/wiki/Documentacion).

Además, se recomienda la lectura detallada del documento "Desarrollo RUP - Consejos y buenas prácticas", guía indispensable para los desarolladores que integren o utilicen los patrones RUP en  sus aplicaciones, incluida también en la sección "patrones" de la [documentación sumnistrada](https://code.google.com/p/uda/wiki/Documentacion).