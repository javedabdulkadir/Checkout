package com.checkout.processpayment.model.gatewayrequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Source{
    public String type;
    public String token;
}
