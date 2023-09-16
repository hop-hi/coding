package com.mh.spring.SpringTest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Primary
public class DXSample implements ISample{

    @Override
    public List<String> call(){
        return Arrays.asList("hello" , "Korea" , "hi ");
    }
}