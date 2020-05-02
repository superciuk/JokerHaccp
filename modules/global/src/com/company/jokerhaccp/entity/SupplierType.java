package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum SupplierType implements EnumClass<String> {

    food("food"),
    beer("beer"),
    cashAndCarry("cash and carry"),
    wine("wine"),
    greengrocer("greengrocer"),
    haccp("haccp");

    private String id;

    SupplierType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static SupplierType fromId(String id) {
        for (SupplierType at : SupplierType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}