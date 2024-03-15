package com.wannacode.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
@RefreshScope
public class CategoryController {

    @Value("${app.testProp}")
    private String testProp;

    // este endpoint es para testear si cuando enviamos un commit desde nuestra configuracion centralizada
    // se esta reflejando tambien en nuestro product microservice sin la necesidad de detener e iniciar el microservicio
    @GetMapping("test-prop")
    public String getTestProp(){
        return this.testProp;
    }
}
