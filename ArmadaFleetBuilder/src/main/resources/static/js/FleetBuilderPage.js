
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
        this.bindAdvancedSearch();
        this.bindCloseButton();
        this.bindSearchSubmit();

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

    getNameSearchType: function() {
            var nameSearchType;

            if($( "#unitNameBegins" ).is(':checked')){
                nameSearchType = "name begins with";
            }

            else if($( "#unitNameEnds" ).is(':checked')){
                nameSearchType = "name ends with";
            }

            else if($( "#unitNameContains" ).is(':checked')){
                nameSearchType = "name contains";
            }

            return nameSearchType;
    },

    getNameToSearch: function(){
        var nameToSearch;
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
       if(unitRadioChecked){
            /*nameToSearch = $( "#unitName" ).value;*/
            nameToSearch = document.getElementById("unitName").value;
        }

        else{
            /*nameToSearch = $( "#cardName" ).value; */
            nameToSearch = document.getElementById("cardName").value;
        }

        return nameToSearch;
    },

    getMaxPointCost: function(){
        var maxPointCost;
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        if(unitRadioChecked){
            maxPointCost = document.getElementById("maximumPointCostUnits").value;
        }

        else{
             maxPointCost = document.getElementById("maximumPointCostCards").value;
        }

        return maxPointCost;

    },

    getIncludeNeutrals: function(){
        var includeNeutrals;
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        if(unitRadioChecked){
            includeNeutrals = document.getElementById("includeNeutralsCheckboxUnits").value;
        }

        else{
           includeNeutrals = document.getElementById("includeNeutralsCheckboxCards").value;
        }
        includeNeutrals = " " + includeNeutrals;
        return includeNeutrals + " ";
    },

    getIncludeTypes: function(){
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        var includeList = " ";
        if(unitRadioChecked){
            if ($( "#includeShips").is(":checked")){
                includeList = includeList + "include ships";
            }

            if ($( "#includeSquadrons").is(":checked")){
                includeList = includeList + "include squadrons";
            }

            if ($( "#includeShipsAndSquadrons").is(":checked")){
                includeList = includeList + "include ships and squadrons";
            }
        }

        else{

            includeList = " include: "
            if ($( "#includeCommanders").is(":checked")){
                includeList = includeList + "commanders,";
            }

            if ($( "#includeUniques").is(":checked")){
                includeList = includeList + "uniques,";
            }

            if ($( "#includeModifications").is(":checked")){
                includeList = includeList + "modifications,";
            }

            if ($( "#includeDefenseRetrofit").is(":checked")){
                includeList = includeList + "defense retrofit,";
            }

            if ($( "#includeOffensiveRetrofit").is(":checked")){
                includeList = includeList + "offense retrofit,";
            }

            if ($( "#includeTurboLaser").is(":checked")){
                includeList = includeList + "turbo laser,";
            }

            if ($( "#includeIonCannon").is(":checked")){
                includeList = includeList + "ion cannon,";
            }

            if ($( "#includeOrdnance").is(":checked")){
                includeList = includeList + "ordnance,";
            }

            if ($( "#includeTitle").is(":checked")){
                includeList = includeList + "title,";
            }

            if ($( "#includeOfficer").is(":checked")){
                includeList = includeList + "officer,";
            }

            if ($( "#includeWeaponsTeam").is(":checked")){
                includeList = includeList + "weapons team,";
            }

            if ($( "#includeSupportTeam").is(":checked")){
                includeList = includeList + "support team,";
            }

            var includeList = includeList.substring(0, includeList.length-1);
        }

        return includeList;
    },

    onSearch: function(){
        var unitRadioChecked = $("#radioSearchUnits").is(":checked");
        var nameSearchType;
        var nameToSearch;
        var maxPointCost;
        var includeNeutrals;
        var includeList;
        nameSearchType = FleetBuilderPage.getNameSearchType();
        nameToSearch = FleetBuilderPage.getNameToSearch();
        maxPointCost = FleetBuilderPage.getMaxPointCost();
        includeNeutrals = FleetBuilderPage.getIncludeNeutrals();
        includeList = FleetBuilderPage.getIncludeTypes();
        if(unitRadioChecked){
            console.log("searched for units " + "name search type: " + nameSearchType + " name searched: " + nameToSearch + "max point cost: " + maxPointCost + "include neutrals: " + includeNeutrals + "included: " + includeList);
        }

        else{
            console.log("searched for cards " + "name search type: " + nameSearchType + " name searched: " + nameToSearch + "max point cost: " + maxPointCost +  "include neutrals: "+ includeNeutrals + "included" + includeList);
        }
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




}

