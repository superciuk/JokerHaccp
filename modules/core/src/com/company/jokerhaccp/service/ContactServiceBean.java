package com.company.jokerhaccp.service;

import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(ContactService.NAME)
public class ContactServiceBean implements ContactService {

    @Inject
    private DataManager dataManager;

    @Inject
    private Metadata metadata;

    @Override
    public boolean createContact(String name, String surname, String phone, String personalEmailAddress, String note, String supplierId) {


        return true;

    }

    @Override
    public boolean updateContact(String id, String name, String surname, String phone, String personalEmailAddress, String note, String supplierId) {

        return true;

    }

    @Override
    public boolean deleteContact(String id) {

        return true;

    }

}