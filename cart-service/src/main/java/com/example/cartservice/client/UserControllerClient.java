package com.example.cartservice.client;


import com.example.commonapi.api.IUserController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-service", url = "http://localhost:8081")
public interface UserControllerClient extends IUserController {
}
