package com.ax.springbootdemo01;

import com.ax.springbootdemo01.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
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


}
