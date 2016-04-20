package com.arbitragestock.arbitragestock.model;

/**
 * Created by tanglin on 16/4/20.
 */
public class Stock {
    private String name;
    private String code;
    private String buyPrice;
    private String sellPrice;
    private String riseFall;
    private String currentPrice;
    private String netWorthEstimate;
    private String newWorthLastNight;
    private String indexNumber;
    private String indexNumberRiseFall;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getRiseFall() {
        return riseFall;
    }

    public void setRiseFall(String riseFall) {
        this.riseFall = riseFall;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getNetWorthEstimate() {
        return netWorthEstimate;
    }

    public void setNetWorthEstimate(String netWorthEstimate) {
        this.netWorthEstimate = netWorthEstimate;
    }

    public String getNewWorthLastNight() {
        return newWorthLastNight;
    }

    public void setNewWorthLastNight(String newWorthLastNight) {
        this.newWorthLastNight = newWorthLastNight;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumberRiseFall() {
        return indexNumberRiseFall;
    }

    public void setIndexNumberRiseFall(String indexNumberRiseFall) {
        this.indexNumberRiseFall = indexNumberRiseFall;
    }
}
