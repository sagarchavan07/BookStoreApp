package com.example.orderservice.client;


import com.example.commonapi.api.IBookController;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "book-service", url = "http://localhost:8082")
public interface BookControllerClient extends IBookController {
}
