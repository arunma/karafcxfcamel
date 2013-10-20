package me.rerun.karafcxfcamel.rest;

import me.rerun.karafcxfcamel.model.AgePhoneResult;
import me.rerun.karafcxfcamel.model.NameEmailResult;
import me.rerun.karafcxfcamel.service.base.AgePhoneService;
import me.rerun.karafcxfcamel.service.base.NameEmailService;
import me.rerun.karafcxfcamel.service.impl.AgePhoneServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestServiceImpl implements RestService {

    private static Logger logger= LoggerFactory.getLogger(AgePhoneServiceImpl.class);

    private NameEmailService nameEmailService;
    private AgePhoneService agePhoneService;

    public RestServiceImpl(){
    }

    //Do nothing. Camel intercepts and routes the requests
    public String sourceResultsFromTwoSources(String queryString) {
        return null;
    }


    public NameEmailResult getNameEmailResult(String queryString){
        logger.info("Invoking getNameEmailResult from RestServiceImpl");
        return nameEmailService.getNameAndEmail(queryString);
    }


    public AgePhoneResult getAgePhoneResult(String queryString){
        logger.info("Invoking getAgePhoneResult from RestServiceImpl");
        return agePhoneService.getAgePhoneResult(queryString);
    }

    public NameEmailService getNameEmailService() {
        return nameEmailService;
    }

    public AgePhoneService getAgePhoneService() {
        return agePhoneService;
    }

    public void setNameEmailService(NameEmailService nameEmailService) {
        this.nameEmailService = nameEmailService;
    }

    public void setAgePhoneService(AgePhoneService agePhoneService) {
        this.agePhoneService = agePhoneService;
    }
}
