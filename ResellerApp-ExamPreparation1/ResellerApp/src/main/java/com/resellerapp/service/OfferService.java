package com.resellerapp.service;

import com.resellerapp.model.OfferCreateBindingModel;
import com.resellerapp.model.OfferHomeDTO;

public interface OfferService {

    OfferHomeDTO getOffersForHomePage();

    boolean create(OfferCreateBindingModel offerCreateBindingModel);

    void buy(Long id);
}
