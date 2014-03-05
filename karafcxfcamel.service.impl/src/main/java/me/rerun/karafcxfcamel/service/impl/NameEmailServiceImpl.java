package me.rerun.karafcxfcamel.service.impl;

import me.rerun.karafcxfcamel.model.NameEmailResult;
import me.rerun.karafcxfcamel.service.base.NameEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameEmailServiceImpl implements NameEmailService {

    private static Logger logger= LoggerFactory.getLogger(NameEmailServiceImpl.class);

    public NameEmailServiceImpl() {
    }

    public NameEmailResult getNameAndEmail(String queryString){

        return new NameEmailResult("Arun", "arun@arunma.com");

    }

}
