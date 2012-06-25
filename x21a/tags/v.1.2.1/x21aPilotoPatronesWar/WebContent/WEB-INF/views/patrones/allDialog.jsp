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

<div style="float:left">
	<!-- Maint (toolbar + grid + maint) -->
	<div id="error" style="display:none"></div>
	<div id="maintDialog" >
		<div id="contenido" style="margin-top:0.5em;margin-bottom:0.5em;width:600px;">
			<form id="searchFormDialog">
				<div  class="formulario_legend" id="titleSearch_maintDialog"><spring:message code="searchCriteria" />:</div>
				<fieldset style="border:1px solid #DADADA;" id="FIELDSET_SEARCH_maintDialog">
					<div class="formulario_columna_cnt">
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">id:</div>
							<input type="text" name="id" class="formulario_linea_input" id="dialog_id_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">nombre:</div>
							<input type="text" name="nombre" class="formulario_linea_input" id="dialog_nombre_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">apellido1:</div>
							<input type="text" name="apellido1" class="formulario_linea_input" id="dialog_apellido1_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">apellido2:</div>
							<input type="text" name="apellido2" class="formulario_linea_input" id="dialog_apellido2_search" />
						</div>
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">ejie:</div>
							<div style="float: left;"><select id="dialog_ejie_search" class="rup-combo" ></select></div>
						</div>
						<div class="formulario_linea_izda_float">
							<div class="formulario_linea_label">fechaAlta:</div>
							<input type="text" name="fechaAlta" class="formulario_linea_input" id="dialog_fechaAlta_search" />
						</div>
						<div class="formulario_linea_izda_float" style="clear: left;">
							<div class="formulario_linea_label">fechaBaja:</div>
							<input type="text" name="fechaBaja" class="formulario_linea_input" id="dialog_fechaBaja_search" />
						</div>
					</div>
				</fieldset>
			</form>
		</div>
		<div id="RUP_gridDialog">
			<table id="gridDialog" cellpadding="0" cellspacing="0"></table>
			<div id="pagerDialog" style="text-align:center;"></div>
		</div>
	</div>
</div>

<div style="float: right; margin-right: 2em;">
	<!-- Feedback -->
	<div id="feedbackDialog"></div><br>

	<div style="margin-bottom: 15.5em;">
		<!-- Fecha --> 
		<div id="dateDialog" style="float: left;"></div>
		<!-- Hora -->
		<div id="timeDialog" style="float: left; margin-left: 2em;"></div>
	</div><br>
	
	<!-- Combo -->
	<div style="margin-bottom: 1.5em;">
		<div style="float: left;"><select id="comboDialogProvincia" name="provincia" class="rup-combo" ></select></div>
		<div style="float: left; margin-left: 2em;"><select id="comboDialogComarca" class="rup-combo"></select></div>
	</div><br>
	
	<!-- Autocomplete / Tooltip -->
	Autocomplete (lenguaje):<input id="autocompleteDialog" name="autocompleteDialog" />&nbsp; Tooltip: <input id="tooltipDialog" name="tooltipDialog" title="Introduzca su nombre."/><br><br>
	
	<!-- Pestañas -->
	<div id="tabsDialog" style="width: 40em;"></div><br>
</div>