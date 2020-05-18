package com.company.jokerhaccp.web.screens.contact;
import com.haulmont.cuba.gui.screen.*;
import com.company.jokerhaccp.entity.Contact;

@UiController("jokerhaccp_Contact.browse")
@UiDescriptor("contact-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class ContactBrowse extends MasterDetailScreen<Contact> {
}