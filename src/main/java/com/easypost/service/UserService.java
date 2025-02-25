package com.easypost.service;

import com.easypost.Constants;
import com.easypost.exception.EasyPostException;
import com.easypost.exception.General.FilteringError;
import com.easypost.http.Requestor;
import com.easypost.http.Requestor.RequestMethod;
import com.easypost.model.ApiKey;
import com.easypost.model.ApiKeys;
import com.easypost.model.Brand;
import com.easypost.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class UserService {
    private final EasyPostClient client;

    /**
     * UserService constructor.
     *
     * @param client The client object.
     */
    UserService(EasyPostClient client) {
        this.client = client;
    }

    /**
     * Retrieve a User from the API.
     *
     * @param id The ID of the User to retrieve.
     * @return User object.
     * @throws EasyPostException when the request fails.
     */
    public User retrieve(final String id) throws EasyPostException {
        String endpoint = "users/" + id;

        return Requestor.request(RequestMethod.GET, endpoint, null, User.class, client);
    }

    /**
     * Retrieve your User from the API.
     *
     * @return User object.
     * @throws EasyPostException when the request fails.
     */
    public User retrieveMe() throws EasyPostException {
        String endpoint = "users";

        return Requestor.request(RequestMethod.GET, endpoint, null, User.class, client);
    }

    /**
     * Create a User object with a map of parameters.
     *
     * @param params Map of User parameters.
     * @return User object.
     * @throws EasyPostException when the request fails.
     */
    public User create(final Map<String, Object> params) throws EasyPostException {
        Map<String, Object> wrappedParams = new HashMap<String, Object>();
        wrappedParams.put("user", params);

        String endpoint = "users";

        return Requestor.request(RequestMethod.POST, endpoint, wrappedParams, User.class, client);
    }

    /**
     * Update this User.
     *
     * @param id     The ID of user.
     * @param params Map of User parameters.
     * @return User object.
     * @throws EasyPostException when the request fails.
     */
    public User update(final String id, final Map<String, Object> params) throws EasyPostException {
        Map<String, Object> wrappedParams = new HashMap<String, Object>();
        wrappedParams.put("user", params);

        String endpoint = "users/" + id;

        return Requestor.request(RequestMethod.PUT, endpoint, wrappedParams, User.class, client);
    }

    /**
     * Delete this User.
     *
     * @param id The ID of the user.
     * @throws EasyPostException when the request fails.
     */
    public void delete(final String id) throws EasyPostException {
        String endpoint = "users/" + id;

        Requestor.request(RequestMethod.DELETE, endpoint, null, User.class, client);
    }

    /**
     * Get this User's API keys.
     *
     * @param id The ID of the user.
     * @return List of ApiKey objects.
     * @throws EasyPostException when the request fails.
     */
    public List<ApiKey> apiKeys(final String id) throws EasyPostException {
        ApiKeys parentKeys = client.apiKey.all();

        if (Objects.equals(id, parentKeys.getId())) {
            return parentKeys.getKeys();
        }

        for (int i = 0; i < parentKeys.getChildren().size(); i++) {
            if (id.equals(parentKeys.getChildren().get(i).getId())) {
                return parentKeys.getChildren().get(i).getKeys();
            }
        }

        throw new FilteringError(String.format(Constants.ErrorMessages.NO_OBJECT_FOUND, "API keys"));
    }

    /**
     * Update the user brand.
     *
     * @param id     The ID of user.
     * @param params Map of parameters.
     * @return Brand object.
     * @throws EasyPostException when the request fails.
     */
    public Brand updateBrand(final String id, final Map<String, Object> params) throws EasyPostException {
        Map<String, Object> wrappedParams = new HashMap<String, Object>();
        wrappedParams.put("brand", params);

        String endpoint = "users/" + id + "/brand";

        return Requestor.request(RequestMethod.PUT, endpoint, wrappedParams, Brand.class, client);
    }
}
