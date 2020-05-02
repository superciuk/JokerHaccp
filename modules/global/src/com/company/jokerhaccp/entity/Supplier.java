package com.company.jokerhaccp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "JOKERHACCP_SUPPLIER")
@Entity(name = "jokerhaccp_Supplier")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = 7885149098043039843L;


    @Column(name = "NAME")
    protected String name;

    @Column(name = "ADDRESS")
    protected String address;

    @Column(name = "CAP")
    protected String cap;

    @Column(name = "CITY")
    protected String city;

    @Column(name = "PROVINCE")
    protected String province;

    @Column(name = "COUNTRY")
    protected String country;

    @Column(name = "VAT")
    protected String vat;

    @Column(name = "FISCAL_CODE")
    protected String fiscalCode;

    @Column(name = "PHONE")
    protected String phone;

    @Column(name = "EMAIL_ADDRESS")
    protected String emailAddress;

    @Column(name = "PEC")
    protected String pec;

    @Column(name = "SDI")
    protected String sdi;

    @Column(name = "SUPPLIER_TYPE")
    protected String supplierType;

    @Column(name = "PRODUCT_CATEGORY")
    protected String productCategory;

    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.DENY)
    @OneToMany(mappedBy = "supplier")
    protected List<Contact> contacts;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public ProductCategory getProductCategory() {
        return productCategory == null ? null : ProductCategory.fromId(productCategory);
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.getId();
    }

    public SupplierType getSupplierType() {
        return supplierType == null ? null : SupplierType.fromId(supplierType);
    }

    public void setSupplierType(SupplierType supplierType) {
        this.supplierType = supplierType == null ? null : supplierType.getId();
    }

    public String getSdi() {
        return sdi;
    }

    public void setSdi(String sdi) {
        this.sdi = sdi;
    }

    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}