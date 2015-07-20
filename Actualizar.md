_[English version](http://translate.google.es/translate?sl=es&tl=en&js=n&prev=_t&hl=es&ie=UTF-8&u=http%3A%2F%2Fcode.google.com%2Fp%2Fuda%2Fwiki%2FActualizar)_

En esta sección iremos indicando como mantenerse actualizado con las últimas versiones disponibles de los componentes de <img src='http://uda.googlecode.com/svn/wiki/images/uda-mini-micro2.png' />, es decir, cuando ya se dispone de una aplicación generada, y se desea incorporar las últimas actualizaciones.

**Para el proceso de actualización dan por sentados los siguientes supuestos**:
<ul>
<li>La actualización se realiza sobre una aplicación con la versión 2.4.0 de RUP. La actualización directa desde versiones anteriores no ha sido probada por lo que es posible que pueda darse la necesidad de realizar modificaciones extras.</li>
<li>Los ficheros originales de RUP no han sido modificados.</li>
</ul>

<p>
Si lo que buscas es información sobre como mantener tu entorno de desarrollo actualizado, debes consultar la sección <a href='http://code.google.com/p/uda/wiki/Instalar'>"Instalar"</a>.<br>
<br>
<br>
<h3>v2.4.5 (24-Abril-2015)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U3A5dXNzM1dfMkU&export=download'>rup-v2.4.5.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Sustituir las líneas 10-34:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.sprite-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.contextMenu-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.report-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.table-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tree-2.4.5.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>

<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 7-9, 20-21, 39-78 y :<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.src.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid.rup.table.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
...<br>
<br>
&lt;!-- Utilidades adicionales --&gt;<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.jstree.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.hotkeys.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.contextMenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.contextMenu-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.report-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.core-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.contextMenu-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.filter-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.search-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.toolbar-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.feedback-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.fluid-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.formEdit-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.inlineEdit-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.multiselection-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.jerarquia-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.masterDetail-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tree-2.4.5.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_RUtDU3pSLVZ5Smc&export=download'>templates-v2.4.5.zip</a></li></ul>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_TEllbWM4ZXcxTFk&export=download'>versión 2.4.5</a>, que contiene la nueva versión de la librería  (<a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U3NwbHhnbG5vMXM&export=download'>x38ShLibClasses</a>)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.5-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download'>Plugin UDA (v2.4.0)</a> y las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_RUtDU3pSLVZ5Smc&export=download'>Plantillas (v2.4.5)</a>, o si lo prefieres el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_TDIybWVPaEJBS0E&export=download'>Eclipse Helios UDA (v2.4.5)</a> completo.<br>
</li>
</ol>
<p>
<h3>v2.4.4 (1-Diciembre-2014)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_WEpvRWFWU0xJc00&export=download'>rup-v2.4.4.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Sustituir las líneas 10-34:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.sprite-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.contextMenu-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.report-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.table-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tree-2.4.4.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>

<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 7-9, 20-21, 39-78 y :<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.src.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid.rup.table.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
...<br>
<br>
&lt;!-- Utilidades adicionales --&gt;<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.jstree.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.hotkeys.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.contextMenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.contextMenu-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.report-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.core-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.contextMenu-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.filter-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.search-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.toolbar-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.feedback-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.fluid-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.formEdit-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.inlineEdit-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.multiselection-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.jerarquia-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.masterDetail-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tree-2.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_OXdMME1NM3M3TEk&export=download'>templates-v2.4.4.zip</a></li></ul>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_S2g4UWZwbXh2aHM&export=download'>versión 2.4.4</a>, que contiene la nueva versión de la librería x38ShLibClasses (<a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_Y3dkd19vcWVGb0E&export=download'>x38ShLibClasses-v2.4.4.jar</a>)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.4-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download'>Plugin UDA (v2.4.0)</a> y las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_OXdMME1NM3M3TEk&export=download'>Plantillas (v2.4.4)</a>, o si lo prefieres el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_aXJtdHUycXZVajg&export=download'>Eclipse Helios UDA (v2.4.4)</a> completo.<br>
</li>
</ol>
<p>

<h3>v2.4.3 (04-Agosto-2014)</h3>

<b>Actualizar la librería de utilidades</b>
<ol>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_YUJRcUMxN01mX28&export=download'>versión 2.4.3</a>, que contiene la nueva versión de la librería x38ShLibClasses (<a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_Mk1INnpBLWR5Z0k&export=download'>x38ShLibClasses-2.4.3-RELEASE.jar</a>)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.3-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download'>Plugin UDA (v2.4.0)</a> y las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_QUpwV3V4VEc1alU&export=download'>Plantillas (v2.4.3)</a>, o si lo prefieres el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_cW9CM1pFcmZLLTA&export=download'>Eclipse Helios UDA (v2.4.2)</a> completo.<br>
</li>
</ol>
<p>



<h3>v2.4.2 (27-Junio-2014)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_Tld4b2M4TmFCZU0&export=download'>rup-v2.4.2.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Sustituir las líneas 10-34:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.sprite-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.contextMenu-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.report-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.table-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tree-2.4.2.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>

<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 7-9, 20-21, 39-78 y :<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.src.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid.rup.table.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
...<br>
<br>
&lt;!-- Utilidades adicionales --&gt;<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.jstree.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.hotkeys.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.contextMenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.contextMenu-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.report-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.core-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.contextMenu-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.filter-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.search-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.toolbar-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.feedback-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.fluid-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.formEdit-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.inlineEdit-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.multiselection-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.jerarquia-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.masterDetail-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tree-2.4.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_cXV6Rkc4VDFMRlU&export=download'>templates-v2.4.2.zip</a></li></ul>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_eW9sMVZ5M3FEZ0U&export=download'>versión 2.4.2</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.4.2.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.2-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download'>Plugin UDA (v2.4.0)</a> y las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_MFh2YUFJRURwVXc&export=download'>Plantillas (v2.4.2)</a>, o si lo prefieres el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_cW9CM1pFcmZLLTA&export=download'>Eclipse Helios UDA (v2.4.2)</a> completo.<br>
</li>
</ol>
<p>

<h3>v2.4.1 (13-Marzo-2014)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_d09LeDNrZjlKSzg&export=download'>rup-v2.4.1.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Sustituir las líneas 10-34:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.sprite-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.contextMenu-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.report-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.table-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tree-2.4.1.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>

<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 7-9, 20-21, 39-78 y :<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.src.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid.rup.table.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
...<br>
<br>
&lt;!-- Utilidades adicionales --&gt;<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.jstree.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.hotkeys.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.contextMenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.contextMenu-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.report-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.core-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.contextMenu-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.filter-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.search-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.toolbar-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.feedback-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.fluid-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.formEdit-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.inlineEdit-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.multiselection-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.jerarquia-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.masterDetail-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tree-2.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_cXV6Rkc4VDFMRlU&export=download'>templates-v2.4.1.zip</a></li></ul>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_eW9sMVZ5M3FEZ0U&export=download'>versión 2.4.1</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.4.1.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.1-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_U0p3OFloTERDLVU&export=download'>Plugin UDA (v2.4.0)</a> y las <a href='https://docs.google.com/uc?authuser=0&id=0B2jWuJHnBpz_cXV6Rkc4VDFMRlU&export=download'>Plantillas (v2.4.1)</a>, o si lo prefieres el <a href='https://drive.google.com/folderview?id=0B2jWuJHnBpz_VFVLU2ZoREQ2Q1E&usp=sharing'>Eclipse Helios UDA (v2.4.1)</a> completo.<br>
</li>
</ol>
<p>


<h3>v2.4.0 (22-Noviembre-2013)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v2.4.0.zip'>rup-v2.4.0.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Sustituir las líneas 10-34:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.sprite-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.contextMenu-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.report-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.table-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tree-2.4.0.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre>
<i>El fichero rup.maint-2.4.0.css no aparece, pero se ha mantenido por compatibilidad y se puede obtener en <a href='http://uda.googlecode.com/files/templates-v2.4.0.zip'>templates-v2.4.0.zip</a></i></blockquote></blockquote>

<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 7-9, 20-21, 39-78 y :<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.src.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid.rup.table.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
...<br>
<br>
&lt;!-- Utilidades adicionales --&gt;<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.jstree.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.hotkeys.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.contextMenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.contextMenu-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.report-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.core-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.contextMenu-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.filter-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.search-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.toolbar-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.feedback-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.fluid-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.formEdit-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.inlineEdit-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.multiselection-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.jerarquia-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup_table/rup.table.masterDetail-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tree-2.4.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
<i>El fichero rup.maint-2.4.0.js no aparece, pero se ha mantenido por compatibilidad y se puede obtener en <a href='http://uda.googlecode.com/files/templates-v2.4.0.zip'>templates-v2.4.0.zip</a></i></blockquote></blockquote>

</li>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v2.4.0.zip'>templates-v2.4.0.zip</a></li></ul>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v2.4.0.zip'>versión 2.4.0</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.4.0.jar) y el resto de dependencias actualizadas (Spring, jslf4, logback)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.4.0-RELEASE&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v2.4.0.zip'>Plugin UDA (v2.4.0)</a> y las <a href='http://uda.googlecode.com/files/templates-v2.4.0.zip'>Plantillas (v2.4.0)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.4.0)</a> completo.<br>
</li>
</ol>
<p>






<h3>v2.1.3 (5-Junio-2013)</h3>

<b>Actualización de la versión de la librería de utilidades</b>
<ol>
<li><b>Actualizar la configuración de seguridad</b>
<blockquote>Eliminar en el fichero <code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\spring\security-core-config.xml, el bean <i>stockUdaSecurityPadlocks</i> y su uso como propiedad en <i>preAuthenticateProcessingFilter</i> (líneas 47-51):<br>
<pre><code>	&lt;!-- Se define que con cambios de usurio se recargen los datos de seguridad y se mate la session, cual es el "perimetralSecurityWrapper" y el "authenticationManager" --&gt;<br>
	&lt;bean id="stockUdaSecurityPadlocks" class="com.ejie.x38.security.StockUdaSecurityPadlocksImpl"/&gt;<br>
	<br>
	&lt;bean id="preAuthenticateProcessingFilter" class="com.ejie.x38.security.PreAuthenticateProcessingFilter"&gt;<br>
		&lt;property name="stockUdaSecurityPadlocks" ref="stockUdaSecurityPadlocks" /&gt;<br>
	...<br>
</code></pre></blockquote>

</li>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v2.1.3.zip'>versión 2.1.3</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.1.3.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;com.ejie.x38.version&gt;2.1.3&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v2.1.1.zip'>Plugin UDA (v2.1.1)</a> y las <a href='http://uda.googlecode.com/files/templates-v2.1.3.zip'>Plantillas (v2.1.3)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.1.3)</a> completo.<br>
</li>
</ol>
<p>



<h3>v2.1.2 (19-Marzo-2013)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v2.1.2.zip'>rup-v2.1.2.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Modificar las líneas 10-29 y añadir:<br>
<pre><code><br>
&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.1.2.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 6-9 y 40-60:<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.1.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre></blockquote></blockquote>

</li>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v2.1.2.zip'>templates-v2.1.2.zip</a></li></ul>

<li>Finalmente, no olvides actualizar las <a href='http://uda.googlecode.com/files/templates-v2.1.0.zip'>Plantillas (v2.1.2)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.1.2)</a> completo.<br>
</li>
</ol>
<p>

<h3>v2.1.1 (18-Enero-2013)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v2.1.1.zip'>rup-v2.1.1.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Modificar las líneas 10-29 y añadir:<br>
<pre><code><br>
&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid.jerarquia-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Añadir en el fichero en las líneas 17, 21, y 49 respectivamente :<br>
<pre><code>&lt;!-- jQuery UI 1.8.23--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.multiselect.js" type="text/javascript"&gt;&lt;/script&gt;&lt;!-- multicombo --&gt;<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.contextmenu.js" type="text/javascript"&gt;&lt;/script&gt;	<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
</code></pre>
Modificar las líneas 6-9 y 40-60:<br>
<pre><code><br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid.jerarquia-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre></blockquote></blockquote>

</li>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v2.1.1.zip'>templates-v2.1.1.zip</a></li></ul>

<li>Actualizar la librería de utilidades <a href='http://uda.googlecode.com/files/x38ShLibClasses-2.1.1.jar'>x38ShLibClasses-2.1.1.jar</a>
<blockquote>Modificar la definición de la variable DESTROY_XLNETS_SESSION el fichero <code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\base-includes.jsp (línea 34) para sustituir <i>destroyXLNetsSession</i> por <i>destroySessionSecuritySystem</i>
<pre><code>	DESTROY_XLNETS_SESSION = '&lt;#noparse&gt;${!empty sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal ? sessionScope.SPRING_SECURITY_CONTEXT.authentication.credentials.destroySessionSecuritySystem : sessionScope.destroySessionSecuritySystem}&lt;/#noparse&gt;';<br>
	...<br>
</code></pre></blockquote>

</li>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v2.1.1.zip'>versión 2.1.1</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.1.1.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
    &lt;com.ejie.x38.version&gt;2.1.1&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v2.1.0.zip'>Plugin UDA (v2.1.0)</a> y las <a href='http://uda.googlecode.com/files/templates-v2.1.1.zip'>Plantillas (v2.1.1)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.1.1)</a> completo.<br>
</li>
</ol>
<p>


<h3>v2.1.0 (20-Septiembre-2012)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics\WebContent</code>\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v2.1.0.zip'>rup-v2.1.0.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Modificar las líneas 7-8 y 10-29 y añadir:<br>
<pre><code>&lt;!-- jQuery UI (custom-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/custom-theme/jquery-ui-1.8.23.custom.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
<br>
&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 3-12, 18-19 y 37-57:<br>
<pre><code><br>
&lt;!-- jQuery 1.8.0--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery-1.8.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- jQuery UI 1.8.23--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui-1.8.23.custom.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.4.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid-4.4.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v2.1.0.zip'>templates-v2.1.0.zip</a></li></ul>

<li><b>Actualización de la configuración de seguridad</b>
<blockquote>Añadir al fichero <code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\spring\security-core-config.xml, el bean <i>stockUdaSecurityPadlocks</i> (líneas 47-51):<br>
<pre><code>	&lt;!-- Se define que con cambios de usurio se recargen los datos de seguridad y se mate la session, cual es el "perimetralSecurityWrapper" y el "authenticationManager" --&gt;<br>
	&lt;bean id="stockUdaSecurityPadlocks" class="com.ejie.x38.security.StockUdaSecurityPadlocksImpl"/&gt;<br>
	<br>
	&lt;bean id="preAuthenticateProcessingFilter" class="com.ejie.x38.security.PreAuthenticateProcessingFilter"&gt;<br>
		&lt;property name="stockUdaSecurityPadlocks" ref="stockUdaSecurityPadlocks" /&gt;<br>
	...<br>
</code></pre></blockquote>

<blockquote>Cambiar la clase asociada al <i>myAccessDeniedHandler</i> por <i>com.ejie.x38.security.MyAccessDeniedHandler</i> (líneas 89-90):<br>
<pre><code>	&lt;!-- Por defecto, se configura para que se redireccione a una pagina de error (/accessDenied) --&gt;<br>
	&lt;bean id="myAccessDeniedHandler" class="com.ejie.x38.security.MyAccessDeniedHandler"&gt;<br>
	...<br>
</code></pre></blockquote>

<blockquote>En caso de utilizar el <i>wrapperMock</i>, en el fichero <code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\spring\security-config.xml se deben añadir las propiedades <i>name</i>,<i>surname</i> y <i>fullname</i> a las especificaciones de los usuarios:<br>
<pre><code>	&lt;bean id="perimetralSecurityWrapper" class="com.ejie.x38.security.PerimetralSecurityWrapperMockImpl"&gt;<br>
		&lt;property name="principal"&gt;<br>
			&lt;list&gt;<br>
				&lt;map&gt;<br>
					...<br>
					&lt;entry key="name" value="Uda"/&gt;<br>
					&lt;entry key="surname" value="User"/&gt;<br>
					&lt;entry key="fullName" value="Uda User"/&gt;<br>
					...<br>
				&lt;/map&gt;<br>
			&lt;/list&gt;<br>
		&lt;/property&gt;<br>
	...	<br>
</code></pre>
</li></blockquote>

<li>Opcionalmente se puede configurar el botón de desconexión de usuario, para lo que será necesario realizar los siguientes pasos:<br>
<blockquote>En el fichero <code>&lt;xxxStatics&gt;\WebContent\&lt;xxx&gt;</code>\scripts\<code>&lt;xxxYYY&gt;</code>\<code>_</code>layoutLoader.js, añadir como parámetro la url de la pagina de logOut en la definición del componente <i>breadCrumb</i>
<pre><code>	logOutUrl: "/XXXWar/logout"<br>
</code></pre>
En el fichero <code>&lt;xxxYYY&gt;War\WebContent</code>\WEB-INF\layouts\base-includes.jsp, añadir la definición de las nuevas variables<br>
<pre><code><br>
	LOGGED_USER = "${!empty sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal ? sessionScope.SPRING_SECURITY_CONTEXT.authentication.credentials.fullName : sessionScope.fullName}",<br>
<br>
	DESTROY_XLNETS_SESSION = "${!empty sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal ? sessionScope.SPRING_SECURITY_CONTEXT.authentication.credentials.destroyXLNetsSession : sessionScope.destroyXLNetsSession}";<br>
<br>
</code></pre>
</li></blockquote>

<li><i>En caso de no realizar la actualización de los componentes RUP a su versión 2.1.0</i>, <b>será necesario realizar las siguientes actualizaciones de forma obligatoria</b>
<ul>
<li>En <code>&lt;xxxStatics&gt;\WebContent</code>\rup\basic-theme\images incluir los ficheros: <i>rup.padlock.gif</i>, <i>rup.unlock.png</i>, <i>rup.doorOut.png</i></li>
<li>Sustituir los ficheros:<br>
<pre><code>&lt;xxxStatics&gt;\WebContent\rup\basic-theme\theme.rup.breadCrumb-x.x.x.css<br>
&lt;xxxStatics&gt;\WebContent\rup\scripts\rup.breadCrumb-x.x.x.js<br>
&lt;xxxStatics&gt;\WebContent\rup\resources\rup.i18n_xx.json<br>
</code></pre>
con sus correspondientes de la versión 2.1.0.<br>
Todos estos ficheros se pueden obtener en <a href='http://uda.googlecode.com/files/rup-v2.1.0.zip'>rup-v2.1.0.zip</a></li>
</ul>
</li>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v2.1.0.zip'>versión 2.1.0</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-2.1.0.jar) y el resto de dependencias actualizadas (Spring, jslf4, logback)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
	&lt;org.springframework.version&gt;3.1.2.RELEASE&lt;/org.springframework.version&gt;<br>
	&lt;org.springframework.security.version&gt;3.1.2.RELEASE&lt;/org.springframework.security.version&gt;<br>
	&lt;org.logback.version&gt;1.0.6&lt;/org.logback.version&gt;<br>
	&lt;org.slf4j.version&gt;1.6.6&lt;/org.slf4j.version&gt;<br>
    &lt;com.ejie.x38.version&gt;2.1.0&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v2.1.0.zip'>Plugin UDA (v2.1.0)</a> y las <a href='http://uda.googlecode.com/files/templates-v2.1.0.zip'>Plantillas (v2.1.0)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.1.0)</a> completo.<br>
</li>
</ol>
<p>




<h3>v2.0.0 (22-Junio-2012)</h3>

<b>Para modificar la versión de los componentes RUP</b>
<ol>
<li>Cambiar la carpeta <code>xxxStatics</code>\WebContent\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v2.0.0.zip'>rup-v2.0.0.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Modificar las líneas 7-8 y 10-27 y añadir:<br>
<pre><code>&lt;!-- jQuery UI (custom-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/custom-theme/jquery-ui-1.8.20.custom.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
<br>
&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.validate-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.wizard-2.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;</code>\WebContent\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 3-4. Actualización de la versión de jQuery:<br>
<pre><code>&lt;!-- jQuery 1.7.2 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery-1.7.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Modificar las líneas 6-8. Modificar las versiones de rup.utils y rup.base:<br>
<pre><code>&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Añadir en la línea 9:<br>
<pre><code>&lt;script src="${staticsUrl}/rup/scripts/rup.compatibility-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Actualizar la sección de jQuery UI:<br>
<pre><code>&lt;!-- jQuery UI 1.8.20--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui-1.8.20.custom.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui.multidatespicker.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui.timepicker.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.ui.autocomplete.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.ui.selectmenu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Actualizar la sección de jqGrid:<br>
<pre><code>&lt;!-- jqGrid 4.3.2--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jqGrid-4.3.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid/jquery.jqGrid.fluid.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Actualizar la sección de Utilidades adicionales:<br>
<pre><code>&lt;!—Utilidades adicionales--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/form2object.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.blockUI.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.fileupload.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.fileupload-ui.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.form.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.iframe-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.json-2.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.numeric.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.qtip.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.url.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.validate.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/jquery.xdr-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/utils/xbreadcrumbs.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Actualizar las versiones de los ficheros de los patrones RUP:<br>
<pre><code>&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.form-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Añadir a continuación las entradas de los nuevos patrones:<br>
<pre><code>&lt;script src="${staticsUrl}/rup/scripts/rup.validate-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.wizard-2.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Añadir la sección para el menú:<br>
<pre><code>&lt;!-- Ajustes de compatibilidad de menú--&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery-1.7.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/menu/jquery.ui.core.menu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/menu/jquery.ui.widget.menu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/menu/jquery.ui.position.menu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/menu/jquery.ui.menu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script type="text/javascript"&gt;widgetMenu = $.noConflict(true);&lt;/script&gt;<br>
</code></pre>
</li>
</blockquote></blockquote><ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v2.0.0.zip'>templates-v2.0.0.zip</a></li></ul>

<ul><li>NOTA: <i>Debido al impacto de los cambios en la configuración de la versión 2.0.0, la actualización de la librería x38ShLibClasses (x38ShLibClasses-2.0.0.jar) incluida en el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v2.0.0.zip'>versión 2.0.0</a>, se detallará en un documento de migración a disposición en la zona de descarga.</i></li></ul>

<li>Para desarrollar aplicaciones con la nueva versión no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v2.0.0.zip'>Plugin UDA (v2.0.0)</a> y las <a href='http://uda.googlecode.com/files/templates-v2.0.0.zip'>Plantillas (v2.0.0)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v2.0.0)</a> completo.<br>
</li>
</ol>
<p>


<h3>v1.2.1 (22-Febrero-2012)</h3>
<ol>
<li>Cambiar la carpeta <code>xxxStatics</code>\WebContent\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v1.2.1.zip'>rup-v1.2.1.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Modificar las líneas 10-27:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.accordion-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-1.2.1.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;</code>\WebContent\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Modificar las líneas 6-8, 27-28 y 36-55:<br>
<pre><code>&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- jqGrid 4.3.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid-4.3.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.accordion-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-1.2.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v1.2.1.zip'>templates-v1.2.1.zip</a></li></ul>


<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v1.2.1.zip'>versión 1.2.1</a>, que contiene la nueva versión de la librería x38ShLibClasses (x38ShLibClasses-1.2.1.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
    &lt;com.ejie.x38.version&gt;1.2.1&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
<li>Borra versión o versiones anteriores, en caso de que permanezca alguna</li>
</ul>
</li>


<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v1.2.1.zip'>Plugin UDA (v1.2.1)</a> y las <a href='http://uda.googlecode.com/files/templates-v1.2.1.zip'>Plantillas (v1.2.1)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v1.2.1)</a> completo.<br>
</li>
</ol>
<p>



<h3>v1.2.0 (15-Diciembre-2011)</h3>
<ol>
<li>Cambiar la carpeta <code>xxxStatics</code>\WebContent\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v1.2.0.zip'>rup-v1.2.0.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.styles.inc<br>
<blockquote>Incluir en la línea 5:<br>
<pre><code>&lt;link href="${staticsUrl}/rup/basic-theme/jquery.fileupload-ui.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre>
Modificar las líneas 10-26:<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-1.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre></blockquote></blockquote>


<blockquote><code>&lt;xxxYYY&gt;</code>\WebContent\WEB-INF\layouts\includes\rup.scripts.inc<br>
<blockquote>Incluir en la línea 20:<br>
<pre><code>&lt;!-- FileUpload --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.fileupload.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.fileupload-ui.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.iframe-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.xdr-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Modificar las líneas 6-8 y 36-55:<br>
<pre><code>&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-1.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote></blockquote>

<ul><li>NOTA 1: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v1.2.0.zip'>templates-v1.2.0.zip</a></li></ul>

<ul><li>NOTA 2: En caso de querer añadir únicamente el patrón upload sería necesario añadir las líneas nuevas <i>pero no nos hacemos cargo de la interacción del patrón con versiones anteriores de RUP</i>.<br>
<blockquote>En <code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.styles.inc<br>
<pre><code>&lt;link href="${staticsUrl}/rup/basic-theme/jquery.fileupload-ui.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-1.2.0.css" rel="stylesheet" type="text/css" /&gt;<br>
...<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.upload-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre>
En <code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.scripts.inc<br>
<pre><code>&lt;script src="${staticsUrl}/rup/scripts/rup.utils-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-1.2.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
&lt;!-- FileUpload --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.fileupload.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.fileupload-ui.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.iframe-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.xdr-transport.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.upload-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre></blockquote></li></ul>


<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v1.2.0.zip'>versión 1.2.0</a>, que contiene  las nuevas versión de la librería x38ShLibClasses (x38ShLibClasses-1.2.0.jar)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
    ...<br>
    &lt;com.ejie.x38.version&gt;1.2.0&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
</code></pre>
</li>

<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
</ul>
</li>

<li>Para migrar los proyectos existentes a la nueva versión del servidor Weblogic 10.3.5:<br>
<br>
<ul>
<li>En primer lugar debe instalarse el servidor de aplicaciones WebLogic Server 11g (10.3.5.0) y configurarse para su trabajo en Eclipse como se indica en el <a href='http://uda.googlecode.com/files/Documentacion-v1.2.0.zip'>documento de instalación en PC local</a></li>
<li>Configurada la nueva versión del servidor se debe ir a las propiedades de cada uno de los proyectos que componen la aplicación (botón derecho sobre proyecto > Properties) y seleccionar el apartado "Project Facets". En la pestaña "Runtimes" debe marcarse la opción correspondiente a la nueva versión de WebLogic Server como aparece en la siguiente imagen.</li>

<img src='http://uda.googlecode.com/svn/wiki/images/img11.JPG' />

<li>Si en "Window>Preferences>UDA" está seleccionado el check "Desarrollo para EJIE" se deben actualizar además las librerías presentes en el CLASSPATH relacionadas con la versión anterior del servidor de aplicaciones. Para ello debe accederse a las propiedades de los proyectos <code>xxxEARClasses</code> y <code>xxxNombreWar</code> que componen nuestra aplicación ("botón derecho sobre proyecto > Properties") y seleccionar el apartado "Java Build Path". En la pestaña "Libraries" seleccionar "WebLogic System Libraries" y pulsar "Edit".</li>

<img src='http://uda.googlecode.com/svn/wiki/images/img12.JPG' />

<li>Aparecen las librerías que se han incluido en el CLASSPATH para el trabajo con la versión 10.3.1 de WebLogic Server 11g. Las librerías que no se encuentran aparecen con una "X" (weblogic.client.modules_10.3.1.0.jar y weblogic.server.modules.extra_10.3.1.0.jar) debiéndose sustituir por sus equivalentes de la versión 10.3.5 de WebLogic Sever 11g. Para ello se selecciona cada una de ellas y se edita el campo "Relative path" buscando la librería equivalente de la versión 10.3.5 (se encuentran en la carpeta "features" de la instalación del servidor).</li>

<img src='http://uda.googlecode.com/svn/wiki/images/img13.JPG' />

Este proceso debe repetirse para el proyecto <code>xxxEARClasses</code>.<br>
<li>Actualizadas las librerías se añade la aplicación al nuevo servidor configurado en Eclipse quedando configurada para su despliegue en Weblogic Server 11g versión 10.3.5.</li>
</ul>
</li>

<li>Finalmente, no olvides actualizar el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v1.2.0.zip'>Plugin UDA (v1.2.0)</a> y las <a href='http://uda.googlecode.com/files/templates-v1.2.0.zip'>Plantillas (v1.2.0)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v1.2.0)</a> completo.<br>
</li>
</ol>

<h3>v1.1.1 (14-Octubre-2011)</h3>
<ol>
<li>Cambiar la carpeta <code>xxxStatics</code>\WebContent\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v1.1.1.zip'>rup-v1.1.1.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS y JS:<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\includes\rup.styles.inc (líneas 9-24):<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-1.1.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-1.1.1.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre></blockquote>

<blockquote><code>&lt;xxxYYY&gt;</code>\WebContent\WEB-INF\layouts\includes\rup.scripts.inc (líneas 6-8 y 29-44):<br>
<pre><code>&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
...<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-1.1.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-1.1.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li></blockquote>

<ul><li>NOTA: Los ficheros actualizados puedes obtenerlos desde <a href='http://uda.googlecode.com/files/templates-v1.1.1.zip'>templates-v1.1.1.zip</a></li></ul>

<li>Si estás construyendo una aplicación para EJIE que además debe ser integrada en alguno de los portales de euskadi.net, debes actualizar el fichero <code>xxxEAR\build.xml</code> que incluye la nueva utilidad de generación de estilos (generatePortalStatic). Haciendo uso de dicha utilidad evitarás posibles problemas en el momento de integrar tu aplicación en el portal.<br>
<br>
<pre><code>&lt;?xml version="1.0" encoding="UTF-8"?&gt;<br>
&lt;!DOCTYPE project&gt;<br>
&lt;project name="aaaEAR" default="mavenRunDependencies" xmlns:artifact="antlib:org.apache.maven.artifact.ant"&gt;<br>
	<br>
	&lt;!-- Permite el uso de variables de entorno --&gt;<br>
	&lt;property environment="env" /&gt;<br>
		<br>
	&lt;!-- Obtener dependencias --&gt;	<br>
	&lt;target name="mavenRunDependencies" description="Resuelve las dependencias del proyecto desde Maven"&gt;<br>
		&lt;path id="maven-ant-tasks.classpath" path="${ant.home}/lib/maven-ant-tasks-2.1.1.jar" /&gt;<br>
		&lt;typedef resource="org/apache/maven/artifact/ant/antlib.xml" uri="antlib:org.apache.maven.artifact.ant" classpathref="maven-ant-tasks.classpath" /&gt;	<br>
		&lt;artifact:dependencies settingsFile="${env.M2_HOME}/conf/settings.xml"/&gt;<br>
		&lt;artifact:mvn pom="pom.xml" mavenHome="${env.M2_HOME}" fork="true"&gt;<br>
			&lt;arg value="package"/&gt;<br>
		&lt;/artifact:mvn&gt;		<br>
	&lt;/target&gt;<br>
	<br>
	&lt;!-- Portalizar estilos --&gt;<br>
	&lt;property name="codApp" value="aaa"/&gt;<br>
	&lt;property name="srcDir" value="../${codApp}Statics/WebContent"/&gt;<br>
	&lt;property name="destDir" value="../${codApp}Statics/${codApp}PortalStatics"/&gt;<br>
<br>
	&lt;target name="generatePortalStatics" description="Genera directorio aaaPortalStatics para despliegue en portal"&gt;<br>
		&lt;echo&gt;Regenerando directorio (aaaPortalStatics)&lt;/echo&gt;<br>
		&lt;delete dir="${destDir}" /&gt;<br>
		&lt;mkdir  dir="${destDir}" /&gt;<br>
		&lt;copy todir="${destDir}/rup" &gt;<br>
	 		&lt;fileset dir="${srcDir}/rup" /&gt;<br>
		&lt;/copy&gt;<br>
		&lt;copy todir="${destDir}/${codApp}" &gt;<br>
			&lt;fileset dir="${srcDir}/${codApp}" /&gt;<br>
		&lt;/copy&gt;<br>
		<br>
		&lt;!-- Desplegar en LOCAL --&gt;<br>
		&lt;copy todir="${destDir}/WEB-INF" &gt;<br>
			&lt;fileset dir="${srcDir}/WEB-INF" /&gt;<br>
		&lt;/copy&gt;<br>
		&lt;replace file="${destDir}/WEB-INF/weblogic.xml" token="${codApp}Statics" value="${codApp}PortalStatics" /&gt;<br>
		<br>
		<br>
		&lt;echo&gt;Parseando ficheros de estilos (.css)&lt;/echo&gt;<br>
		&lt;taskdef name="portalizeCss" classname="com.ejie.uda.UDAPortalizeCss" classpath="${ant.home}/lib/com.ejie.uda.statics.tools.jar" /&gt;<br>
		&lt;portalizeCss codApp="${codApp}" destDir="${destDir}" parserHacks="${ant.home}/lib/com.ejie.uda.statics.tools.style_hacks"/&gt;<br>
	&lt;/target&gt;<br>
<br>
&lt;/project&gt;<br>
</code></pre>

Acuérdate de sustituir el valor de la etiqueta <code>value</code> de la línea <code>&lt;property name="codApp" value="aaa"/&gt;</code> por el código de tu aplicación, así como el nombre del proyecto <code>&lt;project name="aaaEAR" </code> al principio del fichero.<br>
<br>
<ul><li>NOTA: Las librerías que contienen esta utilidad se instalarán cuando actualices el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v1.1.1.zip'>Plugin UDA (v1.1.1)</a>, por tanto, para poder utilizarla, debes realizar antes dicha <a href='http://code.google.com/p/uda/wiki/Instalar'>instalación</a>.</li></ul>

</li>

<li>Actualizar el repositorio de dependencias Maven con la nueva <a href='http://uda.googlecode.com/files/MavenRepository-v1.1.1.zip'>versión 1.1.1</a>, que contiene  las nuevas versiones de las librerias actualizadas (x38ShLibClasses-1.1.1.jar e hibernate-validator-4.2.0.Final)</li>

<li>Actualizar el fichero "<code>pom.xml</code>" del proyecto <code>xxxEAR</code> para dejar acorde las dependencias de las librerías:<br>
<br>
<ul>
<li>Actualizar la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
    ...<br>
    ...<br>
    &lt;com.ejie.x38.version&gt;1.1.1&lt;/com.ejie.x38.version&gt;<br>
&lt;/dependency&gt;<br>
<br>
...<br>
<br>
&lt;!-- x38 --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;com.ejie.x38&lt;/groupId&gt;<br>
    &lt;artifactId&gt;x38ShLibClasses&lt;/artifactId&gt;<br>
    &lt;version&gt;${com.ejie.x38.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
</code></pre>
</li>

<li>Actualizar la versión de Hibernate Validator:<br>
<pre><code>&lt;!-- JSR 303 with Hibernate Validator --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.hibernate&lt;/groupId&gt;<br>
    &lt;artifactId&gt;hibernate-validator&lt;/artifactId&gt;<br>
    &lt;version&gt;4.2.0.Final&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
</code></pre>
</li>
<li>Abre el "<code>build.xml</code>" del proyecto <code>xxxEAR</code> con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build) actualizando las nuevas librerías <code>xxxEAR\APP_INF\lib</code></li>
<li>Sobre el proyecto <code>xxxEAR</code> pulsa F5 (Refresh)</li>
</ul>
</li>
<li>
En la configuración del sistema de logging, en el fichero <code>xxxConfig\logback.xml</code>, corregir el appender de trazas de la aplicación.<br>
<blockquote>Donde aparece<br>
<pre><code>	&lt;logger name="com.ejie.${CONTEXT_NAME}" level="${log.level.aplicTrazas}"&gt;<br>
		&lt;appender-ref ref="aplicTrazasAppender"/&gt;<br>
	&lt;/logger&gt;<br>
</code></pre></blockquote>

<blockquote>Sustituir <code>${CONTEXT_NAME</code>} por el código de tu aplicación para que en el fichero se escriban las trazas de la aplicación.<br>
</li>
<li>No olvides actualizar también el <a href='http://uda.googlecode.com/files/pluginUDAInstall-v1.1.1.zip'>Plugin UDA (v1.1.1)</a> y las <a href='http://uda.googlecode.com/files/templates-v1.1.1.zip'>Plantillas (v1.1.1)</a>, o si lo prefieres el <a href='http://code.google.com/p/uda/downloads/list'>Eclipse Helios UDA (v1.1.1)</a> completo. Es más, si no lo haces, no funcionará la utilidad de generación de estilos para integrar tu aplicación en la red de portales euskadi.net.<br>
</li>
</ol></blockquote>

<h3>v1.1.0 (15-Septiembre-2011)</h3>

<ol>
<li>Actualizar la estructura de proyectos<br>
<br>
<ul>
<li>
<b>EARClasses:</b>

Se ha cambiado la ruta de los ficheros de configuración de Spring (se han sacado del directorio META-INF):<br>
<br>
Antes:<br>
<pre><code>xxxEARClasses/src/META-INF/spring/<br>
</code></pre>
Ahora:<br>
<pre><code>xxxEARClasses/src/spring/<br>
</code></pre>

Esta modificación produce cambios en cadena en el fichero "<code>xxxEARClasses/src/beanRefContext.xml</code>":<br>
<br>
Antes:<br>
<pre><code>&lt;value&gt;META-INF/spring/dao-config.xml&lt;/value&gt; <br>
&lt;value&gt;META-INF/spring/log-config.xml&lt;/value&gt;<br>
&lt;value&gt;META-INF/spring/service-config.xml&lt;/value&gt;<br>
&lt;value&gt;META-INF/spring/security-config.xml&lt;/value&gt;<br>
&lt;value&gt;META-INF/spring/tx-config.xml&lt;/value&gt;<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;value&gt;spring/dao-config.xml&lt;/value&gt; <br>
&lt;value&gt;spring/log-config.xml&lt;/value&gt;<br>
&lt;value&gt;spring/service-config.xml&lt;/value&gt;<br>
&lt;value&gt;spring/security-config.xml&lt;/value&gt;	<br>
&lt;value&gt;spring/tx-config.xml&lt;/value&gt;<br>
</code></pre>
</li>

<li>
<b>Statics:</b>

El fichero de carga del layout ha cambiado de ruta:<br>
<br>
Antes:<br>
<pre><code>xxxStatics/WebContent/xxx/scripts/layoutLoaderXxxWARNAME.js<br>
</code></pre>
Ahora:<br>
<pre><code>xxxStatics/WebContent/xxx/scripts/WARNAME/layoutLoader.js<br>
</code></pre>

Esta modificación produce cambios en cadena en el fichero "<code>xxxNombreWar/WebContent/WEB-INF/layouts/base-includes.jsp</code>":<br>
<br>
Antes:<br>
<pre><code>&lt;script src="${staticsUrl}/xxx/scripts/layoutLoaderXXXPilotoPatrones.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;script src="${staticsUrl}/xxx/scripts/WARNAME/layoutLoader.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>

NOTA: Donde se indica "WARNAME" es el nombre del War sin código de aplicación y sin la terminación "War" (Ej. De <code>x21aPilotoPatronesWar</code> sería <code>PilotoPatrones</code>)<br>
</li>

<li>
<b>War:</b>

El fichero de inclusión de TLDs y definición de variables estáticas ha cambiado de ruta (se ha sacado del directorio <code>views/includes</code>):<br>
<br>
Antes:<br>
<pre><code>…/WEB-INF/views/includes/includeTemplate.inc<br>
</code></pre>
Ahora:<br>
<pre><code>…/WEB-INF/includeTemplate.inc<br>
</code></pre>

Esta modificación produce cambios en cadena en los ficheros:<br>
<ul>
<li><code>xxxNombreWar/WebContent/WEB-INF/layouts/base-includes.jsp</code></li>
<li><code>xxxNombreWar/WebContent/WEB-INF/layouts/header.jsp</code></li>
<li><code>xxxNombreWar/WebContent/WEB-INF/layouts/template.jsp</code></li>
<li>Páginas generadas con el plugin de mantenimiento</li>
<ul>
<li><code>xxxNombreWar/WebContent/WEB-INF/views/aaa/aaa-includes.jsp</code></li>
<li><code>xxxNombreWar/WebContent/WEB-INF/views/aaa/aaa.jsp</code></li>
</ul>
</ul>

Antes:<br>
<pre><code>&lt;%@include file="/WEB-INF/views/includes/includeTemplate.inc"%&gt;<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;%@include file="/WEB-INF/includeTemplate.inc"%&gt;<br>
</code></pre>

Se añaden nuevos ficheros para facilitar la inclusión de los estáticos y son los siguientes ficheros:<br>
<br>
<ul>
<li><code>…/WEB-INF/layouts/includes/rup.scripts.inc</code> (Scripts de RUP)</li>
<li><code>…/WEB-INF/layouts/includes/rup.styles.inc</code> (Estilos de RUP)</li>
<li><code>…/WEB-INF/layouts/includes/xxx.scripts.inc</code> (Scripts de la aplicación)</li>
<li><code>…/WEB-INF/layouts/includes/xxx.styles.inc</code> (Estilos de la aplicación)</li>
</ul>

NOTA: Estos ficheros están incluidos en las plantillas <a href='http://uda.googlecode.com/files/templates-v1.1.0.zip'>templates-v1.1.0.zip</a>, en la carpeta "<code>templates\war\WebContent\WEB-INF\layouts\includes</code>"<br>
<br>
Esta modificación produce cambios en cadena en el fichero "<code>xxxNombreWar/WebContent/WEB-INF/layouts/base-includes.jsp</code>":<br>
<br>
<br>
Antes:<br>
<pre><code>&lt;!-- jQuery 1.4.4 --&gt;<br>
&lt;script src="&lt;#noparse&gt;${staticsUrl}&lt;/#noparse&gt;/rup/scripts/core/jquery-1.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="&lt;#noparse&gt;${staticsUrl}&lt;/#noparse&gt;/rup/scripts/rup.utils-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="&lt;#noparse&gt;${staticsUrl}&lt;/#noparse&gt;/rup/scripts/rup.base-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
			...<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;%@include file="/WEB-INF/layouts/includes/rup.scripts.inc"%&gt;<br>
&lt;%@include file="/WEB-INF/layouts/includes/xxx.scripts.inc"%&gt;<br>
</code></pre>

Además también se producen cambios en el fichero "<code>xxxNombreWar/WebContent/WEB-INF/layouts/base-head.jsp</code>":<br>
<br>
Antes:<br>
<pre><code>&lt;!-- BASE (sub-productos para patrones) --&gt;<br>
&lt;link href="&lt;#noparse&gt;${staticsUrl}&lt;/#noparse&gt;/rup/basic-theme/ui.jqgrid.css" rel="stylesheet" type="text/css" /&gt;<br>
<br>
&lt;!-- jQuery UI (custom-theme) --&gt;<br>
&lt;link href="&lt;#noparse&gt;${staticsUrl}&lt;/#noparse&gt;/rup/custom-theme/jquery-ui-1.8.13.custom.css" rel="stylesheet" type="text/css" /&gt;<br>
			...<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;%@include file="/WEB-INF/layouts/includes/rup.styles.inc"%&gt;<br>
&lt;%@include file="/WEB-INF/layouts/includes/xxx.styles.inc"%&gt;<br>
</code></pre>

NOTA: Para utilizar los ficheros .inc se deberán actualizar también los componentes visuales (RUP) a la <a href='http://uda.googlecode.com/files/rup-v1.1.0.zip'>versión 1.1.0</a>.<br>
</li>
</ul>
</li>

<li>Migración del sistema de trazas de LOG4J a SLF4J y LOGBack<br>
<ul>

<li>Para que en nuevo sistema de trazas funcione correctamente, es necesario actualizar las siguientes librerías ubicadas en el proyecto EAR de la aplicación:<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img1.JPG' />

<ul>
<li>Actualizar la librería de UDA a la última versión <a href='http://uda.googlecode.com/files/x38ShLibClasses-1.1.0.jar'>x38ShLibClasses-1.1.0.jar</a> para tener el código del nuevo sistema de trazas de UDA.</li>
<li>Cambiar las librerías de LOG4J por las de SLF4J y LOGBack:<br>
<br>
Borrar las librerías <code>log4j-1.2.16.jar</code> y <code>slf4j-log4j12-1.6.1.jar</code>, y añadir las librerías <code>slf4j-ext-1.6.1.jar</code>, <code>logback-classic-0.9.29.jar</code>, <code>logback-core-0.9.29.jar</code>, <code>jcl-over-slf4j-1.6.1.jar</code>, <code>jdbcdslog-1.0.5.jar</code> y <code>slf4j-api-1.6.1.jar</code> (estas pueden obtenerse desde el fichero de <a href='http://uda.googlecode.com/files/MavenRepository-v1.1.0.zip'>repositorio Maven 1.1.0 suministrado</a>)<br>
<br>
<li>Cambiar el fichero "<code>pom.xml</code>" del proyecto EAR para dejar acorde las dependencias de las librerías:<br>
<br>
Antes:<br>
<pre><code>&lt;org.log4j.version&gt;1.2.16&lt;/org.log4j.version&gt; <br>
</code></pre>
Ahora:<br>
<pre><code>&lt;org.logback.version&gt;0.9.29&lt;/org.logback.version&gt;<br>
</code></pre>

También se deben sustituir los siguientes bloques de dependencias:<br>
<br>
Antes:<br>
<pre><code>&lt;!-- Logging --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;slf4j-api&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;jcl-over-slf4j&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
    &lt;scope&gt;runtime&lt;/scope&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;slf4j-log4j12&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
    &lt;scope&gt;runtime&lt;/scope&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;log4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;log4j&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.log4j.version}&lt;/version&gt;<br>
    &lt;scope&gt;runtime&lt;/scope&gt;<br>
&lt;/dependency&gt;<br>
<br>
&lt;!-- x38 --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;com.ejie.x38&lt;/groupId&gt;<br>
    &lt;artifactId&gt;x38ShLibClasses&lt;/artifactId&gt;<br>
    &lt;version&gt;1.0.1&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
</code></pre>
Ahora:<br>
<pre><code>&lt;!-- Logging --&gt;<br>
<br>
&lt;!-- SLF4J --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;jcl-over-slf4j&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
    &lt;scope&gt;runtime&lt;/scope&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;slf4j-api&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;org.slf4j&lt;/groupId&gt;<br>
    &lt;artifactId&gt;slf4j-ext&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.slf4j.version}&lt;/version&gt;<br>
    &lt;exclusions&gt;<br>
    &lt;!-- Exclude Compiler assisted localization library (CAL10N) --&gt;<br>
       &lt;exclusion&gt;<br>
          &lt;groupId&gt;ch.qos.cal10n&lt;/groupId&gt;<br>
          &lt;artifactId&gt;cal10n-api&lt;/artifactId&gt;<br>
       &lt;/exclusion&gt;                       <br>
    &lt;/exclusions&gt; <br>
&lt;/dependency&gt;<br>
<br>
&lt;!-- Logback --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;ch.qos.logback&lt;/groupId&gt;<br>
    &lt;artifactId&gt;logback-core&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.logback.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;ch.qos.logback&lt;/groupId&gt;<br>
    &lt;artifactId&gt;logback-classic&lt;/artifactId&gt;<br>
    &lt;version&gt;${org.logback.version}&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
		<br>
&lt;!-- x38 --&gt;<br>
&lt;dependency&gt;<br>
    &lt;groupId&gt;com.ejie.x38&lt;/groupId&gt;<br>
    &lt;artifactId&gt;x38ShLibClasses&lt;/artifactId&gt;<br>
    &lt;version&gt;1.1.0&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
</code></pre>
</li>
</li>
</ul>
</li>

<li>Modificar los ficheros de configuración de LOGBack (<a href='http://code.google.com/p/uda/source/browse/wiki/files/logback-test.xml'>"logback-test.xml"</a> y <a href='http://code.google.com/p/uda/source/browse/wiki/files/logback.xml'>"logback.xml"</a>) para aplicarles el código de aplicación que albergara el sistema de trazas cambiando el campo <code>&lt;contextName&gt;xxxx&lt;/contextName&gt;</code> (situado al comienzo de los ficheros) con el código apropiado de aplicación (Ej. <code>&lt;contextName&gt;x21b&lt;/contextName&gt;</code>)<br>
<br>
Copiar los ficheros en el proyecto/ruta correspondiente:<br>
<ul>
<li><code>logback-test.xml</code> en la carpeta <code>xxxEarClasses/src/</code></li>
<li><code>logback.xml</code> en la carpeta <code>xxxConfig/</code></li>
</ul>


Borrar el fichero de configuración de log4j (<code>.properties</code>) del proyecto.<br>
<br>
Así, los proyectos deberían quedar como en las siguientes imágenes:<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img2.JPG' />

<img src='http://uda.googlecode.com/svn/wiki/images/img3.JPG' />

</li>

<li>Se deben modificar las propiedades que configuran el nuevo sistema de trazas. En el fichero de propiedades de la aplicación (<code>xxxConfig/xxx.properties</code>) se deberán añadir las siguientes líneas:<br>
<br>
<pre><code>#Loggin parameters<br>
log.path=c:/datos/xxx/log<br>
log.level.salidaEstandar=INFO<br>
log.level.UDATrazas=TRACE<br>
log.level.aplicTrazas=INFO<br>
log.level.auditoriaAccesos=INFO<br>
</code></pre>

Donde <code>log.path</code> indica la ruta del directorio que albergará los ficheros de trazas.<br>
<br>
NOTA: En EJIE, por normativa, la ubicación es "<code>datos/xxx/log</code>" (siendo xxx el código de aplicación).<br>
<br>
El resto de propiedades indica el nivel de traza de cada uno de los ficheros que se genera.<br>
</li>

<li>Para que la configuración de LOGBack sea cargada por Spring es necesario editar el fichero "<code>log-config.xml</code>" situado en la carpeta <code>spring</code> del directorio <code>src</code> del proyecto <code>EarClasses</code> de la aplicación.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img5.JPG' />

<pre><code>&lt;!-- Se especifica la inicialización de los trazas mediante logback --&gt;<br>
&lt;bean id="trazasystemInitializer" <br>
      class="org.springframework.beans.factory.config.MethodInvokingFactoryBean"&gt;  <br>
<br>
  &lt;property name="staticMethod" value="com.ejie.x38.log.LogbackConfigurer.initLogging" /&gt;  <br>
  &lt;property name="arguments"&gt;  <br>
    &lt;list&gt;  <br>
       &lt;!-- Se especifica la ubicación del fichero de configuración de logback (puede ser una ruta del classpath o absoluta) --&gt;<br>
       &lt;value&gt;XXX/logback.xml&lt;/value&gt;<br>
<br>
       &lt;!-- Se especifica si se desea que se pinte el estado de la configuración de Logback por la salida de log correspondiente --&gt;<br>
       &lt;value&gt;true&lt;/value&gt;<br>
    &lt;/list&gt;  <br>
  &lt;/property&gt;  <br>
&lt;/bean&gt;<br>
</code></pre>
</li>

<li>Cambiar toda referencia a log4j (imports y entradas de trazas) del código de la aplicación por el de SLF4J. Para ello se deberían hacer los siguientes cambios:<br>
<br>
Los imports de log4j<br>
<br>
Antes:<br>
<pre><code>import org.apache.log4j.Level;<br>
import org.apache.log4j.Logger; <br>
</code></pre>
Ahora:<br>
<pre><code>import org.slf4j.LoggerFactory;<br>
import org.slf4j.Logger;<br>
</code></pre>

Las instancias de los loggers<br>
<br>
Antes:<br>
<pre><code>private static final  Logger  logger = Logger.getLogger(xxxServiceImpl.class);<br>
</code></pre>
Ahora:<br>
<pre><code>private static final  Logger  logger = LoggerFactory.getLogger(xxxServiceImpl.class);<br>
</code></pre>

Cualquier traza incluida en el código con log4j debe ser adaptada a la sintaxis utilizada por slf4j. El cambio principal es la especificación del nivel de traza. :<br>
<br>
Antes (log4j especifica el nivel como parámetro):<br>
<pre><code>logger.log(Level.ALL, "mensaje de ejemplo");<br>
logger.log(Level.DEBUG, "mensaje de ejemplo");<br>
logger.log(Level.ERROR, "mensaje de ejemplo");<br>
logger.log(Level.FATAL, "mensaje de ejemplo");<br>
logger.log(Level.INFO, "mensaje de ejemplo");<br>
logger.log(Level.OFF, "mensaje de ejemplo");<br>
logger.log(Level.TRACE, "mensaje de ejemplo");<br>
logger.log(Level.WARN, "mensaje de ejemplo");<br>
</code></pre>

Ahora (SLF4J tiene un método específico para cada nivel de log):<br>
<pre><code>logger.debug("mensaje de ejemplo");<br>
logger.error("mensaje de ejemplo");<br>
logger.info("mensaje de ejemplo");<br>
logger.trace("mensaje de ejemplo");<br>
logger.warn("mensaje de ejemplo");<br>
</code></pre>

Es importante tener en cuenta que los niveles que se pueden asociar a un mensaje de traza varían entre una tecnología y otra. Los más comunes coincidirán y solo habrá que cambiar el parámetro por la invocación al método correspondiente, pero en aquéllos que no coinciden habrá que adecuarlos convenientemente a SLF4J.<br>
<br>
Para hacer este cambio de forma rápida y sencilla se recomienda utilizar la herramienta de reemplazo de código integrada en el Eclipse.<br>
<br>
Con el Eclipse arrancado y dentro del WorkSpace donde se encuentra el código a adaptar, se debe presionar las teclas Ctrl+h. Esto sacará la ventana de búsquedas del Eclipse.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img6.JPG' />

En dicha ventana, se usará la pestaña "File Search" para realizar todos los cambios automáticos de código. Las búsquedas se deberán parametrizar sobre todos los ficheros indicando un <code>*</code> en el campo "File name patterns". Para cada búsqueda se indicará el texto a buscar en el campo "Containing text" y se presionará el botón "Replace". Se desencadenará una búsqueda sobre todo el código y se presentará una nueva ventana donde se solicita el texto a utilizar en el reemplazo.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img7.JPG' />

Una vez especificado el texto a sustituir en el campo "With", se presionará el botón "Ok" para culminar el procedimiento. Si se desea visualizar los cambios que se van a realizar, y asegurarse de que todo va a marchar como debe, presionando el botón "Preview" se podrán visualizar los cambios que va a realizar el Eclipse.<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img8.JPG' />

Una vez se entiende y comprende la herramienta que se va a utilizar las sustituciones que se deben realizar son las siguientes:<br>
<br>
Buscar "<code>import org.apache.log4j.Level;</code>" y sustituir por "<code>import org.slf4j.LoggerFactory;</code>"<br>
<br>
Buscar "<code>import org.apache.log4j.Logger;</code>" y sustituir por "<code>import org.slf4j.Logger;</code>"<br>
<br>
Buscar "<code>Logger.getLogger</code>" y sustituir por "<code>LoggerFactory.getLogger</code>"<br>
<br>
Buscar "<code>logger.log(Level.DEBUG,</code>" y sustituir por "<code>logger.debug(</code>"<br>
<br>
Buscar "<code>logger.log(Level.ERROR,</code>" y sustituir por "<code>logger.error(</code>"<br>
<br>
Buscar "<code>logger.log(Level.INFO,</code>" y sustituir por "<code>logger.info(</code>"<br>
<br>
Buscar "<code>logger.log(Level.TRACE,</code>" y sustituir por "<code>logger.trace(</code>"<br>
<br>
Buscar "<code>logger.log(Level.WARN,</code>" y sustituir por "<code>logger.warn(</code>"<br>
<br>
Una vez realizadas las sustituciones anteriores, se habrá adaptado el 95% de los cambios. Llegados a este punto se deberán buscar los niveles de log4j que no cubre SLF4J para adaptarlos. Para ello se deberá buscar, mediante la herramienta de búsqueda (Ctrl.+ h), el texto "<code>logger.log(</code>"  y acceder a esos casos para realizar los cambios a mano.<br>
<br>
Es muy posible que en esta búsqueda aparezcan algunas ocurrencias de los niveles ya buscados por que el patrón de búsqueda utilizado difiere en algún espacio al utilizado en la aplicación. En estos casos, se debería ajustar el patrón de búsqueda y realizar de nuevo el reemplazo para ajustar el código de forma correcta.<br>
</li>
</ul>
</li>

<li>Existe la posibilidad de auditar los accesos a Base de Datos para conocer las consultas que se lanzan contra la Base de Datos y los datos que se devuelven. Por seguridad esta traza no se configura inicialmente en UDA pero a continuación se comentan los pasos a seguir de cara aplicar esta auditoría.<br>
<br>
<ul>
<li>Añadir la librería necesaria <code>jdbcdslog-1.0.5.jar</code> al proyecto EAR (esta puede obtenerse desde el fichero de <a href='http://uda.googlecode.com/files/MavenRepository-v1.1.0.zip'>repositorio Maven 1.1.0 suministrado</a>)<br>
<br>
<img src='http://uda.googlecode.com/svn/wiki/images/img9.JPG' />

</li>

<li>
Modificar el fichero de configuración de propiedades "<code>xxx.properties</code>" para indicar el nivel de traza del fichero. Se debe añadir la siguiente línea:<br>
<br>
<pre><code>log.level.auditoriaBBDD=INFO<br>
</code></pre>
</li>

<li>Se deberá incluir el <code>DataSource</code> que interceptará las peticiones a Base de Datos. Se deberá modificar el fichero "<code>dao-config.xml</code>" del proyecto <code>xxxEARClasses</code>.<br>
<br>
<pre><code>&lt;!--Configuration of dataSource with DDBB audit --&gt;<br>
&lt;jee:jndi-lookup id="aplicDataSource" jndi-name="x21a.x21aDataSource" resource-ref="false"/&gt;<br>
	<br>
&lt;bean id="dataSource" class="org.jdbcdslog.ConnectionPoolDataSourceProxy"&gt;<br>
      &lt;property name="targetDSDirect" ref="aplicDataSource" /&gt;<br>
&lt;/bean&gt;<br>
</code></pre>

NOTA: En este ejemplo el <code>DataSource</code> al que se conecta es <code>x21a.x21aDataSource</code>

En el caso de tratarse de un proyecto JPA hay que hacer un par de modificaciones:<br>
<br>
<ul>
<li>Añadir la cabecera "<code>xmlns:jee</code>" para soportar la etiqueta <code>&lt;jee&gt;</code>:<br>
<br>
<pre><code>&lt;beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"<br>
xmlns:jee="http://www.springframework.org/schema/jee"<br>
xsi:schemaLocation="http://www.springframework.org/schema/beans<br>
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd<br>
   http://www.springframework.org/schema/context<br>
   http://www.springframework.org/schema/context/spring-context-3.0.xsd<br>
   http://www.springframework.org/schema/jee<br>
   http://www.springframework.org/schema/jee/spring-jee-3.0.xsd"&gt;<br>
</code></pre>
</li>
<li>Añadir la propiedad "<code>dataSource</code>":<br>
<br>
<pre><code>&lt;!-- Configuration of the JPA Management  --&gt;<br>
&lt;bean id="jtaEntityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean"&gt;<br>
        &lt;property name="persistenceUnitName" value="XXX_JTA" /&gt;<br>
        &lt;property name="dataSource" ref="dataSource" /&gt;<br>
        &lt;property name="persistenceXmlLocation" value="classpath:udaPersistence.xml" /&gt;<br>
        &lt;property name="loadTimeWeaver"&gt;<br>
            &lt;bean class="org.springframework.instrument.classloading.weblogic.WebLogicLoadTimeWeaver" /&gt;<br>
        &lt;/property&gt;<br>
        &lt;property name="jpaVendorAdapter"&gt;<br>
            &lt;bean class="org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter"&gt;<br>
                &lt;property name="database" value="ORACLE" /&gt;<br>
                &lt;property name="showSql" value="true" /&gt;<br>
            &lt;/bean&gt;<br>
        &lt;/property&gt;<br>
&lt;/bean&gt;<br>
</code></pre>
</li>
</ul>
</li>

<li>Modificar el fichero "<code>xxxConfig/logback.xml</code>" para incluir el <code>appender</code> y los <code>loggers</code> necesarios para generar las trazas.<br>
<br>
<pre><code>&lt;appender name="auditoriaBBDDAppender" class="ch.qos.logback.core.rolling.RollingFileAppender"&gt;<br>
	<br>
        &lt;File&gt;${log.path}/auditoriaBBDD_${CONTEXT_NAME}_${weblogic.Name}.log&lt;/File&gt;<br>
	&lt;filter class="com.ejie.x38.log.UdaLogFilter"/&gt;<br>
	&lt;encoder class="ch.qos.logback.core.encoder.LayoutWrappingEncoder"&gt;<br>
		&lt;layout class="com.ejie.x38.log.LogLayout"&gt;<br>
			&lt;appCode&gt;${CONTEXT_NAME}&lt;/appCode&gt;<br>
	     		&lt;instance&gt;${weblogic.Name}&lt;/instance&gt;	<br>
		&lt;/layout&gt;<br>
	&lt;/encoder&gt;<br>
	&lt;rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy"&gt;<br>
	<br>
        &lt;!-- rollover daily --&gt;<br>
        &lt;fileNamePattern&gt;${log.path}/auditoriaBBDD_${CONTEXT_NAME}_${weblogic.Name}.%d{yyyy-MM-dd}.%i.gz&lt;/fileNamePattern&gt;<br>
<br>
        &lt;timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP"&gt;<br>
	&lt;maxFileSize&gt;100MB&lt;/maxFileSize&gt;<br>
	&lt;/timeBasedFileNamingAndTriggeringPolicy&gt;<br>
	<br>
        &lt;!-- 7-day history --&gt;<br>
      	&lt;maxHistory&gt;6&lt;/maxHistory&gt;<br>
	&lt;/rollingPolicy&gt;<br>
&lt;/appender&gt;<br>
<br>
&lt;logger name="org.jdbcdslog" level="${log.level.auditoriaBBDD}" additivity="false"&gt;<br>
       &lt;appender-ref ref="auditoriaBBDDAppender"/&gt;<br>
&lt;/logger&gt;<br>
&lt;logger name="org.eclipse.persistence-connection" level="${log.level.auditoriaBBDD}" <br>
    additivity="false"&gt;<br>
       &lt;appender-ref ref="auditoriaBBDDAppender"/&gt;<br>
&lt;/logger&gt;<br>
&lt;logger name="org.eclipse.persistence" level="${log.level.auditoriaBBDD}" <br>
    additivity="false"&gt;<br>
	&lt;appender-ref ref="auditoriaBBDDAppender"/&gt;<br>
&lt;/logger&gt;<br>
</code></pre>
</li>
</ul>
</li>
</ol>

<h3>v1.0.1 (09-Julio-2011)</h3>
<ol>
<li>Cambiar la carpeta <code>&lt;APP&gt;</code>Statics\WebContent\rup por la carpeta incluida en el fichero <a href='http://uda.googlecode.com/files/rup-v1.0.1.zip'>rup-v1.0.1.zip</a></li>
<li>Modificar la inclusión de los ficheros CSS (template) y JS (base-includes):<br>
<br>
<blockquote><code>&lt;xxxYYY&gt;</code>War\WebContent\WEB-INF\layouts\template.jsp (líneas 17-32):<br>
<pre><code>&lt;!-- Patrones (basic-theme) --&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.base-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.autocomplete-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.breadCrumb-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.combo-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.date-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.feedback-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.grid-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.lang-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.maint-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.menu-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.messages-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tabs-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.time-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.toolbar-1.0.1.css" rel="stylesheet" type="text/css" /&gt;<br>
&lt;link href="${staticsUrl}/rup/basic-theme/theme.rup.tooltip-1.0.0.css" rel="stylesheet" type="text/css" /&gt;<br>
</code></pre></blockquote>

<ul><li>NOTA: En caso de tener templateVertical.jsp o templateMixto.jsp el cambio sería idéntico</li></ul>

<blockquote><code>&lt;xxxYYY&gt;</code>\WebContent\WEB-INF\layouts\base-includes.jsp (líneas 15-56):<br>
<pre><code>&lt;!-- jQuery 1.4.4 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery-1.4.4.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- RUP-CORE --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.utils-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.base-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- jQuery UI 1.8.11 (+ patrones subyacentes) --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.blockUI.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/xbreadcrumbs.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui-1.8.11.custom.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.ui.autocomplete.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.ui.menu.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui.multidatespicker.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery.ui.selectmenu.js" type="text/javascript"&gt;&lt;/script&gt;&lt;!-- combo --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/ui/jquery-ui.timepicker.js" type="text/javascript"&gt;&lt;/script&gt;<br>
	<br>
&lt;!-- jqGrid 3.8.1 --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jqGrid.min-3.8.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
   <br>
&lt;!-- Utilidades adicionales --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.form.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.json-2.2.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/form2object.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/core/jquery.numeric.js" type="text/javascript"&gt;&lt;/script&gt;<br>
<br>
&lt;!-- Patrones RUP --&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.autocomplete-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.breadCrumb-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.combo-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.date-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.dialog-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.feedback-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.grid-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.lang-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.maint-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.menu-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.message-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tabs-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.time-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.toolbar-1.0.1.js" type="text/javascript"&gt;&lt;/script&gt;<br>
&lt;script src="${staticsUrl}/rup/scripts/rup.tooltip-1.0.0.js" type="text/javascript"&gt;&lt;/script&gt;<br>
</code></pre>
</li>
<li>Añadir la siguiente cabecera para soporte nativo de IE8 en templates.jsp (línea 8):</blockquote>

<pre><code>&lt;meta http-equiv="X-UA-Compatible" content="IE=8" /&gt;<br>
</code></pre>

<ul><li>NOTA: En caso de tener templateVertical.jsp o templateMixto.jsp el cambio sería idéntico<br>
</li></li></ul>

<li>Actualizar el fichero <a href='http://uda.googlecode.com/svn/wiki/files/security-core-config.xml'>"security-core-config.xml"</a> (a nivel de WAR)<br>
<br>
<ul><li>NOTA: Este fichero no está disponible en la sección de "downloads", por tanto, decárgatelo desde el enlace anterior.<br>
</li>
<li>Aumentar el tiempo de cacheo en el fichero "security-config.xml" (a nivel de WAR) de 2 a 120 para cuando se usa el wrapper de n38 (línea 7):</li></ul>

<pre><code>&lt;property name="xlnetCachingPeriod" value="120" /&gt;<br>
</code></pre>

<ul><li>NOTA: Antes la configuración era en minutos y actualmente el valor es en segundos<br>
</li></li></ul>

<li>Modificar el pom.xml del EAR para permitir SNAPSHOT del repositorio de OTC <code>"&lt;enabled&gt;true&lt;/enabled&gt;"</code> (línea 160):<br>
<br>
<pre><code>&lt;repositories&gt;<br>
    &lt;repository&gt;<br>
	&lt;id&gt;ejie&lt;/id&gt;<br>
	&lt;name&gt;ejie&lt;/name&gt;<br>
	&lt;url&gt;http://www.otc.ejiedes.net/archiva/repository/repoEJIE&lt;/url&gt;<br>
	&lt;snapshots&gt;<br>
		&lt;enabled&gt;true&lt;/enabled&gt;<br>
	&lt;/snapshots&gt;<br>
    &lt;/repository&gt;<br>
&lt;/repositories&gt;<br>
</code></pre>
</li>
<li>Actualizar x38ShLibClasses a la versión 1.0.1 <a href='http://uda.googlecode.com/files/x38ShLibClasses-1.0.1.jar'>x38ShLibClasses-1.0.1.jar</a>. Puedes copiar directamente la librería sobre el subdirectorio APP-INF/lib del EAR, o bien seguir estos pasos (recomendado):<br>
<ul>
<li>En el fichero pom.xml del EAR actualiza la versión de x38:<br>
<pre><code>&lt;dependency&gt;<br>
&lt;groupId&gt;com.ejie.x38&lt;/groupId&gt;<br>
&lt;artifactId&gt;x38ShLibClasses&lt;/artifactId&gt;<br>
&lt;version&gt;1.0.1&lt;/version&gt;<br>
&lt;/dependency&gt;<br>
</code></pre>
</li>
<li>Abre el build.xml del proyecto EAR con el editor ant (botón derecho sobre el fichero, Open With>Ant Editor)</li>
<li>Ejecuta la tarea "mavenRunDependencies" (botón derecho sobre la tarea, Run As>Ant Build)</li>
</ul>
</li>
<li>Para no tener problemas con los caracteres acentuados, eñes, etc. incluye en el fichero web.xml de todos tus WARs lo siguiente (línea 5):<br>
<pre><code>&lt;jsp-config&gt;<br>
    &lt;jsp-property-group&gt;<br>
        &lt;url-pattern&gt;*.jsp&lt;/url-pattern&gt;<br>
        &lt;page-encoding&gt;UTF-8&lt;/page-encoding&gt;<br>
    &lt;/jsp-property-group&gt;<br>
&lt;/jsp-config&gt;<br>
</code></pre>
</li>
<li>A partir de la versión 1.0.1 los mantenimientos no requieren que el identificador de su capa comience con "<code>EJIE_MAINT_</code>". Debido a este cambio es posible que sea necesario realizar las siguientes modificaciones en las páginas que utilicen el componente mantenimiento:<br>
<ul>
<li>En las jsp creadas de acuerdo a la versión 1.0.0 el identificador de la capa del mantenimiento será "EJIE_MAINT_nombre", siendo "nombre" el literal identificador del mantenimiento. De acuerdo a los cambios realizados el identificador de la capa deberá ser "nombre". Por ejemplo sustiuir <code>&lt;div id="EJIE_MAINT_usuarios"&gt;</code> por <code>&lt;div id="usuarios"&gt;</code>.</li>
<li>Del mismo modo, se deberá de modificar en el fichero js asociado a la jsp, la llamada que se realiza para la construcción del componente mantenimiento de modo que se referencie correctamente al nuevo identificador. Siguiendo el mismo ejemplo, se debería de modificar la llamada existente <code>$("#EJIE_MAINT_usuarios").rup_maint(</code> por <code>$("#usuarios").rup_maint(</code></li>
</ul>
</li>
</ol>