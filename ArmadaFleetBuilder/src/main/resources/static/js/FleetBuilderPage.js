
FleetBuilderPage = {
    startup: function(generatedURL) {

        this.baseUrl = generatedURL;

        //init widgets
        $( "#searchButton" ).button();
        $( "#advancedSearchButton" ).button();
        $( "#closeButton" ).button();
        $( "#radioSearchUnits" ).checkboxradio();
        $( "#radioSearchCards" ).checkboxradio();
        $( "#fleetAccordion" ).accordion();
        $( "#includeNeutralsCheckboxUnits" ).checkboxradio();
        $( "#includeNeutralsCheckboxCards" ).checkboxradio();
        $( "#searchButtonAdvancedUnits" ).button();
        $( "#searchButtonAdvancedCards" ).button();
        $( "#closeButtonAdvancedUnits" ).button();
        $( "#closeButtonAdvancedCards" ).button();




        //binds
        this.bindSearchSubmit();
        this.bindAdvancedSearch();
        this.bindCloseButton();

    },

    onSearch: function(){

        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        alert("value is: " + unitRadioChecked );
        if(unitRadioChecked){
            $( "#searchResultsPanel" ).html("searched for units")
        }

        else{
            $( "#searchResultsPanel" ).html("searched for cards")
        }
    },

    bindSearchSubmit: function() {

            $("#searchButton").click(function() {
                FleetBuilderPage.onSearch();
            });

            $("#searchButtonAdvancedUnits").click(function() {
                FleetBuilderPage.onSearch();
            });

            $("#searchButtonAdvancedCards").click(function() {
                FleetBuilderPage.onSearch();
            });
    },


    bindAdvancedSearch: function(){
        $("#advancedSearchButton").click(function() {
            FleetBuilderPage.onAdvancedSearch();
        });

    },

    bindCloseButton: function(){
            $("#closeButtonAdvancedUnits").click(function() {
                FleetBuilderPage.onClose();
            });

            $("#closeButtonAdvancedCards").click(function() {
                FleetBuilderPage.onClose();
            });

    },

    onClose: function(){
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        if(unitRadioChecked){
            $("#advancedSearchFormUnits").dialog("close");
        }
        else{
            $("#advancedSearchFormCards").dialog("close");
        }
        
        $( "#radioSearchUnits" ).checkboxradio("enable");
        $( "#radioSearchCards" ).checkboxradio("enable");

    },

    onAdvancedSearch: function(){
        $( "#radioSearchUnits" ).checkboxradio("disable");
        $( "#radioSearchCards" ).checkboxradio("disable");
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
            if(unitRadioChecked){
                $("#advancedSearchFormUnits").dialog({dialogClass:"no-close"});


            }
            else{
                $("#advancedSearchFormCards").dialog({dialogClass:"no-close"});
            }

    },
}

