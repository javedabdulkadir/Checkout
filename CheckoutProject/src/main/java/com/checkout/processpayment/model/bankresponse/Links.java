package com.checkout.processpayment.model.bankresponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links{
    public Self self;
    public Action action;
    @JsonProperty("void")
    public Void myvoid;
    public Capture capture;
}