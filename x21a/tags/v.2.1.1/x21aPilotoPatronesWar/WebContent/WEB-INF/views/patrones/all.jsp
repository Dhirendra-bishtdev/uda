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
<h2>Todos los patrones</h2>

<div style="float:left; width: 48%;">
	<!-- Maint (toolbar + grid + maint) -->
	<div id="error" style="display:none"></div>
	<div id="maint">
		<div id="contenido" style="margin-top:0.5em;margin-bottom:0.5em;width:600px;">
			<form id="searchForm">
				<div  class="formulario_legend" id="titleSearch_maint"><spring:message code="searchCriteria" />:</div>
				<fieldset style="border:1px solid #DADADA;" id="FIELDSET_SEARCH_maint">
					<div class="formulario_columna_cnt">
						<div class="formulario_linea_izda_float">
							<label for="id" class="formulario_linea_label">id:</label>
							<input type="text" name="id" class="formulario_linea_input" id="id_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<label for="nombre" class="formulario_linea_label">nombre:</label>
							<input type="text" name="nombre" class="formulario_linea_input" id="nombre_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<label for="apellido1" class="formulario_linea_label">apellido1:</label>
							<input type="text" name="apellido1" class="formulario_linea_input" id="apellido1_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<label for="apellido2" class="formulario_linea_label">apellido2:</label>
							<input type="text" name="apellido2" class="formulario_linea_input" id="apellido2_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<label for="ejie_search" class="formulario_linea_label">ejie:</label>
							<div style="float: left;"><select id="ejie_search" name="ejie" class="rup-combo" ></select></div>
						</div>
						<div class="formulario_linea_izda_float">
							<label for="fechaAlta_search" class="formulario_linea_label">fechaAlta:</label>
							<input type="text" name="fechaAlta" class="formulario_linea_input" id="fechaAlta_search" />
						</div>
						<div class="formulario_linea_izda_float" style="clear: left;">
							<label for="fechaBaja_search" class="formulario_linea_label">fechaBaja:</label>
							<input type="text" name="fechaBaja" class="formulario_linea_input" id="fechaBaja_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<label for="multicombo_search" class="formulario_linea_label">multicombo:</label>
							<select id="multicombo_search" name="multicombo" class="rup-combo" ></select>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
		<div id="RUP_grid">
			<table id="grid" cellpadding="0" cellspacing="0"></table>
			<div id="pager" style="text-align:center;"></div>
		</div>
	</div>
	<br><br>
	<button id="dialog">Dialog</button>
</div>

<div style="float: right; width: 48%; margin-right: 2em;">
	<!-- Feedback -->
	<div id="feedback"></div><br>

	<div style="margin-bottom: 15.5em;">
		<!-- Fecha --> 
		<div id="date" style="float: left;"></div>
		<!-- Hora -->
		<div id="time" style="float: left; margin-left: 2em;"></div>
	</div><br>
	
	<!-- Combo -->
	<div style="margin-bottom: 1.5em;">
		<div style="float: left;"><select id="comboProvincia" name="provincia" class="rup-combo" ></select></div>
		<div style="float: left; margin-left: 2em;"><select id="comboComarca" class="rup-combo"></select></div>
	</div><br>
	
	<!-- Multicombo -->
	<select id="multicomboGruposRemoto" class="rup-combo" ></select><br><br>
	
	<!-- Autocomplete / Tooltip -->
	<label for ="autocomplete">Autocomplete (lenguaje):</label><input id="autocomplete" name="autocomplete" />
	<label for ="tooltip">Tooltip: </label><input id="tooltip" name="tooltip" title="Introduzca su nombre."/><br><br>
	
	<!-- Pestañas -->
	<div id="tabs" style="width: 40em;"></div>
</div>

<!-- Menu contextual -->
<div id="contextMenu" style="display:none">
	<ul>
    	<li id="menu_1">
        	<span>Opción 1</span>
    	</li>
    	<li id="menu_2">
        	<span class="ui-icon ui-icon-pencil" style="float:left"></span>
    		<span>Opción 2</span>
		</li>
		<li id="menu_3">
    		<span class="ui-icon ui-icon-trash" style="float:left"></span>
            <span>Opción 3</span>
        </li>
    </ul>
</div>