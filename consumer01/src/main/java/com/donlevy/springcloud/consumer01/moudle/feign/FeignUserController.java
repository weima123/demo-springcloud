package com.donlevy.springcloud.consumer01.moudle.feign;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/feign/user")
@RestController
public class FeignUserController {
    @Autowired
    private FeignUserService feignUserService;


    @GetMapping("/get/order")
    public ResponseEntity<String> getOrderNums(@RequestParam("id") String id ){
        return ResponseEntity.ok(feignUserService.getById(id));
    }
}
