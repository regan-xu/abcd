package com.study.SpringBoot.forezp.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.study.SpringBoot.forezp.interf.TestInterface;

@Component
@Profile("pro")//通过在配置文件spring.profiles.active的值激活具体使用哪个实现类
public class TestPro implements TestInterface {

	@Override
	public String configure() {
		System.out.println("pro");
		return "pro";
	}

}
