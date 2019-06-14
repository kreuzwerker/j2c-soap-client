package com.springboot.soapclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import movies.wsdl.*;

public class MovieClient extends WebServiceGatewaySupport{

    private static final Logger log = LoggerFactory.getLogger(MovieClient.class);

    public GetMovieByIdResponse GetMovieById(Long id)
    {
        GetMovieByIdRequest request = new GetMovieByIdRequest();
        request.setMovieId(id);

        log.info("Requesting Movie By id= " + id);
		return (GetMovieByIdResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}

