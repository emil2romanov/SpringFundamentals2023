package com.resellerapp.model.entity;

import com.resellerapp.model.OfferCreateBindingModel;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {

    @Length(min = 2, max = 50)
    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @Positive
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "condition_id", nullable = false)
    private ConditionEntity condition;

    @ManyToOne
    @NotNull
    private UserEntity createdBy;

    @ManyToOne
    private UserEntity boughtBy;

    public OfferEntity() {
    }

    public OfferEntity(OfferCreateBindingModel offerCreateBindingModel, ConditionEntity condition, UserEntity createdBy) {
        description = offerCreateBindingModel.getDescription();
        price = offerCreateBindingModel.getPrice();
        this.condition = condition;
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ConditionEntity getCondition() {
        return condition;
    }

    public void setCondition(ConditionEntity condition) {
        this.condition = condition;
    }

    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public UserEntity getBoughtBy() {
        return boughtBy;
    }

    public void setBoughtBy(UserEntity boughtBy) {
        this.boughtBy = boughtBy;
    }
}
