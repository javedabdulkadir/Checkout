package com.checkout.simulator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PaymentObject {
        public Source source;
        public int amount;
        public String currency;
        public String processing_channel_id;
        public String reference;
        public Metadata metadata;
    }

