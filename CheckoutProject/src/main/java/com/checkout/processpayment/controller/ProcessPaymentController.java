package com.checkout.processpayment.controller;

import com.checkout.processpayment.model.bankresponse.BankResponse;
import com.checkout.processpayment.model.gatewayrequest.GatewayRequest;
import com.checkout.processpayment.model.gatewayresponse.GatewayResponse;
import com.checkout.processpayment.service.AcquiringBankService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProcessPaymentController {



    @PostMapping(path = "payment", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GatewayResponse> acceptPayment(@RequestBody com.fasterxml.jackson.databind.JsonNode payment ) {
        GatewayResponse gatewayResponse=new GatewayResponse();
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            GatewayRequest gatewayRequest=mapper.convertValue(payment, GatewayRequest.class);
            AcquiringBankService acquiringBankService=new AcquiringBankService();
            gatewayResponse=acquiringBankService.postPayment(gatewayRequest);

        }catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<GatewayResponse>(gatewayResponse, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET ,value = "retreivepayment/{paymentId}"  , produces =  MediaType.APPLICATION_JSON_VALUE)
    public BankResponse retreivepayment(@PathVariable("paymentId") String paymentId ) {
        System.out.println("paymentIdpaymentIdpaymentId="+paymentId);
        AcquiringBankService acquiringBankService=new AcquiringBankService();
        BankResponse bankResponse=acquiringBankService.retreivePayment(paymentId);
        return bankResponse;
    }
}
