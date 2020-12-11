package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    // /hello-world (endpoint)
    //@RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    //string값이 아니라 java bean형태로 반환하면 스프링프레임워크에서는
    //text나 object형이 아닌 json 형태로 변환해서 반환한다


}
