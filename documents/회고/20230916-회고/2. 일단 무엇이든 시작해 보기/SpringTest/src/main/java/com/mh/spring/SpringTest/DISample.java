package com.mh.spring.SpringTest;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DISample implements ISample{

    @Override
    public List<String> call(){
       return Arrays.asList("hello" , "world" , "hi ");
    }
}
