package com.checkout.processpayment.service;

import com.checkout.processpayment.model.bankresponse.BankResponse;
import com.checkout.processpayment.model.gatewayrequest.GatewayRequest;
import com.checkout.processpayment.model.gatewayresponse.GatewayResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public class AcquiringBankService {


    @Value("${acquiring.bank.url}")
     String bankURL;

    public GatewayResponse postPayment(GatewayRequest paymentObject) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        BankResponse bankResponse = restTemplate.postForObject("http://localhost:9090/api/v1/acceptpayment", paymentObject, BankResponse.class);
        GatewayResponse gatewayResponse=new GatewayResponse();
        gatewayResponse.setId(bankResponse.getId());
        gatewayResponse.setAction_id(bankResponse.getAction_id());
        gatewayResponse.setAmount(bankResponse.getAmount());
        gatewayResponse.setCurrency(bankResponse.getCurrency());
        gatewayResponse.setApproved(bankResponse.isApproved());
        gatewayResponse.setStatus(bankResponse.getStatus());
        gatewayResponse.setAuth_code(bankResponse.getAuth_code());
        gatewayResponse.setResponse_code(bankResponse.getResponse_code());
        gatewayResponse.setResponse_summary(bankResponse.getResponse_summary());

        return gatewayResponse;
    }
    public BankResponse retreivePayment(String paymentId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        BankResponse bankResponse = restTemplate.getForObject("http://localhost:9090/api/v1/getpayment/"+paymentId, BankResponse.class);
        return bankResponse;
    }


}
