package com.example.springbootdubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.edas.boot.IHelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class DemoConsumerController {
    @Reference(group = "zlg",version = "0.0.1")
    private IHelloService iHelloService;

    @RequestMapping("/sayhello/{name}")
    public String sayHello(@PathVariable String name) {
        return iHelloService.sayHello(name);
    }
}
