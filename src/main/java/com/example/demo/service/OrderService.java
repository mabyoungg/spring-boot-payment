package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public void checkAmount(String orderId, String amount) {
        // 해당 주문번호의 최종 결제금액이 정말 amount와 일치하는지 확인하는 로직

        boolean matched = true;

        // 만약 일치하지 않는다면, 예외
        if ( !matched ) throw new RuntimeException("결제금액이 일치하지 않습니다.");
    }

    public void setPaymentComplete(String orderId) {

    }
}