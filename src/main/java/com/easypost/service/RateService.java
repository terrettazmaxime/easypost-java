package com.easypost.service;

import com.easypost.exception.EasyPostException;
import com.easypost.http.Requestor;
import com.easypost.http.Requestor.RequestMethod;
import com.easypost.model.Rate;
import com.easypost.utils.InternalUtilities;

public class RateService {
    private final EasyPostClient client;

    /**
     * RateService constructor.
     * 
     * @param client The client object.
     */
    RateService(EasyPostClient client) {
        this.client = client;
    }

    /**
     * Retrieve a Rate from the API.
     *
     * @param id ID of the Rate to retrieve.
     * @return Rate object.
     * @throws EasyPostException when the request fails.
     */
    public Rate retrieve(final String id) throws EasyPostException {
        Rate response;
        response = Requestor.request(RequestMethod.GET, InternalUtilities.instanceURL(Rate.class, id), null, Rate.class,
                client);

        return response;
    }
}
