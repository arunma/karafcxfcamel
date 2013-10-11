package me.rerun.karafcxfcamel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("rest")
public interface RestService {


    @GET
    @Path("query/{queryString}")
    @Produces(MediaType.APPLICATION_JSON)
    public String sourceResultsFromTwoSources(@PathParam("queryString") String queryString);

}
