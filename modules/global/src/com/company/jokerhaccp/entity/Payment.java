package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Payment implements EnumClass<String> {

    cartaDiCredito("carta Di Credito"),
    bancomat("bancomat"),
    bonifico("bonifico"),
    assegno("assegno"),
    contanti("contanti");

    private String id;

    Payment(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Payment fromId(String id) {
        for (Payment at : Payment.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}