package com.company.jokerhaccp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;

@Table(name = "JOKERHACCP_PREPARATION")
@Entity(name = "jokerhaccp_Preparation")
public class Preparation extends StandardEntity {
    private static final long serialVersionUID = -4079684434186966439L;

    @Temporal(TemporalType.DATE)
    @Column(name = "PREPARATION_DATE")
    protected Date preparationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPIRATION_DATE")
    protected Date expirationDate;

    @Lookup(type = LookupType.SCREEN, actions = "lookup")
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREPARATION_ID")
    protected PreparationPrototype preparation;

    @Column(name = "INTERNAL_LOT")
    protected String internalLot;

    @Column(name = "QUANTITY")
    protected Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getInternalLot() {
        return internalLot;
    }

    public void setInternalLot(String internalLot) {
        this.internalLot = internalLot;
    }

    public PreparationPrototype getPreparation() {
        return preparation;
    }

    public void setPreparation(PreparationPrototype preparation) {
        this.preparation = preparation;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getPreparationDate() {
        return preparationDate;
    }

    public void setPreparationDate(Date preparationDate) {
        this.preparationDate = preparationDate;
    }
}