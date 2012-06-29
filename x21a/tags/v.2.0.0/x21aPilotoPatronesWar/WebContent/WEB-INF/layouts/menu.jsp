<%--  
 -- Copyright 2011 E.J.I.E., S.A.
 -- Licencia con arreglo a la EUPL, Versión 1.1 exclusivamente (la «Licencia»);
 -- Solo podrá usarse esta obra si se respeta la Licencia.
 -- Puede obtenerse una copia de la Licencia en
 -- 
 -- http://ec.europa.eu/idabc/eupl.html
 -- 
 -- Salvo cuando lo exija la legislación aplicable o se acuerde por escrito,
 -- el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
 -- SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
 -- Véase la Licencia en el idioma concreto que rige los permisos y limitaciones
 -- que establece la Licencia. 
 --%>
 <%@include file="/WEB-INF/includeTemplate.inc"%>

	<ul id="x21aPilotoPatronesWar_menu"	class="rup_invisible_menu">
		<li>
			<a href="/x21aPilotoPatronesWar/../x21aMantenimientosWar/">
				<spring:message code="mantenimientos" />
			</a>
		</li>
		<li>
			<a href="/x21aPilotoPatronesWar/">
				<spring:message code="inicio" />
			</a>
		</li>
		<li>
			<a>
				<spring:message code="patrones" />
			</a>
			<ul>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/all">
						<spring:message code="all" />
					</a>
				</li>
				<li class="ui-widget-content ui-menu-divider"></li>
				<li><strong><spring:message code="titulo-notifi" /></strong></li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/feedback">
						<spring:message code="feedback" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/tooltip">
						<spring:message code="tooltip" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/message">
						<spring:message code="message" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/dialog">
						<spring:message code="dialog" />
					</a>
				</li>
				<li class="ui-widget-content ui-menu-divider"></li>
				<li><strong><spring:message code="titulo-nave" /></strong></li>
				<li>
					<a>
						<spring:message code="menu" />
					</a>
					<ul>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/menu">
								<spring:message code="menuHorizontal" />
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/menuVertical">
								<spring:message code="menuVertical" />
							</a>
						</li>
						<li>
							<a	href="/x21aPilotoPatronesWar/patrones/menuMixto">
								<spring:message code="menuMixto" />
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/toolbar">
						<spring:message code="toolbar" />
					</a>
				</li>
				<li class="ui-widget-content ui-menu-divider"></li>
				<li><strong><spring:message code="titulo-estru" /></strong></li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/accordion">
						<spring:message code="accordion" />
					</a>
				</li>
				<li>
					<a>
						<spring:message code="tabs" />
					</a>
					<ul>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/tabsStatic">
								<spring:message code="tabsStatic" />
							</a>
						</li>
						<li>
							<a	href="/x21aPilotoPatronesWar/patrones/tabsAjax">
								<spring:message code="tabsAjax" />
							</a>
						</li>
						<li>
							<a	href="/x21aPilotoPatronesWar/patrones/tabsMixto">
								<spring:message code="tabsMixto" />
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/maintTab">
								<spring:message code="maintTab" />
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/grid">
						<spring:message code="grid" />
					</a>
<!-- 					<ul> -->
<!-- 						<li> -->
<!-- 							<a	href="/x21aPilotoPatronesWar/patrones/gridGroup"> -->
<%-- 								<spring:message code="grid_grupo" /> --%>
<!-- 							</a> -->
<!-- 						</li> -->
<!-- 						<li> -->
<!-- 							<a	href="/x21aPilotoPatronesWar/patrones/grid"> -->
<%-- 								<spring:message code="grid_base" /> --%>
<!-- 							</a> -->
<!-- 						</li> -->
<!-- 						<li> -->
<!-- 							<a href="/x21aPilotoPatronesWar/patrones/gridTree"> -->
<%-- 								<spring:message code="grid_arbol" /> --%>
<!-- 							</a> -->
<!-- 						</li> -->
<!-- 					</ul> -->
				</li>
				<li>
					<a>
						<spring:message code="wizard" />
					</a>
					<ul>
						<li>
							<a	href="/x21aPilotoPatronesWar/patrones/wizard">
								<spring:message code="wizardA" />
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/wizard_includeFile">
								<spring:message code="wizardB" htmlEscape="true"/>
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/wizard_jspInclude">
								<spring:message code="wizardC" htmlEscape="true"/>
							</a>
						</li>
						<li>
							<a	href="/x21aPilotoPatronesWar/patrones/wizard_jstlImport">
								<spring:message code="wizardD" htmlEscape="true"/>
							</a>
						</li>
					</ul>
				</li>
				<li class="ui-widget-content ui-menu-divider"></li>
				<li><strong><spring:message code="titulo-inser" /></strong></li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/autocomplete">
						<spring:message code="autocomplete" />
					</a>
				</li>
				<li>
					<a>
						<spring:message code="combo" />
					</a>
					<ul>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/comboSimple">
								<spring:message code="comboSimple" />
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/comboEnlazadoSimple">
								<spring:message code="comboEnlazadoSimple" />
							</a>
						</li>
						<li>
							<a href="/x21aPilotoPatronesWar/patrones/comboEnlazadoMultiple">
								<spring:message code="comboEnlazadoMulti" />
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/date">
						<spring:message code="date" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/form">
						<spring:message code="form" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/time">
						<spring:message code="time" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/upload">
						<spring:message code="upload" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/patrones/validate">
						<spring:message code="validate" />
					</a>
				</li>
			</ul>
		</li>
		<sec:authorize access="hasRole('ROLE_X21A-IN-0003')">
		<li>
			<a>
				<spring:message code="experimental" />
			</a>
			<ul>
				<li>
					<a href="/x21aPilotoPatronesWar/experimental/maestro_detalle">
						<spring:message code="maestro_detalle" />
					</a>
				</li>
				<li>
					<a	href="/x21aPilotoPatronesWar/experimental/z-index">
						<spring:message code="z-index" />
					</a>
				</li>
				<li>
					<a href="/x21aPilotoPatronesWar/experimental/mant_multi_entidad">
						<spring:message code="mant_multi_entidad" />
					</a>
				</li>
				<li>
					<a>
						<spring:message code="mant_clave_compuesta" />
					</a>
					<ul>
						<li>
							<a	href="/x21aPilotoPatronesWar/experimental/mant_clave_compuesta_multi">
								<spring:message code="mant_clave_compuesta_multi" />
							</a>
						</li>
						<li>
							<a	href="/x21aPilotoPatronesWar/experimental/mant_clave_compuesta_edlinea">
								<spring:message code="mant_clave_compuesta_edlinea" />
							</a>
						</li>
					</ul>
				</li>
				<li>
					<a	href="/x21aPilotoPatronesWar/experimental/nora">
						<spring:message code="nora" />
					</a>
				</li>
			</ul>
		</li>
		</sec:authorize>
		<li>
			<a	href="http://code.google.com/p/uda/" target="_blank">
				<spring:message code="uda" />
			</a>
		</li>
	</ul>