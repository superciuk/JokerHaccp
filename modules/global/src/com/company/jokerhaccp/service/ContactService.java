package com.company.jokerhaccp.service;

public interface ContactService {
    String NAME = "jokerhaccp_ContactService";

    boolean createContact(String name, String surname, String phone, String personalEmailAddress, String note, String supplierId);

    boolean updateContact(String id, String name, String surname, String phone, String personalEmailAddress, String note, String supplierId);

    boolean deleteContact(String id);

}