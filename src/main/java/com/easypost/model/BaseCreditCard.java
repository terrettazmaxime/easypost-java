package com.easypost.model;

/**
 * BaseCreditCard is a model class that represents the base of any credit card.
 *
 * @deprecated Use {@link com.easypost.model.PaymentMethodObject} instead.
 * Deprecated: v5.5.0 - v7.0.0
 */
@Deprecated
public class BaseCreditCard extends EasyPostResource {
    private String object;
    private String name;
    private String last4;
    private String expMonth;
    private String expYear;
    private String brand;

    /**
     * Get the brand of this CreditCard object.
     *
     * @return the brand of this CreditCard.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set the brand of this CreditCard object.
     *
     * @param brand the brand of this CreditCard.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Get the expMonth of this CreditCard object.
     *
     * @return the expMonth of this CreditCard.
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Set the expMonth of this CreditCard object.
     *
     * @param expMonth the expMonth of this CreditCard.
     */
    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    /**
     * Get the expYear of this CreditCard object.
     *
     * @return the expYear of this CreditCard.
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Set the expYear of this CreditCard object.
     *
     * @param expYear the expYear of this CreditCard.
     */
    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    /**
     * Get the last 4 digits of this CreditCard object.
     *
     * @return the last 4 digits of this CreditCard.
     */
    public String getLast4() {
        return last4;
    }

    /**
     * Set the last 4 digits of this CreditCard object.
     *
     * @param last4 the last 4 digits of this CreditCard.
     */
    public void setLast4(String last4) {
        this.last4 = last4;
    }

    /**
     * Get the name of this CreditCard object.
     *
     * @return the name of this CreditCard.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of this CreditCard object.
     *
     * @param name the name of this CreditCard.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the object of this CreditCard object.
     *
     * @return the object of this CreditCard.
     */
    public String getObject() {
        return object;
    }

    /**
     * Set the object of this CreditCard object.
     *
     * @param object the object of this CreditCard.
     */
    public void setObject(String object) {
        this.object = object;
    }
}
