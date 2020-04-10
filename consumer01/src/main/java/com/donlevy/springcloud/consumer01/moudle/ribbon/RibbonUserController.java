package com.donlevy.springcloud.consumer01.moudle.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : mawei
 * @description :
 * @since : 2020-04-10 14:36
 */
@RequestMapping("/api/ribbon/user")
@RestController
public class RibbonUserController {

    @Autowired
    @Qualifier("normalRestTemplate")
    private RestTemplate restTemplate;

    private static final String host = "http://producer01";

    private static final String url = "/api/order/get/by/id";

    @GetMapping("/get/order")
    public ResponseEntity<String> getOrderNums(@RequestParam("id") String id ){
        return ResponseEntity.ok(restTemplate.getForObject(host+ url+"?id="+id,String.class));
    }
}
