package com.donlevy.springcloud.producer01.moudle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : mawei
 * @description :
 * @since : 2020-04-10 14:36
 */
@RequestMapping("/api/order")
@RestController
public class OrderController {

    @GetMapping("/get/by/id")
    public ResponseEntity<String> getOrderNums(@RequestParam("id") String id ){
        return ResponseEntity.ok("producer"+id);
    }
}
