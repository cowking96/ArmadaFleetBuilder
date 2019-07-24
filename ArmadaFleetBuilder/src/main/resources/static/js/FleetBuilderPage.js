
FleetBuilderPage = {
    startup: function(generatedURL) {

        this.baseUrl = generatedURL;

        //init widgets
        $( "#searchButton" ).button();
        $( "#advancedSearchButton" ).button();
        $( "#closeButton" ).button();

        $( "#radioSearchUnits" ).checkboxradio();
        $( "#radioSearchCards" ).checkboxradio();

        $( "#unitNameBegins" ).checkboxradio();
        $( "#unitNameEnds" ).checkboxradio();
        $( "#unitNameContains" ).checkboxradio();

        $( "#cardNameBegins" ).checkboxradio();
        $( "#cardNameEnds" ).checkboxradio();
        $( "#cardNameContains" ).checkboxradio();

        $( "#includeShips").checkboxradio();
        $( "#includeSquadrons").checkboxradio();
        $( "#includeShipsAndSquadrons").checkboxradio();

        $( "#includeNeutralsCheckboxUnits" ).checkboxradio();
        $( "#includeNeutralsCheckboxCards" ).checkboxradio();

        $( "#includeCommanders").checkboxradio();
        $( "#includeUniques").checkboxradio();
        $( "#includeModifications").checkboxradio();
        $( "#includeDefenseRetrofit").checkboxradio();
        $( "#includeOffensiveRetrofit").checkboxradio();
        $( "#includeTurboLaser").checkboxradio();
        $( "#includeIonCannon").checkboxradio();
        $( "#includeOrdnance").checkboxradio();
        $( "#includeTitle").checkboxradio();
        $( "#includeOfficer").checkboxradio();
        $( "#includeWeaponsTeam").checkboxradio();
        $( "#includeSupportTeam").checkboxradio();

        $( "#fleetAccordion" ).accordion();

        $( "#searchButtonAdvancedUnits" ).button();
        $( "#searchButtonAdvancedCards" ).button();
        $( "#closeButtonAdvancedUnits" ).button();
        $( "#closeButtonAdvancedCards" ).button();


        //binds
        this.bindMonsterSearchSubmit();
        this.bindAdvancedSearch();
        this.bindCloseButton();
        this.bindSearchSubmit();

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
                $("#advancedSearchFormUnits").dialog({dialogClass:"no-close advancedSearchForm",
                resizable:"false"},"modal" );

            }
            else{
                $("#advancedSearchFormCards").dialog({dialogClass:"no-close advancedSearchForm", resizable:"false"},"modal" );
            }

    },

    bindMonsterSearchSubmit: function() {

            $("#searchButton").click(function() {
                FleetBuilderPage.onSubmit();
            });

        },

    getName: function() {
        var nameToSearch;
        var nameSearchType;

        if(unitRadioChecked){
            nameToSearch = $('unitName').value;
            if($('unitNameBegins').is(':checked')){
                nameSearchType = "name begins with"
            }

            else if($('unitNameEnds').is(':checked')){
                nameSearchType = "name ends with"
            }

            else if($('unitNameContains').is(':checked')){
                nameSearchType = "name contains"
            }
        }

        if(cardRadioChecked){
            nameToSearch = $('cardName').value;
            if($('cardNameBegins').is(':checked')){
                nameSearchType = "name begins with"
            }

            else if($('cardNameEnds').is(':checked')){
                nameSearchType = "name ends with"
            }

            else if($('cardNameContains').is(':checked')){
                nameSearchType = "name contains"
            }
        }

        return nameSearchType;
     },



}

