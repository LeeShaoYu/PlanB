package com.aoyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ByteOO
 * Date: 2020/9/15 17:13
 * @Version:
 * @Description:
 */

@MapperScan("com.aoyu.mapper")
@SpringBootApplication
public class PlanBApplication {
	public static void main(String[] args) {
		SpringApplication.run(PlanBApplication.class, args);
	}
}
