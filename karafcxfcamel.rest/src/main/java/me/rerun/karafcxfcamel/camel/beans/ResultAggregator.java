package me.rerun.karafcxfcamel.camel.beans;

import me.rerun.karafcxfcamel.model.AgePhoneResult;
import me.rerun.karafcxfcamel.model.ConsolidatedSearchResult;
import me.rerun.karafcxfcamel.model.NameEmailResult;
import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultAggregator implements AggregationStrategy {

    private static Logger logger= LoggerFactory.getLogger(ResultAggregator.class);

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {


        ConsolidatedSearchResult consolidatedSearchResult=null;
        if (oldExchange==null){
            consolidatedSearchResult=new ConsolidatedSearchResult();
        }
        else{
            consolidatedSearchResult=oldExchange.getIn().getBody(ConsolidatedSearchResult.class);
        }


        NameEmailResult nameEmailResult=newExchange.getIn().getBody(NameEmailResult.class);
        AgePhoneResult agePhoneResult=newExchange.getIn().getBody(AgePhoneResult.class);

        if (nameEmailResult!=null){
            consolidatedSearchResult.setNameEmailResult(nameEmailResult);
        }

        if (agePhoneResult!=null){
            consolidatedSearchResult.setAgePhoneResult(agePhoneResult);
        }

        newExchange.getIn().setBody(consolidatedSearchResult);

        return newExchange;
    }
}
