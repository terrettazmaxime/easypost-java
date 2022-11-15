package com.easypost.model;

import java.util.List;
import java.util.Map;

public final class Order extends EasyPostResource {
    private String service;
    private String reference;
    private Boolean isReturn;
    private Address toAddress;
    private Address buyerAddress;
    private Address fromAddress;
    private Address returnAddress;
    private CustomsInfo customsInfo;
    private List<Shipment> shipments;
    private List<Rate> rates;
    private Map<String, Object> options;
    private List<ShipmentMessage> messages;
    private List<CarrierAccount> carrierAccounts;

    /**
     * Get the buyer address of the Order.
     *
     * @return the buyer address of the Order.
     */
    public Address getBuyerAddress() {
        return buyerAddress;
    }

    /**
     * Set the buyer address of the Order.
     *
     * @param buyerAddress the buyer address of the Order.
     */
    public void setBuyerAddress(final Address buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    /**
     * Get the list of carrier accounts of the Order.
     *
     * @return List of CarrierAccount object.
     */
    public List<CarrierAccount> getCarrierAccounts() {
        return carrierAccounts;
    }

    /**
     * Set the carrier accounts of the Order.
     *
     * @param carrierAccounts List of CarrierAccount objects
     */
    public void setCarrierAccounts(List<CarrierAccount> carrierAccounts) {
        this.carrierAccounts = carrierAccounts;
    }

    /**
     * Get the customs info of the Order.
     *
     * @return CustomsInfo object.
     */
    public CustomsInfo getCustomsInfo() {
        return customsInfo;
    }

    /**
     * Set the customs info of the Order.
     *
     * @param customsInfo CustomsInfo object.
     */
    public void setCustomsInfo(final CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
    }

    /**
     * Get the from address of the Order.
     *
     * @return the from address of the Order.
     */
    public Address getFromAddress() {
        return fromAddress;
    }

    /**
     * Set the from address of the Order.
     *
     * @param fromAddress the from address of the Order.
     */
    public void setFromAddress(final Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * Get whether the order is a return.
     *
     * @return true if the order is a return.
     */
    public Boolean getIsReturn() {
        return isReturn;
    }

    /**
     * Set whether the order is a return.
     *
     * @param isReturn true if the order is a return.
     */
    public void setIsReturn(final Boolean isReturn) {
        this.isReturn = isReturn;
    }

    /**
     * Get the messages of the Order.
     *
     * @return List of ShipmentMessage objects.
     */
    public List<ShipmentMessage> getMessages() {
        return messages;
    }

    /**
     * Set the messages of the Order.
     *
     * @param messages List of ShipmentMessage objects.
     */
    public void setMessages(final List<ShipmentMessage> messages) {
        this.messages = messages;
    }

    /**
     * Get the options of the Order.
     *
     * @return map of options.
     */
    public Map<String, Object> getOptions() {
        return options;
    }

    /**
     * Set the options of the Order.
     *
     * @param options map of options.
     */
    public void setOptions(final Map<String, Object> options) {
        this.options = options;
    }

    /**
     * Get the rates of the Order.
     *
     * @return List of Rate objects.
     */
    public List<Rate> getRates() {
        return rates;
    }

    /**
     * Set the rates of the Order.
     *
     * @param rates List of Rate objects.
     */
    public void setRates(final List<Rate> rates) {
        this.rates = rates;
    }

    /**
     * Get the reference of the Order.
     *
     * @return the reference of the Order.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Set the reference of the Order.
     *
     * @param reference the reference of the Order.
     */
    public void setReference(final String reference) {
        this.reference = reference;
    }

    /**
     * Get the return address of the Order.
     *
     * @return the return address of the Order.
     */
    public Address getReturnAddress() {
        return returnAddress;
    }

    /**
     * Set the return address of the Order.
     *
     * @param returnAddress the return address of the Order.
     */
    public void setReturnAddress(final Address returnAddress) {
        this.returnAddress = returnAddress;
    }

    /**
     * Get the service of the Order.
     *
     * @return the service of the Order.
     */
    public String getService() {
        return service;
    }

    /**
     * Set the service of the Order.
     *
     * @param service the service of the Order.
     */
    public void setService(final String service) {
        this.service = service;
    }

    /**
     * Get the to address of the Order.
     *
     * @return the to address of the Order.
     */
    public Address getToAddress() {
        return toAddress;
    }

    /**
     * Set the to address of the Order.
     *
     * @param toAddress the to address of the Order.
     */
    public void setToAddress(final Address toAddress) {
        this.toAddress = toAddress;
    }

    /**
     * Get the shipments of the Order.
     *
     * @return List of Shipment objects.
     */
    public List<Shipment> getShipments() {
        return shipments;
    }

    /**
     * Set the shipments of the Order.
     *
     * @param shipments List of Shipment objects.
     */
    public void setShipments(final List<Shipment> shipments) {
        this.shipments = shipments;
    }
}
