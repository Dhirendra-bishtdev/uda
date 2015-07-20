_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2F)_

<h1><img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro.png' /> - Utilidades de desarrollo de aplicaciones</h1>
<p>
<a href='https://plus.google.com/115407042298445383174'>Google+</a>
<p>
<b>Ya está disponible una <a href='http://www.ejie.eus/x21aPilotoPatronesWar/'>demo</a> del funcionamiento de los componentes que ofrece UDA.</b>

<p>
IMPORTANTE: Debido a que Google Code ha cambiado su política de albergue de descargas, los ficheros de las diferentes versiones se pueden encontrar en <a href='https://drive.google.com/folderview?id=0B2jWuJHnBpz_VFVLU2ZoREQ2Q1E&usp=sharing#list'>Google Drive de UDA</a>

<b><a href='http://code.google.com/p/uda/wiki/Actualizar'>24-Abril-2015</a>:</b>
<p>
Se actualizan las siguientes <a href='https://drive.google.com/folderview?id=0B2jWuJHnBpz_VFVLU2ZoREQ2Q1E&usp=sharing#list'>descargas</a>:<br>
<ul>
<li>Librería de utilidades comunes <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U3NwbHhnbG5vMXM&export=download'>x38ShLibClasses-2.4.5-RELEASE.jar</a></li>
<li>Plantillas de generación de código: <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_RUtDU3pSLVZ5Smc&export=download'>Plantillas (v2.4.5)</a></li>
<li>Componentes visuales <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U3A5dXNzM1dfMkU&export=download'>Componentes RUP (v2.4.5)</a></li>
<li>Actualización con las nuevas versiones de la librería del <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_TEllbWM4ZXcxTFk&export=download'>Repositorio Maven</a></li>
<li>Eclipse IDE configurado con las nuevas plantillas para <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />: <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_TDIybWVPaEJBS0E&export=download'>Eclipse Helios UDA (v2.4.5)</a></li>
</ul>

En esta versión se han realizado las siguientes mejoras:<br>
<ul>
<li>Correción de bugs detectados en la versión anterior de los componentes</li>
<li>Nueva funcionalidad en el mantenimiento que permite guardar filtros personalizados por usuario</li>
<li>Nuevos eventos en el autocomplete, migas, tabla </li>
</ul>

En la sección UDA v2.4.5 (24-Abril-2015) del archivo <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_NnJEWkFsYkNlbVU&export=download'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
La <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_TnhuN2k1bElmTFU&export=download'>máquina virtual</a> configurada con el entorno completo sobre la versión 2.4.4 sigue estando disponible en caso de necesitar una maqueta de entorno completo.<br>
<br>
<br>
<b>06-Febrero-2013:</b>
<p>
Ya está disponible la <a href='http://guc.esi.es/platea/'>formación</a> en <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> así como las pruebas de <a href='http://guc.esi.es/platea/'>certificación</a> como analista y como desarrollador.<br>
<br>
<br>
<i>Puedes encontrar la información sobre los productos liberados anteriormente en el apartado <a href='http://code.google.com/p/uda/wiki/Versiones'>Versiones</a></i>
<p>
<p>

<a href='http://www.ejie.net/'><img src='http://uda.googlecode.com/svn/wiki/images/EJIE.jpg' /></a><a href='http://www.ejgv.euskadi.net/r53-2283/es/'><img src='http://uda.googlecode.com/svn/wiki/images/r53-logo_gobierno_homes.gif' align='right' /></a>

<h1>Introducción</h1>

<img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> es el conjunto de utilidades, herramientas, librerías, plugins, guías, y recomendaciones funcionales y técnicas que permiten acelerar el proceso de desarrollo de sistemas software con tecnología Java.<br>
<br>
El espíritu del proyecto, y por tanto su principal objetivo, es aumentar la productividad del desarrollador, sin coartar por ello su imaginación ni su libertad para crear software. <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> ayuda y colabora en las tareas repetitivas y de poco (o nulo) valor añadido, pero que sin embargo, son imprescindibles. Pero también persigue otros fines:<br>
<br>
<ul>
<li>Minimizar la curva de aprendizaje. No pretende ser un framework más, <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> adopta y explota los ya consolidados y de uso extendido y se aprovecha del conocimiento compartido por sus creadores y usuarios.</li>
<li>Proponer patrones de usabilidad web, que aprovechen las mejoras proporcionadas por las tecnologías <a href='http://es.wikipedia.org/wiki/Rich_Internet_Applications'>RIA</a> - <a href='http://es.wikipedia.org/wiki/images/AJAX'>Ajax</a>. Se cubren los escenarios de uso más habituales para las aplicaciones web con dicha tecnología.</li>
<li>Generar  interfaces  de usuario. Crea <b>automáticamente</b> las <a href='http://code.google.com/p/uda/wiki/Patrones#14._Mantenimiento_con_formulario'>interfaces de mantenimiento de datos</a> (acciones <a href='http://es.wikipedia.org/wiki/CRUD'>CRUD</a>), y otras de uso común (combos enlazados, fechas-horas, feedback, etc.)</li>
<li>Generar código. Crea el código imprescindible en toda aplicación con arquitectura en capas y bajo el paradigma <a href='http://es.wikipedia.org/wiki/Modelo_Vista_Controlador'>MVC</a> (Modelo-Vista-Controlador).</li>
<li>Ser flexible y configurable. Permite adaptar el código generado por los asistentes a las necesidades de cada organización (libro de estilo, estándares de codificación, etc.)</li>
<li>Ser adaptable y ampliable. Su arquitectura modular y desacoplada permitirá ampliar y/o sustituir las tecnologías utilizadas en cada una de las capas de responsabilidad que la componen.</li>
<li>No imponer un modelo de uso único. En algún caso ya se proponen tecnologías alternativas para la misma capa de la arquitectura.</li>
<li>Crear aplicaciones accesibles. Hasta donde sea posible, se cumplen con las recomendaciones <a href='http://www.w3.org/TR/WCAG20/'>WCAG2.0</a> y <a href='http://www.w3.org/WAI/intro/aria.php'>WAI-ARIA</a></li>
</ul>

<h1>Una aplicación operativa y usable, en solo 5 minutos</h1>

<a href='http://www.youtube.com/watch?feature=player_embedded&v=5T7VHQeNyuk' target='_blank'><img src='http://img.youtube.com/vi/5T7VHQeNyuk/0.jpg' width='640' height=360 /></a><br>
<br>
<a href='https://code.google.com/p/uda/wiki/Videos'>Videos</a>

<h1>Componentes</h1>

<h2>Arquitectura</h2>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> <a href='http://code.google.com/p/uda/wiki/Arquitectura'>propone una arquitectura</a> de sistema software estándar, basada principalmente en la división de responsabilidades, y en los paradigmas y patrones de diseño más utilizados.<br>
<br>
Para cada una de las <a href='http://code.google.com/p/uda/wiki/Arquitectura#Capas'>capas que componen la arquitectura</a> se identifican las tecnologías y frameworks que la soportan, especificando en cada caso su modelo de uso y de inter-relación. Se define la mejor forma de ensamblar todos los componentes para lograr la sinergia que favorezca la simplicidad de las aplicaciones y la robustez de la arquitectura.<br>
<br>
<h2>Patrones de interacción</h2>
Los modelos de interacción usuario-sistema, propuestos por <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> se fundamentan en un estudio previo realizado por <a href='http://www.ejie.net/'>EJIE</a>, en colaboración con un equipo de expertos, en el que se identificaron y normalizaron el conjunto de <a href='http://code.google.com/p/uda/wiki/Patrones'>patrones de interacción web de referencia</a> para aplicaciones con tecnología <a href='http://es.wikipedia.org/wiki/Rich_Internet_Applications'>RIA</a> - <a href='http://es.wikipedia.org/wiki/AJAX'>Ajax</a>, y los principios de diseño y de usabilidad que pueden ser aplicados en las típicas aplicaciones de gestión. En dichos trabajos se catalogaron y estudiaron las distintas tipologías de aplicaciones, caracterizadas por varios criterios relevantes:<br>
<ul>
<li>Según el contexto: de internet, de intranet, de extranet, o combinaciones de varios de ellos.</li>
<li>Según la experiencia e interés de sus usuarios: expertos de negocio, noveles, sin conocimientos, etc.</li>
<li>Según su frecuencia de uso: diario, casual, en fechas concretas, etc.</li>
</ul>
Se establecen entonces los modelos básicos de navegación, los estilos visuales, el catálogo de componentes de presentación y sus comportamientos, la disposición preferente de los elementos que componen las paginas Web, su "profundidad" recomendada, modelos de refresco, etc.<br>
<br>
<h2>Asistentes</h2>
Se proveen distintos asistentes que permite generar automáticamente los componentes básicos necesarios para construir un sistema software. Sin teclear ni una sola línea de código ya se dispone de una aplicación operativa.<br>
<br>
En este caso, las tecnologías utilizadas son:<br>
<br>
<table><thead><th> <b>Tecnología</b> </th><th> <b>Versión</b> </th><th> <b>Función</b> </th></thead><tbody>
<tr><td>Eclipse            </td><td>OEPE 11.1.1.7.2 </td><td>IDE             </td></tr>
<tr><td>Maven              </td><td>2.2.1           </td><td>Gestión de dependencias</td></tr>
<tr><td>Ant                </td><td>1.7.1           </td><td>Automatización de Tareas</td></tr>
<tr><td>Freemarker         </td><td>2.3.16          </td><td>Plantillas      </td></tr>
<tr><td>Hibernate Tools    </td><td>3.4             </td><td>Plugin          </td></tr></tbody></table>


<h3>Asistente de generación de proyectos</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Crear nueva aplicación</i>

<p>Plugin Eclipse que crea la estructura básica de proyectos:<br>
<ul>
<li>Proyecto de tipo EAR (Enterprise Archive), que contiene las librerías comunes y la  información de despliegue para el contenedor de aplicaciones.</li>
<li>Proyecto Java con los fuentes de las clases comunes</li>
<li>Proyecto WAR (Web application Archive) con el contenido web dinámico de la aplicación</li>
<li>Proyecto EJB (Enterprise Java Bean) con los EJB que gestionará nuestra aplicación (opcional)</li>
<li>Proyecto genérico con datos de configuración</li>
<li>Proyecto WAR con los contenidos estáticos del sistema (patrones de usabilidad)</li>
</ul>

Posteriormente se podrán añadir nuevos módulos WAR (Web application Archive) y EJB (Enterprise Java Bean) a esos proyectos iniciales.<br>
<br>
<h3>Asistente de generación de código de negocio y control</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Generar código de negocio y control</i>

<p>Partiendo de la estructura de proyectos ya creados, y de un esquema relacional de base de datos, se podrá autogenerar el código  necesario para realizar la gestión <a href='http://es.wikipedia.org/wiki/CRUD'>CRUD</a> (Create, Read, Update, Delete) de dicho esquema relacional para una sistema software JEE, con interfaces <a href='http://es.wikipedia.org/wiki/Representational_State_Transfer'>REST</a> y/o <a href='http://es.wikipedia.org/wiki/Java_Remote_Method_Invocation'>RMI</a>.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/Asistente-de-generación-de-código.png' />

<h3>Asistente de generación de interfaces de usuario (mantenimiento)</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Generar mantenimiento</i>

<p>Una vez que se ha autogenerado el backend de la aplicación, se podrán generar ya las interfaces de usuario <a href='http://es.wikipedia.org/wiki/Rich_Internet_Applications'>RIA</a> - <a href='http://es.wikipedia.org/wiki/AJAX'>Ajax</a>, proporcionando al usuario final interfaces atractivas y accesibles desde las que gestionar sus datos.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/Asistente-de-generación-de-mantenimiento.png' />

<p>Sin teclear ni una sola linea de código ya tendremos operativo en nuestra aplicación el mantenimiento de una tabla de datos.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/mantenimiento-editable.png' />

<p>Para poder incluir en las páginas web otros patrones de interacción, se puede hacer uso de los "Snippets" facilitados por <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />.<br>
<br>
<h3>Asistente de generación de nuevos módulos Web</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Añadir proyecto WAR</i>

<p>Cuando sea necesario, se podrán incluir nuevos módulos web (WAR) a la aplicación, generándose así un nuevo proyecto WAR de Eclipse.<br>
<br>
<h3>Asistente de generación de nuevos módulos EJB</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Añadir proyecto EJB</i>

<p>Si fuese necesario, se podrán incluir nuevos módulos EJB a la aplicación, generándose en este caso un nuevo proyecto EJB de Eclipse.<br>
<br>
<h3>Asistente de generación de código para EJB cliente</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Generar código para EJB cliente</i>

<img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> facilita la creación del código necesario en la invocación a servicios ofrecidos por otros sistemas software disponibles bajo la especificación de EJB remoto (versiones 3.0 y 2.x).<br>
<br>
<h3>Asistente de generación de EJB servidor</h3>
<img src='http://uda.googlecode.com/svn/wiki/images/uda-micro.png' /><i>Generar código para EJB servidor</i>

<p>Permite la exposición de servicios gestionados por nuestro sistema software a otros aplicativos interesados. A partir de un servicio ya existente, se pueden crear fácilmente nuevos EJB que posibiliten su invocación remota.<br>
<br>
<h2>Kit de desarrollo</h2>
Para poder iniciarse rápidamente en el uso de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, se proporciona:<br>
<ul>
<li>Un paquete descomprimible con el IDE Eclipse totalmente configurado</li>
<li>Los componentes de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> por separado (el plugin, las plantillas, las librerías, etc.)</li>
<li>Y por supuesto, toda la documentación necesaria</li>
</ul>

<h2>Para estar informado de nuestras actualizaciones y mejoras</h2>

Si quieres estar al día de los cambios y actualizaciones que se generen en <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> tienes varias posibilidades: <a href='http://code.google.com/p/support/wiki/Feeds'>configurar tu lector de Feeds</a>, crear tus <a href='http://code.google.com/p/uda/feeds'>gadgets</a>, o también puedes participar en nuestro <a href='http://groups.google.com/group/uda-ejie'>grupo</a> de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />.<br>
<br>
Además, en la sección <a href='http://code.google.com/p/uda/wiki/Instalar'>Instalar</a> iremos publicando información sobre los cambios que vayamos realizando y qué deberías descargar para estar actualizado.<br>
<br>
<h2>Formación y certificaciones</h2>

Si lo deseas, puedes recibir <a href='http://guc.esi.es/platea/'>formación</a> muy completa sobre <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, así como obtener las <a href='http://guc.esi.es/platea/'>certificaciones</a> como analista y como desarrollador.<br>
<br>
<h2>Licencias</h2>
<ul>
<li>La documentación y la información contenida en estas páginas se ofrecen bajo licencia<br>
<a href='http://creativecommons.org/licenses/by-nc-sa/3.0/'><img src='http://i.creativecommons.org/l/by-nc-sa/3.0/88x31.png' /></a> <a href='http://creativecommons.org/licenses/by-nc-sa/3.0/'>Creative Commons Reconocimiento-NoComercial-CompartirIgual 3.0 Unported License</a>.</li>

<li>El plugin <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, las extensiones para Hibernate Tools, las plantillas de generación de código, las librerías de utilidades <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> y los componentes RUP se ofrecen con arreglo a la <a href='http://ec.europa.eu/idabc/eupl.html'>European Union Public Licence - EUPL v1.1</a>, exclusivamente en su versión 1.1</li></ul>

<h2>Empresas colaboradoras</h2>

<a href='http://www.entelgy.com/'><img src='http://uda.googlecode.com/svn/wiki/images/entelgy_ibai.png' /></a>
<a href='http://www.eurohelp.es/'><img src='http://uda.googlecode.com/svn/wiki/images/eurohelp.png' /></a>
<a href='http://www.ibermatica.com/'><img src='http://uda.googlecode.com/svn/wiki/images/ibermatica.png' /></a>
<a href='http://www.tecnalia.com'><img src='http://uda.googlecode.com/svn/wiki/images/logoTecnalia.png' /></a>