package com.checkout.processpayment.model.gatewayresponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GatewayResponse {

        public String id;
        public String action_id;
        public int amount;
        public String currency;
        public boolean approved;
        public String status;
        public String auth_code;
        public String response_code;
        public String response_summary;
    }

