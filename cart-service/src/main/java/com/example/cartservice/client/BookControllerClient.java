package com.example.cartservice.client;


import com.example.commonapi.api.IBookController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "book-service", url = "http://localhost:8082")
public interface BookControllerClient extends IBookController {
}
