package com.ax.springbootdemo01;

import com.ax.springbootdemo01.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo01ApplicationTests {

	@Autowired
	private Person person;

	@Autowired       // 注入ApplicationContext 容器对象
	private ApplicationContext applicationContext;

	@Test
	public void contextLoads() {
		System.out.println(person.toString());
	}

	@Test
	public  void  test() {
		boolean b = applicationContext.containsBean("helloWorldService"); //调用方法，判断ApplicationContext中是否存在指定 名称的  bean
		System.out.println(b);
	}


	/**
	 * 测试日志输出
	 * */
	@Test
	public  void  LoggginTest() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
       //日志输出级别，可以在配置文件中设置，  Spring Boot 框架默认设置的级别是  info级别
		logger.trace("这是trace级别日志 ：：跟踪");
		logger.debug("这是debug级别日志 ：：调试");
		logger.info("这是info级别日志 ：：普通");
		logger.warn("这是warn级别日志 ：：警告");
		logger.error("这是error级别日志 ：：错误");
	}



}
