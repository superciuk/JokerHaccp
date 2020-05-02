package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Storage implements EnumClass<String> {

    frigorifero("frigorifero"),
    congelatore("congelatore"),
    dispensa("dispensa");

    private String id;

    Storage(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Storage fromId(String id) {
        for (Storage at : Storage.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}