package com.qyx.test.child;

import com.qyx.test.child.beans.MyChildBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyChildDemo {

    @Bean
    public MyChildBean childBean() {
        return new MyChildBean();
    }
}
