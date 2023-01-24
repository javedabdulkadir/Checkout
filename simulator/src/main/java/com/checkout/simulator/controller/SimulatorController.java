package com.checkout.simulator.controller;

import com.checkout.simulator.model.PaymentObject;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
@Validated
@Slf4j
public class SimulatorController {


    @RequestMapping(method = RequestMethod.GET ,value = "getpayment/{paymentId}"  , produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPayment(@PathVariable("paymentId") String paymentId ) {
        return ResponseEntity.status(HttpStatus.OK).body("{\n" +
                "  \"id\": \"pay_mbabizu24mvu3mela5njyhpit4\",\n" +
                "  \"action_id\": \"act_mbabizu24mvu3mela5njyhpit4\",\n" +
                "  \"amount\": 6540,\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"approved\": true,\n" +
                "  \"status\": \"Authorized\",\n" +
                "  \"auth_code\": \"770687\",\n" +
                "  \"response_code\": \"10000\",\n" +
                "  \"response_summary\": \"Approved\",\n" +
                "  \"3ds\": {\n" +
                "    \"downgraded\": true,\n" +
                "    \"enrolled\": \"N\"\n" +
                "  },\n" +
                "  \"risk\": {\n" +
                "    \"flagged\": true\n" +
                "  },\n" +
                "  \"source\": {\n" +
                "    \"type\": \"card\",\n" +
                "    \"id\": \"src_nwd3m4in3hkuddfpjsaevunhdy\",\n" +
                "    \"billing_address\": {\n" +
                "      \"address_line1\": \"Checkout.com\",\n" +
                "      \"address_line2\": \"90 Tottenham Court Road\",\n" +
                "      \"city\": \"London\",\n" +
                "      \"state\": \"London\",\n" +
                "      \"zip\": \"W1T 4TJ\",\n" +
                "      \"country\": \"GB\"\n" +
                "    },\n" +
                "    \"phone\": {\n" +
                "      \"country_code\": \"+1\",\n" +
                "      \"number\": \"415 555 2671\"\n" +
                "    },\n" +
                "    \"last4\": \"4242\",\n" +
                "    \"fingerprint\": \"F31828E2BDABAE63EB694903825CDD36041CC6ED461440B81415895855502832\",\n" +
                "    \"bin\": \"424242\"\n" +
                "  },\n" +
                "  \"customer\": {\n" +
                "    \"id\": \"cus_udst2tfldj6upmye2reztkmm4i\",\n" +
                "    \"email\": \"brucewayne@gmail.com\",\n" +
                "    \"name\": \"Bruce Wayne\"\n" +
                "  },\n" +
                "  \"processed_on\": \"2019-09-10T10:11:12Z\",\n" +
                "  \"reference\": \"ORD-5023-4E89\",\n" +
                "  \"processing\": {\n" +
                "    \"retrieval_reference_number\": \"909913440644\",\n" +
                "    \"acquirer_transaction_id\": \"440644309099499894406\"\n" +
                "  },\n" +
                "  \"eci\": \"06\",\n" +
                "  \"scheme_id\": \"489341065491658\",\n" +
                "  \"links\": {\n" +
                "    \"self\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4\"\n" +
                "    },\n" +
                "    \"action\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/actions\"\n" +
                "    },\n" +
                "    \"void\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/captures\"\n" +
                "    },\n" +
                "    \"capture\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/voids\"\n" +
                "    }\n" +
                "  }\n" +
                "}");

    }


    @PostMapping (path = "acceptpayment", consumes =MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> acceptPayment(@RequestBody com.fasterxml.jackson.databind.JsonNode payload ) {


        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

            PaymentObject payment=mapper.convertValue(payload,PaymentObject.class);
            System.out.println("Amout="+payment.getAmount());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.OK).body("{\n" +
                "  \"id\": \"pay_mbabizu24mvu3mela5njyhpit4\",\n" +
                "  \"action_id\": \"act_mbabizu24mvu3mela5njyhpit4\",\n" +
                "  \"amount\": 6540,\n" +
                "  \"currency\": \"USD\",\n" +
                "  \"approved\": true,\n" +
                "  \"status\": \"Authorized\",\n" +
                "  \"auth_code\": \"770687\",\n" +
                "  \"response_code\": \"10000\",\n" +
                "  \"response_summary\": \"Approved\",\n" +
                "  \"3ds\": {\n" +
                "    \"downgraded\": true,\n" +
                "    \"enrolled\": \"N\"\n" +
                "  },\n" +
                "  \"risk\": {\n" +
                "    \"flagged\": true\n" +
                "  },\n" +
                "  \"source\": {\n" +
                "    \"type\": \"card\",\n" +
                "    \"id\": \"src_nwd3m4in3hkuddfpjsaevunhdy\",\n" +
                "    \"billing_address\": {\n" +
                "      \"address_line1\": \"Checkout.com\",\n" +
                "      \"address_line2\": \"90 Tottenham Court Road\",\n" +
                "      \"city\": \"London\",\n" +
                "      \"state\": \"London\",\n" +
                "      \"zip\": \"W1T 4TJ\",\n" +
                "      \"country\": \"GB\"\n" +
                "    },\n" +
                "    \"phone\": {\n" +
                "      \"country_code\": \"+1\",\n" +
                "      \"number\": \"415 555 2671\"\n" +
                "    },\n" +
                "    \"last4\": \"4242\",\n" +
                "    \"fingerprint\": \"F31828E2BDABAE63EB694903825CDD36041CC6ED461440B81415895855502832\",\n" +
                "    \"bin\": \"424242\"\n" +
                "  },\n" +
                "  \"customer\": {\n" +
                "    \"id\": \"cus_udst2tfldj6upmye2reztkmm4i\",\n" +
                "    \"email\": \"brucewayne@gmail.com\",\n" +
                "    \"name\": \"Bruce Wayne\"\n" +
                "  },\n" +
                "  \"processed_on\": \"2019-09-10T10:11:12Z\",\n" +
                "  \"reference\": \"ORD-5023-4E89\",\n" +
                "  \"processing\": {\n" +
                "    \"retrieval_reference_number\": \"909913440644\",\n" +
                "    \"acquirer_transaction_id\": \"440644309099499894406\"\n" +
                "  },\n" +
                "  \"eci\": \"06\",\n" +
                "  \"scheme_id\": \"489341065491658\",\n" +
                "  \"links\": {\n" +
                "    \"self\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4\"\n" +
                "    },\n" +
                "    \"action\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/actions\"\n" +
                "    },\n" +
                "    \"void\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/captures\"\n" +
                "    },\n" +
                "    \"capture\": {\n" +
                "      \"href\": \"https://api.sandbox.checkout.com/payments/pay_mbabizu24mvu3mela5njyhpit4/voids\"\n" +
                "    }\n" +
                "  }\n" +
                "}");

    }

}
