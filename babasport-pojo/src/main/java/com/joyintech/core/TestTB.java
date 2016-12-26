package com.joyintech.core;

import java.util.Date;

public class TestTB {

    private Integer id;
    private Integer age;
    private String name;
    private Date birthday;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "TestTB [id=" + id + ", age=" + age + ", name=" + name + ", birthday=" + birthday
                + "]";
    }

}
