package com.example.orderservice.client;


import com.example.commonapi.api.IUserController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserControllerClient extends IUserController {
}
