package com.chap06.main;

import com.chap06.config.AppCtx;
import com.chap06.spring.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;
//@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) throws IOException {
		//SpringApplication.run(DemoApplication.class);
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		Client client = ctx.getBean(Client.class);
		client.send();

		ctx.close();
	}
}