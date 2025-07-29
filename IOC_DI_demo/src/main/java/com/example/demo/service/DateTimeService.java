package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DateTimeService {
    public String getCurrentTime(){
        LocalDateTime now=LocalDateTime.now();
        return now.getHour()+": "+now.getMinute()+":"+now.getSecond()+" /// "+now.getDayOfMonth()+"-"+now.getMonthValue()+"-"+now.getYear();
    }
}
