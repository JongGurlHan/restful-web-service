package com.example.restfulwebservice;
//lombok

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //message를 사용하는 생성자가 만들어진다.
@NoArgsConstructor//디폴트 생성자 만듦
public class HelloWorldBean {
    private String message;


}
