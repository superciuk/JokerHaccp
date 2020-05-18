package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ProductCategory implements EnumClass<String> {

    salumi("salumi"),
    formaggi("formaggi"),
    latticini("latticini"),
    pesce("pesce"),
    carne("carne"),
    bibite("bibite"),
    panini("panini");

    private String id;

    ProductCategory(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ProductCategory fromId(String id) {
        for (ProductCategory at : ProductCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}