/*
* Copyright 2012 E.J.I.E., S.A.
*
* Licencia con arreglo a la EUPL, Versión 1.1 exclusivamente (la «Licencia»);
* Solo podrá usarse esta obra si se respeta la Licencia.
* Puede obtenerse una copia de la Licencia en
*
* http://ec.europa.eu/idabc/eupl.html
*
* Salvo cuando lo exija la legislación aplicable o se acuerde por escrito,
* el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
* SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
* Véase la Licencia en el idioma concreto que rige los permisos y limitaciones
* que establece la Licencia.
*/
package com.ejie.uda.wizards;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.TreeItem;

import com.ejie.uda.operations.DataBaseWorker;
import com.ejie.uda.utils.ConnectionData;
import com.ejie.uda.utils.ContentProvider;
import com.ejie.uda.utils.GridColumn;
import com.ejie.uda.utils.TableLabelProvider;
import com.ejie.uda.utils.TreeNode;
import com.ejie.uda.utils.Utilities;

/**
 * Clase que define la cuarta pantalla del asistente "Generar mantenimiento"
 */
public class NewMaintWizardPageFour extends WizardPage {
	
	// Objecto grid utilizados en la pantalla
	private CheckboxTreeViewer schemaCheckboxTree;
	// Propiedades de las columnas
	private List<GridColumn> columnsProperties;
	
	private Combo alignCombo;
	private Button editableCheck;
	private Text valueEditOptionsText;
	private Text dataUrlEditOptionsText;
	private Text buildSelectEditOptionsText;
	private Text defaultValueEditOptionsText;
	private Text otherOptionsEditOptionsText;
	private Button edithiddenEditRulesCheck;
	private Button requiredEditRulesCheck;
	private Button numberEditRulesCheck;
	private Button integerEditRulesCheck;
	private Text minValueEditRulesText;
	private Text maxValueEditRulesText;
	private Button emailEditRulesCheck;
	private Button urlEditRulesCheck;
	private Button dateEditRulesCheck;
	private Button timeEditRulesCheck;
	private Button customEditRulesCheck;
	private Text customFuncEditRulesText;
	private Combo editTypeCombo;
	private Combo firstSortOrderCombo;
	private Button fixedCheck;
	private Combo formatterCombo;
	private Text formatOptionsText;
	private Button hiddenCheck;
	private Text indexText;
	private Text labelText;
	private Text nameText;
	private Button resizableCheck;
	private Button sortableCheck;
	private Button titleCheck;
	private Text widthText;
	private Text unformatText;
	private Button enableEditRulesCheck;
	
	private Composite containerTab;
	private String activeColumn;
	private List<String> primaryKeys;
	
	/**
	 * Cuarta ventana del Wizard de Plugin, donde se asigna las propiedades y eventos a las columnas
	 * @param selection
	 */
	public NewMaintWizardPageFour(ISelection selection) {
		super("wizardPage");

		setTitle("Generar nuevo mantenimiento para una aplicación");
		setDescription("Este Wizard genera un nuevo mantenimiento para una aplicación UDA");
	}

	/**
	 * Creación de controles de la ventana
	 * @param parent - controlador padre
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		
		container.setLayout(new GridLayout(2, true));
		container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));

		// Descripción de la operación
		Label descLabel = new Label(container, SWT.NULL);
		descLabel.setText("Configure las propiedades de las columnas que aparecerán en el mantenimiento.");
		descLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		// Descripción de la operación
		descLabel = new Label(container, SWT.NULL);
		descLabel.setText("Nota: Sólo se generarán las columnas que están checkeadas.");
		descLabel.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		
		descLabel = new Label(container, SWT.NULL);
		descLabel.setText("(*): Campos obligatorios");
		descLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, false, 1, 1));
		
		// Salto de línea
		Label spaceLabel= new Label(container, SWT.NULL);
		spaceLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));

	    // Contenedor del tablas/entidades
		Composite containerTables = new Composite(container, SWT.NONE);
		containerTables.setLayout(new GridLayout(1, true));
		containerTables.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		// Tree con el contenido del esquema de BBDD
		// Los datos serán insertados desde el Método público de esta clase
		schemaCheckboxTree = new CheckboxTreeViewer(containerTables);
		schemaCheckboxTree.setContentProvider(new ContentProvider());
		schemaCheckboxTree.setLabelProvider(new TableLabelProvider());
		schemaCheckboxTree.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		// Cuando chequea/descheckea un checkbox en un tree, checkea/descheckea
		// a todos sus hijos
		schemaCheckboxTree.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {

				TreeNode node = (TreeNode) event.getElement();
				if (event.getChecked()) {
					// checkea a todos los hijos
					schemaCheckboxTree.setSubtreeChecked(node, true);
					node.setChecked(true);
					
					// si hay algun elemento checkeado se habilita el botón de Next y 
					// reestablece el mensaje de la pantalla 
					setDescription("Este Wizard genera el código fuente para desplegar una aplicación UDA");
					setPageComplete(true);	

				} else {
					if (node.isPrimaryKey()) {
						// Si es primary key no se puede deseleccionar
						schemaCheckboxTree.setChecked(node, true);
						node.setChecked(true);
					} else {
						// descheckea a todos los hijos
						schemaCheckboxTree.setSubtreeChecked(node, false);
						node.setChecked(false);
					}
				}
				// Actualiza el estado del checks-padres
				updateParentItems((TreeNode) ((TreeNode) event.getElement()).getParent());
			}
		});
		
		schemaCheckboxTree.getTree().addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				TreeNode node = (TreeNode)event.item.getData();
				GridColumn gridColumn = findColumn(node.getName());
				
				if (gridColumn != null){
					if (node.isChecked()){
						gridColumn.setActivated(true);
					}else{
						gridColumn.setActivated(false);
					}
					if (!gridColumn.getColumnName().equals(activeColumn)){
						setWidgetsToGridColumns(findColumn(activeColumn));
					}
				}
				
				if (event.detail == SWT.CHECK) {
					// Columna checkeada
					schemaCheckboxTree.getTree().select((TreeItem)event.item);
				}
				
				if (gridColumn != null && node.isChecked()){
					containerTab.setVisible(true);
					activeColumn = node.getName();
					setGridColumnsToWidgets(findColumn(node.getName()));
				}else{
					containerTab.setVisible(false);
					activeColumn = "";
				}
			}
		});
		
		 // Contenedor del tablas/entidades
		containerTab = new Composite(container, SWT.NONE);
		containerTab.setLayout(new GridLayout(1, true));
		containerTab.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		containerTab.setVisible(false);
		
		// Pestañas de propiedades y eventos
		final TabFolder tabFolder = new TabFolder(containerTab, SWT.NONE);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		TabItem propertiesTab = new TabItem(tabFolder, SWT.NONE);
		propertiesTab.setText("Propiedades básicas");
		propertiesTab.setToolTipText("Propiedades básicas");
		
		TabItem propertiesAdvancedTab = new TabItem(tabFolder, SWT.NONE);
		propertiesAdvancedTab.setText("Propiedades avanzadas");
		propertiesAdvancedTab.setToolTipText("Propiedades avanzadas");

		ScrolledComposite scrolledContainerPropertiesTab = new ScrolledComposite(tabFolder, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledContainerPropertiesTab.setLayout(new GridLayout(1, false));
		scrolledContainerPropertiesTab.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		// Contenedor de la pestaña de propiedades
		Composite containerPropertiesTab = new Composite(scrolledContainerPropertiesTab, SWT.NONE);
		containerPropertiesTab.setLayout(new GridLayout(2, false));
		containerPropertiesTab.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		
		ScrolledComposite scrolledAdvancedContainerPropertiesTab = new ScrolledComposite(tabFolder, SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledAdvancedContainerPropertiesTab.setLayout(new GridLayout(1, false));
		scrolledAdvancedContainerPropertiesTab.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		// Contenedor de la pestaña de propiedades
		Composite containerAdvancedPropertiesTab = new Composite(scrolledAdvancedContainerPropertiesTab, SWT.NONE);
		containerAdvancedPropertiesTab.setLayout(new GridLayout(2, false));
		containerAdvancedPropertiesTab.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		
		FocusListener focusListener = new FocusListener() {
		      public void focusGained(FocusEvent e) {
		      }

		      public void focusLost(FocusEvent e) {
		    	  setWidgetsToGridColumns(findColumn(activeColumn));
		      }
		};
		
		// Propiedad de name
		Label nameLabel = new Label(containerPropertiesTab, SWT.NULL);
		nameLabel.setText("Name(*):         ");
		nameLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto name
		nameText = new Text(containerPropertiesTab, SWT.BORDER | SWT.SINGLE);
		nameText.setToolTipText("Nombre de la columna");
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		nameText.addFocusListener(focusListener);
		
		// Propiedad de label
		Label labelLabel = new Label(containerPropertiesTab, SWT.NULL);
		labelLabel.setText("Label(*):");
		labelLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto label
		labelText = new Text(containerPropertiesTab, SWT.BORDER | SWT.SINGLE);
		labelText.setToolTipText("Texto que aparece en la cabecera de la columna");
		labelText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		labelText.addFocusListener(focusListener);
		
		// Propiedad de index
		Label indexLabel = new Label(containerPropertiesTab, SWT.NULL);
		indexLabel.setText("Index(*):");
		indexLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto index
		indexText = new Text(containerPropertiesTab, SWT.BORDER | SWT.SINGLE);
		indexText.setToolTipText("Indica el índice de la columna");
		indexText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		indexText.addFocusListener(focusListener);
		
		// Propiedad de la alineación 
		Label alignLabel = new Label(containerPropertiesTab, SWT.NULL);
		alignLabel.setText("Align:");
		alignLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo combo de tipo de ordenación
		alignCombo = new Combo(containerPropertiesTab, SWT.READ_ONLY);
		alignCombo.add("left");
		alignCombo.add("center");
		alignCombo.add("right");
		alignCombo.select(0);
		alignCombo.setToolTipText("Establece la alineación para una columna");
		alignCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		alignCombo.addFocusListener(focusListener);
		
		// Propiedad de width
		Label widthLabel = new Label(containerPropertiesTab, SWT.NULL);
		widthLabel.setText("Width:");
		widthLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto width
		widthText = new Text(containerPropertiesTab, SWT.BORDER | SWT.SINGLE);
		widthText.setText("150");
		widthText.setToolTipText("Define la anchura de la columna");
		widthText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		widthText.addFocusListener(focusListener);
		
		// Propiedad de columna editable
		Label editableLabel = new Label(containerPropertiesTab, SWT.NULL);
		editableLabel.setText("Editable:");
		editableLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de columna editable
		editableCheck = new Button(containerPropertiesTab, SWT.CHECK);
		editableCheck.setSelection(true);
		editableCheck.setToolTipText("Establece si esa columna es editable o no");
		editableCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		editableCheck.addFocusListener(focusListener);

		//Configura la capa de scroll
		scrolledContainerPropertiesTab.setContent(containerPropertiesTab);
		scrolledContainerPropertiesTab.setExpandHorizontal(true);
		scrolledContainerPropertiesTab.setExpandVertical(true);
		scrolledContainerPropertiesTab.setMinSize(containerPropertiesTab.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		// Añade el contenedor a la pestaña de propiedades
		propertiesTab.setControl(scrolledContainerPropertiesTab);
		
		// Propiedad de edittype 
		Label editTypeLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		editTypeLabel.setText("RupType:");
		editTypeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo combo de edittype
		editTypeCombo = new Combo(containerAdvancedPropertiesTab, SWT.READ_ONLY);
		editTypeCombo.add("Text");
		editTypeCombo.add("Textarea");
		editTypeCombo.add("Autocomplete");
		editTypeCombo.add("Datepicker");
		editTypeCombo.add("Combo");
		editTypeCombo.add("Checkbox");
		editTypeCombo.add("Password");
		editTypeCombo.add("Button");
		editTypeCombo.add("Image");
		editTypeCombo.add("File");
		editTypeCombo.select(0);
		editTypeCombo.setToolTipText("Indica el tipo de elemento que se forma al poner la columna en modo edición");
		editTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		editTypeCombo.addFocusListener(focusListener);
		
		// Propiedad de firstsortorder 
		Label firstSortOrderLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		firstSortOrderLabel.setText("Firstsortorder:");
		firstSortOrderLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo combo de firstsortorder
		firstSortOrderCombo = new Combo(containerAdvancedPropertiesTab, SWT.READ_ONLY);
		firstSortOrderCombo.add("");
		firstSortOrderCombo.add("asc");
		firstSortOrderCombo.add("desc");
		firstSortOrderCombo.select(0);
		firstSortOrderCombo.setToolTipText("La columna se ordenará en la dirección seleccionada");
		firstSortOrderCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		firstSortOrderCombo.addFocusListener(focusListener);
		
		// Propiedad de fixed
		Label fixedLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		fixedLabel.setText("Fixed:");
		fixedLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de fixed
		fixedCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		fixedCheck.setSelection(false);
		fixedCheck.setToolTipText("Columna que no se redimensiona cuando se cambia el grid");
		fixedCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		fixedCheck.addFocusListener(focusListener);
		
		// Propiedad de hidden
		Label hiddenLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		hiddenLabel.setText("Hidden:");
		hiddenLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de hidden
		hiddenCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		hiddenCheck.setSelection(false);
		hiddenCheck.setToolTipText("Indica si la columna es oculta o no");
		hiddenCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		hiddenCheck.addFocusListener(focusListener);
		
		// Propiedad de resizable
		Label resizableLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		resizableLabel.setText("Resizable:");
		resizableLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de resizable
		resizableCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		resizableCheck.setSelection(true);
		resizableCheck.setToolTipText("Indica si la columna es redimensionable o no");
		resizableCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		resizableCheck.addFocusListener(focusListener);
		
		// Propiedad de sortable
		Label sortableLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		sortableLabel.setText("Sortable:");
		sortableLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de sortable
		sortableCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		sortableCheck.setSelection(true);
		sortableCheck.setToolTipText("Indica si la columna es ordenable o no");
		sortableCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		sortableCheck.addFocusListener(focusListener);
		
		// Propiedad de title
		Label titleLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		titleLabel.setText("Title:");
		titleLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de title
		titleCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		titleCheck.setSelection(true);
		titleCheck.setToolTipText("Activa o no el tooltip en la columna");
		titleCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		titleCheck.addFocusListener(focusListener);
		
		// Propiedad de unformat
		Label unformatLabel = new Label(containerAdvancedPropertiesTab, SWT.NULL);
		unformatLabel.setText("Unformat:");
		unformatLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto unformat
		unformatText = new Text(containerAdvancedPropertiesTab, SWT.BORDER | SWT.SINGLE);
		unformatText.setToolTipText("Define el nuevo formato cuando una columna deja de ser editable");
		unformatText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		unformatText.addFocusListener(focusListener);
		
		////////////////////////////////
		// Grupo de opciones de edición
		////////////////////////////////
		Group editOptionsGroup = new Group(containerAdvancedPropertiesTab, SWT.NONE);
		editOptionsGroup.setText("Opciones de edición");
		editOptionsGroup.setLayout(new GridLayout(2, false));
		editOptionsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2 ,1));
		
		// Propiedad de valor 
		Label valueEditOptionsLabel = new Label(editOptionsGroup, SWT.NULL);
		valueEditOptionsLabel.setText("Value:");
		valueEditOptionsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto valor
		valueEditOptionsText = new Text(editOptionsGroup, SWT.BORDER | SWT.SINGLE);
		valueEditOptionsText.setToolTipText("Define los posibles valores de edición. Ej.: si es un check: \"Yes:No\", si es un combo:\"1:One;2:Two\"");
		valueEditOptionsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		valueEditOptionsText.addFocusListener(focusListener);
		
		// Propiedad de defaultValue
		Label defaultValueEditOptionsLabel = new Label(editOptionsGroup, SWT.NULL);
		defaultValueEditOptionsLabel.setText("DefaultValue:");
		defaultValueEditOptionsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto defaultValue
		defaultValueEditOptionsText = new Text(editOptionsGroup, SWT.BORDER | SWT.SINGLE);
		defaultValueEditOptionsText.setToolTipText("Propiedad de defaultValue");
		defaultValueEditOptionsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		defaultValueEditOptionsText.addFocusListener(focusListener);
		
		// Propiedad de otherOptions
		Label otherOptionsEditOptionsLabel = new Label(editOptionsGroup, SWT.NULL);
		otherOptionsEditOptionsLabel.setText("OtherOptions:");
		otherOptionsEditOptionsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto otherOptions
		otherOptionsEditOptionsText = new Text(editOptionsGroup, SWT.BORDER | SWT.SINGLE);
		otherOptionsEditOptionsText.setToolTipText("Se indica cualquier otro atributo válido para el elemento editable");
		otherOptionsEditOptionsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		otherOptionsEditOptionsText.addFocusListener(focusListener);
		///////////////////////////////////////////////
		
		///////////////////////////////////
		// Grupo de formateador
		///////////////////////////////////
		Group formatterGroup = new Group(containerAdvancedPropertiesTab, SWT.NONE);
		formatterGroup.setText("Formateador");
		formatterGroup.setLayout(new GridLayout(2, false));
		formatterGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		// Propiedad de formatter
		Label formatterLabel = new Label(formatterGroup, SWT.NULL);
		formatterLabel.setText("Formatter:");
		formatterLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo combo de formatter
		formatterCombo = new Combo(formatterGroup, SWT.READ_ONLY);
		formatterCombo.add("");
		formatterCombo.add("integer");
		formatterCombo.add("number");
		formatterCombo.add("currency");
		formatterCombo.add("date");
		formatterCombo.add("email");
		formatterCombo.add("link");
		formatterCombo.add("checkbox");
		formatterCombo.add("select");
		formatterCombo.select(0);
		formatterCombo.setToolTipText("Indica el formato a aplicar al visualizar la columna");
		formatterCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		formatterCombo.addFocusListener(focusListener);
		formatterCombo.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (formatterCombo.getSelectionIndex() != 0) {
					formatOptionsText.setEnabled(true);
				}else{
					formatOptionsText.setText("");
					formatOptionsText.setEnabled(false);
				}
			}
		});
		
		// Propiedad de formatoptions
		Label formatOptionsLabel = new Label(formatterGroup, SWT.NULL);
		formatOptionsLabel.setText("Formatoptions:");
		formatOptionsLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto formatoptions
		formatOptionsText = new Text(formatterGroup, SWT.BORDER | SWT.SINGLE);
		formatOptionsText.setToolTipText("Se define a las columnas para sobreescribir los valores por defecto");
		formatOptionsText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		formatOptionsText.addFocusListener(focusListener);
		formatOptionsText.setEnabled(false);
		///////////////////////////////////////////////
		
		// Check box para habilitar grupo de reglas de edición
		enableEditRulesCheck = new Button(containerAdvancedPropertiesTab, SWT.CHECK);
		enableEditRulesCheck.setText("Reglas de edición");
		enableEditRulesCheck.setSelection(false);
		enableEditRulesCheck.setToolTipText("Habilita el grupo de Regla de Edición");
		enableEditRulesCheck.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
				if (enableEditRulesCheck.getSelection()) {
					enableEditRules(true);
				} else {
					enableEditRules(false);
				}
            }
        });
		enableEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		
		////////////////////////////////
		// Grupo de reglas de edición
		////////////////////////////////
		Group editRulesGroup = new Group(containerAdvancedPropertiesTab, SWT.NONE);
		editRulesGroup.setText("Reglas de edición");
		editRulesGroup.setLayout(new GridLayout(2, false));
		editRulesGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		// Propiedad de edithidden 
		Label edithiddenEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		edithiddenEditRulesLabel.setText("Edithidden:");
		edithiddenEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de edithidden
		edithiddenEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		edithiddenEditRulesCheck.setSelection(false);
		edithiddenEditRulesCheck.setToolTipText("Indica si el elemento que se creará en el formulario de detalle será oculto o no");
		edithiddenEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		edithiddenEditRulesCheck.addFocusListener(focusListener);
		edithiddenEditRulesCheck.setEnabled(false);
		
		// Propiedad de required
		Label requiredEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		requiredEditRulesLabel.setText("Required:");
		requiredEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de edithidden
		requiredEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		requiredEditRulesCheck.setSelection(false);
		requiredEditRulesCheck.setToolTipText("Verifica si el valor es requerido");
		requiredEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		requiredEditRulesCheck.addFocusListener(focusListener);
		requiredEditRulesCheck.setEnabled(false);
		
		// Propiedad de number
		Label numberEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		numberEditRulesLabel.setText("Number:");
		numberEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de number
		numberEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		numberEditRulesCheck.setSelection(false);
		numberEditRulesCheck.setToolTipText("Verifica si el valor es de tipo numérico");
		numberEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		numberEditRulesCheck.addFocusListener(focusListener);
		numberEditRulesCheck.setEnabled(false);
		
		// Propiedad de integer
		Label integerEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		integerEditRulesLabel.setText("Integer:");
		integerEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de integer
		integerEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		integerEditRulesCheck.setSelection(false);
		integerEditRulesCheck.setToolTipText("Verifica si el valor es de tipo entero");
		integerEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		integerEditRulesCheck.addFocusListener(focusListener);
		integerEditRulesCheck.setEnabled(false);
		
		// Propiedad de minValue
		Label minValueEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		minValueEditRulesLabel.setText("MinValue:");
		minValueEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto minValue
		minValueEditRulesText = new Text(editRulesGroup, SWT.BORDER | SWT.SINGLE);
		minValueEditRulesText.setToolTipText("Establece un mínimo valor posible");
		minValueEditRulesText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		minValueEditRulesText.addFocusListener(focusListener);
		minValueEditRulesText.setEnabled(false);
		
		// Propiedad de maxValue
		Label maxValueEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		maxValueEditRulesLabel.setText("MaxValue:");
		maxValueEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto maxValue
		maxValueEditRulesText = new Text(editRulesGroup, SWT.BORDER | SWT.SINGLE);
		maxValueEditRulesText.setToolTipText("Establece un máximo valor posible");
		maxValueEditRulesText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		maxValueEditRulesText.addFocusListener(focusListener);
		maxValueEditRulesText.setEnabled(false);
		
		// Propiedad de email
		Label emailEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		emailEditRulesLabel.setText("Email:");
		emailEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de email
		emailEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		emailEditRulesCheck.setSelection(false);
		emailEditRulesCheck.setToolTipText("Verifica si el valor de email tiene un formato correcto");
		emailEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		emailEditRulesCheck.addFocusListener(focusListener);
		emailEditRulesCheck.setEnabled(false);
		
		// Propiedad de url
		Label urlEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		urlEditRulesLabel.setText("URL:");
		urlEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de url
		urlEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		urlEditRulesCheck.setSelection(false);
		urlEditRulesCheck.setToolTipText("Verifica si el valor de URL tiene un formato correcto");
		urlEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		urlEditRulesCheck.addFocusListener(focusListener);
		urlEditRulesCheck.setEnabled(false);
		
		// Propiedad de date
		Label dateEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		dateEditRulesLabel.setText("Date:");
		dateEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de date
		dateEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		dateEditRulesCheck.setSelection(false);
		dateEditRulesCheck.setToolTipText("Verifica si el valor de fecha tiene un formato correcto");
		dateEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		dateEditRulesCheck.addFocusListener(focusListener);
		dateEditRulesCheck.setEnabled(false);
		
		// Propiedad de time
		Label timeEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		timeEditRulesLabel.setText("Time:");
		timeEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de time
		timeEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		timeEditRulesCheck.setSelection(false);
		timeEditRulesCheck.setToolTipText("Verifica si el valor de tiempo tiene un formato correcto");
		timeEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		timeEditRulesCheck.addFocusListener(focusListener);
		timeEditRulesCheck.setEnabled(false);
		
		// Propiedad de custom
		Label customEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		customEditRulesLabel.setText("Custom:");
		customEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo check de custom
		customEditRulesCheck = new Button(editRulesGroup, SWT.CHECK);
		customEditRulesCheck.setSelection(false);
		customEditRulesCheck.setToolTipText("Activa la personalización a través de 'Custom_func'");
		customEditRulesCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1 ,1));
		customEditRulesCheck.addFocusListener(focusListener);
		customEditRulesCheck.setEnabled(false);
		
		// Propiedad de customFunc
		Label customFuncEditRulesLabel = new Label(editRulesGroup, SWT.NULL);
		customFuncEditRulesLabel.setText("Custom_func:");
		customFuncEditRulesLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1 ,1));
		// Campo texto customFunc
		customFuncEditRulesText = new Text(editRulesGroup, SWT.BORDER | SWT.SINGLE);
		customFuncEditRulesText.setToolTipText("Función personalizada de los roles de edición, vinculado al campo 'Custom'");
		customFuncEditRulesText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1 ,1));
		customFuncEditRulesText.addFocusListener(focusListener);
		customFuncEditRulesText.setEnabled(false);
		///////////////////////////////////////////////
		
		//Configura la capa de scroll
		scrolledAdvancedContainerPropertiesTab.setContent(containerAdvancedPropertiesTab);
		scrolledAdvancedContainerPropertiesTab.setExpandHorizontal(true);
		scrolledAdvancedContainerPropertiesTab.setExpandVertical(true);
		scrolledAdvancedContainerPropertiesTab.setMinSize(containerAdvancedPropertiesTab.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Añade el contenedor a la pestaña de propiedades avanzadas
		propertiesAdvancedTab.setControl(scrolledAdvancedContainerPropertiesTab);
		
		setControl(container);
	}
	
	/*************/
	/*  Getters  */
	/*************/
	
	/**
	 * Retorna un listado de propiedades de las columnas
	 * 
	 * @param conData - conexión a la BBDD
	 * @param tableName - nombre de la tabla
	 */
	public List<GridColumn> getColumns(){
		return columnsProperties;
	}
	
	
	/**
	 * Asigna los valores de las columnas y su estado al control
	 * 
	 * @param conData - conexión a la BBDD
	 * @param tableName - nombre de la tabla
	 */
	public void setColumns(ConnectionData conData, String tableName){
		
		List<TreeNode> columnsComposite = new ArrayList<TreeNode>(0);
		primaryKeys = new ArrayList<String>(0);
		// Inicializa la lista de propiedades de las columnas
		columnsProperties = new ArrayList<GridColumn>(0);
		// Inicializa visualmente
		containerTab.setVisible(false);
		activeColumn = "";
		
		if (conData != null && !Utilities.isBlank(tableName)){
			
			TreeNode table = DataBaseWorker.getTableNode(conData, tableName);
			
			String entity = table.getName().replace("_", "").toLowerCase();
			
			if (table != null){
				schemaCheckboxTree.setInput(table);
				// Selecciona todos los checks
				setSelection(true);
				// Expande el árbol de columnas
				schemaCheckboxTree.expandAll();
				// Crea propiedades para las columnas
				
				List<TreeNode> columns = table.getChildren();
				
				
				if (columns != null && !columns.isEmpty()){
					for (Iterator<TreeNode> iterator = columns.iterator(); iterator.hasNext();) {
						TreeNode column = (TreeNode) iterator.next();
						
						
						if (column.isComposite()){
							
							columnsComposite = column.getChildren();
							
							for (Iterator<TreeNode> iteratorComposite = columnsComposite.iterator(); iteratorComposite
									.hasNext();) {
								TreeNode columnComposite = (TreeNode) iteratorComposite.next();
								
								if (columnComposite.isPrimaryKey()){
									// Añade a la lista de primaryKeys
									primaryKeys.add(columnComposite.getName());
								}
								columnComposite.setComposite(true);
								// Crea las propiedades para cada columna
								createColumnProperties(columnComposite, entity);
							}
						}else if (!column.isComposite()){
							if (column.isPrimaryKey()){
								// Añade a la lista de primaryKeys
								primaryKeys.add(column.getName());
							}
							// Crea las propiedades para cada columna
							createColumnProperties(column, entity);
						}
					}
				}
			}
		}
	}
		
	/**
	 * Retorna un listado de claves primarias
	 * 
	 * @return claves primarias separado por comas
	 */
	public String getPrimaryKeys(){
		
		String pKeys = "";
		
		if (primaryKeys != null && !primaryKeys.isEmpty()){
			
			for (Iterator<String> iterator = primaryKeys.iterator(); iterator.hasNext();) {
				pKeys += (String) iterator.next();
				
				if (iterator.hasNext()){
					pKeys += ";";	
				}
			}
		}
		return pKeys;
	}

	/**********************/
	/*  Métodos privados  */
	/**********************/
	
	/**
	 * Genera las propiedades para cada columna de la tabla
	 */
	private void createColumnProperties(TreeNode column, String entity){
		GridColumn columnProperties = new GridColumn();
		// Inicializa con los valores por defecto
		columnProperties.initializeColumnProperties();
		columnProperties.setTableName(column.getParent().getName());
		columnProperties.setColumnName(column.getName());
		columnProperties.setLabel(column.getName());
		
		// Si es JPA y clave compueste le añadimos el JPA_ID. o 'entidad'. por delante para acceder a los datos, segun la tecnología de persistencia.
		if (column.isPrimaryKey() && column.isComposite()){
			if (isJPAProjectWar(getIProjectWARPageOne())){
				columnProperties.setName("JPA_ID." + column.getName());				
			}else if (!Utilities.isBlank(column.getReferenceClass())){
				columnProperties.setName(column.getReferenceClass() + "." + column.getName());
			}else{
				columnProperties.setName(column.getName());
			}
		}else{
			if (!isJPAProjectWar(getIProjectWARPageOne()) && !Utilities.isBlank(column.getReferenceClass())){
				columnProperties.setName(column.getReferenceClass() + "." + column.getName());				
			}else{
				columnProperties.setName(column.getName());
			}
		}
		
		// Añade a la lista
		columnsProperties.add(columnProperties);

		//Añade el inndex a la propiedad
//		int index = columnsProperties.indexOf(columnProperties);
//		if (index != -1){
//			columnProperties.setIndex(Integer.toString(index + 1));			
//		}
		columnProperties.setIndex(column.getName());
		
		if (column.toStringBBDD().contains(": DATE")
				|| column.toStringBBDD().contains(": TIMESTAMP")
				|| column.toStringBBDD().contains(": VARBINARY")){
			columnProperties.setEditTypeIndex(3); // Equivalente a 'Datepicker'
			columnProperties.setEditType("text");
			columnProperties.setRupType("datepicker");
		}else if (column.toStringBBDD().contains(": CLOB")
				|| column.toStringBBDD().contains(": BLOB")){
			columnProperties.setEditTypeIndex(9); // Equivalente a 'File'
			columnProperties.setEditType("file");
			columnProperties.setRupType("");
		}else {
			columnProperties.setEditTypeIndex(0); // Equivalente a 'Text'
			columnProperties.setEditType("text");
			columnProperties.setRupType("");
		}
		
		
		
	}

	/**
	 * Asigna el estado de los checks al árbol
	 * 
	 * @param state - estado del check
	 */
	private void setSelection(boolean state) {
		if (schemaCheckboxTree != null){
			TreeNode input = (TreeNode) schemaCheckboxTree.getInput();
			select(input, state);
		}
	}

	/**
	 * Recursivo seleccionado y deseleccionado de nodos
	 * 
	 * @param root - árbol de columnas de la tabla
	 * @param state - estado de selección 
	 */
	private void select(TreeNode root, boolean state) {
		if (root != null){
			List<TreeNode> children = root.getChildren();
			if (children!=null && !children.isEmpty()){
				for(TreeNode node : children){
					schemaCheckboxTree.setChecked(node, state);
					node.setChecked(state);
					select(node, state);
				}
			}	
		}		
	}

	/**
	* Actualiza los padres del check seleccionado
	* 
	* @param item - árbol de columna de la tabla
	*/
	private void updateParentItems(TreeNode item) {
		if (item != null) {
			List<TreeNode> children = item.getChildren();
			boolean containsChecked = false;
			boolean containsUnchecked = false;
			
			for (TreeNode treeNode : children) {
				containsChecked |= schemaCheckboxTree.getChecked(treeNode);
				containsUnchecked |= (!schemaCheckboxTree.getChecked(treeNode));
			}
			
			item.setChecked(containsChecked);
			schemaCheckboxTree.setChecked(item, containsChecked);
			TreeNode parent = item.getParent();
			
			// Check las claves primarias obligatorias.
			if (containsChecked){
				checkPrimaryKeys(item);
			}
			// Actualiza los padres
			updateParentItems(parent);
		}
	}
	
	/**
	* Checkea las columnas Primary Key del nodo tabla
	* 
	* @param item - árbol de columna de la tabla
	*/
	private void checkPrimaryKeys(TreeNode item) {
		
    	if (item != null) {
			List<TreeNode> children = item.getChildren();
			
			if (children != null && !children.isEmpty()){
				for (TreeNode treeNode : children) {
					
					if (treeNode.isComposite() && treeNode.isPrimaryKey()){
						
						// Checkea las claves primarias
						schemaCheckboxTree.setChecked(treeNode, true);
						treeNode.setChecked(true);
						
						List<TreeNode> childrenComposite = treeNode.getChildren();
						if (childrenComposite != null && !childrenComposite.isEmpty()){
							for (TreeNode treeNodeComposite : childrenComposite) {
								if (treeNodeComposite.isPrimaryKey()){
									// Checkea las claves primarias
									schemaCheckboxTree.setChecked(treeNodeComposite, true);
									treeNodeComposite.setChecked(true);
								}
							}
						}
					}else if (treeNode.isPrimaryKey()){
						// Checkea las claves primarias
						schemaCheckboxTree.setChecked(treeNode, true);
						treeNode.setChecked(true);
					}
				}
			}
		}
	}
	
	/**
	 * Recupera las propiedades de la columna pasándole el nombre de la misma
	 * 
	 * @param columnName - nombre de la columna a buscar
	 * @return propiedades de la columna
	 */
	private GridColumn findColumn(String columnName){
		
		GridColumn properties = null;
		
		if (!Utilities.isBlank(columnName) && columnsProperties != null && !columnsProperties.isEmpty()){
			for (Iterator<GridColumn> iterator = columnsProperties.iterator(); iterator.hasNext();) {
				GridColumn gridColumn = (GridColumn) iterator.next();
				
				if (columnName.equals(gridColumn.getColumnName())){
					properties = gridColumn;
					break;
				}
			}
		}
		return properties;
	}
	
	/**
	 * Pasa los valores del los campos de la pantalla al objecto de propiedades la columna
	 * 
	 * @param gridColumn - propiedades de la columna
	 */
	private void setWidgetsToGridColumns(GridColumn gridColumn){
		
		if (gridColumn != null){
			if (alignCombo != null){
				gridColumn.setAlignIndex(alignCombo.getSelectionIndex());
				gridColumn.setAlign(alignCombo.getText());	
			}
			if (editableCheck != null){
				gridColumn.setEditable(editableCheck.getSelection());	
			}
			if (valueEditOptionsText != null){
				gridColumn.setValueEditOptions(valueEditOptionsText.getText());	
			}
			if (dataUrlEditOptionsText != null){
				gridColumn.setDataUrlEditOptions(dataUrlEditOptionsText.getText());	
			}
			if (buildSelectEditOptionsText != null && buildSelectEditOptionsText.getText() != null){
				gridColumn.setBuildSelectEditOptions(buildSelectEditOptionsText.getText());	
			}
			if (defaultValueEditOptionsText != null && defaultValueEditOptionsText.getText() != null){
				gridColumn.setDefaultValueEditOptions(defaultValueEditOptionsText.getText());	
			}
			if (otherOptionsEditOptionsText != null && otherOptionsEditOptionsText.getText() != null){
				gridColumn.setOtherOptionsEditOptions(otherOptionsEditOptionsText.getText());	
			}
			if (edithiddenEditRulesCheck != null){
				gridColumn.setEditHiddenEditRules(edithiddenEditRulesCheck.getSelection());	
			}
			if (requiredEditRulesCheck != null){
				gridColumn.setRequiredEditRules(requiredEditRulesCheck.getSelection());	
			}
			if (numberEditRulesCheck != null){
				gridColumn.setNumberEditRules(numberEditRulesCheck.getSelection());	
			}
			if (integerEditRulesCheck != null){
				gridColumn.setIntegerEditRules(integerEditRulesCheck.getSelection());	
			}
			if (minValueEditRulesText != null && minValueEditRulesText.getText() != null){
				gridColumn.setMinValueEditRules(minValueEditRulesText.getText());	
			}
			if (maxValueEditRulesText != null && maxValueEditRulesText.getText() != null){
				gridColumn.setMaxValueEditRules(maxValueEditRulesText.getText());
			}
			if (emailEditRulesCheck != null){
				gridColumn.setEmailEditRules(emailEditRulesCheck.getSelection());
			}
			if (urlEditRulesCheck != null){
				gridColumn.setUrlEditRules(urlEditRulesCheck.getSelection());
			}
			if (dateEditRulesCheck != null){
				gridColumn.setDateEditRules(dateEditRulesCheck.getSelection());
			}
			if (dateEditRulesCheck != null){
				gridColumn.setDateEditRules(dateEditRulesCheck.getSelection());
			}
			if (timeEditRulesCheck != null){
				gridColumn.setTimeEditRules(timeEditRulesCheck.getSelection());
			}
			if (customEditRulesCheck != null){
				gridColumn.setCustomEditRules(customEditRulesCheck.getSelection());
			}
			if (customFuncEditRulesText != null && customFuncEditRulesText.getText() != null){
				gridColumn.setCustomFuncEditRules(customFuncEditRulesText.getText());
			}
			if (editTypeCombo != null){
				gridColumn.setEditTypeIndex(editTypeCombo.getSelectionIndex());
				gridColumn.setEditType(editTypeCombo.getText());
			}
			if (firstSortOrderCombo != null){
				gridColumn.setFirstSortOrderIndex(firstSortOrderCombo.getSelectionIndex());
				gridColumn.setFirstSortOrder(firstSortOrderCombo.getText());
			}
			if (fixedCheck != null){
				gridColumn.setFixed(fixedCheck.getSelection());
			}
			if (formatterCombo != null){
				gridColumn.setFormatterIndex(formatterCombo.getSelectionIndex());
				gridColumn.setFormatter(formatterCombo.getText());
			}
			if (formatOptionsText != null && formatOptionsText.getText() != null){
				gridColumn.setFormatOptions(formatOptionsText.getText());
			}
			if (hiddenCheck != null){
				gridColumn.setHidden(hiddenCheck.getSelection());
			}
			if (indexText != null && indexText.getText() != null){
				gridColumn.setIndex(indexText.getText());
			}
			if (labelText != null && labelText.getText() != null){
				gridColumn.setLabel(labelText.getText());
			}
			if (nameText != null && nameText.getText() != null){
				gridColumn.setName(nameText.getText());
			}
			if (resizableCheck != null){
				gridColumn.setResizable(resizableCheck.getSelection());
			}
			if (sortableCheck != null){
				gridColumn.setSortable(sortableCheck.getSelection());
			}
			if (titleCheck != null){
				gridColumn.setTitle(titleCheck.getSelection());
			}
			if (widthText != null && widthText.getText() != null){
				gridColumn.setWidth(widthText.getText());
			}
			if (unformatText != null && unformatText.getText() != null){
				gridColumn.setUnformat(unformatText.getText());
			}
		}
	}
	
	/**
	 * Pasa los valores del objecto de propiedades de la columna a los campos de la pantalla
	 * 
	 * @param gridColumn - propiedades de la columna
	 */
	private void setGridColumnsToWidgets(GridColumn gridColumn){
		
		if (gridColumn != null){
			
			if (alignCombo != null){
				alignCombo.select(gridColumn.getAlignIndex());
			}
			if (editableCheck != null){
				editableCheck.setSelection(gridColumn.isEditable());	
			}
			if (valueEditOptionsText != null && gridColumn.getValueEditOptions() != null){
				valueEditOptionsText.setText(gridColumn.getValueEditOptions());	
			}
			if (dataUrlEditOptionsText != null && gridColumn.getDataUrlEditOptions() != null){
				dataUrlEditOptionsText.setText(gridColumn.getDataUrlEditOptions());	
			}
			if (buildSelectEditOptionsText != null && gridColumn.getBuildSelectEditOptions() != null){
				buildSelectEditOptionsText.setText(gridColumn.getBuildSelectEditOptions());	
			}
			if (defaultValueEditOptionsText != null && gridColumn.getDefaultValueEditOptions() != null){
				defaultValueEditOptionsText.setText(gridColumn.getDefaultValueEditOptions());	
			}
			if (otherOptionsEditOptionsText != null && gridColumn.getOtherOptionsEditOptions() != null){
				otherOptionsEditOptionsText.setText(gridColumn.getOtherOptionsEditOptions());	
			}
			if (edithiddenEditRulesCheck != null){
				edithiddenEditRulesCheck.setSelection(gridColumn.isEditHiddenEditRules());	
			}
			if (requiredEditRulesCheck != null){
				requiredEditRulesCheck.setSelection(gridColumn.isRequiredEditRules());	
			}
			if (numberEditRulesCheck != null){
				numberEditRulesCheck.setSelection(gridColumn.isNumberEditRules());	
			}
			if (integerEditRulesCheck != null){
				integerEditRulesCheck.setSelection(gridColumn.isIntegerEditRules());	
			}
			if (minValueEditRulesText != null && gridColumn.getMinValueEditRules() != null){
				minValueEditRulesText.setText(gridColumn.getMinValueEditRules());
			}
			if (maxValueEditRulesText != null && gridColumn.getMaxValueEditRules() != null){
				maxValueEditRulesText.setText(gridColumn.getMaxValueEditRules());
			}
			if (emailEditRulesCheck != null){
				emailEditRulesCheck.setSelection(gridColumn.isEmailEditRules());
			}
			if (urlEditRulesCheck != null){
				urlEditRulesCheck.setSelection(gridColumn.isUrlEditRules());
			}
			if (dateEditRulesCheck != null){
				dateEditRulesCheck.setSelection(gridColumn.isDateEditRules());
			}
			if (dateEditRulesCheck != null){
				dateEditRulesCheck.setSelection(gridColumn.isDateEditRules());
			}
			if (timeEditRulesCheck != null){
				timeEditRulesCheck.setSelection(gridColumn.isTimeEditRules());
			}
			if (customEditRulesCheck != null){
				customEditRulesCheck.setSelection(gridColumn.isCustomEditRules());
			}
			if (customFuncEditRulesText != null && gridColumn.getCustomFuncEditRules() != null){
				customFuncEditRulesText.setText(gridColumn.getCustomFuncEditRules());
			}
			if (editTypeCombo != null){
				editTypeCombo.select(gridColumn.getEditTypeIndex());
			}
			if (firstSortOrderCombo != null){
				firstSortOrderCombo.select(gridColumn.getFirstSortOrderIndex());
			}
			if (fixedCheck != null){
				fixedCheck.setSelection(gridColumn.isFixed());
			}
			if (formatterCombo != null){
				formatterCombo.select(gridColumn.getFormatterIndex());
			}
			if (formatOptionsText != null && gridColumn.getFormatOptions()!= null){
				formatOptionsText.setText(gridColumn.getFormatOptions());
			}
			if (hiddenCheck != null){
				hiddenCheck.setSelection(gridColumn.isHidden());
			}
			if (indexText != null && gridColumn.getIndex() != null){
				indexText.setText(gridColumn.getIndex());
			}
			if (labelText != null && gridColumn.getLabel() != null){
				labelText.setText(gridColumn.getLabel());
			}
			if (nameText != null && gridColumn.getName() != null){
				nameText.setText(gridColumn.getName());
			}
			if (resizableCheck != null){
				resizableCheck.setSelection(gridColumn.isResizable());
			}
			if (sortableCheck != null){
				sortableCheck.setSelection(gridColumn.isSortable());
			}
			if (titleCheck != null){
				titleCheck.setSelection(gridColumn.isTitle());
			}
			if (widthText != null && gridColumn.getWidth() != null){
				widthText.setText(gridColumn.getWidth());
			}
			if (unformatText != null && gridColumn.getUnformat() != null){
				unformatText.setText(gridColumn.getUnformat());
			}
		}
	}
	
	/**
     * Valida los campos de la pantalla
     * 
     * @return true si todos los controles están validados, false si algún campo no es válido.
     */
    protected boolean validatePage() {
    	
    	setErrorMessage(null);
	
//		if (rowNumText != null && !Utilities.isBlank(rowNumText.getText()) && !Utilities.validateNumber(rowNumText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'Número de filas'");
//			return false;
//		}
//		
//		if (beforeRequestText != null && !Utilities.isBlank(beforeRequestText.getText()) && !Utilities.validateText(beforeRequestText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'beforeRequest'");
//			return false;
//		}
//		
//		if (loadBeforeSendText != null && !Utilities.isBlank(loadBeforeSendText.getText()) && !Utilities.validateText(loadBeforeSendText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'loadBeforeSend'");
//			return false;
//		}
//		
//		if (gridCompleteText != null && !Utilities.isBlank(gridCompleteText.getText()) && !Utilities.validateText(gridCompleteText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'gridComplete'");
//			return false;
//		}
//		
//		if (loadCompleteText != null && !Utilities.isBlank(loadCompleteText.getText()) && !Utilities.validateText(loadCompleteText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'loadComplete'");
//			return false;
//		}
//		
//		if (loadCompleteText != null && !Utilities.isBlank(loadCompleteText.getText()) && !Utilities.validateText(loadCompleteText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'loadComplete'");
//			return false;
//		}
//		
//		if (ondblclickRowText != null && !Utilities.isBlank(ondblclickRowText.getText()) && !Utilities.validateText(ondblclickRowText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'ondblclickRow'");
//			return false;
//		}
//		
//		if (onSelectRowText != null && !Utilities.isBlank(onSelectRowText.getText()) && !Utilities.validateText(onSelectRowText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'onSelectRow'");
//			return false;
//		}
//		
//		if (onSelectAllText != null && !Utilities.isBlank(onSelectAllText.getText()) && !Utilities.validateText(onSelectAllText.getText())) {
//			setErrorMessage("Caracteres no válidos para en campo 'onSelectAllText'");
//			return false;
//		}
		
        setErrorMessage(null);
        setMessage("Este Wizard genera un nuevo mantenimiento para una aplicación UDA");
        return true;
    }
    
    private void enableEditRules(boolean select) {
    	if (edithiddenEditRulesCheck != null){
    		edithiddenEditRulesCheck.setSelection(false);
    		edithiddenEditRulesCheck.setEnabled(select);
    	}
    	if (requiredEditRulesCheck != null){
    		requiredEditRulesCheck.setSelection(false);
    		requiredEditRulesCheck.setEnabled(select);
    	}
    	if (numberEditRulesCheck != null){
    		numberEditRulesCheck.setSelection(false);
    		numberEditRulesCheck.setEnabled(select);
    	}
    	if (integerEditRulesCheck != null){
    		integerEditRulesCheck.setSelection(false);
    		integerEditRulesCheck.setEnabled(select);	
    	}
    	if (minValueEditRulesText != null){
    		minValueEditRulesText.setText("");
    		minValueEditRulesText.setEnabled(select);
    	}
    	if (maxValueEditRulesText != null){
    		maxValueEditRulesText.setText("");
    		maxValueEditRulesText.setEnabled(select);	
    	}
    	if (emailEditRulesCheck != null){
    		emailEditRulesCheck.setSelection(false);
    		emailEditRulesCheck.setEnabled(select);	
    	}
    	if (urlEditRulesCheck != null){
    		urlEditRulesCheck.setSelection(false);
    		urlEditRulesCheck.setEnabled(select);	
    	}
    	if (dateEditRulesCheck != null){
    		dateEditRulesCheck.setSelection(false);
    		dateEditRulesCheck.setEnabled(select);	
    	}
    	if (timeEditRulesCheck != null){
    		timeEditRulesCheck.setSelection(false);
    		timeEditRulesCheck.setEnabled(select);	
    	}
    	if (customEditRulesCheck != null){
    		customEditRulesCheck.setSelection(false);
    		customEditRulesCheck.setEnabled(select);	
    	}
    	if (customFuncEditRulesText != null){
    		customFuncEditRulesText.setText("");
    		customFuncEditRulesText.setEnabled(select);	
    	}
    }
    
    /**
	 * Método que indica si es un proyecto JPA o JDBC
	 * 
	 * @param project - Proyecto WAR
	 * @return - proyecto JPA
	 */
	private boolean isJPAProjectWar(IProject project){
		boolean isJPA = false;
		
		if (project != null){
			// Fichero encargado de indicar que el proyecto tendrá tecnologia JPA 2.0 en el proyecto EARClasses
			String path =  project.getLocation().toString() + "\\.settings\\com.ejie.uda.xml";
			File jpaXml = new File(path);
			// Verifica si existe el fichero com.ejie.uda.xml
			if (jpaXml.exists()){
				isJPA = true;
			}
		}
	
		return isJPA;
	}
	
	private IProject getIProjectWARPageOne(){
		IProject projectWar = null; 
	
		NewMaintWizard newMaintWizard = (NewMaintWizard)getWizard();
		if (newMaintWizard != null) {
			NewMaintWizardPageOne newMaintWizardPageOne = newMaintWizard.getPageNewMaintWizardPageOne();
			if (newMaintWizardPageOne != null) {
				// Recuperar el proyecto WAR seleccionado en la primera ventana
				projectWar = newMaintWizardPageOne.getWarProject();
			}
		}
		
		if (projectWar == null){
			// Validación de selección de proyecto WAR de UDA
				this.setMessage(
						"Se debe seleccionar algun proyecto tipo WAR para generar el mantenimiento",
						IMessageProvider.ERROR);
		}
		
		return projectWar;
	}
	
	
}