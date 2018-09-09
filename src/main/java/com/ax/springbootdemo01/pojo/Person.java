package com.ax.springbootdemo01.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

//@PropertySource(value = {"classpath:person.properties"})  //可以加载指定配置文件
@Component   // 这个注解是做什么？    泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
@ConfigurationProperties(prefix = "person")  //这个注解，可以将配置文件中的数据注入到该类中 , 可以用于复杂数据类型注入
public class Person {


//    @Value("${email}")
//    private  String email ;
    private  String  userName;
    private  Integer  age;
    private Map address;
    private Date birthday;
   private boolean  boss;
   private ArrayList  likeList ;
   private Dog dog ;

    @Override
    public String toString() {
        return "Person{" +
//                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthday=" + birthday +
                ", boss=" + boss +
                ", likeList=" + likeList +
                ", dog=" + dog +
                '}';
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public ArrayList getLikeList() {
        return likeList;
    }

    public void setLikeList(ArrayList likeList) {
        this.likeList = likeList;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map getAddress() {
        return address;
    }

    public void setAddress(Map address) {
        this.address = address;
    }
}
