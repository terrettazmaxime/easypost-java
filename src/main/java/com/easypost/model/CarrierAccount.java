package com.easypost.model;

import java.util.Map;
import lombok.Getter;

@Getter
public final class CarrierAccount extends EasyPostResource {
    private String object;
    private String type;
    private Fields fields;
    private boolean clone;
    private String readable;
    private String description;
    private String reference;
    private String billingType;
    private Map<String, Object> credentials;
    private Map<String, Object> testCredentials;
}
