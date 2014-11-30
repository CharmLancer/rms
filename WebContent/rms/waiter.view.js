sap.ui.jsview("rms.waiter", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf rms.waiter
	*/ 
	getControllerName : function() {
		return "rms.waiter";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf rms.waiter
	*/ 
	createContent : function(oController) {
		var oCarousel2 = new sap.ui.commons.Carousel();
		oCarousel2.setOrientation("vertical");
		oCarousel2.setVisibleItems(1);
		oCarousel2.setHeight("250px");

		//Create a panel instance
		var oPanel = new sap.ui.commons.Panel({
			width : "350px"
		});

		//Set the title of the panel
		oPanel.setTitle(new sap.ui.core.Title({
			text : "Contact Data",
			icon : "images/carousel/SAPLogo.gif"
		}));
		//As alternative if no icon is desired also the following shortcut might be possible:
		//oPanel.setText("Contact Data");

		//Create a matrix layout with 2 columns
		var oMatrix = new sap.ui.commons.layout.MatrixLayout({
			layoutFixed : true,
			width : '300px',
			columns : 2
		});
		oMatrix.setWidths('100px', '200px');

		//Create a simple form within the layout
		var oLabel = new sap.ui.commons.Label({
			text : 'Name'
		});
		var oInput = new sap.ui.commons.TextField({
			value : 'Mustermann',
			width : '100%'
		});
		oLabel.setLabelFor(oInput);
		oMatrix.createRow(oLabel, oInput);

		oLabel = new sap.ui.commons.Label({
			text : 'First Name'
		});
		oInput = new sap.ui.commons.TextField({
			value : 'Max',
			width : '100%'
		});
		oLabel.setLabelFor(oInput);
		oMatrix.createRow(oLabel, oInput);

		//Add the form to the panels content area
		oPanel.addContent(oMatrix);

		//Add some buttons to the panel header
		oPanel.addButton(new sap.ui.commons.Button({
			text : 'Save'
		}));
		oPanel.addButton(new sap.ui.commons.Button({
			text : 'Cancel'
		}));
		
		oCarousel2.addContent(oPanel);
		//oCarousel2.addContent(oPanel2);
		oCarousel2.placeAt("content");
	}

});
