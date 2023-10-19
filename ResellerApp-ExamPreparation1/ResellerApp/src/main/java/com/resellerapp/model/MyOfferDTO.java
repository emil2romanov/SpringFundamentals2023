package com.resellerapp.model;

import com.resellerapp.model.entity.OfferEntity;
import com.resellerapp.model.enums.ConditionName;

public class MyOfferDTO extends BoughtOffersDTO{

    private ConditionName condition;
    private Long id;

    public MyOfferDTO() {
    }

    public MyOfferDTO(OfferEntity offer) {
        super(offer);
        id = offer.getId();
        condition = offer.getCondition().getName();
    }

    public ConditionName getCondition() {
        return condition;
    }

    public void setCondition(ConditionName condition) {
        this.condition = condition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
