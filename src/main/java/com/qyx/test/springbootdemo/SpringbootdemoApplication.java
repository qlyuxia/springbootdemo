package com.qyx.test.springbootdemo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@RequestMapping("test")
public class SpringbootdemoApplication {
    @RequestMapping("hello")
	@ResponseBody
	public String test(){
        return "Hello World!,My name is Qi yuxia";
	}

	@Bean
	public My my(){
		return new My();
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootdemoApplication.class, args);
		applicationContext.getBean(My.class).test();
	}

	static class My implements InitializingBean {
		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("test bean");
		}

		public void test(){
            System.out.println("haha，胡峻峥，大傻逼！");
		}
	}
}
