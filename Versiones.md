_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FVersiones)_

En esta sección mantendremos el historial de versiones liberadas.
## 2.4.4 (1-Diciembre-2014) ##

---

#### Componentes RUP ####
<ul>
<li>Correcciones y nuevos eventos en el componente rup.table</li>
<li>Nuevas propiedades en el componente rup.tabs</li>
<li>Nuevos eventos y propiedades en el componente rup.autocomplete</li>
<li>Adaptación del componente rup.autocomplete para permitir autocompletado en un combo</li>
<li>Adaptación del componente rup.tabs para disponer de un carrusel de pestañas</li>
</ul>
#### Utilidades ####
<ul>
<li>Máquina virtual configurada preparada para arrancar y desarrollar</li>
</ul>
_NOTA: Esta versión manteniene el componente rup.maint por compatibilidad con versiones anteriores_
En la sección UDA v2.4.4 (1-Diciembre-2014) del archivo [ChangeLog.txt](https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_WnRnZWhyUC1TQ3M&export=download) podrás encontrar la lista de cambios realizados en esta versión.


## 2.4.3 (04-Agosto-2014) ##

---

#### Librería de utilidades X38 ####
<ul>
<li>Bug al mostrar el usuario conectado cuando la autenticación se realizad con juego de barcos</li>
</ul>
## 2.4.2 (27-Junio-2014) ##

---

#### Librería de utilidades X38 ####
<ul>
<li>Soporte para la generación de feeds RSS a partir de los items de la tabla</li>
<li>Soporte para facilitar la subida de ficheros mediante streaming a la infraestructura PIF (Ejie)</li>
</ul>
#### Componentes RUP ####
<ul>
<li>Modificación del componente rup.table para la generación de feeds RSS a partir de los items de la tabla</li>
<li>Modificación del componente rup.tabs (pestañas) para permitir configurar la posición de las pestañas por encima o por debajo del contenido</li>
<li>Correcciones en los componentes rup.table, rup.wizard, rup.combo, rup.upload, rup.tooltip, rup.contextMenu</li>
</ul>
_NOTA: Esta versión manteniene el componente rup.maint por compatibilidad con versiones anteriores_
En la sección UDA v2.4.2 (27-Junio-2014) del archivo [ChangeLog.txt](https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_UDdLRlFpZmxkQms&export=download) podrás encontrar la lista de cambios realizados en esta versión.

## 2.4.1 (13-Marzo-2014) ##

---

#### Librería de utilidades X38 ####
<ul>
<li>Soporte para la edición online de documentos mediante WebDAV</li>
</ul>
#### Componentes RUP ####
<ul>
<li>Plugin rup.table.report para el componente rup.table</li>
</ul>
_NOTA: Esta versión manteniene el componente rup.maint por compatibilidad con versiones anteriores_

En la sección UDA v2.4.1 (13-Marzo-2014) del archivo [ChangeLog.txt](https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download) podrás encontrar la lista de cambios realizados en esta versión.


## 2.4.0 (22-Noviembre-2013) ##

---

#### Plugin UDA ####
<ul>
<li>Asistente de mantenimiento: Generación en base al componente rup.table</li>
<li>Asistente de generación de aplicación: Generación de recursos RUP comprimidos y minimizados</li>
</ul>
#### Librería de utilidades X38 ####
<ul>
<li>Soporte para el nuevo componente rup.table</li>
</ul>
#### Componentes RUP ####
<ul>
<li>Nuevo componente rup.table</li>
<li>Nuevo componente rup.tree</li>
<li>Nuevo componente rup.contextMenu</li>
<li>Compresión y minimización de recursos de componentes RUP</li>
<li>Uso de sprites en los componentes RUP</li>
</ul>
_NOTA: Esta versión manteniene el componente rup.maint por compatibilidad con versiones anteriores_

En la sección UDA v2.4.0 (22-11-2013) del archivo [ChangeLog.txt](http://uda.googlecode.com/files/CHANGELOG.txt) podrás encontrar la lista de cambios realizados en esta versión.
<p>


<h2>2.1.3 (5-Junio-2013)</h2>
<hr />
<h4>Librería de utilidades X38</h4>
<ul>
<li>Soporte a implementación de nuevas funcionalidades comunes</li>
<li>Corrección de bugs</li>
</ul>

En la sección UDA v2.1.3 (05-06-2013) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
El cambio de la librería manteniene la compatibilidad con versiones anteriores pero es necesario modificar la configuración de seguridad (consultar los cambios a realizar en la sección de la wiki <a href='https://code.google.com/p/uda/wiki/Actualizar'>Actualizar</a>)<br>
<p>


<h2>2.1.2 (19-Marzo-2013)</h2>
<hr />
<h4>Componentes RUP</h4>
<ul>
<li>Corrección de bugs</li>
</ul>

En la sección UDA v2.1.2 (19-03-2013) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>
<p>


<h2>2.1.1 (18-Enero-2013)</h2>
<hr />
<h4>Librería de utilidades x38</h4>
<ul>
<li>logging: rotación y escritura de ficheros en el inicio de aplicaciones</li>
<li>concurrencia de peticiones http y ajax</li>
<li>seguridad: reutilización de instancias entre aplicaciones</li>
</ul>
<h4>Componentes RUP</h4>
<ul>
<li>componente rup.multicombo</li>
<li>componente rup.jerarquía</li>
<li>layout de las aplicaciones</li>
<ul>
<li>rup.language: presentación diálogo, presentación inline (es|eu)</li>
<li>header: actualizar estilos de la cabecera de las aplicaciones generadas</li>
</ul>
</ul>

En la sección UDA v2.1.1 (18-01-2013) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>
<p>



<p>
<h2>2.1.0 (20-Septiembre-2012)</h2>
<hr />
<ul>
<li>Sistema de seguridad: corrección de problema con refresco de credenciales, nuevas propiedades de usuario en el mock de pruebas sin Xlnets, soporte a la securización de breadcrumbs en base al rol del usuario.</li>
<li>Revisión de la base tecnológica sobre la que se desarrollan las aplicaciones: springframework, spring-security, logback, jackson, jquery, jquery-ui, jqgrid.</li>
<li>Patrones de interacción RUP: Correcciones en los componentes existentes para solucionar problemas detectados en la interacción entre sí y en la integración en la infraestructura de portal.</li>
<li>Reglas de calidad de código estático: Bajo acuerdo con la Oficina de Calidad se han revisado los niveles y la necesidad de algunas reglas</li>
</ul>

En la sección UDA v2.1.0 (20-09-2012) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>


<p>
<h2>2.0.0 (22-Junio-2012)</h2>
<hr />
<ul>
<li>Configuración y propiedades de idioma: la configuración de estas propiedades forma parte de la aplicación en lugar de cargarse desde la configuración de entorno.</li>
<li>Gestión de validaciones y excepciones: validaciones en servidor y cliente, facilidades para añadir gestión propia de excepciones, mejora de la página de error.</li>
<li>Sistema de seguridad: soporte multiusuario en el mock para las pruebas sin Xlnets, soporte a la autenticación con certificado, securización de menús en base al rol del usuario.</li>
<li>Revisión de la base tecnológica sobre la que se desarrollan las aplicaciones: springframework, spring-security, logback, jackson, jquery, jquery-ui, jqgrid.</li>
<li>Patrones de interacción RUP: Correcciones en los componentes existentes, integración de la gestión de validaciones y excepciones, cambio del plugin subyacente en el tooltip y el menú, nuevos patrones (wizard, form, validation).</li>
<li>Reglas de calidad de código estático: Bajo acuerdo con la Oficina de Calidad se han revisado los niveles y la necesidad de algunas reglas</li>
</ul>

En la sección UDA v2.0.0 (22-06-2012) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>




<h2>1.2.1 (22-Febrero-2012)</h2>
<hr />
<ul>
<li>Nueva documentación sobre recomendaciones y buenas prácticas en la programación de la interfaz web.</li>
<li>Nueva documentación de ayuda para el desarrollo de webservices siguiendo las recomendaciones de ERPI.</li>
<li>Nuevo componente accordion para agrupar secciones lógicas de un contenido dentro de una ventana.</li>
<li>Modificaciones en el componente tooltip: se cambia el color de fondo para uniformizar el color de los avisos al usuario y se mejora su integración en la infraestructura de Portales.</li>
<li>Correcciones sobre los patrones upload, combo, autocomplete, pestañas, diálogo, fecha y hora para mejorar su gestión e integración en el mantenimiento.</li>
</ul>

En la sección UDA v1.2.1 (22-02-2012) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>


<h2>1.2.0 (15-Diciembre-2011)</h2>
<hr />
<ul>
<li>Adaptación de la generación de código a la versión 10.3.5 de Oracle Weblogic Server. El código generado en versiones anteriores del plugin UDA se podía desplegar en la versión 10.3.5 del servidor modificando los descriptores de despliegue. Con este cambio el entorno de desarrollo en PC local evoluciona para ser análogo al entorno de desarrollo en EJIE. Tanto en el documento de instalación como en la <a href='http://code.google.com/p/uda/wiki/Actualizar'>página de actualización</a> se describen los pasos para la migración de los proyectos desarrollados en PC local en la versión 10.3.1 del servidor.</li>
<li>Nuevo plugin añadido al Eclipse IDE para facilitar la consulta de los logs de las aplicaciones <a href='http://code.google.com/a/eclipselabs.org/p/logviewer/'>Eclipse Log Viewer</a>.</li>
<li>Nuevos serializadores para el tratamiento de fechas y horas en los patrones date y time.</li>
<li>Nuevo patrón upload para el tratamiento de la subida de ficheros en las aplicaciones.</li>
<li>Correcciones sobre los patrones combo, autocomplete, fecha y hora para mejorar su integración en el mantenimiento.</li>
</ul>

En la sección UDA v1.2.0 (15-12-2011) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion y<br>
<ul>
<li>descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>

Para migrar el despliegue de los proyectos Eclipse existentes en la nueva versión del servidor Weblogic Server 11g 10.3.5 se recomienda leer la guía de "Instalación en PC Local" incluida en la <a href='http://uda.googlecode.com/files/Documentacion-v1.2.0.zip'>documentación</a> o los pasos incluidos en la sección <a href='http://code.google.com/p/uda/wiki/Actualizar'>Actualizar</a>.<br>
<br>
<br>
<h2>1.1.1 (14-Octubre-2011)</h2>
<hr />
<ul>
<li>Se ha actualizado la librería de utilidades <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> a la <a href='http://uda.googlecode.com/files/x38ShLibClasses-1.1.1.jar'>versión 1.1.1</a> corrigiendo un <a href='http://code.google.com/p/uda/issues/detail?id=8&can=1'>error</a> detectado en la composición de la url de XlNets.</li>
<li>Se ha actualizado el <a href='http://uda.googlecode.com/files/MavenRepository-v1.1.1.zip'>repositorio Maven (v1.1.1)</a> para incluir la nueva versión de la librería de utilidades.</li>
<li>Se han corregido varios bugs de los <a href='http://uda.googlecode.com/files/rup-v1.1.1.zip'>componentes RUP</a> y algunas incidencias de accesibilidad para la adecuación a las pautas WCAG 2.0 AA.</li>
<li>Se han actualizado convenientemente las <a href='http://uda.googlecode.com/files/templates-v1.1.1.zip'>plantillas</a> que generan automáticamente el código de los proyectos y los componentes RUP, a su versión 1.1.1.</li>
<li>Se ha actualizado el <a href='http://uda.googlecode.com/file/pluginUDAInstall-v1.1.1.zip'>plugin UDA</a> para corregir la generación de código de las relaciones M:N utilizando los sinónimos.</li>
</ul>

En la sección UDA v1.1.1 (14-10-2011) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
Para adecuar los patrones RUP en una aplicación que ya se encuentre en desarrollo, se recomienda guardar los cambios convenientemente en Subversion<br>
<ul>
<li>habrá que descomprimir y sustituir la carpeta rup en el proyecto de estáticos (codappStatics).</li>
<li>modificar los ficheros ".inc" con la versión correspondiente de los patrones.</li>
</ul>

<h2>1.1.0 (15-Septiembre-2011)</h2>
<hr />
<ul>
<li>Actualizada la librería de utilidades de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> a la <a href='http://uda.googlecode.com/files/x38ShLibClasses-1.1.0.jar'>versión 1.1.0</a>. Se ha modificado el sistema de logs para mejorar las trazas de las aplicaciones desarrolladas cambiando la implementación de log4j por <a href='http://www.slf4j.org'>slf4j</a> y <a href='http://logback.qos.ch'>logback</a>.</li>
<li>Se ha actualizado el <a href='http://uda.googlecode.com/files/MavenRepository-v1.1.0.zip'>repositorio Maven (v1.1.0)</a> para incluir la nueva versión de la librería de utilidades.</li>
<li>Se han corregido varios bugs y modificado la estructura del proyecto War y de los <a href='http://uda.googlecode.com/files/rup-v1.1.0.zip'>componentes RUP</a> para facilitar futuras tareas de compresión y minimizado, pasando a la versión 1.1.0.</li>
<li>Se han actualizado convenientemente las <a href='http://uda.googlecode.com/files/templates-v1.1.0.zip'>plantillas</a> que generan automáticamente el código de los proyectos y los componentes RUP, a su versión 1.1.0.</li>
<li>Se ha añadido una regla de análisis estático al conjunto de <a href='http://uda.googlecode.com/files/rules-v1.1.0.zip'>reglas de aseguramiento de la calidad</a>.</li>
<li>Se ha actualizado el <a href='http://uda.googlecode.com/file/pluginUDAInstall-v1.1.0.zip'>plugin UDA</a> para<br>
<ul><li>Suprimir la necesidad de incluir el fichero "htejie.jar" como extensión de Hibernate Tools.</li>
<li>Unificar la inyección de dependencias en la generación de los proyectos EarClasses y War mediante XML o anotaciones.</li>
</ul></li>
<li>Se incluye el plugin <a href='http://www.jboss.org/tools'>Freemarker IDE (JBoss Tools)</a> en Eclipse para facilitar la edición de las plantillas de generación de código.</li>
</ul>

En la sección UDA v1.1.0 (15-09-2011) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
También hemos incluido una nueva sección <a href='http://code.google.com/p/uda/wiki/Actualizar'>"Actualizar"</a>, en el que podrás encontrar las instrucciones para actualizar una aplicación que ya hayas generado con UDA previamente.<br>
<br>
<br>
<h2>1.0.1 (09-Julio-2011)</h2>
<hr />
<ul>
<li>Actualizada la librería de utilidades de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> a la <a href='http://uda.googlecode.com/files/x38ShLibClasses-1.0.1.jar'>versión x38ShLibClasses-1.0.1.jar</a>. Se han completado y mejorado ciertos aspectos sobre la gestión de la seguridad de las aplicaciones.</li>
<li>Se ha actualizado también el <a href='http://uda.googlecode.com/files/MavenRepository-v1.0.1.zip'>repositorio Maven (v1.0.1)</a> para incluir la nueva versión de la librería de utilidades.</li>
<li>Corregidos ciertos bugs y aplicadas algunas mejoras sobre los <a href='http://uda.googlecode.com/files/rup-v1.0.1.zip'>componentes RUP</a>, pasando a la versión 1.0.1.</li>
<li>Puesto que las <a href='http://uda.googlecode.com/files/templates-v.1.0.1.zip'>plantillas</a> generan automáticamente los  componentes RUP, estas también han sido actualizadas a la versión 1.0.1</li>
<li>
Se actualiza la <a href='http://uda.googlecode.com/files/Documentaci%C3%B3n.v1.0.1.zip'>documentación con la versión 1.0.1</a>, completándose con las guías de uso de los patrones (Documentación.v1.0.1\Guias de uso\Patrones), y cambios menores en la<br>
guía de uso de los plugins (Documentación.v1.0.1\Plugin UDA\Guia_Uso_Plugins.v.1.0.1.pdf).<br>
</li>
</ul>

En la sección UDA v1.0.1 (09-Julio-2011) del archivo <a href='http://uda.googlecode.com/files/CHANGELOG.txt'>ChangeLog.txt</a> podrás encontrar la lista de cambios realizados en esta versión.<br>
<br>
También hemos incluido una nueva sección <a href='http://code.google.com/p/uda/wiki/Actualizar'>"Actualizar"</a>, en el que podrás encontrar las instrucciones para actualizar una aplicación que ya hayas generado con UDA previamente.<br>
<br>
<br>
<h2>1.0.0 (30-Mayo-2011)</h2>
<hr />
<ul>
<li><b>Helios UDA.1.0.0.part_n</b> : Contiene el Eclipse Helios totalmente configurado, incluyendo las plantillas (templates.v1.0.0) y las reglas de aseguramiento de la calidad del código (análisis estático) establecidas en el entorno de EJIE-GV (rules.v1.0.0).</li>
<li><b>templates.v1.0.0</b> : Plantillas de generación de código</li>
<li><b>rules.v1.0.0</b> : Reglas de aseguramiento de la calidad del código (análisis estático) establecidas en el entorno de EJIE-GV </li>
<li><b>rup.v1.0.0</b> : Patrones de interacción (plugins jQuery y jQueryUI). Al hacer uso del asistente de "crear nueva aplicación", se generará un proyecto tipo War (appStatics) con los contenidos estáticos necesarios para la apliación, conteniendo por lo tanto los patrones RUP propuestos por <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />. Para actualizar solo la versión de los patrones RUP, será suficiente con sustituir el subdirectorio "rup" en el proyecto de contenidos estáticos.</li>
<li><b>usr.v1.0.0</b> : Librerías de infraestructura; necesarias si se va ha desarrollar para el entorno de EJIE-GV, haciendo uso de XLNetS y creando puebas unitarias, de integración, o de sistema.</li>
<ul>
<li>XLNetS (Sistema de seguridad)</li>
<li>Entorno de calidad y pruebas (junit4.8.2 y selenium 1.2)</li>
</ul>
<li><b>UDAWLS11Classpath.userlibraries</b> : Configura en Eclipse como "userlibraries", las librerías de infraestructura, por tanto, solo es necesario si se va ha deasrrollar para el entorno de EJIE-GV. </li>
<li><b>addonsPluginUDA.v1.0.0</b> : Extensiones de Hibernate Tools (htejie.jar, ejb-api-3.0.jar y ojdbc5.jar)</li>
<li><b>x38ShLibClasses-1.0</b> : Librería de utilidades de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /></li>
<li><b>MavenRepository.v1.0</b> : Repositorio Maven, conteniendo también la librería de utilidades de UDA "x38ShLibClasses-x.x.jar"</li>
<li><b>pluginUDAInstall.v1.0.0</b> : Plugin <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /></li>
<li><b>Documentación</b> : Toda la documentación necesaria para el uso de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> y de cualquiera de sus componentes.</li>
</ul>