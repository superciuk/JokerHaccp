package com.company.jokerhaccp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

import java.util.List;

@Table(name = "JOKERHACCP_PREPARATION_Prototype")
@Entity(name = "jokerhaccp_Preparation_Prototype")
public class PreparationPrototype extends StandardEntity {
    private static final long serialVersionUID = -4079684434186966439L;

    @Column(name = "NAME")
    protected String name;

    @JoinTable(name = "JOKERHACCP_PREPARATION_PROTOTYPE_PRODUCT_LINK",
            joinColumns = @JoinColumn(name = "PREPARATION_PROTOTYPE_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    @OnDeleteInverse(DeletePolicy.DENY)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    protected List<Product> ingredients;

    @Column(name = "RONER")
    protected Boolean roner;

    @Column(name = "RONER_TIME_IN_MINUTES")
    protected Integer ronerTimeInMinutes;

    @Column(name = "BLAST_CHILLER")
    protected Boolean blastChiller;

    @Column(name = "BLAST_CHILLER_TIME_IN_MINUTES")
    protected Integer blastChillerTimeInMinutes;

    @Column(name = "VACUUM_PACKED")
    protected Boolean vacuumPacked;

    @Column(name = "STORAGE_TEMPERATURE")
    protected String storageTemperature;

    @Column(name = "STORAGE_TIME_IN_DAYS")
    protected Integer storageTimeInDays;

    public Integer getStorageTimeInDays() {
        return storageTimeInDays;
    }

    public void setStorageTimeInDays(Integer storageTimeInDays) {
        this.storageTimeInDays = storageTimeInDays;
    }

    public StorageTemperature getStorageTemperature() {
        return storageTemperature == null ? null : StorageTemperature.fromId(storageTemperature);
    }

    public void setStorageTemperature(StorageTemperature storageTemperature) {
        this.storageTemperature = storageTemperature == null ? null : storageTemperature.getId();
    }

    public Boolean getVacuumPacked() {
        return vacuumPacked;
    }

    public void setVacuumPacked(Boolean vacuumPacked) {
        this.vacuumPacked = vacuumPacked;
    }

    public Integer getBlastChillerTimeInMinutes() {
        return blastChillerTimeInMinutes;
    }

    public void setBlastChillerTimeInMinutes(Integer blastChillerTimeInMinutes) {
        this.blastChillerTimeInMinutes = blastChillerTimeInMinutes;
    }

    public Boolean getBlastChiller() {
        return blastChiller;
    }

    public void setBlastChiller(Boolean blastChiller) {
        this.blastChiller = blastChiller;
    }

    public Integer getRonerTimeInMinutes() {
        return ronerTimeInMinutes;
    }

    public void setRonerTimeInMinutes(Integer ronerTimeInMinutes) {
        this.ronerTimeInMinutes = ronerTimeInMinutes;
    }

    public Boolean getRoner() {
        return roner;
    }

    public void setRoner(Boolean roner) {
        this.roner = roner;
    }

    public List<Product> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Product> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}