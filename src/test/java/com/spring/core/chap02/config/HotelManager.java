package com.spring.core.chap02.config;

import com.spring.core.chap02.Hotel;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.chap02")
// @Component가 붙은 걸 자동으로 생성
public class HotelManager {

}
