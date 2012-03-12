<%--  
 -- Copyright 2011 E.J.I.E., S.A.
 --
 -- Licencia con arreglo a la EUPL, Versión 1.1 exclusivamente (la «Licencia»);
 -- Solo podrá usarse esta obra si se respeta la Licencia.
 -- Puede obtenerse una copia de la Licencia en
 --
 --      http://ec.europa.eu/idabc/eupl.html
 --
 -- Salvo cuando lo exija la legislación aplicable o se acuerde por escrito, 
 -- el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
 -- SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
 -- Véase la Licencia en el idioma concreto que rige los permisos y limitaciones
 -- que establece la Licencia.
 --%>
<%@include file="/WEB-INF/includeTemplate.inc"%>

<!-- Include de los elementos comunes -->
<script type="text/javascript">
	APP_RESOURCES = 'x21a',
	CTX_PATH = '<%= request.getContextPath()%>/',
	RUP = '${staticsUrl}/rup',
	STATICS = '${staticsUrl}',
	DEFAULT_LANGUAGE = "${defaultLanguage}",
	LAYOUT = "${defaultLayout}",
	WAR_NAME = "x21aMantenimientos",
	AVAILABLE_LANGS = "es, eu, en, fr";
</script>

<%@include file="/WEB-INF/layouts/includes/rup.scripts.inc"%>
<!--%@include file="/WEB-INF/layouts/includes/rup.scripts.min.js"%-->
<%@include file="/WEB-INF/layouts/includes/x21a.scripts.inc"%>