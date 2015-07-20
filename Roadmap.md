_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FRoadmap)_

# Roadmap UDA #

A continuación se recoge el roadmap <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> con las actividades que se pretenden abordar y una previsión del momento de liberación de cada una ellas.


## Futuras mejoras ##

---

#### Librería de utilidades x38 ####
<ul>
<li>jUnit de las utilidades</li>
<li>Gestión de datos en cache (spring-cache)</li>
</ul>
#### Componentes RUP ####
<ul>
<li>componente rup.autocomplete<br>
<ul><li>añadir modo de fucionamiento suggest</li>
<li>eliminar implementación externa jQuery</li>
</ul>
</li>
<li>componente rup.menu<br>
<ul>
<li>eliminar implementación externa jQuery</li>
</ul>
</li>
<li>componente: listas de selección (<a href='http://www.senamion.com/blog/jmultiselect2side.html'>http://www.senamion.com/blog/jmultiselect2side.html</a>)</li>
<li>revisión de versiones de jQuery, jQueryUI, jqGrid</li>
<li>componentes gráficos (ej. JFreeChart)</li>
<li>pruebas qUnit sobre los componentes RUP</li>
</ul>
#### Plugin <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' /> ####
<ul>
<li>General<br>
<ul>
<li>Limpiar plantillas</li>
<li>Modularizar los diferentes plugins</li>
<li>Regeneración parcial de código en las clases vs regenerar de fichero completo</li>
<li>Almacenar datos de conexión a diferentes DataSources (actualmente solo 1)</li>
</ul>
</li>
<li>Generación de código<br>
<ul>
<li>Eliminar la selección de generación de código con anotación o xml (solo anotaciones)</li>
<li>Eliminar la pantalla para introducir los datos de seguridad</li>
<li>Permitir el uso de varios DataSources en una aplicación (actualmente solo 1)</li>
<li>Mejoras en el DAO (NamedParameter, evitar RowMapper)</li>
<li>Optimizar relaciones EAGER-LAZY y sus queries</li>
<li>Generar clases JUnit del código generado</li>
</ul>
</li>
<li>Nuevos asistentes<br>
<ul>
<li>Seguridad</li>
<li>WebService</li>
<li>JSP/formulario</li>
<li>Batch para procesos java</li>
</ul>
</li>
</ul>
<p>