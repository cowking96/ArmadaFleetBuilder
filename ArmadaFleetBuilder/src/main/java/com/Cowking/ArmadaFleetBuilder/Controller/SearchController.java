package com.Cowking.ArmadaFleetBuilder.Controller;

import com.Cowking.ArmadaFleetBuilder.Service.CardService;
import com.Cowking.ArmadaFleetBuilder.Service.FleetBuilderService;
import com.Cowking.ArmadaFleetBuilder.Service.UnitService;
import com.Cowking.ArmadaFleetBuilder.Util.CardSearchInfo;
import com.Cowking.ArmadaFleetBuilder.Util.UnitSearchInfo;
import com.Cowking.ArmadaFleetBuilder.Model.Unit;
import com.Cowking.ArmadaFleetBuilder.Model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class SearchController {

    private static final String SEARCH_URL_UNITS = "/units";
    private static final String SEARCH_URL_CARDS = "/cards";
    private static final Logger LOG = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    private CardService cardService;
    private UnitService unitService;
    private FleetBuilderService fleetBuilderService;

    @Autowired
    public SearchController(CardService cardService, UnitService unitService, FleetBuilderService fleetBuilderService) {
        this.cardService = cardService;
        this.unitService = unitService;
        this.fleetBuilderService = fleetBuilderService;
    }

    @RequestMapping(value = SEARCH_URL_UNITS, method = RequestMethod.POST)
    public ResponseEntity<?> search(UnitSearchInfo unitSearchInfo, UnitService unitService) {
        System.out.println("this is a test of the unit search");
        try {

            Iterable<Unit> units = unitService.findUnits(unitSearchInfo);

            LOG.debug("searched for units");

            return new ResponseEntity<Iterable<Unit>>(units, HttpStatus.OK);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = SEARCH_URL_CARDS, method = RequestMethod.POST)
    public ResponseEntity<?> search(CardSearchInfo cardSearchInfo,CardService cardService) {
        System.out.println("this is a test of the card search");

        LOG.debug("searched for cards");
        try {

            Iterable<Card> cards = cardService.findCards(cardSearchInfo);

            LOG.debug("searched for units");

            return new ResponseEntity<Iterable<Card>>(cards, HttpStatus.OK);

        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
