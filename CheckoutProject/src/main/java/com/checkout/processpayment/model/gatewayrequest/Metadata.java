package com.checkout.processpayment.model.gatewayrequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Metadata{
    public String udf1;
    public String coupon_code;
    public int partner_id;
}