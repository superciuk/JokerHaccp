package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum PurchaseDocument implements EnumClass<String> {

    ddt("ddt"),
    fattura("fattura"),
    proForma("pro forma"),
    scontrino("scontrino"),
    nulla("nulla");

    private String id;

    PurchaseDocument(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PurchaseDocument fromId(String id) {
        for (PurchaseDocument at : PurchaseDocument.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}