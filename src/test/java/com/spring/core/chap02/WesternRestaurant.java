package com.spring.core.chap02;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@NoArgsConstructor // 기본 생성자
@Component("wr") // hotelmanager에 객체 생성을 맡김
public class WesternRestaurant implements Restaurant {

    // 의존 객체
    private Chef chef;
    private FrenchCourse course = new FrenchCourse();

    @Autowired
    public WesternRestaurant(@Qualifier("jc") Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        // 요리 코스 메뉴를 구성해야 한다.
        course.combineMenu();
        // 요리사에게 요리 명령을 내려야 한다.
        chef.cook();
    }
}
