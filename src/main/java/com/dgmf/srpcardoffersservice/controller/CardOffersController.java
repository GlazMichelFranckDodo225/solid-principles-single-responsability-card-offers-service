package com.dgmf.srpcardoffersservice.controller;

import com.dgmf.srpcardoffersservice.model.CardOffersRequest;
import com.dgmf.srpcardoffersservice.model.CardOffersResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardOffersController {
    public CardOffersResponse getOffers(CardOffersRequest request) {
        // 1 - Get the Request from the Client
        // 2 - Validate the Request
        if(request == null) {
            // Handle exception
        }

        if(request.getCardNum() == null) {
            // Handle exception
        }

        // 3 - Write the Business logic, like :
        // - Card offers expired
        // - Get the list of Cards
        // - Apply the logic to get valid offers
        // - etc...

        // 4 - Communicate with Backend Systems, like :
        // - Database
        // - Service
        // - File
        // - etc...

        // 5 - Response logics

        return null;
    }
}
