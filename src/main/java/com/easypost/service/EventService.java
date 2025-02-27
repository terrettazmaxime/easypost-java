package com.easypost.service;

import com.easypost.exception.EasyPostException;
import com.easypost.http.Requestor;
import com.easypost.http.Requestor.RequestMethod;
import com.easypost.model.Event;
import com.easypost.model.EventCollection;
import com.easypost.model.Payload;
import com.easypost.model.PayloadCollection;

import java.util.List;
import java.util.Map;

public class EventService {
    private final EasyPostClient client;

    /**
     * EventService constructor.
     *
     * @param client The client object.
     */
    EventService(EasyPostClient client) {
        this.client = client;
    }

    /**
     * Retrieve a Event from the API.
     *
     * @param id ID of the Event to retrieve
     * @return Event object
     * @throws EasyPostException when the request fails.
     */
    public Event retrieve(final String id) throws EasyPostException {
        String endpoint = "events/" + id;

        return Requestor.request(RequestMethod.GET, endpoint, null, Event.class, client);
    }

    /**
     * Get a list of Events.
     *
     * @param params A map of parameters to pass to the API.
     * @return EventCollection object
     * @throws EasyPostException when the request fails.
     */
    public EventCollection all(final Map<String, Object> params) throws EasyPostException {
        String endpoint = "events";

        return Requestor.request(RequestMethod.GET, endpoint, params, EventCollection.class, client);
    }

    /**
     * Retrieve all payloads.
     *
     * @param eventId The ID of event.
     * @return List of Payload objects.
     * @throws EasyPostException when the request fails.
     */
    public List<Payload> retrieveAllPayloads(final String eventId) throws EasyPostException {
        String endpoint = "events/" + eventId + "/payloads";

        PayloadCollection payloads =
                Requestor.request(RequestMethod.GET, endpoint, null, PayloadCollection.class,
                        client);

        return payloads.getPayloads();
    }

    /**
     * Retrieve a payload.
     *
     * @param eventId   The ID of event.
     * @param payloadId The ID of payload.
     * @return PayloadCollection object
     * @throws EasyPostException when the request fails.
     */
    public Payload retrievePayload(final String eventId, final String payloadId) throws EasyPostException {
        String endpoint = "events/" + eventId + "/payloads/" + payloadId;

        return Requestor.request(RequestMethod.GET, endpoint, null, Payload.class,
                client);
    }
}
