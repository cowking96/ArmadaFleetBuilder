
FleetBuilderPage = {
    startup: function(generatedURL) {

        this.baseUrl = generatedURL;

        //init widgets
        $( ".searchButton" ).button();
        $( ".advancedSearchButton" ).button();
        $( ".radioButtons" ).controlgroup();
        $( ".fleetAccordion" ).accordion();


    }
}