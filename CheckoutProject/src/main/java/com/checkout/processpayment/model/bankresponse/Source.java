package com.checkout.processpayment.model.bankresponse;

import com.checkout.processpayment.model.BillingAddress;

public class Source{
    public String type;
    public String id;
    public BillingAddress billing_address;
    public Phone phone;
    public String last4;
    public String fingerprint;
    public String bin;
}
