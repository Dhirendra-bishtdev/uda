_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FInstalar)_

La forma más sencilla y rápida para empezar a trabajar y crear aplicaciones rápidamente con <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> es instalar la última versión del entorno de desarrollo Eclipse Helios UDA suministrado, el cual ya contiene todos los plugins necesarios, así como las plantillas de generación de código, además, **siempre actualizados**.

Si se van a realizar desarrollos para el entorno de EJIE-GV se deberá instalar previamente:
<ul>
<li>Oracle Weblogic Server 11g</li>
<ul>
<li>Instalar el servidor de aplicaciones</li>
<li>Crear un dominio de desarrollo</li>
<li>Configurar su integración con XLNets (sistema de seguridad estándar de EJIE-GV)</li>
</ul>

<li><a href='http://maven.apache.org/'>Apache Maven</a> versión 2.0.9 o superior (se ha validado también con la versión 3.0)</li>
<ul>
<li>Configurar las variables de entorno M2_HOME, M2_REPO y el fichero settings.xml</li>
<li>Descomprimir el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_S2g4UWZwbXh2aHM&export=download'>repositorio suministrado</a>, el cual además de contener la librería de utilidades de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_Y3dkd19vcWVGb0E&export=download'>x38ShLibClasses</a> y de XLNetS, evitará la descarga de todas las librerías necesarias desde Internet</li>
</ul>

<li><a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_V2NuX0FtY3ItRUk&export=download'>Librerías de infraestructura</a>, necesarias para el correcto funcionamiento de Eclipse. Es suficiente con descomprimir el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_V2NuX0FtY3ItRUk&export=download'>"usr.rar"</a> en la unidad de disco seleccionada</li>
</ul>

Una vez instalados todos estos elementos se deberá descomprimir el fichero que contiene el Eclipse, ["Helios UDA-v2.4.4.zip"](https://drive.google.com/uc?id=0B2jWuJHnBpz_aXJtdHUycXZVajg&export=download), ejecutar Eclipse, y seguir los siguientes pasos:
<ul>
<li>Activando la perspectiva "JavaEE", dar de alta un nuevo servidor de aplicaciones. En la pestaña "Servers", con botón derecho, activar "New>Server", configurando el "Oracle Weblogic Server 11g" instalado previamente</li>
<li>En la ventana "Window>Preferences":</li>
<ul>
<li>Acceder a "General>Workspace", y establecer el "Text file encoding" a "UTF-8"</li>
<li>Acceder a "General>Content Types". Para los de tipo "Text" y pulsando "Update", establecer como "Default enconding" el "UTF-8". Repetir este paso para los subtipos "Java Properties Files" y "JSP"</li>
<li>Acceder a "Web>CSS Files" y seleccionar el encoding "ISO 10646/Unicode(UTF-8)"</li>
<li>Acceder a "Web>HTML Files" y seleccionar el encoding "ISO 10646/Unicode(UTF-8)"</li>
<li>Acceder a "Web>JSP Files" y seleccionar el encoding "ISO 10646/Unicode(UTF-8)"</li>
<li>Acceder a "XML>XML Files" y seleccionar el encoding "ISO 10646/Unicode(UTF-8)"</li>
<li>Acceder a "General>Editors>File Associations" y activar como editores por defecto (pulsando botón "Default") para los ficheros ".jsp > JSP Editor"</li>
<li>Acceder a "Java>Build path>User Libraries" e importar el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_aXVOT0xuUFBBV1E&export=download'>"UDAWLS11Classpath.userlibraries"</a> suministrado</li>
<li>Acceder a "UDA" para configurar el path que contiene las plantillas, "ECLIPSE_HOME\templates", y marcar la casilla "Desarrollo para EJIE"</li>
</ul>
</ul>

Por último, ya solo queda configurar el entorno de aseguramiento de la calidad del código de EJIE-GV.

<ul>
<li>Acceder a "Checkstyle" y pulsando en "New..." rellenar la nueva ventana con los siguientes datos:</li>
<ul>
<li>Type: External configuration file</li>
<li>Name: UDA Checkstyle Project</li>
<li>Location: ECLIPSE_HOME\rules\OTC_Sonar_Checkconfig.xml</li>
</ul>
Seleccionar la nueva configuración y pulsar "Set as Default"<br>
<li>Acceder a "PMD>Rules configuration", pulsar en "Clear all", e importar ("Import rule set...") las nuevas reglas desde el fichero ECLIPSE_HOME\rules\OTC_Sonar_PMDconfig.xml</li>
<li>Acceder a "Java>FindBugs". En la pestaña "Filter Files", apartado "Include filter files" añadir ("Add...") las nuevas reglas desde el fichero ECLIPSE_HOME\rules\OTC_Sonar_Findbugsconfig.xml. En la pestaña "Reporter configuration" marcar todos los checks.</li>
</ul>

El asistente de generación de proyectos de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> configura automáticamente el uso de las reglas estándar de calidad de EJIE-GV para el análisis estático del código, por tanto, si no se tienen instalados Chekstyle y PMD, Eclipse dará errores de configuración. Esto se puede evitar, evidentemente, instalando dichos plugins, o bien eliminando los ficheros ".checkstyle" y ".pmd" de la raiz de los proyectos generados.

También es posible que ya se tengan instalados previamente todos o parte de los componentes necesarios aquí indicados, pero en cualquier caso, se recomienda encarecidamente consultar como guía de instalación, el documento ["Instalacion\_PC\_local\_WLS11\_proveedores.pdf"](https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_MlBZRFZscG5iY0k&export=download).

<br>
En el caso de que solo quiera instalar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_a1BTRWdvcVQ3QlE&export=download'>"plugin UDA"</a> en Eclipse, deberá realizar los siguientes pasos:<br>
<ol>
<li><b>Desinstalar la versión previa del plugin</b> realizando las siguientes acciones:</li>
<ul>
<li>En Eclipse "Help > About Eclipse Platform > Installation Details" y en la pestaña "Installed Software" seleccionar <b>com.ejie.uda.feature (provider EJIE)</b>, y desinstalar. Eclipse solicitará reiniciarse para eliminar todos los ficheros.</li>
<li>Eliminar manualmente los ficheros del plugin y la feature de la ruta:</li>
<ul>
<li>ECLIPSE_HOME\features\com.ejie.uda.feature_XXX</li>
<li>ECLIPSE_HOME\plugins\com.ejie.uda_XXX.jar</li>
</ul>
<li>A partir de la versión 1.1.0, no es necesario el fichero "htejie.jar", por lo que habrá que eliminarlo manualmente de la ruta ECLIPSE_HOME\plugins\org.hibernate.eclipse_3.4.0.v20110215-1252-H31-GA\lib\tools<br>
<br>
</li>
</ul>
<li><b>Instalar la nueva versión del <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_a1BTRWdvcVQ3QlE&export=download'>"plugin UDA"</a></b> para lo que se debe descargar y descomprimir en una ubicación temporal para proceder a su instalación.<br>
<br>
En "Eclipse>Window>Preferences>Available Software Site", crear un site que referencie la ubicación temporal e instalarlo desde "Eclipse>Help>Install New Software", seleccionándolo.<br>
<br>
Eclipse solicitará reiniciarse para crear correctamente todos los ficheros.<br>
<br>
</li>

<li><b>Actualizar las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_OXdMME1NM3M3TEk&export=download'>plantillas de generación de código</a></b> descargándolas y almacenándolas en el directorio templates bajo "ECLIPSE_HOME".<br>
<br>
NOTA: Se recomienda borrar la carpeta "ECLIPSE_HOME\templates\" para garantizar la  correcta eliminación de las plantillas anteriores.<br>
<br>
</li>
</ol>


Además recuerde que deberá instalar también:<br>
<ul>
<li>Las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_amloVEpLX0RKTlU&export=download'>extensiones de Hibernate Tools</a></li>
<li>La librería <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_Y3dkd19vcWVGb0E&export=download'>"x38ShLibClasses-x.x.x.jar"</a></li>
</ul>

<br>
Si se va a utilizar <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> en un entorno distinto al de EJIE-GV se recomienda adaptar las plantillas suministradas a su contenedor preferido.