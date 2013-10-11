package me.rerun.karafcxfcamel.camel.beans;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class RestToBeanRouter extends RouteBuilder {


    @Override
    public void configure() throws Exception {

        from ("cxfrs://bean://rsServer")
                .multicast()
                .parallelProcessing()
                .aggregationStrategy(new ResultAggregator())
                .beanRef("restServiceImpl", "getNameEmailResult")
                .beanRef("restServiceImpl", "getAgePhoneResult")
                .end()
                .marshal().json(JsonLibrary.Jackson)
                .to("log://camelLogger?level=DEBUG");
    }
}
