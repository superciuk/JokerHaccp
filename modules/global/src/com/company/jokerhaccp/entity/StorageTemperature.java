package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum StorageTemperature implements EnumClass<String> {

    piuQuattro("+4/+8"),
    menoDiciotto("-18"),
    temperaturaAmbiente("Temperatura Ambiente");

    private String id;

    StorageTemperature(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static StorageTemperature fromId(String id) {
        for (StorageTemperature at : StorageTemperature.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}