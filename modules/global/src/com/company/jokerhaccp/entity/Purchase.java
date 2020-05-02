package com.company.jokerhaccp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "JOKERHACCP_PURCHASE")
@Entity(name = "jokerhaccp_Purchase")
public class Purchase extends StandardEntity {
    private static final long serialVersionUID = -4523121354768693596L;


    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;


    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    protected Product product;

    @Lookup(type = LookupType.DROPDOWN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    protected Supplier supplier;

    @Column(name = "LOT")
    protected String lot;

    @Column(name = "QUANTITY")
    protected BigDecimal quantity;

    @Column(name = "UNIT")
    protected String unit;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Column(name = "PAYMENT")
    protected String payment;

    @Column(name = "PURCHASE_DOCUMENT")
    protected String purchaseDocument;

    @Column(name = "PURCHASE_DOCUMENT_ID")
    protected String purchaseDocumentId;

    @Column(name = "NOTE")
    protected String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPurchaseDocumentId() {
        return purchaseDocumentId;
    }

    public void setPurchaseDocumentId(String purchaseDocumentId) {
        this.purchaseDocumentId = purchaseDocumentId;
    }

    public PurchaseDocument getPurchaseDocument() {
        return purchaseDocument == null ? null : PurchaseDocument.fromId(purchaseDocument);
    }

    public void setPurchaseDocument(PurchaseDocument purchaseDocument) {
        this.purchaseDocument = purchaseDocument == null ? null : purchaseDocument.getId();
    }

    public Payment getPayment() {
        return payment == null ? null : Payment.fromId(payment);
    }

    public void setPayment(Payment payment) {
        this.payment = payment == null ? null : payment.getId();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Unit getUnit() {
        return unit == null ? null : Unit.fromId(unit);
    }

    public void setUnit(Unit unit) {
        this.unit = unit == null ? null : unit.getId();
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}