package com.easypost.service;

import com.easypost.exception.EasyPostException;
import com.easypost.http.Requestor;
import com.easypost.http.Requestor.RequestMethod;
import com.easypost.model.EndShipper;
import com.easypost.model.EndShipperCollection;
import com.easypost.utils.Utilities;

import java.util.HashMap;
import java.util.Map;

public class EndShipperService {
    private final EasyPostClient client;

    /**
     * EndShipperService constructor.
     * 
     * @param client The client object.
     */
    EndShipperService(EasyPostClient client) {
        this.client = client;
    }

    /**
     * Create EndShipper object from parameter map.
     *
     * @param params Map of EndShipper parameters.
     * @return EndShipper object.
     * @throws EasyPostException when the request fails.
     */
    public EndShipper create(final Map<String, Object> params) throws EasyPostException {
        Map<String, Object> wrappedParams = new HashMap<String, Object>();

        wrappedParams.put("address", params);

        String url = String.format("%s/%s/%s", client.getApiBase(), client.getApiVersion(), "end_shippers");

        return Requestor.request(RequestMethod.POST, url, wrappedParams, EndShipper.class, client);
    }

    /**
     * Retrieve EndShipper object from API.
     *
     * @param id ID of EndShipper to retrieve.
     * @return EndShipper object.
     * @throws EasyPostException when the request fails.
     */
    public EndShipper retrieve(final String id) throws EasyPostException {
        String url = String.format("%s/%s/%s/%s", client.getApiBase(), client.getApiVersion(), "end_shippers", id);

        return Requestor.request(RequestMethod.GET, url, null, EndShipper.class, client);
    }

    /**
     * List all EndShipper objects.
     *
     * @param params Map of parameters.
     * @return EndShipperCollection object.
     * @throws EasyPostException when the request fails.
     */
    public EndShipperCollection all(final Map<String, Object> params)
            throws EasyPostException {
        return Requestor.request(RequestMethod.GET,
                Utilities.classURL(EndShipper.class), params, EndShipperCollection.class, client);
    }

    /**
     * Update an EndShipper object.
     *
     * @param id     The ID of endshipper.
     * @param params Map of parameters.
     * @return EndShipper object.
     * @throws EasyPostException when the request fails.
     */
    public EndShipper update(final String id, final Map<String, Object> params) throws EasyPostException {
        Map<String, Object> wrappedParams = new HashMap<String, Object>();

        wrappedParams.put("address", params);

        String url = String.format("%s/%s/%s/%s", client.getApiBase(), client.getApiVersion(), "end_shippers", id);

        return Requestor.request(RequestMethod.PUT, url, wrappedParams, EndShipper.class, client);
    }
}
