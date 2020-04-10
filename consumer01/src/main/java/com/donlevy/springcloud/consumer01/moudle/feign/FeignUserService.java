package com.donlevy.springcloud.consumer01.moudle.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2020-04-10 15:17
 */
@FeignClient("producer01")
public interface FeignUserService {

    @GetMapping("/api/order/get/by/id")
    String getById(@RequestParam("id") String id );
}
