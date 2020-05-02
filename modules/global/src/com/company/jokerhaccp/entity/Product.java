package com.company.jokerhaccp.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "JOKERHACCP_PRODUCT")
@Entity(name = "jokerhaccp_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -3811745926984632171L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PRODUCT_CATEGORY")
    protected String productCategory;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "UNIT_PRICE")
    protected BigDecimal unitPrice;

    @Column(name = "STORAGE")
    protected String storage;

    @Column(name = "STORAGE_TEMPERATURE")
    protected String storageTemperature;

    @JoinTable(name = "JOKERHACCP_PRODUCT_SUPPLIER_LINK",
            joinColumns = @JoinColumn(name = "PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUPPLIER_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    protected List<Supplier> suppliers;

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public StorageTemperature getStorageTemperature() {
        return storageTemperature == null ? null : StorageTemperature.fromId(storageTemperature);
    }

    public void setStorageTemperature(StorageTemperature storageTemperature) {
        this.storageTemperature = storageTemperature == null ? null : storageTemperature.getId();
    }

    public Storage getStorage() {
        return storage == null ? null : Storage.fromId(storage);
    }

    public void setStorage(Storage storage) {
        this.storage = storage == null ? null : storage.getId();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ProductCategory getProductCategory() {
        return productCategory == null ? null : ProductCategory.fromId(productCategory);
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory == null ? null : productCategory.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}