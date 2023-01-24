package com.checkout.processpayment.model.gatewayrequest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GatewayRequest {
        public Source source;
        public int amount;
        public String currency;
        public String processing_channel_id;
        public String reference;
        public Metadata metadata;
    }

