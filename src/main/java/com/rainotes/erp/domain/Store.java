package com.rainotes.erp.domain;

public class Store {
    private Integer storeId;

    private Integer stockman;

    private String name;

    private String address;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStockman() {
        return stockman;
    }

    public void setStockman(Integer stockman) {
        this.stockman = stockman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}