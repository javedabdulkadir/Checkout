package com.checkout.processpayment.model.bankresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BankResponse {
    public String id;
    public String action_id;
    public int amount;
    public String currency;
    public boolean approved;
    public String status;
    public String auth_code;
    public String response_code;
    public String response_summary;
    @JsonProperty("3ds")
    public _3ds _3ds;
    public Risk risk;
    public Source source;
    public Customer customer;
    public Date processed_on;
    public String reference;
    public Processing processing;
    public String eci;
    public String scheme_id;
    public Links links;
}
